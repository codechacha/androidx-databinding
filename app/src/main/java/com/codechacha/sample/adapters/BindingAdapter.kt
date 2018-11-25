package com.codechacha.sample.adapters

import android.graphics.drawable.Drawable
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("imageDrawable")
fun bindImageFromRes(view: ImageView, drawable: Drawable?) {
    view.setImageDrawable(drawable)
}
