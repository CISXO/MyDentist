package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class SubActivity1 extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);


        findViewById(R.id.button01).setOnClickListener(this);
        findViewById(R.id.button02).setOnClickListener(this);
        findViewById(R.id.button03).setOnClickListener(this);
        findViewById(R.id.button04).setOnClickListener(this);
        findViewById(R.id.button05).setOnClickListener(this);
        findViewById(R.id.button06).setOnClickListener(this);
        findViewById(R.id.button07).setOnClickListener(this);
        findViewById(R.id.button08).setOnClickListener(this);
        findViewById(R.id.button09).setOnClickListener(this);
        findViewById(R.id.button10).setOnClickListener(this);
        findViewById(R.id.button11).setOnClickListener(this);
        findViewById(R.id.button12).setOnClickListener(this);
        findViewById(R.id.button13).setOnClickListener(this);
        findViewById(R.id.button14).setOnClickListener(this);



    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button01:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("임플란트.\n\n 221002")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button02:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("임플란트.\n\n 221111")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;
            case R.id.button03:

            case R.id.button04:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button05:

            case R.id.button06:

            case R.id.button07:

            case R.id.button08:

            case R.id.button09:

            case R.id.button10:

            case R.id.button11:

            case R.id.button12:

            case R.id.button13:

            case R.id.button14:

                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("우우...")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;


        }
    }

}