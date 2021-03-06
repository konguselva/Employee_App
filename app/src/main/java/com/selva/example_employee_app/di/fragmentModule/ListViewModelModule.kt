package com.selva.example_employee_app.di.fragmentModule

import androidx.lifecycle.ViewModel
import com.selva.example_employee_app.di.anotation.ViewModelKey
import com.selva.example_employee_app.viewmodel.ListViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ListViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(ListViewModel::class)
    fun bindListViewModel(userViewModel: ListViewModel): ViewModel
}