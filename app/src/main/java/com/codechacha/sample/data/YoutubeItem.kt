package com.codechacha.sample.data

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.Toast

class YoutubeItem(val image: Drawable, val title: String) {

    fun onClickListener(view: View) {
        Toast.makeText(view.context, "Clicked: $title", Toast.LENGTH_SHORT).show()
    }

}