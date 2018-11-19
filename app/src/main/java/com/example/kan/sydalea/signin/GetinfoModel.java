package com.example.kan.sydalea.signin;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.OkHttpResponseListener;

import org.json.JSONException;
import org.json.JSONObject;

import okhttp3.Response;

public class GetinfoModel implements IGetifoContract.ISignModel {
   public static final String TAG = "response";
    @Override
    public void login(final Context context, String username, String password, onLoginFinishedListener listener) {
      //---------------getallprersons----------------
       /* AndroidNetworking.get("http://192.168.1.13:9090/TMSR0000709/1/53")
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

        //---------insert Patient---------------------

*/
        /*JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("p1", 2);
            jsonObject.put("p2", "ss");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        AndroidNetworking.post("http://192.168.1.13:9090/TMSR0000709/1/63")
               .addJSONObjectBody(jsonObject)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsOkHttpResponse(new OkHttpResponseListener() {



                    @Override
                    public void onResponse(Response response) {
                        Log.i(TAG,"responsesuccss"+ response.toString());

                    }

                    @Override
                    public void onError(ANError error) {
                        Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                        Log.i(TAG,error.toString());

                        // handle error
                    }
                });*/

        //------------insert person--------------

        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("p1", 4);
            jsonObject.put("p2", 4);
            jsonObject.put("p3", 4);
            jsonObject.put("p4", 4);
            jsonObject.put("p5", 4);
            jsonObject.put("p6", 4);
            jsonObject.put("p7", 4);
            jsonObject.put("p8", 4);
            jsonObject.put("p9", 4);
            jsonObject.put("p10", 4);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        AndroidNetworking.post("http://192.168.1.13:9090/TMSR0000709/1/62")
               .addJSONObjectBody(jsonObject)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsOkHttpResponse(new OkHttpResponseListener() {



                    @Override
                    public void onResponse(Response response) {
                        Log.i(TAG,"responsesuccss"+ response.header("insert"));

                    }

                    @Override
                    public void onError(ANError error) {
                        Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                        Log.i(TAG,error.toString());

                        // handle error
                    }
                });

      //----------insert doctor--------------

       /*JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("p1", 3);
            jsonObject.put("p2", "ss");
            jsonObject.put("p3", "sst");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        AndroidNetworking.post("http://192.168.1.13:9090/TMSR0000709/1/61")
               .addJSONObjectBody(jsonObject)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsOkHttpResponse(new OkHttpResponseListener() {



                    @Override
                    public void onResponse(Response response) {
                        Log.i(TAG,"responsesuccss"+ response.toString());

                    }

                    @Override
                    public void onError(ANError error) {
                        Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                        Log.i(TAG,error.toString());

                        // handle error
                    }
                });*/


    }

}
