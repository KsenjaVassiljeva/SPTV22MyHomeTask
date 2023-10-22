/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TemperatureConverter {
    
    private Scanner scanner;
    
    public TemperatureConverter(Scanner scanner) {
        this.scanner = scanner;
    }

    public void doConvert() {
        boolean repeat = true;
        do{
            System.out.println("Выберите направление корвертации:");
            System.out.println("0. Закончить задачу");
            System.out.println("1. Конвертировать из Цельсия в Фаренгейт");
            System.out.println("2. Конвертировать из Фаренгейта в Цельсий");
            System.out.print("Задача №: ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из конвертора");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("Конвертируем из Цельсия в Фаренгейт");
                    celsiusToFahrenheit();
                    break;
                case 2:
                    System.out.println("Конвертируем из Фаренгейта в Цельсия");
                    fahrenheitToCelsius();
                    break;
                default:
                    System.out.println("Выберите числа из списка");
            }
            System.out.println("---------------");
        }while(repeat);
    }

    private void celsiusToFahrenheit() {
        System.out.print("Введите температуру (Celsius): ");
        double tCelsius = scanner.nextDouble(); scanner.nextLine();
        double tFahrenheit = 0;
        //this code
        System.out.printf("Результат (Fahrenheit): %.1f%n",tFahrenheit);
    }

    private void fahrenheitToCelsius() {
        System.out.print("Введите температуру (Fahrenheit): ");
        double tFahrenheit = scanner.nextDouble(); scanner.nextLine();
        double tCelsius = 0;
        //this code
        System.out.printf("Результат (Celsius): %.1f%n",tCelsius);
    }
    
    
}