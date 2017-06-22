package com.wxy.player;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CCTV1(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv1.m3u8");
        intent.putExtra("name", "CCTV1直播");
        startActivity(intent);
    }

    public void CCTV2(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv2.m3u8");
        intent.putExtra("name", "CCTV2直播");
        startActivity(intent);
    }

    public void CCTV3(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv3.m3u8");
        intent.putExtra("name", "CCTV3直播");
        startActivity(intent);
    }

    public void CCTV4(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv4.m3u8");
        intent.putExtra("name", "CCTV4直播");
        startActivity(intent);
    }

    public void CCTV5(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv5.m3u8");
        intent.putExtra("name", "CCTV5直播");
        startActivity(intent);
    }

    public void CCTV6(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv6.m3u8");
        intent.putExtra("name", "CCTV6直播");
        startActivity(intent);
    }

    public void CCTV7(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv7.m3u8");
        intent.putExtra("name", "CCTV7直播");
        startActivity(intent);
    }

    public void CCTV8(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv8.m3u8");
        intent.putExtra("name", "CCTV8直播");
        startActivity(intent);
    }

    public void CCTV9(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv9.m3u8");
        intent.putExtra("name", "CCTV9直播");
        startActivity(intent);
    }

    public void CCTV10(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv10.m3u8");
        intent.putExtra("name", "CCTV10直播");
        startActivity(intent);
    }

    public void CCTV11(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv11.m3u8");
        intent.putExtra("name", "CCTV11直播");
        startActivity(intent);
    }

    public void CCTV12(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv12.m3u8");
        intent.putExtra("name", "CCTV12直播");
        startActivity(intent);
    }

    public void CCTV13(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/cctv13.m3u8");
        intent.putExtra("name", "CCTV13直播");
        startActivity(intent);
    }

    public void huNanTV(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/hunantv.m3u8");
        intent.putExtra("name", "湖南卫视直播");
        startActivity(intent);
    }

    public void beiJingTV(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/btv1.m3u8");
        intent.putExtra("name", "北京卫视直播");
        startActivity(intent);
    }

    public void shenZhenTV(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/sztv.m3u8");
        intent.putExtra("name", "深圳卫视直播");
        startActivity(intent);
    }

    public void guangDongTV(View view) {
        Intent intent = new Intent(this, TVActivity.class);
        intent.putExtra("url", "http://ivi.bupt.edu.cn/hls/gdtv.m3u8");
        intent.putExtra("name", "广东卫视直播");
        startActivity(intent);
    }
}
