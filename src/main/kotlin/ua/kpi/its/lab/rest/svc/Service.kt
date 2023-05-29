package ua.kpi.its.lab.rest.svc

import jakarta.persistence.EntityManager
import org.springframework.stereotype.Repository
import ua.kpi.its.lab.rest.dto.HospitalRequest
import ua.kpi.its.lab.rest.dto.MedicineRequest
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.entity.Medicine

interface HospitalRepository {
    fun create(hospital: HospitalRequest)
    fun read(id: Int): Hospital?
    fun update(hospital: Hospital)
    fun delete(hospital: Hospital)
}

interface MedicineRepository {
    fun create(medicine: MedicineRequest)
    fun read(id: Int): Medicine?
    fun update(medicine: Medicine)
    fun delete(medicine: Medicine)
    abstract fun save(medicine: Int): Medicine
    abstract fun deleteById(medicineId: Long)
}
@Repository
class JpaHospitalRepository(private val entityManager: EntityManager) : HospitalRepository {
    override fun create(hospital: HospitalRequest) {
        entityManager.persist(hospital)
    }

    override fun read(id: Int): Hospital? {
        return entityManager.find(Hospital::class.java, id)
    }

    override fun update(hospital: Hospital) {
        entityManager.merge(hospital)
    }

    override fun delete(hospital: Hospital) {
        entityManager.remove(hospital)
    }
}

@Repository
abstract class JpaMedicineRepository(private val entityManager: EntityManager) : MedicineRepository {
    override fun create(medicine: MedicineRequest) {
        entityManager.persist(medicine)
    }

    override fun read(id: Int): Medicine? {
        return entityManager.find(Medicine::class.java, id)
    }

    override fun update(medicine: Medicine) {
        entityManager.merge(medicine)
    }

    override fun delete(medicine: Medicine) {
        entityManager.remove(medicine)
    }
}

