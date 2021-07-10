package com.example.siriusdi.di

import com.example.siriusdi.data.LoginService
import com.example.siriusdi.data.UserLocalDataSource
import com.example.siriusdi.data.UserRemoteDataSource
import com.example.siriusdi.data.UserRepository
import retrofit2.Retrofit

/**
 * @author n.d.grebnev
 */
class DependencyContainer {

    // Чтобы предоставить UserRepository, нам нужно
    // удовлетворить все его зависимости
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://example.com")
        .build()
        .create(LoginService::class.java)

    private val remoteDataSource = UserRemoteDataSource(retrofit)
    private val localDataSource = UserLocalDataSource()

    // userRepository не private, т.к. он предоставляется наружу
    val userRepository = UserRepository(localDataSource, remoteDataSource)

    var loginContainer: LoginContainer? = null
}
