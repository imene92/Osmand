/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class ObfDataInterface {
  private long swigCPtr;
  private boolean swigCMemOwn;

  protected ObfDataInterface(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ObfDataInterface obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        OsmAndCoreJNI.delete_ObfDataInterface(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ObfDataInterface(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfReader_const_t_t obfReaders) {
    this(OsmAndCoreJNI.new_ObfDataInterface(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfReader_const_t_t.getCPtr(obfReaders)), true);
  }

  public SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfReader_const_t_t getObfReaders() {
    long cPtr = OsmAndCoreJNI.ObfDataInterface_obfReaders_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfReader_const_t_t(cPtr, false);
  }

  public boolean loadObfFiles(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfFile_const_t_t outFiles, SWIGTYPE_p_OsmAnd__IQueryController controller) {
    return OsmAndCoreJNI.ObfDataInterface_loadObfFiles__SWIG_0(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfFile_const_t_t.getCPtr(outFiles), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller));
  }

  public boolean loadObfFiles(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfFile_const_t_t outFiles) {
    return OsmAndCoreJNI.ObfDataInterface_loadObfFiles__SWIG_1(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__ObfFile_const_t_t.getCPtr(outFiles));
  }

  public boolean loadObfFiles() {
    return OsmAndCoreJNI.ObfDataInterface_loadObfFiles__SWIG_2(swigCPtr, this);
  }

  public boolean loadBasemapPresenceFlag(SWIGTYPE_p_bool outBasemapPresent, SWIGTYPE_p_OsmAnd__IQueryController controller) {
    return OsmAndCoreJNI.ObfDataInterface_loadBasemapPresenceFlag__SWIG_0(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(outBasemapPresent), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller));
  }

  public boolean loadBasemapPresenceFlag(SWIGTYPE_p_bool outBasemapPresent) {
    return OsmAndCoreJNI.ObfDataInterface_loadBasemapPresenceFlag__SWIG_1(swigCPtr, this, SWIGTYPE_p_bool.getCPtr(outBasemapPresent));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction filterById, SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t outReferencedCacheEntries, SWIGTYPE_p_OsmAnd__IQueryController controller, SWIGTYPE_p_OsmAnd__ObfMapSectionReader_Metrics__Metric_loadMapObjects metric) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_0(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller), SWIGTYPE_p_OsmAnd__ObfMapSectionReader_Metrics__Metric_loadMapObjects.getCPtr(metric));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction filterById, SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t outReferencedCacheEntries, SWIGTYPE_p_OsmAnd__IQueryController controller) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_1(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction filterById, SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t outReferencedCacheEntries) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_2(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfMapSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction filterById, SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache cache) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_3(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfMapSectionReader__DataBlocksCache.getCPtr(cache));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction filterById) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_4(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_FilterMapObjectsByIdFunction.getCPtr(filterById));
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom, AreaI bbox31) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_5(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue(), AreaI.getCPtr(bbox31), bbox31);
  }

  public boolean loadMapObjects(SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t resultOut, SWIGTYPE_p_MapFoundationType outFoundation, ZoomLevel zoom) {
    return OsmAndCoreJNI.ObfDataInterface_loadMapObjects__SWIG_6(swigCPtr, this, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__BinaryMapObject_const_t_t.getCPtr(resultOut), SWIGTYPE_p_MapFoundationType.getCPtr(outFoundation), zoom.swigValue());
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById, SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction visitor, SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t outReferencedCacheEntries, SWIGTYPE_p_OsmAnd__IQueryController controller, SWIGTYPE_p_ObfRoutingSectionReader_Metrics__Metric_loadRoads metric) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_0(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction.getCPtr(visitor), SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller), SWIGTYPE_p_ObfRoutingSectionReader_Metrics__Metric_loadRoads.getCPtr(metric));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById, SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction visitor, SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t outReferencedCacheEntries, SWIGTYPE_p_OsmAnd__IQueryController controller) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_1(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction.getCPtr(visitor), SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries), SWIGTYPE_p_OsmAnd__IQueryController.getCPtr(controller));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById, SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction visitor, SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache cache, SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t outReferencedCacheEntries) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_2(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction.getCPtr(visitor), SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache.getCPtr(cache), SWIGTYPE_p_QListT_std__shared_ptrT_ObfRoutingSectionReader__DataBlock_const_t_t.getCPtr(outReferencedCacheEntries));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById, SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction visitor, SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache cache) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_3(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction.getCPtr(visitor), SWIGTYPE_p_ObfRoutingSectionReader__DataBlocksCache.getCPtr(cache));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById, SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction visitor) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_4(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById), SWIGTYPE_p_ObfRoutingSectionReader__VisitorFunction.getCPtr(visitor));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut, SWIGTYPE_p_FilterRoadsByIdFunction filterById) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_5(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut), SWIGTYPE_p_FilterRoadsByIdFunction.getCPtr(filterById));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t resultOut) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_6(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31, SWIGTYPE_p_QListT_std__shared_ptrT_OsmAnd__Model__Road_const_t_t.getCPtr(resultOut));
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel, AreaI bbox31) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_7(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel), AreaI.getCPtr(bbox31), bbox31);
  }

  public boolean loadRoads(SWIGTYPE_p_RoutingDataLevel dataLevel) {
    return OsmAndCoreJNI.ObfDataInterface_loadRoads__SWIG_8(swigCPtr, this, SWIGTYPE_p_RoutingDataLevel.getCPtr(dataLevel));
  }

}