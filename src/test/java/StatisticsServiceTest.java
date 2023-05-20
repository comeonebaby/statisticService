package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findCycle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 2, 3, 4, 5, 6, 7};
        long expected = 7;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);}
    @Test
void findMaxFromSingleIncome() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {5};
    long expected = 5;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}
@Test
void findMaxFromNegativeIncomes() {
    StatisticsService service = new StatisticsService();
    long[] incomesInBillions = {-12, -5, -8, -4, -5, -3, -8, -6, -11, -11, -12};
    long expected = 0;
    long actual = service.findMax(incomesInBillions);
    Assertions.assertEquals(expected, actual);
}

