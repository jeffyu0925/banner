# Android圖片輪播控件
[![Apache 2.0 License](https://img.shields.io/badge/license-Apache%202.0-blue.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0.html)

## 效果圖

|模式|圖片
|---|---|
|指示器模式|![效果示例](http://oceh51kku.bkt.clouddn.com/banner_example1.png)|
|數字模式|![效果示例](http://oceh51kku.bkt.clouddn.com/banner_example2.png)|
|數字加標題模式|![效果示例](http://oceh51kku.bkt.clouddn.com/banner_example3.png)|
|指示器加標題模式<br>垂直顯示|![效果示例](http://oceh51kku.bkt.clouddn.com/banner_example4.png)|
|指示器加標題模式<br>水平顯示|![效果示例](http://oceh51kku.bkt.clouddn.com/banner_example5.png)|

## 常量
|常量名稱|描述|所屬方法
|---|---|---|
|BannerConfig.NOT_INDICATOR| 不顯示指示器和標題|setBannerStyle
|BannerConfig.CIRCLE_INDICATOR| 顯示圓形指示器|setBannerStyle
|BannerConfig.NUM_INDICATOR| 顯示數字指示器|setBannerStyle
|BannerConfig.NUM_INDICATOR_TITLE| 顯示數字指示器和標題|setBannerStyle
|BannerConfig.CIRCLE_INDICATOR_TITLE| 顯示圓形指示器和標題（垂直顯示）|setBannerStyle
|BannerConfig.CIRCLE_INDICATOR_TITLE_INSIDE| 顯示圓形指示器和標題（水平顯示）|setBannerStyle
|BannerConfig.LEFT| 指示器居左|setIndicatorGravity
|BannerConfig.CENTER| 指示器居中|setIndicatorGravity
|BannerConfig.RIGHT| 指示器居右|setIndicatorGravity

## 動畫常量類（setBannerAnimation方法調用）
[ViewPagerTransforms](https://github.com/ToxicBakery/ViewPagerTransforms) `動畫時集成的第三方庫，可能有兼容問題導致position位置不準確，你可以選擇參考動畫然後自定義動畫`

|常量類名|
|---|
|Transformer.Default| 
|Transformer.Accordion| 
|Transformer.BackgroundToForeground| 
|Transformer.ForegroundToBackground| 
|Transformer.CubeIn| 
|Transformer.CubeOut| 
|Transformer.DepthPage| 
|Transformer.FlipHorizontal| 
|Transformer.FlipVertical| 
|Transformer.RotateDown| 
|Transformer.RotateUp| 
|Transformer.ScaleInOut| 
|Transformer.Stack| 
|Transformer.Tablet| 
|Transformer.ZoomIn| 
|Transformer.ZoomOut| 
|Transformer.ZoomOutSlide| 

## 方法
|方法名|描述|版本限制
|---|---|---|
|setBannerStyle(int bannerStyle)| 設置輪播樣式（默認為CIRCLE_INDICATOR）|無
|setIndicatorGravity(int type)| 設置指示器位置（沒有標題默認為右邊,有標題時默認左邊）|無
|isAutoPlay(boolean isAutoPlay)| 設置是否自動輪播（默認自動）|無
|setViewPagerIsScroll(boolean isScroll)| 設置是否允許手動滑動輪播圖（默認true）|1.4.5開始
|update(List<?> imageUrls,List<String> titles)| 更新圖片和標題 |1.4.5開始
|update(List<?> imageUrls)| 更新圖片 |1.4.5開始
|startAutoPlay()|開始輪播|1.4開始，此方法只作用於banner加載完畢-->需要在start()後執行
|stopAutoPlay()|結束輪播|1.4開始，此方法只作用於banner加載完畢-->需要在start()後執行
|start()|開始進行banner渲染（必須放到最後執行）|1.4開始
|setOffscreenPageLimit(int limit)|同viewpager的方法作用一樣|1.4.2開始
|setBannerTitle(String[] titles)| 設置輪播要顯示的標題和圖片對應（如果不傳默認不顯示標題）|1.3.3結束
|setBannerTitleList(List<String> titles)| 設置輪播要顯示的標題和圖片對應（如果不傳默認不顯示標題）|1.3.3結束
|setBannerTitles(List<String> titles)| 設置輪播要顯示的標題和圖片對應（如果不傳默認不顯示標題）|1.4開始
|setDelayTime(int time)| 設置輪播圖片間隔時間（單位毫秒，默認為2000）|無
|setImages(Object[]/List<?> imagesUrl)| 設置輪播圖片(所有設置參數方法都放在此方法之前執行)|1.4後去掉數組傳參
|setImages(Object[]/List<?> imagesUrl,OnLoadImageListener listener)| 設置輪播圖片，並且自定義圖片加載方式|1.3.3結束
|setOnBannerClickListener(this)|設置點擊事件，下標是從1開始|無（1.4.9以後廢棄了）
|setOnBannerListener(this)|設置點擊事件，下標是從0開始|1.4.9以後
|setOnLoadImageListener(this)|設置圖片加載事件，可以自定義圖片加載方式|1.3.3結束
|setImageLoader(Object implements ImageLoader)|設置圖片加載器|1.4開始
|setOnPageChangeListener(this)|設置viewpager的滑動監聽|無
|setBannerAnimation(Class<? extends PageTransformer> transformer)|設置viewpager的默認動畫,傳值見動畫表|無
|setPageTransformer(boolean reverseDrawingOrder, ViewPager.PageTransformer transformer)|設置viewpager的自定義動畫|無

## Attributes屬性（banner佈局文件中調用）
|Attributes|forma|describe
|---|---|---|
|delay_time| integer|輪播間隔時間，默認2000
|scroll_time| integer|輪播滑動執行時間，默認800
|is_auto_play| boolean|是否自動輪播，默認true
|title_background| color|reference|標題欄的背景色
|title_textcolor| color|標題字體顏色
|title_textsize| dimension|標題字體大小
|title_height| dimension|標題欄高度
|indicator_width| dimension|指示器圓形按鈕的寬度
|indicator_height| dimension|指示器圓形按鈕的高度
|indicator_margin| dimension|指示器之間的間距
|indicator_drawable_selected| reference|指示器選中效果
|indicator_drawable_unselected| reference|指示器未選中效果
|image_scale_type| enum |和imageview的ScaleType作用一樣
|banner_default_image| reference | 當banner數據為空是顯示的默認圖片
|banner_layout| reference |自定義banner佈局文件，但是必須保證id的名稱一樣（你可以將banner的佈局文件複製出來進行修改）

## 使用步驟

#### Step 1.依賴banner
Gradle 
```
dependencies{
    compile com.github.jeffyu0925:banner:1.0.0
}
```

#### Step 2.添加權限到你的 AndroidManifest.xml
```xml
<!-- if you want to load images from the internet -->
<uses-permission android:name="android.permission.INTERNET" /> 

<!-- if you want to load images from a file OR from the internet -->
<uses-permission android:name="android.permission.READ_EXTERNAL_STORAGE" />
```

#### Step 3.在佈局文件中添加Banner，可以設置自定義屬性
！！！此步驟可以省略，直接在Activity或者Fragment中new Banner();
```xml
<com.jeff.banner
    android:id="@+id/banner"
    android:layout_width="match_parent"
    android:layout_height="高度自己設置" />
```

#### Step 4.重寫圖片加載器
```java
public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        /**
          注意：
          1.圖片加載器由自己選擇，這裡不限制，只是提供幾種使用方法
          2.返回的圖片路徑為Object類型，由於不能確定你到底使用的那種圖片加載器，
          傳輸的到的是什麼格式，那麼這種就使用Object接收和返回，你只需要強轉成你傳輸的類型就行，
          切記不要胡亂強轉！
         */
        eg：
        
        //Glide 加載圖片簡單用法
        Glide.with(context).load(path).into(imageView);

        //Picasso 加載圖片簡單用法
        Picasso.with(context).load(path).into(imageView);
        
        //用fresco加載圖片簡單用法，記得要寫下面的createImageView方法
        Uri uri = Uri.parse((String) path);
        imageView.setImageURI(uri);
    }
    
    //提供createImageView 方法，如果不用可以不重寫這個方法，主要是方便自定義ImageView的創建
    @Override
    public ImageView createImageView(Context context) {
        //使用fresco，需要創建它提供的ImageView，當然你也可以用自己自定義的具有圖片加載功能的ImageView
        SimpleDraweeView simpleDraweeView=new SimpleDraweeView(context);
        return simpleDraweeView;
    }
}
```

#### Step 5.在Activity或者Fragment中配置Banner 

- 注意！start()方法必須放到最後執行，點擊事件請放到start()前，每次都提交問題問為什麼點擊沒有反應？需要輪播一圈才能點擊？點擊第一個怎麼返回1？麻煩仔細閱讀文檔。

```java
--------------------------簡單使用-------------------------------
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Banner banner = (Banner) findViewById(R.id.banner);
    //設置圖片加載器
    banner.setImageLoader(new GlideImageLoader());
    //設置圖片集合
    banner.setImages(images);
    //banner設置方法全部調用完畢時最後調用
    banner.start();
}
--------------------------詳細使用-------------------------------
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Banner banner = (Banner) findViewById(R.id.banner);
    //設置banner樣式
    banner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);
    //設置圖片加載器
    banner.setImageLoader(new GlideImageLoader());
    //設置圖片集合
    banner.setImages(images);
    //設置banner動畫效果
    banner.setBannerAnimation(Transformer.DepthPage);
    //設置標題集合（當banner樣式有顯示title時）
    banner.setBannerTitles(titles);
    //設置自動輪播，默認為true
    banner.isAutoPlay(true);
    //設置輪播時間
    banner.setDelayTime(1500);
    //設置指示器位置（當banner模式中有指示器時）
    banner.setIndicatorGravity(BannerConfig.CENTER);
    //banner設置方法全部調用完畢時最後調用
    banner.start();
}
-----------------當然如果你想偷下懶也可以這麼用--------------------
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Banner banner = (Banner) findViewById(R.id.banner);
    banner.setImages(images).setImageLoader(new GlideImageLoader()).start();
}
```

#### Step 6.（可選）增加體驗
```java
//如果你需要考慮更好的體驗，可以這麼操作
@Override
protected void onStart() {
    super.onStart();
    //開始輪播
    banner.startAutoPlay();
}

@Override
protected void onStop() {
    super.onStop();
    //結束輪播
    banner.stopAutoPlay();
}
```

## 混淆代碼
```java
# glide 的混淆代碼
-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
  **[] $VALUES;
  public *;
}
# banner 的混淆代碼
-keep class com.jeff.banner.** {
    *;
}
```

## 常見問題
* 問：怎麼顯示的一片空白？
    * 答：<br>
        1、沒有添加網絡權限<br>
        2、檢查圖片鏈接是否能打開。
* 問：怎麼加載其他圖片資源（資源文件、文件、Uri、assets、raw、ContentProvider、sd卡資源）？
    * 答：列如！如果你使用的是glide，那麼可以如下操作，其他圖片圖片加載框架可能有不同
        ```java 
        //資源文件
        Integer[] images={R.mipmap.a,R.mipmap.b,R.mipmap.c};
        //Uri
        Uri uri = resourceIdToUri(context, R.mipmap.ic_launcher);
        Uri[] images={uri};
        //文件對象
        File[] images={"文件對象","文件對象"};
        //raw 兩種方式
        String[] images={"Android.resource://com.frank.glide/raw/raw_1"};
        String[] images={"android.resource://com.frank.glide/raw/"+R.raw.raw_1"};
        //ContentProvider
        String[] images={"content://media/external/images/media/139469"};
        //assets
        String[] images={"file:///android_asset/f003.gif"};
        //sd卡資源
        String[] images={"file://"+ Environment.getExternalStorageDirectory().getPath()+"/test.jpg"};
        
        banner.setImages(images);//這裡接收集合,上面寫成集合太佔地方，這個大家舉一反三就行了啊
        ```
        
* 問：設置banner指示器顏色怎麼變成方的了？

    * 答：首先我先要說很多軟件的指示器也是矩形的，然後banner的指示器可以設置color、資源圖片、drawable文件夾自定義shape ，
    所以形狀你自己可以根據需求定義哦！

* 問：為什麼banner的點擊事件沒有反應，需要下一次輪播才行？點擊第一個圖片怎麼返回1？

     * 答：請將點擊事件放在start方法之前執行，start必須放到最後執行，詳情可以看demo。

## Thanks

- [ViewPagerTransforms](https://github.com/ToxicBakery/ViewPagerTransforms)