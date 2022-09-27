package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class brushing_teeth extends AppCompatActivity {

    private Button btn_move_dd1;
    private Button btn_move_dd2;
    private Button btn_move_dd3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brushing_teeth);

        btn_move_dd1 = findViewById(R.id.btn_move_dd1);
        btn_move_dd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brushing_teeth.this, video_teeth1.class);
                startActivity(intent);
            }
        });


        btn_move_dd2 = findViewById(R.id.btn_move_dd2);
        btn_move_dd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brushing_teeth.this, video_teeth2.class);
                startActivity(intent);
            }
        });


        btn_move_dd3 = findViewById(R.id.btn_move_dd3);
        btn_move_dd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(brushing_teeth.this, video_teeth3.class);
                startActivity(intent);
            }
        });

    }
}