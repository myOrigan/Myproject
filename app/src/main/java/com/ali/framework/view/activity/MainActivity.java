package com.ali.framework.view.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * 作者：Han98
 * 创建时间：2020/1/6
 * 描述：TODO
 * 最近修改：2020/1/6 19:01 modify by liujc
 */
public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("myMessage","onCreate");
        Log.e("myMessage","caojun");
        Log.e("myMessage","韩鹏飞");
    }
}
