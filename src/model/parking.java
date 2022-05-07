package model;
import java.util.ArrayList;
public class parking {
    
    private ArrayList<Vehicle> vehicles;


    public parking() {
        this.vehicles = new ArrayList<>();
    }


    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }


}
