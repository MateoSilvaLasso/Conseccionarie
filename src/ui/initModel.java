package ui;
import java.util.*;
import model.*;
public class initModel {
    
    public initModel(){}
    private ArrayList<Vehicle> vehicles= new ArrayList<>();
    public  ArrayList<Vehicle> vehicles(){
       
        vehicles.add(new GasolineVehicle("1", 12000000, "kia", "2014", 5, 5, true, null, 4, true, 1, 4, 3, '2'));
        vehicles.add(new ElectricVehicle("2", 22000300, "chevrolet", "2021", 5, 5, false, "1234", 4, false, 2, 23, 2, 1));
        vehicles.add(new HybridVehicle("3", 11320000, "mazda", "2013", 4, 5, true, null, 4, false, 2, 23, 1, 23, 3, 3, 2));
        vehicles.add(new MotoCycle("4", 5000000, "yamaha", "2022", 4, 5, true, null, 2, true, 1, 4, 1, 3));
        vehicles.get(0).setDocumentsSoat(new Soat(1,1,1));
        vehicles.get(2).setDocumentsSoat(new Soat(2,3,55));
        vehicles.get(2).setDocumentsMecanic(new Mecanic(23,34,56));
      
        return vehicles;
    }

    public parking park(){
        parking p= new parking();
        p.addVehicle(vehicles.get(0));
        p.addVehicle(vehicles.get(2));
        p.addVehicle(new GasolineVehicle("1", 12000000, "kia", "2011", 5, 5, true, null, 4, true, 1, 4, 3, '2'));
       p.addVehicle(new GasolineVehicle("1", 12000000, "kia", "2014", 5, 5, true, null, 4, true, 1, 4, 3, '2'));
        return p;
    }

}
