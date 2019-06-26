package com.example.swd_project.listener;

import java.util.List;

public interface UserListener {
    void onCheckLoginSuccess(Boolean result);
    void onCheckLoginFailure(String message);
}
