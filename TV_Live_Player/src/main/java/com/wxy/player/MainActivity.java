package com.wxy.player;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.wxy.player.tv.CCTV10Activity;
import com.wxy.player.tv.CCTV11Activity;
import com.wxy.player.tv.CCTV12Activity;
import com.wxy.player.tv.CCTV13Activity;
import com.wxy.player.tv.CCTV1Activity;
import com.wxy.player.tv.CCTV2Activity;
import com.wxy.player.tv.CCTV3Activity;
import com.wxy.player.tv.CCTV4Activity;
import com.wxy.player.tv.CCTV5Activity;
import com.wxy.player.tv.CCTV6Activity;
import com.wxy.player.tv.CCTV7Activity;
import com.wxy.player.tv.CCTV8Activity;
import com.wxy.player.tv.CCTV9Activity;
import com.wxy.player.tv.HunanTVActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CCTV1(View view) {
        startActivity(new Intent(this, CCTV1Activity.class));
    }

    public void CCTV2(View view) {
        startActivity(new Intent(this, CCTV2Activity.class));
    }

    public void CCTV3(View view) {
        startActivity(new Intent(this, CCTV3Activity.class));
    }

    public void CCTV4(View view) {
        startActivity(new Intent(this, CCTV4Activity.class));
    }

    public void CCTV5(View view) {
        startActivity(new Intent(this, CCTV5Activity.class));
    }

    public void CCTV6(View view) {
        startActivity(new Intent(this, CCTV6Activity.class));
    }

    public void CCTV7(View view) {
        startActivity(new Intent(this, CCTV7Activity.class));
    }

    public void CCTV8(View view) {
        startActivity(new Intent(this, CCTV8Activity.class));
    }

    public void CCTV9(View view) {
        startActivity(new Intent(this, CCTV9Activity.class));
    }

    public void CCTV10(View view) {
        startActivity(new Intent(this, CCTV10Activity.class));
    }

    public void CCTV11(View view) {
        startActivity(new Intent(this, CCTV11Activity.class));
    }

    public void CCTV12(View view) {
        startActivity(new Intent(this, CCTV12Activity.class));
    }

    public void CCTV13(View view) {
        startActivity(new Intent(this, CCTV13Activity.class));
    }

    public void huNanTV(View view) {
        startActivity(new Intent(this, HunanTVActivity.class));
    }
}
