package com.qingcheng.du.daggerandroiddemo.di;

import com.qingcheng.du.daggerandroiddemo.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Bob Du on 2018/8/7 18:41
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitiesModule.class
})
public interface MyAppComponent extends AndroidInjector<MyApplication> {
}
