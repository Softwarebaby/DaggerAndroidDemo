package com.qingcheng.du.app3.mvp.presenter;

import com.qingcheng.du.app3.contract.MainContract;
import com.qingcheng.du.app3.mvp.model.MainModel;
import com.qingcheng.du.app3.mvp.view.MainActivity;

import javax.inject.Inject;

/**
 * Created by Bob Du on 2018/8/7 17:45
 */
public class MainPresenter implements MainContract.presenter{
    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity activity, MainModel model){
        this.view = activity;
        this.model = model;
    }

    public void onSkip() {
        view.skip();
    }

    public void onShowMessage() {
        view.showMessage(model.getMessage());
    }

}
