package com.example.devicemonitoring.data

import com.example.devicemonitoring.model.Device
import com.example.devicemonitoring.model.DeviceStatus
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class DeviceRepository {
    private val devices = listOf(
        Device(
            id = "device_01",
            name = "Living Room Tablet",
            status = DeviceStatus.ONLINE,
            connectionType = "Wi-Fi",
            isOnline = true,
            sessionActive = true
        ),
        Device(
            id = "device_02",
            name = "Bedroom Phone",
            status = DeviceStatus.RECONNECTING,
            connectionType = "Mobile Data",
            isOnline = false,
            sessionActive = false
        )
    )

    private val _deviceFlow = MutableStateFlow(devices)
    val deviceFlow: StateFlow<List<Device>> = _deviceFlow

    fun selectDevice(id: String): Device? {
        return _deviceFlow.value.find { it.id == id }
    }
}
