package com.example.siriusdi.di.modules

import com.example.siriusdi.data.UserRepositoryImpl
import com.example.siriusdi.domain.UserRepository
import dagger.Binds
import dagger.Module

/**
 * @author n.d.grebnev
 */
@Module
interface BindsModule {

    @Binds
    fun bindUserRepository(impl: UserRepositoryImpl): UserRepository
}
