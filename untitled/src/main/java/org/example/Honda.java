package org.example;

public class Honda implements IVehicleMaker{
    @Override
    public IVehicle makeVehicle(String modelo) {
        if (modelo=="Civic"){
            System.out.println("Civic fabricado com sucesso!!");
            return new Civic();
        }
        return null;
    }
}
