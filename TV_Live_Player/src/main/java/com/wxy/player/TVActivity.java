package com.wxy.player;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.devlin_n.floatWindowPermission.FloatWindowManager;
import com.devlin_n.yinyangplayer.controller.StandardVideoController;
import com.devlin_n.yinyangplayer.player.YinYangPlayer;

/**
 * Created by wang on 2017/6/22.
 */

public class TVActivity extends AppCompatActivity {
    private YinYangPlayer yinYangPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);
        yinYangPlayer = (YinYangPlayer) findViewById(R.id.player);

        String url = getIntent().getStringExtra("url");
        String name = getIntent().getStringExtra("name");

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(name);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        StandardVideoController controller = new StandardVideoController(this);
        controller.setLive(true);
        Glide.with(this).load("http://7xqblc.com1.z0.glb.clouddn.com/tvlive.jpg").asBitmap()
                .animate(R.anim.anim_alpha_in).placeholder(android.R.color.black).into(controller.getThumb());
        yinYangPlayer.autoRotate()
//                .useAndroidMediaPlayer()
                .setUrl(url)
                .setVideoController(controller);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        super.onPause();
        yinYangPlayer.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        yinYangPlayer.resume();
        yinYangPlayer.stopFloatWindow();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        yinYangPlayer.release();
    }

    @Override
    public void onBackPressed() {
        if (!yinYangPlayer.onBackPressed()) {
            super.onBackPressed();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == FloatWindowManager.PERMISSION_REQUEST_CODE) {
            if (FloatWindowManager.getInstance().checkPermission(this)) {
                yinYangPlayer.startFloatWindow();
            } else {
                Toast.makeText(TVActivity.this, "权限授予失败，无法开启悬浮窗", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
