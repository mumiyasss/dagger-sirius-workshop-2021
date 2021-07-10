package com.example.siriusdi.data

/**
 * @author n.d.grebnev
 */
interface LoginService {

    fun loginUser(username: String, password: String): LoginUserData
}
