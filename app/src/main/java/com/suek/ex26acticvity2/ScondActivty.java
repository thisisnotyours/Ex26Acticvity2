package com.suek.ex26acticvity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ScondActivty extends AppCompatActivity {

    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond_activty);

        tv= findViewById(R.id.tv);

        //이 액티비티를 실행한 택배기사()Intent 객체 참조하기
        Intent intent= getIntent();    //날 실행한 그 택배기사(그래서 new 를 하지않음)
        // 그 인텐드 객체에게 추가 데이터를 얻어오기
        String name= intent.getStringExtra("Name");
        int age= intent.getIntExtra("Age",0); //두번째 파라미터: 혹시 전달된 값이 없으면 기본값

        // 전달된 값 TextView 에 보여주기
        tv.setText(name+"\n"+age);
    }
}
