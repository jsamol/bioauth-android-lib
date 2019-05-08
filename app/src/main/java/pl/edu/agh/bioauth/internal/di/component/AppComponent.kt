package pl.edu.agh.bioauth.internal.di.component

import android.app.Application
import pl.edu.agh.bioauth.internal.di.annotation.Component
import pl.edu.agh.bioauth.internal.di.component.AbstractComponent
import pl.edu.agh.bioauth.internal.di.module.NetworkModule

@Component(targets = [Application::class], modules = [NetworkModule::class])
internal class AppComponent : AbstractComponent()