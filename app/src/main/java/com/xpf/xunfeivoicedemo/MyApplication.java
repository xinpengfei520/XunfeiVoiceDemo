package com.xpf.xunfeivoicedemo;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by x-sir on 2019.01.12 :)
 * Function:MyApplication
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 将 “12345678” 替换成您申请的 APPID，申请地址：http://open.voicecloud.cn
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=56f4c1dd");
    }
}
