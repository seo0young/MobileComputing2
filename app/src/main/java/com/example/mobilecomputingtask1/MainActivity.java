package com.example.mobilecomputingtask1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    List<String> cardValues;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text=findViewById(R.id.textView2);

        cardValues=new ArrayList<>();

        //텍스트 문자열배열에 문자추가
        cardValues.add("사람은 오로지 가슴으로만 올바로 볼 수 있다. 본질적인 것은 눈에 보이지 않는다\n" + "-생텍쥐페리-\n");
        cardValues.add("빛을 퍼뜨릴 수 있는 두 가지 방법이 있다. 촛불이 되거나 또는 그것을 비추는 거울이 되는 것이다\n" +
                "-이디스 워튼-\n");
        cardValues.add("두려움 때문에 갖는 존경심만큼 비열한 것은 없다\n" +
                "-카뮈-\n" );
        cardValues.add("당신이 잘 하는 일이라면 무엇이나 행복에 도움이 된다\n" + "-러셀-\n");
        cardValues.add("스스로를 신뢰하는 사람만이 다른 사람들에게 성실할 수 있다\n" + "-에릭 프롬-\n");

        btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random r = new Random();
                String randomValue = cardValues.get(r.nextInt(cardValues.size()));
                text.setText(randomValue);
            }
        });
    }
}