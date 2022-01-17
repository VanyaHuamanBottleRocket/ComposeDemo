package com.example.composetestapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.composetestapp.ui.theme.ComposeTestAppTheme
import com.example.composetestapp.ui.theme.HomeFragment

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            ComposeTestAppTheme {
                NavHost(navController = navController, startDestination = "main") {
                    composable("main") { MainScreen(navController) }
                    composable("home") { HomeFragment() }
                    // More composable calls
                }
            }
        }
    }
}

@Composable
fun MainScreen(navController: NavController) {
}

@Preview
@Composable
fun MainComposable() {
}

