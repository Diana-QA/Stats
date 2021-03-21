package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSumAllSales() {
        long actual = service.calculateSumAllSales(purchases);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAverageSalesInMonth() {
        long actual = service.calculateAverageSalesInMonth(purchases);
        long expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxSales() {
        long actual = service.calculateMaxSales(purchases);
        long expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinAmount() {
        long actual = service.calculateMinSales(purchases);
        long expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void calculateBelowTheAverage() {
        long actual = service.calculateBelowTheAverage(purchases);
        long expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void calculateAboveAverage() {
        long actual = service.calculateAboveAverage(purchases);
        long expected = 5;
        assertEquals(expected, actual);
    }
}