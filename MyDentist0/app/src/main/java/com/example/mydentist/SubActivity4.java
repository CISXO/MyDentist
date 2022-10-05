package com.example.mydentist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class SubActivity4 extends AppCompatActivity {

    private UserDao mUserDao;
    private TextView name1;
    private TextView id1;
    private TextView age1;
    private TextView eMail1;


    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);
        name1 = findViewById(R.id.name1);
        id1 = findViewById(R.id.id1);
        age1 = findViewById(R.id.age1);
        eMail1 = findViewById(R.id.eMail1);

        UserDatabase database = Room.databaseBuilder(getApplicationContext(), UserDatabase.class, "MyDentist")
                .fallbackToDestructiveMigration()   //스키마 데이타베이스 버전변경 가능
                .allowMainThreadQueries()           //메인 쓰레드에서 db에 Io(Input 입력, output 출력) 가능하게함
                .build();

        mUserDao = database.userDao();
//
//        List<User> userList = mUserDao.getUserAll();
//        userList.get(1).getName()

//        name1.setText(database.userDao().getUserAll().toString());

    }
}