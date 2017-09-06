package com.dominique.labexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_Quiz1;
    EditText et_Quiz2;
    EditText et_SW;
    EditText et_LE;
    EditText et_ME;
    Button btn_Compute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Quiz1 = (EditText) findViewById(R.id.etQuiz1);
        et_Quiz2 = (EditText) findViewById(R.id.etQuiz2);
        et_SW = (EditText) findViewById(R.id.etSW);
        et_LE = (EditText) findViewById(R.id.etLE);
        et_ME = (EditText) findViewById(R.id.etME);
        btn_Compute = (Button) findViewById(R.id.btnCompute);
    }

    public void callSecondActivity (View view){
        Intent intent = new Intent(this, SecondActivity.class);

        double dQ1 = .10*(Integer.parseInt(et_Quiz1.getText().toString()));
        double dQ2 = .10*(Integer.parseInt(et_Quiz2.getText().toString()));
        double dSW = .10*(Integer.parseInt(et_SW.getText().toString()));
        double dLE = .40*(Integer.parseInt(et_LE.getText().toString()));
        double dME = .30*(Integer.parseInt(et_ME.getText().toString()));

        double ra = dQ1 + dQ2 + dSW + dLE + dME;
        intent.putExtra("ra", Double.toString(ra));

        String fg = new String();
        if(ra<60) {
            fg = "FAILED";
        }else if (ra<=65){
            fg = "3.0";
        }else if (ra<=70){
            fg = "2.75";
        }else if (ra<=75){
            fg = "2.5";
        }else if (ra<=80){
            fg = "2.0";
        }else if (ra<= 85){
            fg = "1.75";
        }else if (ra<=90){
            fg = "1.5";
        }else if (ra<=95){
            fg = "1.25";
        }else if(ra<=100){
            fg = "1.0";
        }

        intent.putExtra("fg", fg);
        startActivity(intent);
    }
}
