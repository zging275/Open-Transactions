/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

namespace org.opentransactions.otapi {

using System;
using System.Runtime.InteropServices;

public class OfferListNym : Storable {
  private HandleRef swigCPtr;

  internal OfferListNym(IntPtr cPtr, bool cMemoryOwn) : base(otapiPINVOKE.OfferListNym_SWIGUpcast(cPtr), cMemoryOwn) {
    swigCPtr = new HandleRef(this, cPtr);
  }

  internal static HandleRef getCPtr(OfferListNym obj) {
    return (obj == null) ? new HandleRef(null, IntPtr.Zero) : obj.swigCPtr;
  }

  ~OfferListNym() {
    Dispose();
  }

  public override void Dispose() {
    lock(this) {
      if (swigCPtr.Handle != IntPtr.Zero) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          otapiPINVOKE.delete_OfferListNym(swigCPtr);
        }
        swigCPtr = new HandleRef(null, IntPtr.Zero);
      }
      GC.SuppressFinalize(this);
      base.Dispose();
    }
  }

  public uint GetOfferDataNymCount() {
    uint ret = otapiPINVOKE.OfferListNym_GetOfferDataNymCount(swigCPtr);
    return ret;
  }

  public OfferDataNym GetOfferDataNym(uint nIndex) {
    IntPtr cPtr = otapiPINVOKE.OfferListNym_GetOfferDataNym(swigCPtr, nIndex);
    OfferDataNym ret = (cPtr == IntPtr.Zero) ? null : new OfferDataNym(cPtr, false);
    return ret;
  }

  public bool RemoveOfferDataNym(uint nIndexOfferDataNym) {
    bool ret = otapiPINVOKE.OfferListNym_RemoveOfferDataNym(swigCPtr, nIndexOfferDataNym);
    return ret;
  }

  public bool AddOfferDataNym(OfferDataNym disownObject) {
    bool ret = otapiPINVOKE.OfferListNym_AddOfferDataNym(swigCPtr, OfferDataNym.getCPtr(disownObject));
    if (otapiPINVOKE.SWIGPendingException.Pending) throw otapiPINVOKE.SWIGPendingException.Retrieve();
    return ret;
  }

  public new static OfferListNym ot_dynamic_cast(Storable pObject) {
    IntPtr cPtr = otapiPINVOKE.OfferListNym_ot_dynamic_cast(Storable.getCPtr(pObject));
    OfferListNym ret = (cPtr == IntPtr.Zero) ? null : new OfferListNym(cPtr, false);
    return ret;
  }

}

}
