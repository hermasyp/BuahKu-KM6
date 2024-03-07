package com.catnip.layoutingexample.model

import androidx.annotation.DrawableRes
import java.util.UUID

/**
Written with love by Muhammad Hermas Yuda Pamungkas
Github : https://github.com/hermasyp
 **/
data class Category(
    var id: String = UUID.randomUUID().toString(),
    @DrawableRes
    var image: Int,
    var name: String,
)