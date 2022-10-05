package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.mydentist.ui.login.LoginActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_login;
    private Button btn_move1;
    private Button btn_move2;
    private Button btn_move3;
    private Button btn_move4;
    private UserDao mUserDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "MyDentist")
                .fallbackToDestructiveMigration()   //스키마 데이타베이스 버전변경 가능
                .allowMainThreadQueries()           //메인 쓰레드에서 db에 Io(Input 입력, output 출력) 가능하게함
                .build();

        mUserDao = database.userDao(); //interface 객체 할당

//        데이타 삽입
        User user = new User(); // 객체 인스턴스 생성
        user.setName("Jo");
        user.setAge("25");
        user.setEmail("cisxo@naver.com");
        user.setYear("19980430");
        user.setPasswd("2248");
        mUserDao.setInsertUser(user);
        List<User> userList = mUserDao.getUserAll();
        //데이타 조회
        for (int i=0; i< userList.size(); i++) {
            Log.d("TEST", userList.get(i).getName() + "\n"
            + userList.get(i).getAge()+ "\n" + userList.get(i).getEmail()
            + "\n" + userList.get(i).getPasswd()+"\n" + userList.get(i).getYear()
                    +"\n");
        }

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btn_move1 = findViewById(R.id.btn_move1);
        btn_move1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(intent);
            }
        });
        btn_move2 = findViewById(R.id.btn_move2);
        btn_move2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent);
            }
        });
        btn_move3 = findViewById(R.id.btn_move3);
        btn_move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity3.class);
                startActivity(intent);
            }
        });
        btn_move4 = findViewById(R.id.btn_move4);
        btn_move4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity4.class);
                startActivity(intent);
            }
        });

    }
}