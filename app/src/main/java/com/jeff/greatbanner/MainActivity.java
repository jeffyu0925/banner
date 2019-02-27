package com.jeff.greatbanner;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jeff.banner.widget.Banner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> list = new ArrayList<>();
        list.add("https://s.aolcdn.com/hss/storage/midas/17f4b60aec299f212a456632b2311c5e/202565129/google-1200-2.jpg");
        list.add("https://pay.google.com/about/static/images/social/knowledge_graph_logo.png");

        Banner banner = findViewById(R.id.banner);
        banner.setDelayTime(3000);
        banner.setImages(list).setImageLoader(new GlideImageLoader()).start();
    }
}
