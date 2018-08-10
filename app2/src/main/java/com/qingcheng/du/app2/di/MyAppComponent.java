package com.qingcheng.du.app2.di;

import com.qingcheng.du.app2.base.MyApplication;
import com.qingcheng.du.app2.di.module.Main2ActivityModule;
import com.qingcheng.du.app2.di.module.MainActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by Bob Du on 2018/8/8 11:53
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,
        Main2ActivityModule.class
})
public interface MyAppComponent {
    void inject(MyApplication application);
}
