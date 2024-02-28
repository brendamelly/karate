package org.example;

import java.util.Scanner;

public class Brenda_Task1 {

    Scanner scanner = new Scanner(System.in);

    public void Menu() {
        System.out.println("Welcome to ASCII Drawer!");
        System.out.println("Choose a chape to draw: ");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. exit");
    }

    public void run() {
        while (true) {
            Menu();
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();
            drawShape(choice);
            System.out.println();
        }
    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Enter the height of the Triangle");
                int triangleHeight2 = scanner.nextInt();
                drawTriangleSK(triangleHeight2);
                break;
            case 2:
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    public void drawTriangleSK(int triangleHeight) {
        //nested loop
        //outer loop
        for (int i = 1; i <= triangleHeight; i++) {
            //innerloop (take care the column)
            for (int j = 1; j <= triangleHeight - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        Brenda_Task1 drawer = new Brenda_Task1();
        drawer.run();
    }
}

