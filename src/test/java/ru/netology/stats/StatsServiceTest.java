package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 180;

        double actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }


    @Test
    void shouldCalculateAverage() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;

        double actual = service.calculateAverage(purchases);

        assertEquals(expected, actual);
    }


    @Test
    void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 8;

        double actual = service.findMaxSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 9;

        double actual = service.findMinSalesMonth(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesUnderAverage() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;

        double actual = service.salesUnderAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void shouldSalesOverAverage() {
        StatsService service = new StatsService();

        double[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 5;

        double actual = service.salesOverAverage(purchases);

        assertEquals(expected, actual);
    }
}