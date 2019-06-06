package com.ninetaildemonfox.zdl.dialogduihua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kongzue.dialog.v2.Pop;

import static com.kongzue.dialog.v2.Notification.TYPE_NORMAL;

public class MainActivity extends AppCompatActivity {
    private int notifactionType = TYPE_NORMAL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Pop.show(this, view, "这是个提示在上侧这是个提示在上侧这是个提示在上侧这是个提示在上侧", Pop.SHOW_DOWN, notifactionType);
    }
}
