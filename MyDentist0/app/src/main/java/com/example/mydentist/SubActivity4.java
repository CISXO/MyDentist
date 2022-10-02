package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SubActivity4 extends AppCompatActivity {

    private UserDao mUserDao;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);
//

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "MyDentist")
                .fallbackToDestructiveMigration()   //스키마 데이타베이스 버전변경 가능
                .allowMainThreadQueries()           //메인 쓰레드에서 db에 Io(Input 입력, output 출력) 가능하게함
                .build();

        mUserDao = database.userDao();

        List<User> userList = mUserDao.getUserAll();
    }
}