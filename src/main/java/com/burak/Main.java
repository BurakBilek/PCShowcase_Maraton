package com.burak;

import com.burak.controller.*;

import java.util.Scanner;

public class Main {
    Scanner scanner;
    PostController postController;
    LikeController likeController;
    UserController userController;

    ComputerController computerController;
    ComputerSpecController computerSpecController;

    public Main() {
        this.scanner = new Scanner(System.in);
        this.postController = new PostController();
        this.likeController = new LikeController();
        this.userController = new UserController();
        this.computerController = new ComputerController();
        this.computerSpecController = new ComputerSpecController();
    }


    public static void main(String[] args) {
        Main main = new Main();
        main.pcShareApp();
    }

    private Integer girisMenu() {
        System.out.println("### PC SHARE Uygulamasina Hosgeldiniz! ####");
        System.out.println("1- Kullanici Olustur");
        System.out.println("2- Kullanici Girisi");
        System.out.println("0 - Cikis");
        System.out.print("Secim yapiniz : ");
        Integer secim = Integer.parseInt(scanner.nextLine());
        return secim;
    }

    public void pcShareApp(){
        Integer secim = 0;
        do {
            secim = girisMenu();
            switch(secim){
                case 1:
                    userController.kullaniciOlustur();
                    break;
                case 2:{
                    break;
                }
                case 0: {
                    System.out.println("Cikis Yapildi.");break;
                }
            }
        }while (secim!=0);
    }

    private void userMenu(User user) {
        Integer secim  =0;
        do {
            System.out.println("1- Bilgisayar Bileseni Olustur");
            System.out.println("2- Bilgisayar Olustur");
            System.out.println("3- Yeni Post At");
            System.out.println("4- Post'a Begeni Yap");
            System.out.println("5- Tum postlari Listele");
            System.out.println("6- Begendigim Gonderiler");
            System.out.println("7- Bir kisiye ait postlari Listele");
            System.out.println("0- Cikis Yap");
            System.out.print("Secim yapiniz : ");
            secim = Integer.parseInt(scanner.nextLine());
            switch (secim){
                private static void gorselMenu() {

                    System.out.println("**");
                    System.out.println("Programa hoş geldiniz");
                    System.out.println("**");
                    System.out.println();
                    System.out.println("1- Kayıt Ol");
                    System.out.println("2- Giriş Yap");
                    System.out.println("0- Kapat");

                }
                private static void menu() {
                    boolean cikis = false;

                    do {
                        gorselMenu();
                        System.out.println("Seçim Yapınız");
                        int secim = new Scanner(System.in).nextInt();

                        switch (secim) {
                            case 1:
                                UserController userController = new UserController();
                                userController.registerUser();
                                break;
                            case 2:
                                registerMenu();
                                break;
                            case 0:
                                cikis = true;
                                break;
                            default:
                                System.out.println("İşlem Başarısız");
                                break;
                        }
                    } while (!cikis);
                }
}