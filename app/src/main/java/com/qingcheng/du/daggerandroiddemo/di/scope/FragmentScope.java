package com.qingcheng.du.daggerandroiddemo.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Bob Du on 2018/8/7 18:29
 */
@Scope
@Retention(RUNTIME)
public @interface FragmentScope {

}
