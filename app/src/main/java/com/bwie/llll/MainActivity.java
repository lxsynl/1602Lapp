    package com.bwie.llll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.RadioGroup;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rg_id = findViewById(R.id.rg_id);
        getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment_1()).commit();

        rg_id.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.rb_1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment_1()).commit();
                        break;
                    case R.id.rb_2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment_2()).commit();
                        break;
                    case R.id.rb_3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.frag,new Fragment_3()).commit();
                        break;
                }
            }
        });
    }
}
