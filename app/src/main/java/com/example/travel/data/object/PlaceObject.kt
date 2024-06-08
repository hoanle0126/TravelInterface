package com.example.travel.data.`object`

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.travel.data.model.Place
import com.example.travel.data.model.PlaceData
import com.example.travel.data.repository.PlaceApi
import kotlinx.coroutines.launch

class PlaceObject:ViewModel() {
    var placeResult: Place? by mutableStateOf(Place())

    init {
        getPlace()
    }

    private fun getPlace(){
        viewModelScope.launch {
            placeResult = PlaceApi.retrofitService.getPlaces(
                query = "Hotel"
            )
        }
    }
}