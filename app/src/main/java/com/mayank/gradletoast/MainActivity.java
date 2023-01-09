package com.mayank.gradletoast;

import  androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.logging.ErrorManager;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void showtoast(View view){
            switch (view.getId()){
                case R.id.error:
                    Toasty.error(MainActivity.this, "This is an error toast.", Toast.LENGTH_SHORT, true).show();
                    break;
                case R.id.success:
                    Toasty.success(MainActivity.this, "This is a success toast.", Toast.LENGTH_SHORT, true).show();
                    break;
                case R.id.info:
                    Toasty.info(MainActivity.this, "This is an info toast.", Toast.LENGTH_SHORT, true).show();
                    break;
                case R.id.warning:
                    Toasty.warning(MainActivity.this, "This is a warning toast.", Toast.LENGTH_SHORT, true).show();
                    break;
                case R.id.image:
                    Toasty.normal(MainActivity.this, "Image",
                                    Toast.LENGTH_SHORT,
                                    ContextCompat.getDrawable(MainActivity.this, R.drawable.cloud))
                            .show();

            }




        }





}