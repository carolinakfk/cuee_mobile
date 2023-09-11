package com.example.cuue_mobile.activities;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

import androidx.core.app.ActivityCompat;

import com.example.cuue_mobile.Clases.pBase;
import com.example.cuue_mobile.R;

import java.io.File;

import io.realm.Realm;

public class frmLogin extends pBase {

    private Realm mRealm;
    protected InputMethodManager keyboard;

    public TextView txtVersion, txtUsuario, txtClave;

    private String parNumVer = "1.0.1 / 18-08-2023";
    private String parTipoVer = "CUEE QAS";

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
                        && checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED
                        && checkSelfPermission(Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED
                        && checkCallingOrSelfPermission(Manifest.permission.WAKE_LOCK) == PackageManager.PERMISSION_GRANTED
                        && checkSelfPermission(Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED
                        && checkSelfPermission(Manifest.permission.READ_PHONE_STATE) == PackageManager.PERMISSION_GRANTED) {
                    startApplication();
                } else {
                    ActivityCompat.requestPermissions(this,
                            new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                                    Manifest.permission.ACCESS_FINE_LOCATION,
                                    Manifest.permission.CALL_PHONE,
                                    Manifest.permission.CAMERA,
                                    Manifest.permission.WAKE_LOCK,
                                    Manifest.permission.READ_PHONE_STATE
                            }, 1);
                }
            }

        } catch (Exception e) {
            alert(new Object() {
            }.getClass().getEnclosingMethod().getName()+ e.getMessage());
        }
    }

    private void startApplication() {

        File ffile;

        try {

            super.InitBase();

            txtVersion = findViewById(R.id.txtVersion);
            txtUsuario = findViewById(R.id.txtUsuario);
            txtClave = findViewById(R.id.txtClave);

            txtVersion.setText(" Version " + parNumVer + " / " + parTipoVer);

            txtUsuario.requestFocus();

        } catch (Exception e) {
            addlog(new Object() {}.getClass().getEnclosingMethod().getName(), e.getMessage(), "");
            msgbox(new Object() {}.getClass().getEnclosingMethod().getName() + " . " + e.getMessage());
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