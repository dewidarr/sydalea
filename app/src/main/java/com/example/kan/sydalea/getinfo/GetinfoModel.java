package com.example.kan.sydalea.getinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class GetinfoModel implements IGetifoContract.ISignModel {
   public static final String TAG = "errorresponse";
    @Override
    public void login(final Context context, String username, String password, onLoginFinishedListener listener) {
        AndroidNetworking.get("http://192.168.1.13:9090/TMSR0000709/1/53")
                .setPriority(Priority.LOW)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Toast.makeText(context, response.toString(), Toast.LENGTH_SHORT).show();
                        // do anything with response
                    }

                    @Override
                    public void onError(ANError error) {
                        Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                        Log.i(TAG,error.toString());
                        Log.d(TAG, "onError errorCode : " + error.getErrorCode());
                        Log.d(TAG, "onError errorBody : " + error.getErrorBody());
                        Log.d(TAG, "onError errorDetail : " + error.getErrorDetail());

                    }
                });
        Toast.makeText(context, username, Toast.LENGTH_SHORT).show();

    }

}
