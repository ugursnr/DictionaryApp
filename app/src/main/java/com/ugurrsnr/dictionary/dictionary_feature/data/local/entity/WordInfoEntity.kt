package com.ugurrsnr.dictionary.dictionary_feature.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.Meaning
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String,
    @PrimaryKey val id : Int? = null
){
    fun toWordInfo() : WordInfo{
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic

        )
    }
}
