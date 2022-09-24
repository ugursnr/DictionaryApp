package com.ugurrsnr.dictionary.dictionary_feature.data.remote.dto

import com.ugurrsnr.dictionary.dictionary_feature.data.local.entity.WordInfoEntity
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.WordInfo

data class WordInfoDto(
    val license: LicenseDto,
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
){
    fun toWordInfoEntity() : WordInfoEntity{
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            word = word
        )
    }


}