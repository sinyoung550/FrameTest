package com.example.parksinyoung.framelayouttest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout[] Linears=new LinearLayout[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button[] buts = new Button[3];
        for(int i = 0; i <buts.length;i++){
            buts[i] = (Button)findViewById(R.id.but1+i);
            Linears[i]=(LinearLayout)findViewById(R.id.Line1+i);//Line1,Line2,LIne3 ...
            buts[i].setOnClickListener(butHandler);
        }
    }
    View.OnClickListener butHandler/*참조변수 이름*/=new View.OnClickListener() {
        public void onClick(View v) { //객체 생성까지 같이해줌
            switch(v.getId()){
                case R.id.but1:
                    Linears[0].setVisibility(v.VISIBLE);
                    Linears[1].setVisibility(v.INVISIBLE);
                    Linears[2].setVisibility(v.INVISIBLE);
                    break;
                case R.id.but2:
                    Linears[0].setVisibility(v.INVISIBLE);
                    Linears[1].setVisibility(v.VISIBLE);
                    Linears[2].setVisibility(v.INVISIBLE);
                    break;
                case R.id.but3:
                    Linears[0].setVisibility(v.INVISIBLE);
                    Linears[1].setVisibility(v.INVISIBLE);
                    Linears[2].setVisibility(v.VISIBLE);
                    break;
            }
        }
    };
}
