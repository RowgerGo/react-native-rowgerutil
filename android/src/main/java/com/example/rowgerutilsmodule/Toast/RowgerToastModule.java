package com.example.rowgerutilsmodule.Toast;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class RowgerToastModule  extends ReactContextBaseJavaModule {
    private ReactApplicationContext mContext;
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String DURATION_LONG_KEY = "LONG";
    public RowgerToastModule(ReactApplicationContext reactContent){
        super(reactContent);
    }

    @Override
    public String getName() {
        return "RowgerToastModule"; //这里的name是必须的，最终在js中调用的时候以这个为准！
    }

    @ReactMethod   //这个也是必须的，不然会报错
    public void Toasts(String msg) {
        System.out.println(msg);
        Toast.makeText(getReactApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }
}
