package com.example.kan.sydalea.SignUp;

import android.content.Context;

/**
 * Created by dewidar on 3/26/18.
 */

public class SignUpPresenter implements ISignUpContract.IsignUpPresenter, ISignUpContract.IsignUpModel.onSignupFinishedListener {
    ISignUpContract.IsignUpView mISignUpView;
    ISignUpContract.IsignUpModel mISignUpModel;

    public SignUpPresenter(ISignUpContract.IsignUpView mISignUpView) {
        this.mISignUpView = mISignUpView;
        mISignUpModel = new SignUpModel();
    }

    @Override
    public void validateCred(Context context, String username, String password, String email, String phone, String location) {
        mISignUpModel.Signup(context,username, password, email, phone, location, this);

    }

    @Override
    public void onDestroy() {
        if(mISignUpView !=null){
            mISignUpView=null;
        }
    }


   /* @Override
    public void onUserNameError() {
        if (mISignUpView != null) {
            mISignUpView.setUserNameError();
        }

    }

    @Override
    public void onPasswordError() {
        if (mISignUpView != null) {
            mISignUpView.setPasswordError();
        }
    }

    @Override
    public void onEmailError() {
        if (mISignUpView != null) {
            mISignUpView.setEmailError();
        }
    }

    @Override
    public void onPhoneError() {
        if (mISignUpView != null) {
            mISignUpView.setPhoneError();
        }
    }

    @Override
    public void onLocationError() {
        if (mISignUpView != null) {
            mISignUpView.setLocationError();
        }
    }

    @Override
    public void onSuccess() {
        if (mISignUpView != null) {
            mISignUpView.setSucsses();
        }

    }

    @Override
    public void onFailure(String message) {
        if (mISignUpView != null) {
            mISignUpView.showAlert(message);
        }
    }*/

}
