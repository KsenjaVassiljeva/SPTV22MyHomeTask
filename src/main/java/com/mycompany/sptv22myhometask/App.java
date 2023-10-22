/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sptv22myhometask;
import task.AlphabetCheck;
import task.MultiplicationTest;
import task.ChineseCalendar;
import task.WeatherInYear;
import task.ArrayDemo;
import task.CreateBooksArray;
import task.NumberParser;
import java.util.Scanner;
import task.TemperatureConverter;
/**
 *
 * @author admin
 */
public class App {
    private Scanner scanner;

    public App() {
        this.scanner = new Scanner(System.in);
    }
    
    public void run() {
        boolean repeat = true;
        do{
            System.out.println("Выберите задачу:");
            System.out.println("0. Закончить программу");
            System.out.println("1. Конверетер температуры");
            System.out.println("2. Парсер числа");
            System.out.println("3. Создание массива книг");
            System.out.println("4. Задача с массивом целых чисел");
            System.out.println("5. Температура в году");
            System.out.println("6 Китайский Календарь. ");
            System.out.println("7 Таблица умножения тест. ");
            System.out.println("8 Проверка текста. ");
            int task = scanner.nextInt(); scanner.nextLine();
            switch (task) {
                case 0:
                    System.out.println("Выбран выход из программы");
                    repeat = false;
                    break;
                case 1:
                    System.out.println("--- Выбрана задача 1 ---");
                    TemperatureConverter temperatureConverter;
                    temperatureConverter = new TemperatureConverter(scanner);
                    temperatureConverter.doConvert();
                    break;
                case 2:
                    System.out.println("--- Выбрана задача 2 ---");
                    NumberParser numberParser = new NumberParser(scanner);
                    numberParser.doParse();
                    break;
                case 3:
                    System.out.println("--- Выбрана задача 3 ---");
                    CreateBooksArray createBooksArray;
                    createBooksArray = new CreateBooksArray();
                    createBooksArray.doCreateArray();
                    break;
                case 4:
                    System.out.println("--- Выбрана задача 4 ---");
                    ArrayDemo arrayDemo;
                    arrayDemo = new ArrayDemo(scanner);
                    arrayDemo.runDemo();
                    System.out.println("--- конец задачи 4 ---");
                    break;
                case 5:
                    System.out.println("--- Выбрана задача 5 ---");
                    WeatherInYear weatherInYear;
                    weatherInYear = new WeatherInYear(scanner);
                    weatherInYear.runTask();
                    System.out.println("--- конец задачи 5 ---");
                    break;
                case 6:
                    System.out.println("--- Выбрана задача 6 ---");
                    ChineseCalendar chineseCalander;
                    chineseCalander = new ChineseCalendar();
                    chineseCalander.runTask();
                    System.out.println("--- конец задачи 6 ---");
                    break;
                case 7:
                    System.out.println("--- Выбрана задача 7 ---");
                    MultiplicationTest multiplicationTest;
                    multiplicationTest = new MultiplicationTest(scanner);
                    MultiplicationTest.runTask();
                    System.out.println("--- конец задачи 7 ---");
                    break;
                
                case 8:
                    System.out.println("--- Выбрана задача 8 ---");
                    AlphabetCheck alphabetСheck;
                    alphabetСheck = new AlphabetCheck();
                    AlphabetCheck.runTask();
                    System.out.println("--- конец задачи 8 ---");
                    break;
                
                default:
                    System.out.println("Выберите номер из списка!");
            }
        }while(repeat);
        System.out.println("До свидания!");
    }

    
}