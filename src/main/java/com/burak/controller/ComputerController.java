package com.burak.controller;

import com.burak.repository.entity.Computer;
import com.burak.repository.entity.User;
import com.burak.service.ComputerService;

import java.util.Scanner;

import static com.burak.utility.Constants.getBaseEntity;

public class ComputerController {
    ComputerService computerService;
    Scanner scanner;

    public ComputerController() {
        this.computerService=new ComputerService();
        this.scanner = new Scanner(System.in);
    }

    public Computer bilgisayarOlustur(User user) {
        String marka = "";
        String model = "";
        Long userId = user.getId();


        System.out.print("Marka Giriniz : ");
        marka = scanner.nextLine();
        System.out.print("Model Giriniz : ");
        model = scanner.nextLine();


        Computer computer = Computer.builder()
                .marka(marka)
                .model(model)
                .userId(userId)
                .baseEntity(getBaseEntity())
                .build();

        return computerService.save(computer);
    }
}
