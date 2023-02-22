package com.anddev404.repository.model

import androidx.lifecycle.LiveData
import com.anddev404.repository.errors.ResponseError

data class Response(
    val responseCode: Int,
    val news: LiveData<List<SingularNews>>,
    val error: LiveData<ResponseError>
) {
}