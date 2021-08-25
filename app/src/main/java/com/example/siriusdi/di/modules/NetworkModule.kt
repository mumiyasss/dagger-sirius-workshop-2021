package com.example.siriusdi.di.modules

import com.example.siriusdi.data.LoginService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

/**
 * @author n.d.grebnev
 */
@Module
class NetworkModule {

    @Provides
    fun provideLoginRetrofitService(): LoginService {
        // Whenever Dagger needs to provide an instance of type LoginRetrofitService,
        // this code (the one inside the @Provides method) is run.
        return Retrofit.Builder()
            .baseUrl("https://example.com")
            .build()
            .create(LoginService::class.java)
    }
}
