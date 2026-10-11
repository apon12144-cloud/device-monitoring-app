package com.example.devicemonitoring.ui.screens.device

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.devicemonitoring.viewmodel.DeviceViewModel

@Composable
fun DeviceSelectionScreen(
    navController: NavController,
    viewModel: DeviceViewModel = viewModel()
) {
    val devices by viewModel.devices.collectAsState()

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp)
    ) {
        Text(
            text = "Connected Devices",
            style = MaterialTheme.typography.headlineMedium
        )

        LazyColumn(modifier = Modifier.padding(top = 16.dp)) {
            items(devices) { device ->
                Button(
                    onClick = { },
                    modifier = Modifier.padding(bottom = 12.dp)
                ) {
                    Text(text = "${device.name} - ${device.status.name}")
                }
            }
        }
    }
}
