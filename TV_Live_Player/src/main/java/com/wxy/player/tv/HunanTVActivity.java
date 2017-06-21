package com.wxy.player.tv;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

public class HunanTVActivity extends BaseTVActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.getURL("http://ivi.bupt.edu.cn/hls/hunantv.m3u8");
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("湖南卫视直播");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

}
