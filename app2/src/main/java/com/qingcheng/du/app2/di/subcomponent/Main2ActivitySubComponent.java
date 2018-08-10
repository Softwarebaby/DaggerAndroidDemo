package com.qingcheng.du.app2.di.subcomponent;

import android.content.Context;
import android.content.SharedPreferences;

import com.qingcheng.du.app2.mvp.model.MainModel;
import com.qingcheng.du.app2.mvp.view.Main2Activity;
import com.qingcheng.du.app2.bean.User;

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
        Main2ActivitySubComponent.SubModule.class
})
public interface Main2ActivitySubComponent extends AndroidInjector<Main2Activity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<Main2Activity>{

    }

    @Module
    class SubModule{
        @Provides
        String provideName() {
            return Main2Activity.class.getName();
        }
        @Provides
        SharedPreferences provideSp(Main2Activity activity) {
            return activity.getSharedPreferences("ref", Context.MODE_PRIVATE);
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
