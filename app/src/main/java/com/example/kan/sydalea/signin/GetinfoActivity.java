package com.example.kan.sydalea.signin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.androidnetworking.AndroidNetworking;
import com.example.kan.sydalea.R;


public class GetinfoActivity extends AppCompatActivity implements IGetifoContract.ISignInView{

    private IGetifoContract.ISignInPresenter mSignInPresenter;

    Button getdatabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_info);
        AndroidNetworking.initialize(getApplicationContext());

        getdatabtn=findViewById(R.id.getdatabtn);

        mSignInPresenter = new GetinfoPresenter(this);

        getdatabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSignInPresenter.validateCred(getApplicationContext(),"dewidar","12345678");
            }
        });

    }



    @Override
    protected void onDestroy() {
        super.onDestroy();

        mSignInPresenter.onDestroy();
    }



}