package ua.kpi.its.lab.rest.dto

import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.web.bind.annotation.*
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.svc.impl.HospitalService

data class HospitalRequest(
    val name: String,
    val address: String,
    val phoneNumber: String,
    val departments: List<String>,
)

data class HospitalResponse(
    val id: Int,
    val name: String,
    val address: String,
    val phoneNumber: String,
    val departments: List<String>,
)

data class MedicineRequest(
    val name: String,
    val dosage: Double,
    val manufacturer: String,
)

data class MedicineResponse(
    val id: Int,
    val name: String,
    val dosage: Double,
    val manufacturer: String,
)



