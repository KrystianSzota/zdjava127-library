package pl.sdacademy;

import pl.sdacademy.menu.AddBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void mainMenu() {
        Scanner menuOption = new Scanner(System.in);
        System.out.println("Witaj w systemie bibliotecznym");
        System.out.println("Prosze wybrac, ktora cie interesauje");
        System.out.println("1 - Dodaj ksiazke");
//        System.out.println("2 - Usun ksiazke");
//        System.out.println("3 - Dodaj uzytkownika");
//        System.out.println("4 - Usun uzytkownika");
//        System.out.println("5 - Zarejestruj wypozyczenie ksiazki");
//        System.out.println("6 - Zarejestruj zwrot ksiazki");
        System.out.println("0 - Zakoncz program");
        System.out.println("Wybrana opcja: ");

        try {
            Integer option = menuOption.nextInt();
            switch (option) {
                case 1:
                    AddBook.addBook();
                    break;
//                case 2:
//                    removeBook();
//                    break;
//                case 3:
//                    addUser();
//                    break;
//                case 4:
//                    removeUser();
//                    break;
//                case 5:
//                    rentBook();
//                    break;
//                case 6:
//                    returnBook();
//                    break;
                case 0:
                    break;
                default:
                    System.out.println("Prosze wybrac poprawna wartosc!");
                    mainMenu();
            }
        } catch (InputMismatchException e) {
            System.out.println("Prosze wybrac poprawna wartosc!");
            mainMenu();
        }
    }
}