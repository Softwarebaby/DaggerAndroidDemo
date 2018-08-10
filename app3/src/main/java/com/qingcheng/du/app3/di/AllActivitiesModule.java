package com.qingcheng.du.app3.di;

import com.qingcheng.du.app3.di.module.Main2ActivityModule;
import com.qingcheng.du.app3.di.module.MainActivityModule;
import com.qingcheng.du.app3.di.scope.ActivityScope;
import com.qingcheng.du.app3.mvp.view.Main2Activity;
import com.qingcheng.du.app3.mvp.view.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Bob Du on 2018/8/7 18:21
 */
@Module(subcomponents = BaseActivityComponent.class)
public abstract class AllActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity contributeMainActivityInjector();

    @ActivityScope
    @ContributesAndroidInjector(modules = Main2ActivityModule.class)
    abstract Main2Activity contributeMain2ActivityInjector();
    /**
     * CardActivityModule(.......)
     * Studetn...
     * Checkout...
     * Group ...
     *
     * ....
     * ...
     * ..
     *
     */
}
