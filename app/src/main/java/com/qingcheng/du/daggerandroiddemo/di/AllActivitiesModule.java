package com.qingcheng.du.daggerandroiddemo.di;

import com.qingcheng.du.daggerandroiddemo.di.module.Main2ActivityModule;
import com.qingcheng.du.daggerandroiddemo.di.module.MainActivityModule;
import com.qingcheng.du.daggerandroiddemo.di.scope.ActivityScope;
import com.qingcheng.du.daggerandroiddemo.mvp.view.Main2Activity;
import com.qingcheng.du.daggerandroiddemo.mvp.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bob Du on 2018/8/7 18:21
 */
@Module
public abstract class AllActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = Main2ActivityModule.class)
    abstract Main2Activity contributeMain2ActivityInjector();
}
