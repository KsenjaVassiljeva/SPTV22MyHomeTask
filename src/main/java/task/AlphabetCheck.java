/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;
/**
 *
 * @author User
 */
public class AlphabetCheck {
    public static void runTask() {
        String text = "Съешь ещё этих французских булок и галет, да выпей же чаю с молоком, как и я.";
        boolean containsAllLetters = containsAllRussianLetters(text);
        
        if (containsAllLetters) {
            System.out.println("Текст содержит все буквы русского алфавита.");
        } else {
            System.out.println("Текст не содержит все буквы русского алфавита.");
        }
    }

    public static boolean containsAllRussianLetters(String text) {
        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        for (char letter : alphabet.toCharArray()) {
            if (text.indexOf(letter) == -1 && text.indexOf(Character.toUpperCase(letter)) == -1) {
                return false;
            }
        }
        return true;
    }
}
