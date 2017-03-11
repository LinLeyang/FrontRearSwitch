package com.penta.frontrearswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "正常切换至MainActivity", Toast.LENGTH_SHORT).show();
    }

    public void gotoOtherActivity(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}
