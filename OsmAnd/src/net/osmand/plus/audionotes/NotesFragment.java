package net.osmand.plus.audionotes;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.PopupMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import net.osmand.data.PointDescription;
import net.osmand.plus.OsmandApplication;
import net.osmand.plus.OsmandPlugin;
import net.osmand.plus.R;
import net.osmand.plus.activities.FavoritesActivity;
import net.osmand.plus.activities.MapActivity;
import net.osmand.plus.audionotes.AudioVideoNotesPlugin.Recording;
import net.osmand.plus.dialogs.DirectionsDialogs;
import android.support.v4.app.ListFragment;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Denis
 * on 18.02.2015.
 */
public class NotesFragment extends ListFragment {
	AudioVideoNotesPlugin plugin;
	List<AudioVideoNotesPlugin.Recording> items;
	NotesAdapter listAdapter;

	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		setHasOptionsMenu(true);
		plugin = OsmandPlugin.getEnabledPlugin(AudioVideoNotesPlugin.class);
		View view = getActivity().getLayoutInflater().inflate(R.layout.update_index, container, false);
		view.findViewById(R.id.select_all).setVisibility(View.GONE);
		((TextView) view.findViewById(R.id.header)).setText(R.string.notes);
		return view;
	}

	@Override
	public void onResume() {
		super.onResume();
		items = new ArrayList<Recording>(plugin.getAllRecordings());
		listAdapter = new NotesAdapter(items);
		getListView().setAdapter(listAdapter);
	}

	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
		menu.clear();
		((FavoritesActivity) getActivity()).getClearToolbar(false);
	}

	@Override
	public void onPause() {
		super.onPause();
	}


	public OsmandApplication getMyApplication() {
		return (OsmandApplication) getActivity().getApplication();
	}

	class NotesAdapter extends ArrayAdapter<AudioVideoNotesPlugin.Recording> {
		NotesAdapter(List<AudioVideoNotesPlugin.Recording> recordingList) {
			super(getActivity(), R.layout.note, recordingList);
		}

		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = getActivity().getLayoutInflater();
			View row = convertView;
			if (row == null) {
				row = inflater.inflate(R.layout.note, parent, false);
			}

			final AudioVideoNotesPlugin.Recording recording = getItem(position);
			DashAudioVideoNotesFragment.getNoteView(recording, row, getActivity(), plugin);
			row.findViewById(R.id.play).setVisibility(View.GONE);
			ImageButton options = (ImageButton) row.findViewById(R.id.options);
			options.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					openPopUpMenu(v, recording);
				}
			});
			row.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					showOnMap(recording);
				}
			});
			return row;
		}
	}

	private void showOnMap(Recording recording) {
		getMyApplication().getSettings().setMapLocationToShow(recording.getLatitude(), recording.getLongitude(), 15, 
				new PointDescription(PointDescription.POINT_TYPE_NOTE, recording.getName()), true,
				recording); //$NON-NLS-1$
		MapActivity.launchMapActivityMoveToTop(getActivity());
	}

	private void openPopUpMenu(View v, final AudioVideoNotesPlugin.Recording recording) {
		boolean light = getMyApplication().getSettings().isLightContent();
		final PopupMenu optionsMenu = new PopupMenu(getActivity(), v);
		DirectionsDialogs.setupPopUpMenuIcon(optionsMenu);
		MenuItem item;
		boolean isPhoto = recording.isPhoto();
		final int playIcon;
		if (isPhoto) {
			playIcon = light ? R.drawable.ic_action_eye_light : R.drawable.ic_action_eye_dark;
		} else {
			playIcon = light ? R.drawable.ic_play_light : R.drawable.ic_play_dark;
		}
		item = optionsMenu.getMenu().add(isPhoto ? R.string.watch : R.string.recording_context_menu_play)
				.setIcon(playIcon);
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				plugin.playRecording(getActivity(), recording);
				return true;
			}
		});

		item = optionsMenu.getMenu().add(R.string.search_shown_on_map)
				.setIcon(light ? R.drawable.ic_action_map_marker_light : R.drawable.ic_action_map_marker_dark);
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				showOnMap(recording);
				return true;
			}
		});

		item = optionsMenu.getMenu().add(R.string.share_fav)
				.setIcon(light ? R.drawable.ic_action_gshare_light : R.drawable.ic_action_gshare_dark);
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				Intent sharingIntent = new Intent(Intent.ACTION_SEND);
				if (recording.isPhoto()) {
					Uri screenshotUri = Uri.parse(recording.getFile().getAbsolutePath());
					sharingIntent.setType("image/*");
					sharingIntent.putExtra(Intent.EXTRA_STREAM, screenshotUri);
				} else if (recording.isAudio()) {
					Uri audioUri = Uri.parse(recording.getFile().getAbsolutePath());
					sharingIntent.setType("audio/*");
					sharingIntent.putExtra(Intent.EXTRA_STREAM, audioUri);
				} else if (recording.isVideo()) {
					Uri videoUri = Uri.parse(recording.getFile().getAbsolutePath());
					sharingIntent.setType("video/*");
					sharingIntent.putExtra(Intent.EXTRA_STREAM, videoUri);
				}
				startActivity(Intent.createChooser(sharingIntent, getString(R.string.share_note)));
				return true;
			}
		});

		item = optionsMenu.getMenu().add(R.string.local_index_mi_rename)
				.setIcon(light ? R.drawable.ic_action_edit_light : R.drawable.ic_action_edit_dark);
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				editNote(recording);
				return true;
			}
		});

		item = optionsMenu.getMenu().add(R.string.recording_context_menu_delete)
				.setIcon(light ? R.drawable.ic_action_delete_light : R.drawable.ic_action_delete_dark);
		item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			@Override
			public boolean onMenuItemClick(MenuItem item) {
				AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
				builder.setMessage(R.string.recording_delete_confirm);
				builder.setPositiveButton(R.string.default_buttons_yes, new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog, int which) {
						plugin.deleteRecording(recording);
						listAdapter.remove(recording);
					}
				});
				builder.setNegativeButton(R.string.default_buttons_cancel, null);
				builder.show();
				return true;
			}
		});
		optionsMenu.show();
	}

	private void editNote(final Recording recording) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
		builder.setTitle(R.string.rename_recording);
		final View v = getActivity().getLayoutInflater().inflate(R.layout.note_edit_dialog,
				getListView(), false);
		final EditText editText = (EditText) v.findViewById(R.id.name);
		builder.setView(v);
		String fileName = recording.getName();
		int extInd = recording.getName().lastIndexOf(".");
		final String extension;
		if (extInd >= 0){
			extension = fileName.substring(extInd, fileName.length());
		} else {
			extension = "";
		}

		editText.setText(recording.getName().substring(0, extInd));
		builder.setNegativeButton(R.string.default_buttons_cancel, null);
		builder.setPositiveButton(R.string.default_buttons_apply, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				if(!recording.setName(editText.getText().toString() + extension)) {
					Toast.makeText(getActivity(),R.string.rename_failed,Toast.LENGTH_SHORT).show();
				}
				recording.setDescription();
				listAdapter.notifyDataSetInvalidated();
			}
		});
		builder.create().show();
		editText.requestFocus();
	}


}
