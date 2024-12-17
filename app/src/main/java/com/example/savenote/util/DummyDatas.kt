package com.example.savenote.util

import androidx.annotation.DrawableRes

data class DummyNoteModel(
    val title: String,
    val description: String,
    @DrawableRes val thumbnail: Int
)