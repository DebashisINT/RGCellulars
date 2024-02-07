package com.rgcellularsfsm.features.weather.api

import com.rgcellularsfsm.features.task.api.TaskApi
import com.rgcellularsfsm.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}