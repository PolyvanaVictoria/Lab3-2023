package ua.kpi.its.lab.rest.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import ua.kpi.its.lab.rest.dto.HospitalRequest
import ua.kpi.its.lab.rest.dto.HospitalResponse
import ua.kpi.its.lab.rest.dto.MedicineRequest
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.entity.Medicine
import ua.kpi.its.lab.rest.svc.impl.HospitalService
import ua.kpi.its.lab.rest.svc.impl.MedicineService


@RestController
@RequestMapping("/hospitals")
class HospitalController(private val hospitalService: HospitalService) {

    @PostMapping
    fun createHospital(@RequestBody request: HospitalRequest): ResponseEntity<Unit> {
        val createdHospital = hospitalService.createHospital(request)
        return ResponseEntity(createdHospital, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getHospital(@PathVariable id: Int): ResponseEntity<Hospital?> {
        val hospital = hospitalService.getHospital(id)
        return ResponseEntity(hospital, HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun updateHospital(@PathVariable id: Int, @RequestBody request: HospitalRequest): ResponseEntity<HospitalResponse> {
        val updatedHospital = hospitalService.updateHospital(id, request)
        return ResponseEntity(updatedHospital, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteHospital(@PathVariable id: Int): ResponseEntity<Unit> {
        hospitalService.deleteHospital(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}

@RestController
@RequestMapping("/medicines")
class MedicineController(private val medicineService: MedicineService) {

    @PostMapping
    fun createMedicine(@RequestBody request: MedicineRequest): ResponseEntity<Unit> {
        val createdMedicine = medicineService.createMedicine(request)
        return ResponseEntity(createdMedicine, HttpStatus.CREATED)
    }

    @GetMapping("/{id}")
    fun getMedicine(@PathVariable id: Int): ResponseEntity<Medicine?> {
        val medicine = medicineService.getMedicine(id)
        return ResponseEntity(medicine, HttpStatus.OK)
    }

    @PutMapping("/{id}")
    fun updateMedicine(@PathVariable id: Int, @RequestBody request: MedicineRequest): ResponseEntity<Medicine> {
        val updatedMedicine = medicineService.updateMedicine(id, request)
        return ResponseEntity(updatedMedicine, HttpStatus.OK)
    }

    @DeleteMapping("/{id}")
    fun deleteMedicine(@PathVariable id: Int): ResponseEntity<Unit> {
        medicineService.deleteMedicine(id)
        return ResponseEntity(HttpStatus.NO_CONTENT)
    }
}
