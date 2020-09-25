package com.suek.ex26acticvity2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et= findViewById(R.id.et);

    }




    public void clickBtn(View view) {
        // 1) Second Acitivity 에 전달할 데이터를 EditText 로  부터 얻어오기
        String s= et.getText().toString();

        // 2) Second Activity 를 실행할 Intent 객체(택배기사) 생성
        Intent intent= new Intent(this, ScondActivty.class);

        // 4) SecondActivity 에 전달할 데이터를 택배기사(intent)에게 추가하기
        intent.putExtra("Name", s);       //식별자(Name)와 값(value)
        intent.putExtra("Age", 20);

        // 3) 택배기사를 통해 새로운 액티비티 실행요청
        startActivity(intent);

        finish();
    }




}
