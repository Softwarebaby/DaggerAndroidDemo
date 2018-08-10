package com.qingcheng.du.daggerandroiddemo.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingcheng.du.daggerandroiddemo.bean.User;
import com.qingcheng.du.daggerandroiddemo.di.scope.ActivityScope;
import com.qingcheng.du.daggerandroiddemo.mvp.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bob Du on 2018/8/7 18:36
 */

@Module
public class MainActivityModule {

    @Provides
    static String provideName() {
        return MainActivity.class.getName();
    }

    @Provides
    static SharedPreferences provideSp(MainActivity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static User provideUser() {
        return new User();
    }
}
