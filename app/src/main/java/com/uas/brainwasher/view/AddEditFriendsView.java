package com.uas.brainwasher.view;

import android.widget.EditText;

import com.uas.brainwasher.data.model.Friends;

/* 10116317 - Husna Kusuma Wardani
   13 Agustus 2019
* */

public interface AddEditFriendsView {
    void showData();
    void onFriendAdded();
    void onFriendUpdated(Friends friend);
    void showError(EditText et);
    void showFailed(String msg);
}
