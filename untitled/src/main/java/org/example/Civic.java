package org.example;

public class Civic implements  IVehicle{
    @Override
    public void start() {
        System.out.println("Carro ligado!");
    }

    @Override
    public void drive() {
        System.out.println("Velocidade: \nCombustível: \n");
    }

    @Override
    public void stop() {
        System.out.println("Desligado");
    }
}
