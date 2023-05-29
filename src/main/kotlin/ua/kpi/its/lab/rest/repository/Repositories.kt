package ua.kpi.its.lab.rest.repository

import org.springframework.data.jpa.repository.JpaRepository
import ua.kpi.its.lab.rest.entity.Hospital
import ua.kpi.its.lab.rest.entity.Medicine

interface ЛікарняRepository : JpaRepository<Hospital, Long>

interface MedicineRepository : JpaRepository<Medicine, Long>

