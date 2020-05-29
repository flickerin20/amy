package com.flickerin.amy.mainjavacodes.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.flickerin.amy.R;
import com.flickerin.amy.customcodes.GetFont;


public class LoginRegisterPage extends AppCompatActivity {

    TextView tv_banner;
    TextView tv_register;
    TextView tv_email;
    TextView tv_password;
    TextView tv_forgotPassword;
    TextView tv_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        tv_register = (TextView) findViewById(R.id.registerbutton);
        tv_banner = (TextView) findViewById(R.id.tvBanner);
        tv_email = (TextView) findViewById(R.id.tvUserName);
        tv_password = (TextView) findViewById(R.id.tvPassword);
        tv_forgotPassword = (TextView) findViewById(R.id.tvForgotPassword);
        tv_login = (TextView) findViewById(R.id.tvLogin);
        Typeface typeface = Typeface.createFromAsset(getAssets(), new GetFont().getAppBoldFont());
        Typeface typefaceSemiBold = Typeface.createFromAsset(getAssets(), new GetFont().getAppRegularFont());
        tv_register.setTypeface(typeface);
        tv_banner.setTypeface(typeface);
        tv_email.setTypeface(typeface);
        tv_password.setTypeface(typeface);
        tv_login.setTypeface(typeface);
        tv_forgotPassword.setTypeface(typefaceSemiBold);
        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), RegistrationActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}
