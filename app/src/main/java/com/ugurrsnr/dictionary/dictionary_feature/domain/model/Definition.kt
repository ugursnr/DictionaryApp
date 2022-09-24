package com.ugurrsnr.dictionary.dictionary_feature.domain.model

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>) {
}