package com.example.siriusdi.ui

import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.data.UserRepository
import com.example.siriusdi.di.scopes.ActivityScope
import javax.inject.Inject

/**
 * @author n.d.grebnev
 */
@ActivityScope
class LoginViewModel @Inject constructor(private val userRepository: UserRepository) {

    fun loginUser(username: String, password: String): LoginUserData {
        return userRepository.loginUser(username, password)
    }
}
