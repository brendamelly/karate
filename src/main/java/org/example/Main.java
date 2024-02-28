package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("My Name is Brenda");
        System.out.print("i am a QA Engineer");

        //variabel
        boolean flag; //try-catch
        float num;
        //looping 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        int a = 10;
        int b = 2;
        float c = 3;
        String nama = "Brenda";
        char q = 'Y';
        flag = false;

        float result; //sebelumnya int dirubah jadi float
        //result = a/b; // 10 divide 2 (both int)
        result = a/c; // 10 divide 3 (one of them is float)
        int resultType = (int) (a/c);
        System.out.println(resultType);
        System.out.println(result);

        int timeStart = 8;
        int timeFinish = 17;
        int waktuSaya = 9;
        int waktuPulang = 14;

        //karyawan tepat waktu datang dan pulang
        if (waktuSaya <= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Selamat Kamu Tepat Waktu!");
            System.out.println("Anda Datang " + (timeStart - waktuSaya) + " Jam Lebih Cepat");
            System.out.println("Anda Pulang " + (waktuPulang - timeFinish) + " Jam Lebih Lama");

            // karyawan datang dluan, pulang cepat, dicengin
        } else if (waktuSaya <= timeStart && waktuPulang <= timeFinish) {
            System.out.println("Datang Awal. Pulang cepat nih yee");
            //karyawan telat, pulang lama, dimaafkan
        } else if (waktuSaya >= timeStart && waktuPulang >= timeFinish) {
            System.out.println("Dimaafkan Datang Telatnya");
        //dapat selamat, karyawan telat dan pulang cepat disoraki
        } else {
            System.out.println("YEEE TELAT");
        System.out.println("Anda Telat " + (waktuSaya - timeStart) + " jam");
            System.out.println("Anda Pulang Duluan " + (timeFinish - waktuPulang) + " jam lebih cepat");

        }

        int day = 3;
        switch (day){
            case 1 :
                System.out.println("Saya WFO");
                break;
            case 2 :
                System.out.println("Saya Libur/Cuti");
                break;
            case 3 :
                System.out.println("Saya WFH");
                break;
            case 4 :
                System.out.println("Liburan alias weekend");
        }
        System.out.println("hehehe");
    }
    // loop
    //while dan for loop, foreach
}