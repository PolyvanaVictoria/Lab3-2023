package ua.kpi.its.lab.rest.entity

data class Лікарня(
    val назва: String,
    val адреса: String,
    val профіль: String,
    val датаВідкриття: String,
    val кількістьВідділень: Int,
    val кількістьМісць: Int,
    val дитячеВідділення: Boolean,
    val списокЛіків: List<Medicine>
) : Comparable<Лікарня> {
    override fun compareTo(other: Лікарня): Int {
        // Порівняння лікарень за назвою
        val result = назва.compareTo(other.назва)
        if (result != 0) {
            return result
        }

        // Якщо назви однакові, порівнюємо за кількістю відділень
        return кількістьВідділень.compareTo(other.кількістьВідділень)
    }
}