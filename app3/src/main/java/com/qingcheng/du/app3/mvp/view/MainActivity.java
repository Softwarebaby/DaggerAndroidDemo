package com.qingcheng.du.app3.mvp.view;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.qingcheng.du.app3.R;
import com.qingcheng.du.app3.base.BaseActivity;
import com.qingcheng.du.app3.bean.User;
import com.qingcheng.du.app3.contract.MainContract;
import com.qingcheng.du.app3.mvp.presenter.MainPresenter;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainContract.view, IMainActivity {
    @Inject
    String className;
    @Inject
    MainPresenter mainPresenter;
    @Inject
    SharedPreferences sharedPreferences;
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
        skipBtn = (Button)findViewById(R.id.btn_skip);
        messageBtn = (Button)findViewById(R.id.btn_message);
        contentTv.setText(className+"\n"+sharedPreferences+"\n"+user1+"\n"+user2);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.onSkip();
            }
        });
        messageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.onShowMessage();
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
