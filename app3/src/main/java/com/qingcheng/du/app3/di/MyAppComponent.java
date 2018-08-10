package com.qingcheng.du.app3.di;

import com.qingcheng.du.app3.base.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
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
