package com.rgcellularsfsm.features.document.api

import com.rgcellularsfsm.features.dymanicSection.api.DynamicApi
import com.rgcellularsfsm.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}