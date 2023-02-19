package ru.freelance.freelanceCalcMethod.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncomeExpensesServiceTest {

    @Test
    public void testCalculateVacationMonthsEx1() {
        IncomeExpensesService service = new IncomeExpensesService();
        int vacationMonths = service.calculate(10_000, 3_000, 20_000);
        Assertions.assertEquals(3, vacationMonths);
    }

    @Test
    public void testCalculateVacationMonthsEx2() {
        IncomeExpensesService service = new IncomeExpensesService();
        int vacationMonths = service.calculate(100_000, 60_000, 150_000);
        Assertions.assertEquals(2, vacationMonths);
    }

}
