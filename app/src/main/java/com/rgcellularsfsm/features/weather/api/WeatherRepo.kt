package com.rgcellularsfsm.features.weather.api

import com.rgcellularsfsm.base.BaseResponse
import com.rgcellularsfsm.features.task.api.TaskApi
import com.rgcellularsfsm.features.task.model.AddTaskInputModel
import com.rgcellularsfsm.features.weather.model.ForeCastAPIResponse
import com.rgcellularsfsm.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}