package com.example.jetpackfamily.lifecycle

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyDefaultLifecycleObserver : DefaultLifecycleObserver {

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
        println("onCreate生命周期回调")
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        println("onStart生命周期回调")
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)
        println("onResume生命周期回调")
    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)
        println("onPause生命周期回调")
    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        println("onStop生命周期回调")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
        println("onDestroy生命周期回调")
    }
}