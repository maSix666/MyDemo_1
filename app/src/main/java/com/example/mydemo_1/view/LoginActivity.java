package com.example.mydemo_1.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mydemo_1.R;
import com.example.mydemo_1.TwoActivity;
import com.example.mydemo_1.presenter.IMainPresenter;
import com.example.mydemo_1.presenter.MainPresenterImpl;

public class LoginActivity extends AppCompatActivity implements IMainView {

    private EditText editTextTextPersonName;
    private EditText editTextTextPassword;
    private IMainPresenter presenter;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

        presenter = new MainPresenterImpl(this);

    }


    //登陆的点击事件
    public void loginButton(View view) {
        if (!TextUtils.isEmpty(getUserName()) && !TextUtils.isEmpty(getPassword())) {
            presenter.login(getUserName(), getPassword());
            Toast.makeText(this, "账号密码不为空，登陆成功！！！", Toast.LENGTH_SHORT).show();
            startActivity(new Intent(this, TwoActivity.class));
        }


    }

    @Override
    public String getUserName() {
        return editTextTextPersonName.getText().toString();
    }

    @Override
    public String getPassword() {
        return editTextTextPassword.getText().toString();
    }

    //数据返回
    @Override
    public void getLoginData(String string) {
        str = string;
    }
}