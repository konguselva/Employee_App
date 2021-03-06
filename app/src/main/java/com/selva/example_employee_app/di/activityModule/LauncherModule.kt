package com.selva.example_employee_app.di.activityModule

import androidx.lifecycle.ViewModel
import com.selva.example_employee_app.di.anotation.ViewModelKey
import com.selva.example_employee_app.viewmodel.LauncherViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface LauncherModule {
    @Binds
    @IntoMap
    @ViewModelKey(LauncherViewModel::class)
    fun bindLauncherViewModel(userViewModel: LauncherViewModel): ViewModel
}