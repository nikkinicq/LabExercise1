package com.dominique.labexercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tv_RA;
    TextView tv_FG;
    Button btn_goBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv_RA = (TextView) findViewById(R.id.tvRA);
        tv_FG = (TextView) findViewById(R.id.tvFG);
        btn_goBack = (Button) findViewById(R.id.goBack);

        String ra = getIntent().getStringExtra("ra");
        String fg = getIntent().getStringExtra("fg");

        tv_RA.setText("Your RA is: " + ra);
        tv_FG.setText("Your FG is: " + fg);
    }

    public void callgoBackToMain (View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
