package com.qingcheng.du.app3.di.module;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingcheng.du.app3.bean.User;
import com.qingcheng.du.app3.di.scope.ActivityScope;
import com.qingcheng.du.app3.mvp.view.Main2Activity;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Bob Du on 2018/8/7 18:37
 */

@Module
public class Main2ActivityModule {

    @Provides
    static String provideName() {
        return Main2Activity.class.getName();
    }

    @Provides
    static SharedPreferences provideSp(Main2Activity activity) {
        return activity.getSharedPreferences("def", Context.MODE_PRIVATE);
    }

    @Provides
    @ActivityScope
    static User provideUser() {
        return new User();
    }

}
