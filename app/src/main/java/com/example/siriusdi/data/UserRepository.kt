package com.example.siriusdi.data

import javax.inject.Inject

/**
 * @author n.d.grebnev
 */
class UserRepository @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) {

    fun loginUser(username: String, password: String): LoginUserData {
        val userData = userRemoteDataSource.loginUser(username, password)
        userLocalDataSource.cacheUserData(userData)
        return userData
    }
}
