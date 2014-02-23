package com.yagihitsuji.viewpager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

/**
 */
public class SplashActivity extends BaseFragmentActivity {
    private static final String TAG = "SplashActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, TabActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        }, 1000);
    }
}
