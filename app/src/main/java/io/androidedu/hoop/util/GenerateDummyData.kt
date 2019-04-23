package io.androidedu.hoop.util

import io.androidedu.hoop.R
import io.androidedu.hoop.model.CallsModel
import io.androidedu.hoop.model.StatusModel

object GenerateDummyData {

    fun getDummyStatusList(): ArrayList<StatusModel> = ArrayList<StatusModel>().apply {
        val statusModel = StatusModel(
                R.drawable.ic_person,
                "Madam Curie",
                "Bugün 20:46"
        )

        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
        add(statusModel)
    }


    fun getDummyCallsList(): ArrayList<CallsModel> = ArrayList<CallsModel>().apply {
        val callsModelPhone = CallsModel(
                R.drawable.ic_person,
                "Emre Berk AKIRMAK",
                R.drawable.ic_call_made,
                5,
                "16 Nisan 2019",
                R.drawable.ic_communication_phone

        )
        val callsModelVideo = CallsModel(
                R.drawable.ic_person,
                "Emre Berk AKIRMAK",
                R.drawable.ic_call_received,
                5,
                "16 Nisan 2019",
                R.drawable.ic_communication_video

        )

        add(callsModelPhone)
        add(callsModelVideo)
        add(callsModelPhone)
        add(callsModelVideo)
        add(callsModelPhone)
        add(callsModelVideo)
        add(callsModelPhone)
        add(callsModelVideo)
    }
}