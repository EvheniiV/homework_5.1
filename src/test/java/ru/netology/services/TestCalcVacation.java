package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.CalcVacation;

class TestCalcVacation {
    @Test
    void calculateQuantityVacationMonthFirst() {
        CalcVacation count = new CalcVacation();

        //данные для теста
        int income = 10_000;     //зарплата за месяц
        int expenses = 3_000;    //ежемесячные траты
        int threshold = 20_000;  //граница для отпуска
        int actual = 3;           //ожидаемый результат, количество месяцев отдыха

        //вызов целевого метода
        int result = count.calculate(income, expenses, threshold);

        //сравнивем ожидаемый и полученный результаты
        Assertions.assertEquals(result, actual);
    }

    @Test
    void calculateQuantityVacationMonthSecond() {
        CalcVacation count = new CalcVacation();

        //данные для теста
        int income = 100_000;     //зарплата за месяц
        int expenses = 60_000;    //ежемесячные траты
        int threshold = 150_000;  //граница для отпуска
        int actual = 2;           //ожидаемый результат, количество месяцев отдыха

        //вызов целевого метода
        int result = count.calculate(income, expenses, threshold);

        //сравнивем ожидаемый и полученный результаты
        Assertions.assertEquals(result, actual);
    }


}