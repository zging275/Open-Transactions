/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.opentransactions.jni.core;

public class LoomServer extends Server {
  private long swigCPtr;

  protected LoomServer(long cPtr, boolean cMemoryOwn) {
    super(otapiJNI.LoomServer_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LoomServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        otapiJNI.delete_LoomServer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }
/*@SWIG:otapi/OTAPI.i,132,OT_CAN_BE_CONTAINED_BY@*/
	// Ensure that the GC doesn't collect any OT_CONTAINER instance set from Java
	private WalletData containerRefWalletData;
	// ----------------	
	protected void addReference(WalletData theContainer) {  // This is Java code
		containerRefWalletData = theContainer;
	}
	// ----------------
/*@SWIG@*/
	// ------------------------
  public void setGui_label(String value) {
    otapiJNI.LoomServer_gui_label_set(swigCPtr, this, value);
  }

  public String getGui_label() {
    return otapiJNI.LoomServer_gui_label_get(swigCPtr, this);
  }

  public void setServer_id(String value) {
    otapiJNI.LoomServer_server_id_set(swigCPtr, this, value);
  }

  public String getServer_id() {
    return otapiJNI.LoomServer_server_id_get(swigCPtr, this);
  }

  public void setServer_type(String value) {
    otapiJNI.LoomServer_server_type_set(swigCPtr, this, value);
  }

  public String getServer_type() {
    return otapiJNI.LoomServer_server_type_get(swigCPtr, this);
  }

  public void setServer_host(String value) {
    otapiJNI.LoomServer_server_host_set(swigCPtr, this, value);
  }

  public String getServer_host() {
    return otapiJNI.LoomServer_server_host_get(swigCPtr, this);
  }

  public void setServer_port(String value) {
    otapiJNI.LoomServer_server_port_set(swigCPtr, this, value);
  }

  public String getServer_port() {
    return otapiJNI.LoomServer_server_port_get(swigCPtr, this);
  }

  public void setLoom_username(String value) {
    otapiJNI.LoomServer_loom_username_set(swigCPtr, this, value);
  }

  public String getLoom_username() {
    return otapiJNI.LoomServer_loom_username_get(swigCPtr, this);
  }

  public void setNamefield_id(String value) {
    otapiJNI.LoomServer_namefield_id_set(swigCPtr, this, value);
  }

  public String getNamefield_id() {
    return otapiJNI.LoomServer_namefield_id_get(swigCPtr, this);
  }

  public static LoomServer ot_dynamic_cast(Storable pObject) {
    long cPtr = otapiJNI.LoomServer_ot_dynamic_cast(Storable.getCPtr(pObject), pObject);
    return (cPtr == 0) ? null : new LoomServer(cPtr, false);
  }

}
