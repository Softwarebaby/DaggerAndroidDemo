package com.qingcheng.du.app2.mvp.model;

import com.qingcheng.du.app2.contract.MainContract;

import javax.inject.Inject;

/**
 * Created by Bob Du on 2018/8/8 14:09
 */
public class MainModel implements MainContract.model{

    @Inject
    public MainModel(){}

    public String getMessge() {
        return "test";
    }
}
