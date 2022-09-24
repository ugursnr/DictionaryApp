package com.ugurrsnr.dictionary.dictionary_feature.data.repository

import com.ugurrsnr.dictionary.core.util.Resource
import com.ugurrsnr.dictionary.dictionary_feature.data.local.WordInfoDao
import com.ugurrsnr.dictionary.dictionary_feature.data.remote.DictionaryApi
import com.ugurrsnr.dictionary.dictionary_feature.domain.model.WordInfo
import com.ugurrsnr.dictionary.dictionary_feature.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(private val api : DictionaryApi, private val dao : WordInfoDao) : WordInfoRepository{

    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow{

        emit(Resource.Loading()) //Loading phase

        val wordInfos = dao.getWordInfos(word).map { it.toWordInfo() } //entity to domain level object //getting Data

        emit(Resource.Loading(data = wordInfos ))

        try {
            val remoteWordInfos = api.getWordInfo(word)
            dao.deleteWordInfos(remoteWordInfos.map { it.word })
            dao.insertWordInfos(remoteWordInfos.map { it.toWordInfoEntity() })
        }catch (e : HttpException){
            emit(Resource.Error(message ="Something went wrong",
            data = wordInfos))
        }catch (e : IOException){
            emit(Resource.Error(message ="Check your Internet connection",
                data = wordInfos))

        }

        val newWordInfo = dao.getWordInfos(word).map { it.toWordInfo() }
        emit(Resource.Success(newWordInfo))
    }
}