package com.qingcheng.du.app2.di.module;

import android.app.Activity;

import com.qingcheng.du.app2.mvp.view.MainActivity;
import com.qingcheng.du.app2.di.subcomponent.MainActivitySubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Bob Du on 2018/8/8 12:14
 */
@Module(subcomponents = MainActivitySubComponent.class)
public abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectFactory(MainActivitySubComponent.Builder builder);
}
