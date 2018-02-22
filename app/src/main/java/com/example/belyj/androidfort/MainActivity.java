package com.example.belyj.androidfort;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init() {
        textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Animation animation = null;
        switch (item.getItemId()) {
            case R.id.alpha:
                animation = AnimationUtils.loadAnimation(this, R.anim.myalpha);
                break;
            case R.id.combo:
                animation = AnimationUtils.loadAnimation(this, R.anim.mycombo);
                break;
            case R.id.rotate:
                animation = AnimationUtils.loadAnimation(this, R.anim.myrotate);
                break;
            case R.id.scale:
                animation = AnimationUtils.loadAnimation(this, R.anim.myscale);
                break;
            case R.id.trans:
                animation = AnimationUtils.loadAnimation(this, R.anim.mytrans);
                break;
        }
        if (animation != null) {
            textView.startAnimation(animation);
        }
        return super.onOptionsItemSelected(item);
    }
}
