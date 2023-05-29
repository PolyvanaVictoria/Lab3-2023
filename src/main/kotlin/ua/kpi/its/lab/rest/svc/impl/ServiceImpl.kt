package ua.kpi.its.lab.rest.svc.impl

import org.springframework.stereotype.Service
import ua.kpi.its.lab.rest.dto.HospitalRequest
import ua.kpi.its.lab.rest.dto.HospitalResponse
import ua.kpi.its.lab.rest.dto.MedicineRequest
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.entity.Medicine
import ua.kpi.its.lab.rest.svc.HospitalRepository
import ua.kpi.its.lab.rest.svc.MedicineRepository

@Service
abstract class HospitalService(private val hospitalRepository: HospitalRepository) {
    fun createHospital(hospital: HospitalRequest) {
        hospitalRepository.create(hospital)
    }
    abstract fun updateHospital(id: Int, request: HospitalRequest): HospitalResponse
    abstract fun deleteHospital(id: Int)

    fun getHospital(id: Int): Hospital? {
        return hospitalRepository.read(id)
    }

}

@Service
class MedicineService(private val medicineRepository: MedicineRepository) {
    fun createMedicine(medicine: MedicineRequest) {
        medicineRepository.create(medicine)
    }
    fun updateMedicine(medicine: Int, request: MedicineRequest): Medicine {

        return medicineRepository.save(medicine)
    }
    fun deleteMedicine(medicineId: Int) {
        medicineRepository.deleteById(medicineId)
    }

    fun getMedicine(id: Int): Medicine? {
        return medicineRepository.read(id)
    }

}
