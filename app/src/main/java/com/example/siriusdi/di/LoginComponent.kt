package com.example.siriusdi.di

import com.example.siriusdi.di.scopes.ActivityScope
import com.example.siriusdi.ui.LoginActivity
import dagger.Subcomponent

/**
 * @author n.d.grebnev
 */
@Subcomponent
@ActivityScope
interface LoginComponent {

    fun inject(activity: LoginActivity)

    @Subcomponent.Factory
    interface Factory {

        fun create(): LoginComponent
    }
}
