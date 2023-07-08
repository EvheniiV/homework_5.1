package ru.netology.services;

public class CalcVacation {
    public int calculate(int income, int expense, int threshold) {

        int money = 0; // количество денег
        int result = 0; // счетчик месяцев отдыха

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {
                result++;
                money = money - expense;
                money = money / 3;
            } else {
                money = money + income - expense;

            }

        }
        return result;
    }
}

