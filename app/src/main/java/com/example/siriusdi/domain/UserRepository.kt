package com.example.siriusdi.domain

import com.example.siriusdi.data.LoginUserData

/**
 * @author n.d.grebnev
 */
interface UserRepository {

    fun loginUser(username: String, password: String): LoginUserData
}
