package com.alejandrolora.finalapp.models

import java.util.Date

data class Rate(
        val text: String = "",
        val rate: Float = 0f,
        val createdAt: Date = Date(),
        val profileImgURL: String = ""
)