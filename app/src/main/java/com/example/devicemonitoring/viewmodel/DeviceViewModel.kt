package com.example.devicemonitoring.viewmodel

import androidx.lifecycle.ViewModel
import com.example.devicemonitoring.data.DeviceRepository
import com.example.devicemonitoring.model.Device
import kotlinx.coroutines.flow.StateFlow

class DeviceViewModel : ViewModel() {
    private val repository = DeviceRepository()
    val devices: StateFlow<List<Device>> = repository.deviceFlow

    fun getSelectedDevice(id: String): Device? {
        return repository.selectDevice(id)
    }
}
