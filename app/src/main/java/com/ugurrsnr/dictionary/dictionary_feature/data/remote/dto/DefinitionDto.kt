package com.ugurrsnr.dictionary.dictionary_feature.data.remote.dto

import com.ugurrsnr.dictionary.dictionary_feature.domain.model.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String?,
    val synonyms: List<String>
){

    //Mapper to model class
    fun toDefiniton() : Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            example = example,
            synonyms = synonyms
        )
    }
}