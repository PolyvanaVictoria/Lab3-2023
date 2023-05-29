package ua.kpi.its.lab.rest.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Column
import jakarta.persistence.Id
import java.util.*

@Entity
data class Hospital(
    @Id
    @GeneratedValue
    val id: Long,

    @Column(name = "назва")
    val назва: String,

    @Column(name = "адреса")
    val адреса: String,

    @Column(name = "профіль")
    val профіль: String,

    @Column(name = "дата_відкриття")
    val датаВідкриття: Date,

    @Column(name = "кількість_відділень")
    val кількістьВідділень: Int,

    @Column(name = "кількість_місць")
    val кількістьМісць: Int,

    @Column(name = "дитяче_відділення")
    val дитячеВідділення: Boolean,

)
