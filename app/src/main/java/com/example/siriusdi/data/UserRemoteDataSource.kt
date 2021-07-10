package com.example.siriusdi.data

/**
 * @author n.d.grebnev
 */
class UserRemoteDataSource(private val loginService: LoginService) {

    fun loginUser(username: String, password: String): LoginUserData {
        return loginService.loginUser(username, password)
    }
}
