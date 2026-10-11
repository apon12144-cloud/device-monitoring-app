package com.example.devicemonitoring.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.devicemonitoring.ui.screens.device.DeviceSelectionScreen
import com.example.devicemonitoring.ui.screens.home.HomeScreen

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController = navController)
        }
        composable("devices") {
            DeviceSelectionScreen(navController = navController)
        }
    }
}
