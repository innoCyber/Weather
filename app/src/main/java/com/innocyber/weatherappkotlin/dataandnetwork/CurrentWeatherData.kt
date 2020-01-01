package com.innocyber.weatherappkotlin.dataandnetwork

import com.google.gson.annotations.SerializedName


data class CurrentWeatherData(
    @SerializedName("current")
    val currentWeatherDetail: CurrentWeatherDetail,
    val location: Location
)