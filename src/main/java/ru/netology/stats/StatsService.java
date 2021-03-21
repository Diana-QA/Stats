package ru.netology.stats;

public class StatsService {
    public long calculateSumAllSales(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long calculateAverageSalesInMonth(long[] purchases) {
        long sum = calculateSumAllSales(purchases);
        return sum / purchases.length;
    }

    public long calculateMaxSales(long[] purchases) {
        long month = 0;
        for (long l = 0; l < purchases.length; l++) {
            if (purchases[(int) l] >= purchases[(int) month])
                month = l;
        }
        return month;
    }

    public long calculateMinSales(long[] purchases) {
        long month = 0;
        for (long l = 0; l < purchases.length; l++) {
            if (purchases[(int) l] <= purchases[(int) month])
                month = l;
        }
        return month;
    }

    public long calculateBelowTheAverage(long[] purchases) {
        long month = 0;
        long average = calculateAverageSalesInMonth(purchases);
        for (long purchase : purchases) {
            if (purchase < average)
                month++;
        }
        return month;
    }

    public long calculateAboveAverage(long[] purchases) {
        long month = 0;
        long average = calculateAverageSalesInMonth(purchases);
        for (long purchase : purchases) {
            if (purchase > average)
                month++;
        }
        return month;
    }
}