package com.qingcheng.du.daggerandroiddemo.mvp.view;

import android.os.Bundle;
import android.widget.TextView;

import com.qingcheng.du.daggerandroiddemo.R;
import com.qingcheng.du.daggerandroiddemo.base.BaseActivity;
import com.qingcheng.du.daggerandroiddemo.contract.MainContract;

import javax.inject.Inject;


public class Main2Activity extends BaseActivity implements MainContract.view {
    @Inject
    String className;
    private TextView contentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        contentTv = (TextView) findViewById(R.id.tv_content);
        contentTv.setText(className);
    }
}
