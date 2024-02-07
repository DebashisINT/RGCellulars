package com.rgcellularsfsm.features.activities.api

import com.rgcellularsfsm.features.member.api.TeamApi
import com.rgcellularsfsm.features.member.api.TeamRepo

object ActivityRepoProvider {
    fun activityRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.create())
    }

    fun activityImageRepoProvider(): ActivityRepo {
        return ActivityRepo(ActivityApi.createImage())
    }
}