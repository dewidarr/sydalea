package com.example.kan.sydalea.signin;

import android.content.Context;

public class GetinfoPresenter implements IGetifoContract.ISignInPresenter, IGetifoContract.ISignModel.onLoginFinishedListener {

    IGetifoContract.ISignInView mISignInView;
    IGetifoContract.ISignModel mISignInModel;

    public GetinfoPresenter(IGetifoContract.ISignInView mISignInView){
        this.mISignInView = mISignInView;
        mISignInModel = new GetinfoModel();
    }

    @Override
    public void validateCred(Context context, String username, String password) {

        if (mISignInView != null) {
           // mISignInView.showProgress();
            mISignInModel.login(context,username, password, this);
        }
    }

    @Override
    public void onDestroy() {

        if (mISignInView != null) {
            mISignInView = null;
        }

    }


    @Override
    public void onSuccess() {

        if (mISignInView != null) {
           // mISignInView.hideProgress();
            //mISignInView.navigateToMatin();
        }
    }

    @Override
    public void onFailure(String message) {

        if (mISignInView != null) {
           // mISignInView.hideProgress();
            //mISignInView.showAlert(message);
        }
    }
}
