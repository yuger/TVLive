package com.wxy.player.tv;

import android.os.Bundle;
import android.support.v7.app.ActionBar;

/**
 * Created by wang on 2017/6/21.
 */

public class CCTV11Activity extends BaseTVActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.getURL("http://ivi.bupt.edu.cn/hls/cctv11.m3u8");
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("CCTV11直播");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
