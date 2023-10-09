package com.burak.service;

import com.burak.repository.ComputerRepository;

public class ComputerSpecService {
    ComputerRepository computerRepository;

    public ComputerSpecService(){
        this.computerRepository = new ComputerRepository();
    }
}
