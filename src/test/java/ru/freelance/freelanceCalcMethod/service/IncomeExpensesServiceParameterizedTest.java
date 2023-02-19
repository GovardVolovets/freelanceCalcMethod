package ru.freelance.freelanceCalcMethod.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class IncomeExpensesServiceParameterizedTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/IncomeExpensesService.csv")
    public void testCalculateVacationMonths(int expected, int income, int expenses, int threshold) {
        IncomeExpensesService service = new IncomeExpensesService();
        int vacationMonths = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, vacationMonths);
    }
}
