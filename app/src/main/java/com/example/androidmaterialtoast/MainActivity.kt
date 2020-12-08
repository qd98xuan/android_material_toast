package com.example.androidmaterialtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.simean.materialtoast.ToastType
import com.simean.materialtoast.ToastUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastUtils.makeToast("correct", ToastType.CORRECT, Toast.LENGTH_SHORT)
        ToastUtils.makeToast("error", ToastType.ERROR, Toast.LENGTH_SHORT)
        ToastUtils.makeToast("problem", ToastType.PROBLEM, Toast.LENGTH_SHORT)
        ToastUtils.makeToast("none", ToastType.NONE, Toast.LENGTH_SHORT)
    }
}