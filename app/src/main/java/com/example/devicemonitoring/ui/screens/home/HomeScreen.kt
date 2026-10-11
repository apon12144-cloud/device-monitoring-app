package com.example.devicemonitoring.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Home",
            style = MaterialTheme.typography.headlineMedium
        )

        Button(
            onClick = { navController.navigate("devices") },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("View Devices")
        }

        Button(
            onClick = { },
            modifier = Modifier.padding(top = 12.dp)
        ) {
            Text("Add New Device")
        }

        Button(
            onClick = { },
            modifier = Modifier.padding(top = 12.dp)
        ) {
            Text("Live Screen")
        }
    }
}
