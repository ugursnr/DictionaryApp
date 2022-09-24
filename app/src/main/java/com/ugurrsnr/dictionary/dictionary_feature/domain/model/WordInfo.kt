package com.ugurrsnr.dictionary.dictionary_feature.domain.model

import com.ugurrsnr.dictionary.dictionary_feature.data.remote.dto.LicenseDto
import com.ugurrsnr.dictionary.dictionary_feature.data.remote.dto.MeaningDto
import com.ugurrsnr.dictionary.dictionary_feature.data.remote.dto.PhoneticDto

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)
