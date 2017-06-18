package jp.sabakaido.iconfont

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by anikaido on 2017/06/19.
 */
class IconFontTextView : TextView {
    private val iconFontPass = "material_icons.ttf"

    init {
        typeface = Typeface.createFromAsset(context.assets, iconFontPass)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet)
            : super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int)
            : super(context, attributeSet, defStyleAttr)
}