/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ArrayDemo {
    private Scanner scanner;
    public ArrayDemo(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runDemo() {
        int[] myArray = new int[20];
        Random random = new Random();
        int sum = 0;
        for(int i = 0; i < myArray.length; i++){
            myArray[i] = random.nextInt(19 - 0 + 1); //реализовать заполнение только четными числами
        }
        System.out.println("Массив из 20 случайных четных чисел: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.printf("%4d",myArray[i]);
        }
        System.out.println();
        
        System.out.print("Среднее арифметическое элементов массива\nбез учета максимального и минимального числа: ");
        System.out.println(sum);
        
        
    }
    
}
