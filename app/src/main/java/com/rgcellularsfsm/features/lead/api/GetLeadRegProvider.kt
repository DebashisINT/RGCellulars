package com.rgcellularsfsm.features.lead.api

import com.rgcellularsfsm.features.NewQuotation.api.GetQuotListRegRepository
import com.rgcellularsfsm.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}