package com.example.siriusdi.data

import com.example.siriusdi.domain.UserRepository
import javax.inject.Inject

/**
 * @author n.d.grebnev
 */
class UserRepositoryImpl @Inject constructor(
    private val userLocalDataSource: UserLocalDataSource,
    private val userRemoteDataSource: UserRemoteDataSource
) : UserRepository {

    override fun loginUser(username: String, password: String): LoginUserData {
        val userData = userRemoteDataSource.loginUser(username, password)
        userLocalDataSource.cacheUserData(userData)
        return userData
    }
}
