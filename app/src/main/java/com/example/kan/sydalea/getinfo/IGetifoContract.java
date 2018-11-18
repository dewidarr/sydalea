package com.example.kan.sydalea.getinfo;

import android.content.Context;

/**
 * Created by amr on 3/26/18.
 */

public interface IGetifoContract {

    interface ISignInView{

       /* void showProgress();
        void hideProgress();
        void setUserNameError();
        void setPasswordError();
        void navigateToMatin();
        void showAlert(String message);

        void setId(int company_id);*/
    }

    interface ISignInPresenter{

        void validateCred(Context context, String username, String password);
        void onDestroy();

    }

    interface ISignModel{

        interface onLoginFinishedListener{

           // void onUserNameError();
            //void onPasswordError();
            void onSuccess();
            void onFailure(String message);
        }

        void login(Context context, String username, String password, onLoginFinishedListener listener);

    }
}
