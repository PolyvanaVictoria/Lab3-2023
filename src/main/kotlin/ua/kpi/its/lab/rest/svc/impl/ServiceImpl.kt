package ua.kpi.its.lab.rest.svc.impl

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.entity.Medicine
import ua.kpi.its.lab.rest.svc.HospitalRepository
import ua.kpi.its.lab.rest.svc.MedicineRepository

@Service
abstract class HospitalService(private val hospitalRepository: HospitalRepository) {
    @PreAuthorize("hasRole('EDITOR')")
    fun createHospital(hospital: Hospital) {
    }

    @PreAuthorize("hasRole('EDITOR')")
    fun updateHospital(hospital: Hospital) {
    }

    @PreAuthorize("hasAnyRole('VIEWER', 'EDITOR')")
    fun getHospitalByName(id: Long): HospitalRepository {
        return hospitalRepository
    }

    @PreAuthorize("hasAnyRole('VIEWER', 'EDITOR')")
    fun getAllHospitals(): HospitalRepository {
        return hospitalRepository
    }
}

@Service
class MedicineService(private val medicineRepository: MedicineRepository) {
    @PreAuthorize("hasRole('EDITOR')")
    fun createMedicine(medicine: Medicine) {
    }

    @PreAuthorize("hasRole('EDITOR')")
    fun updateMedicine(medicine: Medicine) {
    }

    @PreAuthorize("hasAnyRole('VIEWER', 'EDITOR')")
    fun getMedicineById(id: Long): MedicineRepository {
        return medicineRepository
    }

    @PreAuthorize("hasAnyRole('VIEWER', 'EDITOR')")
    fun getAllMedicine(): MedicineRepository {
        return medicineRepository
    }
}
