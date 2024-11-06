package com.example.chapter11

import java.util.Date
import java.util.UUID

data class Crime(
    val id:UUID,
    var title:String,
    val date:Date,
    var isSolved:Boolean,
)