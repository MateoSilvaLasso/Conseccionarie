package model;
import java.util.ArrayList;
public class Concessionaire {
    private ArrayList<Vehicle> vehicles;
    private parking park;

    public Concessionaire(){
        this.vehicles= new ArrayList<>();
        this.park= new parking();
    }

    public Concessionaire(ArrayList<Vehicle> vehicles){
        this.vehicles=vehicles;
    }

    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, char typeGasoline){
        Vehicle v= new GasolineVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, typeGasoline);
        this.vehicles.add(v);
    }

    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje,boolean neww, String placa, int doorsNumber, boolean windowp, int type,double batteryDuration, double batteryConsum, int chargerType){
        Vehicle v= new ElectricVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, batteryDuration, batteryConsum, chargerType);
        this.vehicles.add(v);
    }
    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, double batteryDuration, double batteryConsum, int gasolineType, int chargerType){
        Vehicle v=new HybridVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, batteryDuration, batteryConsum, gasolineType, chargerType);
        this.vehicles.add(v);
    }

    public void addVehicle(String id,double baseValue, String mark, String model, double cilindraje, double kilometraje, Boolean neww, String placa, int doorsNumber, boolean windowp, int type,double gasolineCapacity, double gasolineGasto, int type1){
        Vehicle v= new MotoCycle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, gasolineCapacity, gasolineGasto, type1);
        this.vehicles.add(v);
    }

    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setDocumentsInvehicle(double value,String mark, String model,  int year, double gases){
        Documents d= new Mecanic(value,year, gases);
        boolean p=true;
        for(int i=0; i<vehicles.size() && p; i++){

            if(vehicles.get(i).getMark().equals(mark) && vehicles.get(i).getModel().equals(model)){
                vehicles.get(i).setDocumentsMecanic(d);
                p=false;
            } 

        }

    }

    public void setDocumentsInvehicle(String mark, String model, double value, int year, double cobertura){
        Documents d= new Soat(value,year, cobertura);
        boolean p= true;
        for(int i=0; i<vehicles.size() && p; i++){

            if(vehicles.get(i).getMark().equals(mark) && vehicles.get(i).getModel().equals(model)){
                vehicles.get(i).setDocumentsSoat(d);
                p=false;
            } 

        }

    }

    public void setVehicleInDocumentsInimage(String mark, String model,int [][] image){
        boolean p= true;
        for(int i=0; i<vehicles.size() && p; i++){

            if(vehicles.get(i).getMark().equals(mark) && vehicles.get(i).getModel().equals(model)){
                vehicles.get(i).setImageInDocument(image);
                p=false;
            } 

        }
    }

    public double searchValue(String id){
        double value=0;

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i).getId().equalsIgnoreCase(id)){
                value=vehicles.get(i).getSellValue();
            }
        }

        return value;
    }


    public parking getPark() {
        return this.park;
    }

    public void setPark(parking park) {
        this.park = park;
    }

    public String showInformation(int option, int option1){
        String out="";
        switch(option){
            case 1:
                if(option1==1){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i) instanceof GasolineVehicle){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==2){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i) instanceof ElectricVehicle){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==3){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i) instanceof HybridVehicle){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option==4){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i) instanceof MotoCycle){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }
            case 2:
            
                if(option1==1){
                    for(int i=0; i<vehicles.size(); i++){
                        if((vehicles.get(i) instanceof GasolineVehicle && ((GasolineVehicle)vehicles.get(i)).getType()==GasolineType.CORRIENT) || (vehicles.get(i) instanceof HybridVehicle &&((HybridVehicle)vehicles.get(i)).getGasolineType()==GasolineType.CORRIENT)){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==2){
                    for(int i=0; i<vehicles.size(); i++){
                        if((vehicles.get(i) instanceof GasolineVehicle && ((GasolineVehicle)vehicles.get(i)).getType()==GasolineType.DIESEL) || (vehicles.get(i) instanceof HybridVehicle &&((HybridVehicle)vehicles.get(i)).getGasolineType()==GasolineType.DIESEL)){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    } 
                }else if(option1==3){
                    for(int i=0; i<vehicles.size(); i++){
                        if((vehicles.get(i) instanceof GasolineVehicle && ((GasolineVehicle)vehicles.get(i)).getType()==GasolineType.EXTRA) || (vehicles.get(i) instanceof HybridVehicle &&((HybridVehicle)vehicles.get(i)).getGasolineType()==GasolineType.EXTRA)){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==4){
                    for(int i=0; i<vehicles.size(); i++){
                        if((vehicles.get(i) instanceof ElectricVehicle && ((ElectricVehicle)vehicles.get(i)).getType()==ChargerType.NORMAL) || (vehicles.get(i) instanceof HybridVehicle && ((HybridVehicle)vehicles.get(i)).getChargerType()==ChargerType.NORMAL)){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==5){
                    for(int i=0; i<vehicles.size(); i++){
                        if((vehicles.get(i) instanceof ElectricVehicle && ((ElectricVehicle)vehicles.get(i)).getType()==ChargerType.NORMAL) || (vehicles.get(i) instanceof HybridVehicle && ((HybridVehicle)vehicles.get(i)).getChargerType()==ChargerType.NORMAL)){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }
            break;

            case 3:
                if(option1==1){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i).getNeww()){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }else if(option1==2){
                    for(int i=0; i<vehicles.size(); i++){
                        if(vehicles.get(i).getNeww()==false){
                            out+=vehicles.get(i).toString()+"\n";
                        }
                    }
                }
            break;
        }
        return out;
    }


}
