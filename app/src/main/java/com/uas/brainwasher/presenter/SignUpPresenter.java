package com.uas.brainwasher.presenter;

import android.content.Context;
import android.widget.EditText;

import com.uas.brainwasher.data.model.User;
import com.uas.brainwasher.data.repo.UserRepository;
import com.uas.brainwasher.view.SignUpView;

/* 10116317 - Husna Kusuma Wardani
   10 Agustus 2019
* */

public class SignUpPresenter {

    private SignUpView view;
    private UserRepository repo;

    public SignUpPresenter(Context context, SignUpView view) {
        this.view = view;
        repo = new UserRepository(context);
    }

    public void signUp(User user) {
        try {
            repo.insertUser(user);
            view.signUpSuccess();
        } catch (Exception ex) {
            view.signUpFailed();
        }
    }

    public void setError(EditText editText) {
        editText.requestFocus();
        editText.setError("Please fill this box !");
    }

    public void setPassError(EditText editText) {
        editText.requestFocus();
        editText.setError("Password length minimal 8 character !");
    }
}
