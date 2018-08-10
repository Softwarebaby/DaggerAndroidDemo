package com.qingcheng.du.app2.mvp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.qingcheng.du.app2.R;
import com.qingcheng.du.app2.base.BaseActivity;
import com.qingcheng.du.app2.contract.MainContract;

import javax.inject.Inject;

public class Main2Activity extends BaseActivity implements MainContract.view {
    @Inject
    String className;

    private TextView contentTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        contentTv = (TextView)findViewById(R.id.tv_content);
        contentTv.setText(className);
    }
}
