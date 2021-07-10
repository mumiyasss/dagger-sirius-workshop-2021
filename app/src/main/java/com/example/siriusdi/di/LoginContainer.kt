package com.example.siriusdi.di

import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.data.UserRepository
import com.example.siriusdi.ui.LoginViewModelFactory

class LoginContainer(userRepository: UserRepository) {

    val userData = LoginUserData()

    val loginViewModelFactory = LoginViewModelFactory(userRepository)
}
