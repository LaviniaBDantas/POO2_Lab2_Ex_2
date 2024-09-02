package org.example;

public class Toyota implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        if(modelo=="Corolla"){
            System.out.println("Corolla fabricado com sucesso!");
            return new Corolla();
        }
        return null;
    }
}
