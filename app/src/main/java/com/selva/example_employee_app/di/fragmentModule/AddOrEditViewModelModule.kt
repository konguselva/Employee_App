package com.selva.example_employee_app.di.fragmentModule

import androidx.lifecycle.ViewModel
import com.selva.example_employee_app.di.anotation.ViewModelKey
import com.selva.example_employee_app.viewmodel.AddOrEditViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface AddOrEditViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(AddOrEditViewModel::class)
    fun bindAddOrEditViewModel(userViewModel: AddOrEditViewModel): ViewModel
}