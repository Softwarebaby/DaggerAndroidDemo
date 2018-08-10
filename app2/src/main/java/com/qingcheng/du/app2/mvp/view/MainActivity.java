package com.qingcheng.du.app2.mvp.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.qingcheng.du.app2.R;
import com.qingcheng.du.app2.base.BaseActivity;
import com.qingcheng.du.app2.bean.User;
import com.qingcheng.du.app2.contract.MainContract;
import com.qingcheng.du.app2.mvp.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.view, IMainActivity {
    @Inject
    String className;
    @Inject
    SharedPreferences sharedPreferences;
    @Inject
    MainPresenter presenter;
    @Inject
    User user1;
    @Inject
    User user2;

    private TextView contentTv;
    private Button skipBtn;
    private Button messageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contentTv = (TextView)findViewById(R.id.tv_content);
        contentTv.setText(className+"\n"+sharedPreferences+"\n"+user1+"\n"+user2);
        skipBtn = (Button)findViewById(R.id.btn_skip);
        messageBtn = (Button)findViewById(R.id.btn_message);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onSkip();
            }
        });
        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onShowMessage();
            }
        });
    }

    @Override
    public void skip() {
        startActivity(new Intent(this, Main2Activity.class));
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
