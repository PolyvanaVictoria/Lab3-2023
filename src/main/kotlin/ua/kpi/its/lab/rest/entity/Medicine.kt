package ua.kpi.its.lab.rest.entity

data class Medicines(
    val назва: String,
    val лікарськаФорма: String,
    val виробник: String,
    val датаВиробництва: String,
    val термінЗберігання: String,
    val ціна: String,
    val необхідністьРецепту: String
) : Comparable<Medicine> {
    override fun compareTo(other: Medicine): Int {
        // Порівняння ліків за назвою
        val result = назва.compareTo(other.назва)
        if (result != 0) {
            return result
        }

        // Якщо назви однакові, порівнюємо за ціною
        return ціна.compareTo(other.ціна.toString())
    }
}