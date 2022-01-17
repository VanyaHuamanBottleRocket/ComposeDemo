package com.example.composetestapp.di

import com.example.composetestapp.ui.theme.HomeViewModel
import com.example.composetestapp.ui.theme.MainActivityViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {
    val module = module {
        viewModel { MainActivityViewModel() }
        viewModel { HomeViewModel() }
    }
}