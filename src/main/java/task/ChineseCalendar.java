/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;


public class ChineseCalendar {


    public void runTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
        String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};

        int colorIndex = (year - 1984) % 60 / 12;
        int animalIndex = (year - 1984) % 12;

        String yearName = colors[colorIndex] + " " + animals[animalIndex];

        System.out.println("Год " + year + " - " + yearName);
    }
}



