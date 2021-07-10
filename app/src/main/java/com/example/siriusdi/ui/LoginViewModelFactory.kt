package com.example.siriusdi.ui

import com.example.siriusdi.data.UserRepository

/**
 * @author n.d.grebnev
 */
class LoginViewModelFactory(private val userRepository: UserRepository) {

    fun create(): LoginViewModel {
        return LoginViewModel(userRepository)
    }
}
