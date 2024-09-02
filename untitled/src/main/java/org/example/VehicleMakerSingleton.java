package org.example;

public class VehicleMakerSingleton {
    private static IVehicleMaker ToyotaInstance;
    private static IVehicleMaker HondaInstance;

    //Utilizei o singleton porque cada marca só pode ter uma "Fabrica"(Instancia) criada.
    //Toda vez que precisar utilizar a fábrica (de determinada marca) para fazer um carro, irei usar a mesma.
    public static IVehicleMaker getInstance(String name){
        if (name=="Toyota"){
            if (ToyotaInstance==null){
                ToyotaInstance=new Toyota();
            }
            return ToyotaInstance;
        }else if (name=="Honda"){
            if (HondaInstance==null){
                HondaInstance=new Honda();
            }
            return HondaInstance;
        }
        return null;
    }

}
