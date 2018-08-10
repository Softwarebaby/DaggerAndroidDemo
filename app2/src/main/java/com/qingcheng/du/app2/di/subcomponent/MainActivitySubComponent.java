package com.qingcheng.du.app2.di.subcomponent;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingcheng.du.app2.mvp.view.MainActivity;
import com.qingcheng.du.app2.bean.User;
import com.qingcheng.du.app2.mvp.model.MainModel;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Bob Du on 2018/8/8 13:35
 */
@Subcomponent(modules = {
        AndroidInjectionModule.class,
        MainActivitySubComponent.SubModule.class
})
public interface MainActivitySubComponent extends AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {

    }

    @Module
    class SubModule{
        @Provides
        String provideName() {
            return MainActivity.class.getName();
        }
        @Provides
        SharedPreferences provideSp(MainActivity activity) {
            return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
        }
        @Provides
        User provideUser() {
            return new User();
        }
        @Provides
        MainModel provideModel() {
            return new MainModel();
        }
    }
}
