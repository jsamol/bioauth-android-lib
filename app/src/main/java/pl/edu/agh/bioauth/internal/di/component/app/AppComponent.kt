package pl.edu.agh.bioauth.internal.di.component.app

import android.app.Application
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.module.common.NetworkModule
import pl.edu.agh.bioauth.internal.di.module.common.PhotoModule
import pl.edu.agh.bioauth.internal.di.module.common.SecurityModule

@Component(targets = [Application::class], modules = [NetworkModule::class, PhotoModule::class, SecurityModule::class])
internal class AppComponent : AbstractComponent()