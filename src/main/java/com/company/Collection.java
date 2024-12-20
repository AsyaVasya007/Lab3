package com.company;
/**
 * Класс Collection представляет объект с двумя полями для хранения времени
 * выполнения операций с массивами и связанными структурами данных.
 */
public class Collection implements ICollection {

    /**
     * Время выполнения операций с массивом.
     */
    private long t_array;

    /**
     * Время выполнения операций со связанной структурой данных.
     */
    private long t_link;

    /**
     * Конструктор класса Collection.
     * Инициализирует оба времени выполнения (t_array и t_link) значением 0.
     */
    public Collection() {
        t_array = 0;
        t_link = 0;
    }

    /**
     * Получает текущее значение времени выполнения операций с массивом.
     *
     * @return значение времени выполнения операций с массивом (t_array).
     */
    public long getT_array() {
        return t_array;
    }

    /**
     * Получает текущее значение времени выполнения операций
     * со связанной структурой данных.
     *
     * @return значение времени выполнения операций со связанной структурой данных (t_link).
     */
    public long getT_link() {
        return t_link;
    }

    /**
     * Устанавливает значение времени выполнения операций с массивом.
     *
     * @param t новое значение времени выполнения операций с массивом.
     */
    public void setT_array(long t) {
        t_array = t;
    }

    /**
     * Устанавливает значение времени выполнения операций
     * со связанной структурой данных.
     *
     * @param t новое значение времени выполнения операций со связанной структурой данных.
     */
    public void setT_link(long t) {
        t_link = t;
    }
}