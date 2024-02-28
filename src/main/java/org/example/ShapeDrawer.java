package org.example;

import java.util.Scanner;

public class ShapeDrawer {

    Scanner scanner = new Scanner(System.in);

    public void drawShape(int choice){
        //conditional pilih menu
        switch (choice){
            case 1 :
                System.out.println("Masukan berapa tinggi segitiga"); //segitiga siku-siku
                int triangleHeight = scanner.nextInt();
                drawTriangleSS(triangleHeight);
                break;
            case 2 :
                System.out.println("Masukan berapa tinggi segitiga"); //segitiga sama kaki
                int triangleHeight2 = scanner.nextInt();
                drawTriangleSK(triangleHeight2);
                break;
            case 3 :
                break;
            default:
                System.out.println("Invalid Input"); //segitiga sama kaki
        }
    }

    public void drawTriangleSS(int triangleHeight){
        //nested loop
        //outer loop
        for (int i = 1; i <= triangleHeight;i++){
            //innerloop (take care the column)
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void drawTriangleSK(int triangleHeight){
        //nested loop
        //outer loop
        for (int i = 1; i <= triangleHeight;i++) {
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

    public void  displayMenu(){
        System.out.println("Selamat datang di ASCII gambar!");
        System.out.println("pilih gambar: ");
        System.out.println("1. segita siku-siku"); //nested loop
        System.out.println("2. segitiga sama kaki"); //nedted loop, tapi inner loop ada 2
        System.out.println("3. exit");
    }

    public void run(){
        //loop while untuk aplikasi terus running sampai ada exit
        while (true){
            displayMenu();
            System.out.println("Masukan Pilihan Anda: ");
            int choice = scanner.nextInt();
            drawShape(choice); // dimana ada kondisional
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //inheritance (OOP)
        //untuk running
        ShapeDrawer  drawer = new ShapeDrawer();
        drawer.run();
    }
}
