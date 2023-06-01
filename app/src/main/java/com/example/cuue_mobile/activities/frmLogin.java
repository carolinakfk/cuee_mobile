package com.example.cuue_mobile.activities;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import com.example.cuue_mobile.R;

public class frmLogin extends AppCompatActivity {

    //private Realm mRealm;
    protected InputMethodManager keyboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try{

            super.onCreate(savedInstanceState);

            keyboard = (InputMethodManager)getSystemService(this.INPUT_METHOD_SERVICE);

            setContentView(R.layout.activity_frm_login);

            grantPermissions();

        }catch (Exception e){

        }
    }

    private void grantPermissions() {

        try {
            if (Build.VERSION.SDK_INT >= 20) {

                if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
                        && checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED) {
                   // startApplication();
                } else {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                    Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                }
            }

        } catch (Exception e) {
            alert(new Object() {
            }.getClass().getEnclosingMethod().getName()+ e.getMessage());
        }
    }

    protected void alert(String msg)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        alertDialog.setTitle("Ingreso");

        //alertDialog.setIcon(androidx.transition.R.drawable.abc_ic_star_black_16dp);

        alertDialog.setCancelable(false);

        alertDialog.setMessage(msg);

        alertDialog.setButton(DialogInterface.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener()
        {
            public void onClick(DialogInterface dialog, int which)
            {
               // _password.setText("");
               // _password.requestFocus();
            }
        });

        alertDialog.setCanceledOnTouchOutside(false);
        alertDialog.show();
    }
}