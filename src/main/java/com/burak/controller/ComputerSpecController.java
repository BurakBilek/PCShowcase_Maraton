package com.burak.controller;

import com.burak.service.ComputerSpecService;

public class ComputerSpecController {
    ComputerSpecService computerSpecService;

    public ComputerSpecController() {
        this.computerSpecService=new ComputerSpecService();
    }
}
