package com.ugurrsnr.dictionary.dictionary_feature.domain.repository

import com.ugurrsnr.dictionary.core.util.Resource
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word : String) : Flow<Resource<List<WordInfo>>>
}