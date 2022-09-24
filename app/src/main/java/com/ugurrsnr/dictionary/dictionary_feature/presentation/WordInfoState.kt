package com.ugurrsnr.dictionary.dictionary_feature.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.ugurrsnr.dictionary.core.util.Resource
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.WordInfo
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

data class WordInfoState(
    val wordInfoItems : List<WordInfo> = emptyList(),
    val isLoading : Boolean = false
) {


}