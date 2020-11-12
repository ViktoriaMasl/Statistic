package ru.netology.stats;

public class StatsService {

    public double calculateSum(double[] purchases) {
        double sum = 0;
        for (double purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }



    public double calculateAverage(double[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }



    public double findMaxSalesMonth(double[] purchases) {
        double currentMax = purchases[0];
        for (double purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }

        int month = 1;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == currentMax) {
                month = i + 1;
            }
        }
        return month;
    }



    public double findMinSalesMonth (double[] purchases) {
        double currentMin = purchases[0];
        int index = 0;
        for (int i = 0; i < purchases.length; i++) {

            if (purchases[i] <= currentMin) {
                currentMin = purchases[i];
                index = i + 1;
            }
        }
        return index;
    }




    public  double salesUnderAverage (double[] purchases) {
        double monthAmount = 0;
        double monthAverage = calculateAverage(purchases);
        for (double purchase : purchases) {
            if (purchase < monthAverage) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }




    public double salesOverAverage (double[] purchases) {
        double monthAverage = calculateAverage(purchases);
        double monthAmount = 0;
        for (double purchase : purchases) {
            if (purchase > monthAverage) {
                monthAmount += 1;
            }
        }
        return monthAmount;
    }
}
