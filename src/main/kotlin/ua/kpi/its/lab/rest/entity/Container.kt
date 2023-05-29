package ua.kpi.its.lab.rest.entity

interface Container {
    /**
     * Додає об'єкт до контейнера.
     * @param obj об'єкт, який потрібно додати
     */
    fun add(obj: Ліки)

    /**
     * Видаляє об'єкт з контейнера за індексом.
     * @param index індекс об'єкта, який потрібно видалити
     */
    fun remove(index: Int)

    /**
     * Оновлює об'єкт в контейнері за індексом.
     * @param index індекс об'єкта, який потрібно оновити
     * @param obj новий об'єкт
     */
    fun update(index: Int, obj: Ліки)

    /**
     * Отримує об'єкт з контейнера за індексом.
     * @param index індекс об'єкта
     * @return об'єкт, який знаходиться за вказаним індексом
     */
    fun get(index: Int): Ліки

    /**
     * Отримує список всіх об'єктів у контейнері.
     * @return список об'єктів
     */
    fun getAll(): List<Ліки>
    abstract fun add(obj: Лікарня)
}
