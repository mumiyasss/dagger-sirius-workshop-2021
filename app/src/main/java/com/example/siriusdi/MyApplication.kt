package com.example.siriusdi

import android.app.Application
import com.example.siriusdi.di.ApplicationComponent
import com.example.siriusdi.di.DaggerApplicationComponent

/**
 * @author n.d.grebnev
 */
class MyApplication : Application() {

    val appComponent: ApplicationComponent = DaggerApplicationComponent.create()
}
