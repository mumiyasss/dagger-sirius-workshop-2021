package com.example.siriusdi.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.siriusdi.MyApplication
import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.di.DependencyContainer
import com.example.siriusdi.di.LoginContainer

class LoginActivity : AppCompatActivity() {

    private lateinit var dependencyContainer: DependencyContainer
    private lateinit var userData: LoginUserData
    private lateinit var loginViewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dependencyContainer = (application as MyApplication).dependencyContainer

        dependencyContainer.loginContainer = LoginContainer(dependencyContainer.userRepository)

        dependencyContainer.loginContainer?.let {
            loginViewModel = it.loginViewModelFactory.create()
            userData = it.userData
        }

        loginViewModel.loginUser("username", "password")
    }

    override fun onDestroy() {
        dependencyContainer.loginContainer = null
        super.onDestroy()
    }
}
