package com.qingcheng.du.app2.di.module;

import android.app.Activity;

import com.qingcheng.du.app2.mvp.view.Main2Activity;
import com.qingcheng.du.app2.di.subcomponent.Main2ActivitySubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Bob Du on 2018/8/8 12:15
 */
@Module(subcomponents = Main2ActivitySubComponent.class)
public abstract class Main2ActivityModule {

    @Binds
    @IntoMap
    @ActivityKey(Main2Activity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMain2ActivityInjectorFactory(Main2ActivitySubComponent.Builder builder);

}
