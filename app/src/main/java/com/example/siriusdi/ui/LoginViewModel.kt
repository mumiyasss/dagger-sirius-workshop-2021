package com.example.siriusdi.ui

import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.data.UserRepository

/**
 * @author n.d.grebnev
 */
class LoginViewModel(private val userRepository: UserRepository) {

    fun loginUser(username: String, password: String): LoginUserData {
        return userRepository.loginUser(username, password)
    }
}
