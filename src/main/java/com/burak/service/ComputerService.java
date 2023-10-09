package com.burak.service;

import com.burak.repository.ComputerRepository;

public class ComputerService {
    ComputerRepository computerRepository;

    public ComputerService(){
        this.computerRepository = new ComputerRepository();
    }
}
