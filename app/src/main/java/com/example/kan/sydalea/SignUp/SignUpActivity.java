package com.example.kan.sydalea.SignUp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kan.sydalea.R;


//implement it's own interface to use it's method
public class SignUpActivity extends AppCompatActivity implements ISignUpContract.IsignUpView {

    private EditText txtMailEdit, txtPasswordEdit, txtCompanyNameEdit, txtLocationEdit, txtPhoneNumberEdit;
    private Button btnSignUp;

    private ISignUpContract.IsignUpPresenter mSignUpPresenter;

    String place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        mSignUpPresenter = new SignUpPresenter(this);


    }
       // btnSignUp = (Button) findViewById(R.id.btnSignup);

  /*  void gotoMap() {
        mSignUpPresenter.validateCred(this,txtCompanyNameEdit.getText().toString().trim(),
                txtPasswordEdit.getText().toString().trim(), txtMailEdit.getText().toString().trim(),
                txtPhoneNumberEdit.getText().toString().trim(), place.replaceAll("\\s+", "").replace(",", "").replace("/", ""));

    }
    @OnClick(R.id.txtSignup)
    void  gotofrag(){
        Intent i = new Intent(getApplicationContext(), placepicActvity.class);
        startActivity(i);

    }

    @Override
    public void setUserNameError() {
        txtCompanyNameEdit.setError("Company Name is empty");
    }

    @Override
    public void setPasswordError() {
        txtPasswordEdit.setError("Password Is empty!");

    }

    @Override
    public void setEmailError() {
        txtMailEdit.setError("E-mail is empty!");
    }

    @Override
    public void setPhoneError() {
        txtPhoneNumberEdit.setError("Phone num is empty!");
    }

    @Override
    public void setLocationError() {
        txtLocationEdit.setError("Location is empty!");

    }

    @Override
    public void setSucsses() {
        startActivity(new Intent(getApplicationContext(), SignInActivity.class));

    }
    @Override
    public void showAlert(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        mSignUpPresenter.onDestroy();
    }*/


}
