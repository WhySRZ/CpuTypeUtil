package com.leo.cputypeutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.leo.libcputype.CpuTypeUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mStrTv = findViewById(R.id.strTv);

        String cpuType = CpuTypeUtil.getCpuType();
        mStrTv.setText("结果是：" + cpuType);
    }
}
