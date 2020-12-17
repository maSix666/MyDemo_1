package com.example.mydemo_1.presenter;

import android.content.Intent;

public interface IMainPresenter {
    void login(String name,String password);
    void loginResult(String result);

}
