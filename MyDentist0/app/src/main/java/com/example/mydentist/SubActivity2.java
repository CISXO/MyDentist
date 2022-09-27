package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity2 extends AppCompatActivity {

    private Button btn_move_teeth1;
    private Button btn_move_teeth2;
    private Button btn_move_teeth3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        btn_move_teeth1 = findViewById(R.id.btn_move_teeth1);
        btn_move_teeth1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity2.this, brushing_teeth.class);
                startActivity(intent);
            }
        });

        btn_move_teeth2 = findViewById(R.id.btn_move_teeth2);
        btn_move_teeth2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity2.this, denture_manage.class);
                startActivity(intent);
            }
        });

        btn_move_teeth3 = findViewById(R.id.btn_move_teeth3);
        btn_move_teeth3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity2.this, assistant_teeth.class);
                startActivity(intent);
            }
        });

    }
}