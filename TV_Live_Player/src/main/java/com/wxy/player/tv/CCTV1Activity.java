package com.wxy.player.tv;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wxy.player.R;

public class CCTV1Activity extends BaseTVActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.getURL("http://ivi.bupt.edu.cn/hls/cctv1.m3u8");
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("CCTV1直播");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
