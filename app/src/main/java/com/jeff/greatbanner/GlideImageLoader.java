package com.jeff.greatbanner;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jeff.banner.loader.ImageLoader;

public class GlideImageLoader extends ImageLoader {

    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {

        Glide.with(context).load(path).into(imageView);
    }
}
