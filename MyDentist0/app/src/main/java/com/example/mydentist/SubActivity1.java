package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

        findViewById(R.id.button01).setOnClickListener(this);
        findViewById(R.id.button02).setOnClickListener(this);
        findViewById(R.id.button03).setOnClickListener(this);
        findViewById(R.id.button04).setOnClickListener(this);
        findViewById(R.id.button05).setOnClickListener(this);

}