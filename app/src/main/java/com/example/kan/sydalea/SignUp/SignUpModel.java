package com.example.kan.sydalea.SignUp;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dewidar on 3/26/18.
 */

public class SignUpModel implements ISignUpContract.IsignUpModel {


    @Override
    public void Signup(Context context, final String username, final String password, final String email, final String phone, final String location, final onSignupFinishedListener listener) {

      /*  if (TextUtils.isEmpty(username)) {
            listener.onUserNameError();
            return;
        } else if (TextUtils.isEmpty(password)) {
            listener.onPasswordError();
            return;
        } else if (TextUtils.isEmpty(email)) {
            listener.onEmailError();
            return;
        } else if (TextUtils.isEmpty(phone)) {
            listener.onPhoneError();
            return;
        } else if (TextUtils.isEmpty(location)) {
            listener.onLocationError();
            return;
        } else if(username != null   && password !=null && email !=null && phone !=null && location !=null) {


        }
        else {
            listener.onFailure("invalid credentials!");
        }*/

    }
}
