package com.example.mydemo_1.model;

import com.example.mydemo_1.presenter.IMainPresenter;

public class MainModelImpl implements IMainModel {

    private IMainPresenter presenter;

    public MainModelImpl(IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void getLoginData() {
        presenter.loginResult("登陆成功了");
    }
}
