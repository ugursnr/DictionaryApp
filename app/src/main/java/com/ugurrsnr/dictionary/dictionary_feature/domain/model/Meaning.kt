package com.ugurrsnr.dictionary.dictionary_feature.domain.model

data class Meaning(
    val definitions : List<Definition>,
    val partOfSpeech : String
)
