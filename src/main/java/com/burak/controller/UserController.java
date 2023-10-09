package com.burak.controller;

import com.burak.repository.entity.User;
import com.burak.service.UserService;

import java.security.AuthProvider;
import java.util.Optional;
import java.util.Scanner;

import static com.burak.utility.Constants.getBaseEntity;

public class UserController {

    UserService userService;


    public UserController(){
        this.userService = new UserService();

    }

    public User kullaniciOlustur() {
        Scanner scanner = new Scanner(System.in);
        String ad = "";
        String soyad = "";
        String email = "";
        String password = "";

        System.out.print("Kullanici Adini Giriniz : ");
        String username = scanner.nextLine();
        System.out.print("Adinizi Giriniz : ");
        ad = scanner.nextLine();
        System.out.print("Soyadinizi Giriniz : ");
        soyad = scanner.nextLine();
        System.out.print("Email Adresinizi Giriniz : ");
        email = scanner.nextLine();
        System.out.print("Profil Fotoğrafı olustur (E/H) : ");
        if (scanner.nextLine().equalsIgnoreCase("e")){
            System.out.print("Fotoğraf url'si giriniz");

        }


        User user = User.builder()
                .username(username)
                .ad(ad)
                .soyad(soyad)
                .email(email)
                .password(kullaniciOlustur().getPassword())
                .baseEntity(getBaseEntity())
                .build();

        return userService.save(user);
    }


    public Optional<User> girisYap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen username giriniz : ");
        String username = scanner.nextLine();
        Optional<User> user = kullaniciAdinaGoreKullaniciBul(username);
        if (user.isPresent()){
            System.out.println("Hosgeldin " + user.get().getAd());
        } else {
            System.out.println("Kullanici bulunamadi.");
        }
        return user;
    }

    private Optional<User> kullaniciAdinaGoreKullaniciBul(String username) {
        return userService.kullaniciAdinaGoreKullaniciBul(username);
    }
    public void menu(){
        boolean close=false;
        do{
            int secim=0;
            AuthProvider userInterface = null;
            userInterface.login();
            System.out.print("Lütfen seçiniz : ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 0: close = true; break;
                case 1: createAccount(); break;
                case 2: loginUser();break;
            }
        }while (!close);
    }

    public void registerUser() {
    }
}



