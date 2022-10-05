package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;


import android.annotation.SuppressLint;



import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;


public class SubActivity1 extends AppCompatActivity implements View.OnClickListener {
    @SuppressLint("MissingInflatedId")



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
                        .setMessage("221002 임플란트.\n\n")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button02:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("221111 임플란트.\n\n")
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
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("221111 라미네이트.\n\n")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;


            case R.id.button06:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없으나 발치 예정.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button07:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button08:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button09:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button10:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button11:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("라미네이트. \n\n 201008")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button12:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("190204 라미네이트. \n\n 211025 재치료.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button13:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button14:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("없음.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;
        }
    }


}