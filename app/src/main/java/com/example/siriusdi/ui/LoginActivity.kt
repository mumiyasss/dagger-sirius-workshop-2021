package com.example.siriusdi.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.siriusdi.MyApplication
import com.example.siriusdi.data.LoginUserData
import com.example.siriusdi.di.LoginComponent
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var userData: LoginUserData

    @Inject
    lateinit var loginViewModel: LoginViewModel

    private lateinit var loginComponent: LoginComponent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loginComponent = (application as MyApplication).appComponent.loginComponent().create()

        loginComponent.inject(this)

        loginViewModel.loginUser("username", "password")
    }
}
