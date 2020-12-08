package com.simean.materialtoast

import android.app.Application
import android.graphics.drawable.shapes.Shape
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class ToastUtils {
    companion object{
        var toastShow:Toast?=null
        fun getCurrentApplication():Application{
            return Class.forName("android.app.ActivityThread")
                    .getMethod("currentApplication")
                    .invoke(Class.forName("android.app.ActivityThread")) as Application
        }
        fun makeToast(text:String, type: ToastType, duration:Int){
            if (toastShow ==null){
                toastShow =Toast(getCurrentApplication())
            }
            var toastView = LayoutInflater
                    .from(getCurrentApplication())
                    .inflate(R.layout.toast_layout,null,false)
            toastShow?.view=toastView
            var toastIcon = toastView.findViewById<ImageView>(R.id.toast_icon)
            var toastContent = toastView.findViewById<TextView>(R.id.toast_content)
            var background=toastView.findViewById<LinearLayout>(R.id.background)
            when(type){
                ToastType.CORRECT -> {
                    toastIcon
                            .setImageDrawable(getCurrentApplication().getDrawable(R.drawable.ic_correct))
                    background
                            .background = getCurrentApplication().getDrawable(R.drawable.correct_shap)
                }
                ToastType.ERROR -> {
                    toastIcon
                            .setImageDrawable(getCurrentApplication().getDrawable(R.drawable.ic_error))
                    background
                            .background = getCurrentApplication().getDrawable(R.drawable.error_shap)
                }
                ToastType.NONE -> {
                    toastIcon.visibility = View.GONE
                    background
                            .background = getCurrentApplication().getDrawable(R.drawable.none_shap)
                }
                ToastType.PROBLEM -> {
                    toastIcon
                            .setImageDrawable(getCurrentApplication().getDrawable(R.drawable.ic_problem))
                    background
                            .background = getCurrentApplication().getDrawable(R.drawable.prblem_shap)
                }
            }
            toastContent.setText(text)
            toastShow?.duration=duration
            toastShow?.show()
        }
    }
}