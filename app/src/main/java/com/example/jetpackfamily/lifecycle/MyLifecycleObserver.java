package com.example.jetpackfamily.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MyLifecycleObserver implements LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate() {
        System.out.println("onCreate生命周期回调");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart() {
        System.out.println("onStart生命周期回调");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
        System.out.println("onResume生命周期回调");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
        System.out.println("onPause生命周期回调");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
        System.out.println("onStop生命周期回调");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
        System.out.println("onDestroy生命周期回调");
    }

}
