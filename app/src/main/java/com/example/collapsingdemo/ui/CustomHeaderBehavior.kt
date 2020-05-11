package com.example.collapsingdemo.ui

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.LinearLayout
import android.widget.RelativeLayout
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.example.collapsingdemo.R
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.abs

/**
 * Created by jimmy on 11/12/15.
 */
class CustomHeaderBehavior : AppBarLayout.ScrollingViewBehavior {
    private var mContext: Context

    var height = 0
    var width = 0
    var marginBottom = 0
    var firstTime = true

    constructor(
        context: Context,
        attrs: AttributeSet?
    ) : super(context, attrs) {
        mContext = context
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        mContext: Context
    ) : super(context, attrs) {
        this.mContext = mContext
    }

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return super.layoutDependsOn(parent, child, dependency)
    }

//    override fun onDependentViewChanged(
//        parent: CoordinatorLayout,
//        childP: View,
//        dependency: View
//    ): Boolean {
//        val child = childP.findViewById<RelativeLayout>(R.id.cardParent)
//        val maxScroll: Int = (dependency as AppBarLayout).totalScrollRange
//        val percentage =
//            abs(dependency.y) / maxScroll.toFloat()
//        Log.d("Behavx","D.y "+abs(dependency.y)+ " m s "+maxScroll+ " p "+percentage)
//        val lp: LinearLayout.LayoutParams =
//            child.layoutParams as LinearLayout.LayoutParams
//        if(firstTime){
//            height = child.height
//            width = child.width
//            marginBottom = lp.bottomMargin
//            firstTime = false
//        }
//        Log.d("Behaviour", "P "+ ((1-(percentage))*100).toString() +" H " +height+ " U H " +(height*(((1-(percentage))*100))/100) )
//        lp.bottomMargin = ((marginBottom*(((1-(percentage))*100))/100) - ((height*((((percentage))*100))/100))).toInt()
//        lp.bottomMargin = ((marginBottom*(((1-(percentage))*100))/100)).toInt()
//        lp.height = ((height*(((1-(percentage))*100))/100)).toInt()

//        child.layoutParams = lp
//        child.alpha = 1 - (percentage * 4)
//        return super.onDependentViewChanged(parent, childP, dependency)

//    }


    companion object {
        fun getToolbarHeight(context: Context): Int {
            var result = 0
            val tv = TypedValue()
            if (context.theme.resolveAttribute(R.attr.actionBarSize, tv, true)) {
                result = TypedValue.complexToDimensionPixelSize(
                    tv.data,
                    context.resources.displayMetrics
                )
            }
            return result
        }
    }
}