package com.qingcheng.du.app2.di.scope;

import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by Bob Du on 2018/8/7 18:26
 */
@Scope
@Retention(RUNTIME)
public @interface ActivityScope {

}
