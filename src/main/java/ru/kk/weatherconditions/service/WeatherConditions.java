package ru.kk.weatherconditions.service;

import java.util.Scanner;

public class WeatherConditions {
    public static void weatherconditions() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру: ");
        int temperature = scanner.nextInt();
        String weatherDescription;
        if (temperature < 0) {
            weatherDescription = "Сейчас очень холодно";
        } else if (temperature >= 0 && temperature <= 16) {
            weatherDescription = "Сейчас прохладно";
        } else {
            weatherDescription = "Отличный летний денек!";
        }

        System.out.println(weatherDescription);
        scanner.close();
    }
}
