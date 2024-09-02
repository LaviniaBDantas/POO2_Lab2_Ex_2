package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lab-2-Atividade-2");

        //A propriedade Singleton está sendo usada aqui, ao chamar o getInstance e obter uma instância única de fábrica.
        IVehicleMaker FabricaToyota=VehicleMakerSingleton.getInstance("Toyota");
        IVehicleMaker FabricaHonda=VehicleMakerSingleton.getInstance("Honda");

        //A propriedade Factory está sendo usada nesse método, ele é responsável por criar objetos veículos.
        FabricaToyota.makeVehicle("Corolla");
        FabricaHonda.makeVehicle("Civic");
    }
}