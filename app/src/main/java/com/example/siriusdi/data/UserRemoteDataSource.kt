package com.example.siriusdi.data

import javax.inject.Inject

/**
 * @author n.d.grebnev
 */
class UserRemoteDataSource @Inject constructor(private val loginService: LoginService) {

    fun loginUser(username: String, password: String): LoginUserData {
        return loginService.loginUser(username, password)
    }
}
