package com.lt.so;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;

/**
 * 调用so文件
 * Created by lt on 2019/5/3.
 */

public class MainActivity extends AppCompatActivity {

    static {
        //加载so库
        System.loadLibrary("create");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCompatTextView tvShow = findViewById(R.id.tv_show);
        AppCompatTextView tvAdd = findViewById(R.id.tv_add);

        tvShow.setText(Create.helloFromC());
        tvAdd.setText(String.format("1 + 1 = %s",Create.add(1, 1)));
    }
}
