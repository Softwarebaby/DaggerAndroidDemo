package com.qingcheng.du.app2.mvp.presenter;

import com.qingcheng.du.app2.mvp.view.MainActivity;
import com.qingcheng.du.app2.contract.MainContract;
import com.qingcheng.du.app2.mvp.model.MainModel;

import javax.inject.Inject;

/**
 * Created by Bob Du on 2018/8/8 14:09
 */
public class MainPresenter implements MainContract.presenter{
    private final MainActivity view;
    private final MainModel model;

    @Inject
    public MainPresenter(MainActivity view, MainModel model) {
        this.view = view;
        this.model = model;
    }

    public void onSkip() {
        view.skip();
    }

    public void onShowMessage() {
        view.showMessage(model.getMessge());
    }

}
