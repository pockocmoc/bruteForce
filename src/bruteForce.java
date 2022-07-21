/*
Конвертер температуры  в кельвины и фарингейты.
 */

import java.util.Scanner;

interface Converter {
    double getConvertedValue(double baseValue);
}

class CelsiusConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue;
    }
}

class KelvinConverter implements Converter {

    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue + 273.15;
    }
}

class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return 1.8 * baseValue + 32;
    }
}

public class bruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значеине температуры: ");
        double temperature = sc.nextDouble();

       // double temperature = 18.0;
        System.out.println("t = " +
                new CelsiusConverter().getConvertedValue(temperature) + " Цельсия");
        System.out.println("t = " +
                new KelvinConverter().getConvertedValue(temperature) + " Кельвинов");
        System.out.println("t = " +
                new FahrenheitConverter().getConvertedValue(temperature)+ " Фарингейта");
    }
}