package com.example.viewbindingadapters

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import java.lang.Exception

object BindingAdapters {

    @JvmStatic
    @BindingAdapter("isVisible")
    fun showHide(view:View, show:Boolean){
        view.visibility=if(show) View.VISIBLE else View.GONE
    }

    @JvmStatic
    @BindingAdapter("imageUri")

    fun setImageUrl(imageView:ImageView, url: String?){
        try{
            url?.let {

            }
            url.takeIf { it.isNullOrEmpty()}.apply {
                Glide.with(imageView.context)
                    .load(url)
                    .into(imageView)
            } ?: run{

            }
        }catch(e:Exception){

        }
    }
}