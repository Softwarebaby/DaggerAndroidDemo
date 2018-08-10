package com.qingcheng.du.daggerandroiddemo.mvp.model;

import com.qingcheng.du.daggerandroiddemo.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by Bob Du on 2018/8/7 17:45
 */
public class MainModel implements MainContract.model {

    @Inject
    public MainModel() {}

    public String getMessage() {
        return "test";
    }
}
