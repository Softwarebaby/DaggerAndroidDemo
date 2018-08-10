package com.qingcheng.du.app3.di;

import com.qingcheng.du.app3.base.BaseActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Bob Du on 2018/8/8 16:07
 */
@Subcomponent(modules = AndroidInjectionModule.class)
public interface BaseActivityComponent extends AndroidInjector<BaseActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity> {

    }
}
