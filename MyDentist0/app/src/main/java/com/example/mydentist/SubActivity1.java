package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public class SubActivity1 extends AppCompatActivity implements View.OnClickListener {



    @SuppressLint("MissingInflatedId")
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub1);

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
        findViewById(R.id.imageView).setOnClickListener(this);
        findViewById(R.id.imageView2).setOnClickListener(this);
        findViewById(R.id.imageView4).setOnClickListener(this);

    }

    public void onClick(View v) {
        switch (v.getId()) {
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
                        .setMessage("없음.\n\n")
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
                        .setMessage("201008 레진.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.button12:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("190204 레진. \n\n 211025 재치료.")
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

            case R.id.imageView:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("220110 임플란트.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.imageView2:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("180110 임플란트. \n\n 221001 레진.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;

            case R.id.imageView4:
                new AlertDialog.Builder(this)
                        .setTitle("진료 기록")
                        .setMessage("190204 레진. \n\n 211025 재치료. \n\n 221001 2차 치료.")
                        .setNeutralButton("닫기", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dlg, int sumthin) {
                            }
                        })
                        .show(); // 팝업창 보여줌
                break;
        }
    }

}