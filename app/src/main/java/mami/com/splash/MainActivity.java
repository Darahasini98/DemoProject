package mami.com.splash;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private int SPLASH_TIME_OUT = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        splashscreen();
    }
    public void splashscreen()
    {
        new Handler().postDelayed((new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,NextActivity.class));
                finish();
            }
        }),SPLASH_TIME_OUT);

    }
}
