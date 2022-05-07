package ui;
import java.util.*;
import model.*;
public class initModel {
    
    public initModel(){}

    public ArrayList<Vehicle> vehicles(){
        ArrayList<Vehicle> vehicles= new ArrayList<>();

        vehicles.add(new GasolineVehicle("2", 12000000, "kia", "2015", 5, 5, true, null, 4, true, 1, 4, 3, '2'));
        vehicles.add(new ElectricVehicle("1", 22000300, "chevrolet", "2021", 5, 5, false, "1234", 4, false, 2, 23, 2, 1));
        vehicles.add(new HybridVehicle("3", 11320000, "mazda", "2013", 4, 5, true, null, 4, false, 2, 23, 1, 23, 3, 3, 2));
        vehicles.add(new MotoCycle("3", 5000000, "yamaha", "2022", 4, 5, true, null, 2, true, 1, 4, 1, 3));
        return vehicles;
    }

}
