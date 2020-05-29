package com.flickerin.amy.mainjavacodes.login;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.flickerin.amy.R;
import com.flickerin.amy.customcodes.GetFont;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


import androidx.appcompat.app.AppCompatActivity;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationActivity extends AppCompatActivity{

    TextView tv_titlename;
    TextView tv_welcometext;
    FloatingActionButton fab_left;
    FloatingActionButton fab_home;
    private static Connection connection = null;

    

    @Override
    protected void onCreate(Bundle bundleSavedInstance){
        super.onCreate(bundleSavedInstance);
        setContentView(R.layout.login_registration);

        tv_titlename = (TextView) findViewById(R.id.tv_titlename);
        tv_welcometext = (TextView) findViewById(R.id.tv_welcometext);
        fab_left = (FloatingActionButton) findViewById(R.id.fab_left);
        fab_home = (FloatingActionButton) findViewById(R.id.fab_home);

        Typeface getTitleFont = Typeface.createFromAsset(getAssets(),new GetFont().getAppTitleFont());
        Typeface getSemiBoldFont = Typeface.createFromAsset(getAssets(),new GetFont().getAppRegularFont());
        tv_titlename.setTypeface(getTitleFont);
        tv_welcometext.setTypeface(getSemiBoldFont);

        fab_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(RegistrationActivity.this,LoginRegisterPage.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();
            }
        });

        fab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Intent i = new Intent(RegistrationActivity.this,LoginRegisterPage.class);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
                finish();*/
                mysql();
            }
        });


    }

    private static void mysql() {

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try  {
                    //Your code goes here
                    Connection con= DriverManager.getConnection(
                            "jdbc:mariadb://45.130.229.85:3306/flickeri_amy","flickeri_amy","vsiusurya116#");
                    //here sonoo is database name, root is username and password
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from AMY_COUNTRY");
                    while(rs.next())
                        System.out.println(rs.getString(1)+"  "+rs.getString(2));
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println(e);
                }
            }
        });

        thread.start();

}

    @Override
    public void onBackPressed() {
       super.onBackPressed();
    }


}
