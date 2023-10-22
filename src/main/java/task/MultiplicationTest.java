/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

/**
 *
 * @author User
 */
import java.util.Random;
import java.util.Scanner;

public class MultiplicationTest {
    
        private final Scanner scanner;

    public MultiplicationTest(Scanner scanner) {
        this.scanner = scanner;
    }

    public static void runTask() {
                int correctAnswers = 0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int num1 = random.nextInt(10) + 1;
            int num2 = random.nextInt(10) + 1;
            int answer = num1 * num2;

            System.out.print("What is " + num1 + " x " + num2 + " = ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answer) {
                System.out.println("Правильно!");
                correctAnswers++;
            } else {
                System.out.println("Ошибка.");
            }
        }

        System.out.println("Вы ответили правильно на " + correctAnswers + " из 5 вопросов.");

        if (correctAnswers == 5) {
            System.out.println("Молодец!");
        } else if (correctAnswers >= 3) {
            System.out.println("Надо бы еще поучить.");
        } else {
            System.out.println("Срочно нужно учить таблицу умножения.");
        }
    }
}


