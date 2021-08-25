package com.example.siriusdi.di

import com.example.siriusdi.di.modules.BindsModule
import com.example.siriusdi.di.modules.NetworkModule
import com.example.siriusdi.di.modules.SubcomponentsModule
import com.example.siriusdi.domain.UserRepository
import dagger.Component
import javax.inject.Singleton

/**
 * @author n.d.grebnev
 */
@Component(
    modules = [
        BindsModule::class,
        NetworkModule::class,
        SubcomponentsModule::class
    ]
)
@Singleton
interface ApplicationComponent {

    fun userRepository(): UserRepository

    fun loginComponent(): LoginComponent.Factory
}
