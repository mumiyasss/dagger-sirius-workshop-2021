package com.example.siriusdi.data

import javax.inject.Inject

class UserLocalDataSource @Inject constructor() {

    fun cacheUserData(userData: LoginUserData) {
        // do some caching...
    }
}
