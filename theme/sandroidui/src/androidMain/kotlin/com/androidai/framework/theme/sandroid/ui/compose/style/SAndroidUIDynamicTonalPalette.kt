package com.androidai.framework.theme.sandroid.ui.compose.style

import android.content.Context
import androidx.annotation.ColorRes
import androidx.annotation.DoNotInline
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color



@RequiresApi(23)
object ColorResourceHelper {

    @DoNotInline
    fun getColor(
            context : Context,
            @ColorRes
            id : Int) : Color {
        return Color(context.resources.getColor(id, null))
    }
}