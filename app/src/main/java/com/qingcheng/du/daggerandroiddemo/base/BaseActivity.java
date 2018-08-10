package com.qingcheng.du.daggerandroiddemo.base;

import android.app.Application;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import dagger.android.AndroidInjection;
import dagger.android.HasActivityInjector;


/**
 * Created by Bob Du on 2018/8/7 18:12
 */
public class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Application application = getApplication();

        Log.d("TAG", "onCreate: "+application.toString());
        Log.d("TAG", "onCreate: applicaiton"+(application instanceof MyApplication));
        Log.d("TAG", "onCreate: androinInjector"+(application instanceof HasActivityInjector));

        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
