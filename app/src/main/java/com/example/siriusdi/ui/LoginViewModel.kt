package com.example.siriusdi.ui

import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.di.scopes.ActivityScope
import com.example.siriusdi.domain.UserRepository
import dagger.Lazy
import javax.inject.Inject

/**
 * @author n.d.grebnev
 */
@ActivityScope
class LoginViewModel @Inject constructor(private val userRepository: Lazy<UserRepository>) {

    fun loginUser(username: String, password: String): LoginUserData {
        return userRepository.get().loginUser(username, password)
    }
}
