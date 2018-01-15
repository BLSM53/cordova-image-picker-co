package com.blsm.permission; 

import org.apache.cordova.CallbackContext; 
import org.apache.cordova.CordovaPlugin; 
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import android.Manifest;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class Permission extends CordovaPlugin {

    private static final String ACTION_HAS_READ_PERMISSION = "hasPermission";
    private static final String ACTION_REQUEST_READ_PERMISSION = "requestPermission";

    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Activity activity = this.cordova.getActivity(); 
        if (ACTION_HAS_READ_PERMISSION.equals(action)) {
            callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, hasReadPermission()));
            return true; 
        }else if (ACTION_REQUEST_READ_PERMISSION.equals(action)) {
            requestReadPermission();
            return true;
        }
        return false; 
    }

    @SuppressLint("InlinedApi")
    private boolean hasReadPermission() {
        return Build.VERSION.SDK_INT < 23 ||
            PackageManager.PERMISSION_GRANTED == ContextCompat.checkSelfPermission(this.cordova.getActivity(), Manifest.permission.READ_EXTERNAL_STORAGE);
    }

    @SuppressLint("InlinedApi")
    private void requestReadPermission() {
        if (!hasReadPermission()) {
            ActivityCompat.requestPermissions(
                this.cordova.getActivity(),
                new String[] {Manifest.permission.READ_EXTERNAL_STORAGE},
                PERMISSION_REQUEST_CODE);
        }
        // This method executes async and we seem to have no known way to receive the result
        // (that's why these methods were later added to Cordova), so simply returning ok now.
        callbackContext.success();
    }
}