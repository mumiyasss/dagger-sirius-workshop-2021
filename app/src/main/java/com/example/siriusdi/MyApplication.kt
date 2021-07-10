package com.example.siriusdi

import android.app.Application
import com.example.siriusdi.di.DependencyContainer

/**
 * @author n.d.grebnev
 */
class MyApplication: Application() {

    val dependencyContainer = DependencyContainer()
}
