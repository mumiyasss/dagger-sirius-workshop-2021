package com.example.siriusdi.data

/**
 * @author n.d.grebnev
 */
class UserRepository(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) {

    fun loginUser(username: String, password: String): LoginUserData {
        val userData = userRemoteDataSource.loginUser(username, password)
        userLocalDataSource.cacheUserData(userData)
        return userData
    }
}
