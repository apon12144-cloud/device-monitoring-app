package com.example.devicemonitoring.model

data class Device(
    val id: String,
    val name: String,
    val status: DeviceStatus,
    val connectionType: String = "Wi-Fi / Mobile Data",
    val isOnline: Boolean = true,
    val sessionActive: Boolean = false
)

enum class DeviceStatus {
    ONLINE,
    OFFLINE,
    RECONNECTING,
    MONITORING
}
