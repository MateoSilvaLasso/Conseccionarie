package model;
import java.util.ArrayList;
public class Concessionaire{
    private ArrayList<Vehicle> vehicles;
    private parking park;

    public Concessionaire(){
        this.vehicles= new ArrayList<>();
        this.park= new parking();
    }

    public Concessionaire(ArrayList<Vehicle> vehicles, parking park){
        this.vehicles=vehicles;
        this.park=new parking();
        this.park= park;
    }
    /**
     * description: this method add a gasoline vehicle
     * @param id must be full
     * @param baseValue must be full
     * @param mark must be full
     * @param model must be full
     * @param cilindraje must be full
     * @param kilometraje must be full
     * @param neww must be full
     * @param placa must be full
     * @param doorsNumber must be full
     * @param windowp must be full
     * @param type must be full
     * @param tankCapacity must be full
     * @param oilConsume must be full
     * @param typeGasoline must be full
     */
    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, char typeGasoline){
        Vehicle v= new GasolineVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, typeGasoline);
        this.vehicles.add(v);
        park.addVehicle(v);
    }
    /**
     * description: this method add a electric vehicle
     * @param id must be full
     * @param baseValue must be full
     * @param mark must be full
     * @param model must be full
     * @param cilindraje must be full
     * @param kilometraje must be full
     * @param neww must be full
     * @param placa must be full
     * @param doorsNumber must be full
     * @param windowp must be full
     * @param type must be full
     * @param batteryDuration must be full
     * @param batteryConsum must be full
     * @param chargerType must be full
     */
    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje,boolean neww, String placa, int doorsNumber, boolean windowp, int type,double batteryDuration, double batteryConsum, int chargerType){
        Vehicle v= new ElectricVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, batteryDuration, batteryConsum, chargerType);
        this.vehicles.add(v);
        park.addVehicle(v);
    }
    /**
     * description: this method add a hybrid vehicle
     * @param id must be full
     * @param baseValue must be full
     * @param mark must be full
     * @param model must be full
     * @param cilindraje must be full
     * @param kilometraje must be full
     * @param neww must be full
     * @param placa must be full
     * @param doorsNumber must be full
     * @param windowp must be full
     * @param type must be full
     * @param tankCapacity must be full
     * @param oilConsume must be full
     * @param batteryDuration must be full
     * @param batteryConsum must be full
     * @param gasolineType must be full
     * @param chargerType must be full
     */
    public void addVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, double batteryDuration, double batteryConsum, int gasolineType, int chargerType){
        Vehicle v=new HybridVehicle(id,baseValue,  mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, batteryDuration, batteryConsum, gasolineType, chargerType);
        this.vehicles.add(v);
        park.addVehicle(v);
    }
    /**
     * description: this method add a motocycle
     * @param id must be full
     * @param baseValue must be full
     * @param mark must be full
     * @param model must be full
     * @param cilindraje must be full
     * @param kilometraje must be full
     * @param neww must be full
     * @param placa must be full
     * @param doorsNumber must be full
     * @param windowp must be full
     * @param type must be full
     * @param gasolineCapacity must be full
     * @param gasolineGasto must be full
     * @param type1 must be full
     */
    public void addVehicle(String id,double baseValue, String mark, String model, double cilindraje, double kilometraje, Boolean neww, String placa, int doorsNumber, boolean windowp, int type,double gasolineCapacity, double gasolineGasto, int type1){
        Vehicle v= new MotoCycle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, gasolineCapacity, gasolineGasto, type1);
        this.vehicles.add(v);
        park.addVehicle(v);
    }
    /**
     * description: this method show parking 1: full space and 2: empty position
     * @return p, must be inicializated
     * 
     */
    public int[][] showParking(){
        Vehicle [][] parking= park.getParking();
        int [][] p= new int[10][5];
        for(int i=0; i<parking.length; i++){
            for(int j=0; j<parking[0].length; j++){
                if(parking[i][j]!=null){
                    p[i][j]=1;
                }
            }
        } 

        return p;
    }

    /**
     * description: this method change documents in any vehicle
     * @param value must be full
     * @param mark must be full
     * @param model must be full
     * @param year must be full
     * @param gases must be full
     */
    public void setDocumentsInvehicle(double value,String id, int year, double gases){
        Documents d= new Mecanic(value,year, gases);
        boolean p=true;
        for(int i=0; i<vehicles.size() && p; i++){

            if(vehicles.get(i).getId().equalsIgnoreCase(id)){
                vehicles.get(i).setDocumentsMecanic(d);
                p=false;
            } 

        }

    }
    /**
     * description:  this method change documents in any vehicle
     * @param mark must be full
     * @param model must be full
     * @param value must be full
     * @param year must be full
     * @param cobertura must be full
     */
    public void setDocumentsInvehicle(String id, double value, int year, double cobertura){
        Documents d= new Soat(value,year, cobertura);
        boolean p= true;
        for(int i=0; i<vehicles.size() && p; i++){

            if(vehicles.get(i).getId().equalsIgnoreCase(id)){
                vehicles.get(i).setDocumentsSoat(d);
                p=false;
            } 

        }

    }

    /**
     * description: this method show a car value
     * @param id must be full
     * @return value, need be inicializated
     */
    public double searchValue(String id){
        double value=0;

        for(int i=0; i<vehicles.size(); i++){
            if(vehicles.get(i).getId().equalsIgnoreCase(id)){
                value=vehicles.get(i).getSellValue();
            }
        }

        return value;
    }

    /**
     * description: this method valid if exist any car
     * @return p, need be inicializated
     */
    public boolean validAnyCar(){
        boolean p=false;
        for(int i=0; i<vehicles.size() && p==false; i++){
            if(vehicles.get(i)!=null){
                p=true;
            }
        }
        return p;
    }
    /**
     * description: this method show information depending of the options
     * @param option must be full
     * @param option1 must be full
     * @return out, need be inicializated and show a String
     */
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
    /**
     * description: this method show document for one car
     * @param id must be full
     * @return out, need be inicializated
     */
    public String showDocuments(String id){
        String out="";
        boolean p=true;
        for(int i=0; i<vehicles.size() && p; i++){
            if(vehicles.get(i).getId().equalsIgnoreCase(id)){
                if(vehicles.get(i).getDocumentsSoat()==null){
                    out+="this car doesnt have soat\n";
                }else{
                    out+="number soat is: "+ vehicles.get(i).getSoatNumber()+"\n";
                }

                if(vehicles.get(i).getDocumentsMecanic()==null){
                    out+="this car doesnt have technical mecanic";
                }else{
                    out+="number technical Mecanic is: "+ vehicles.get(i).getMecanicNumber();
                }
                p=false;
            }
            

            
           
        }

        if(p){
            out="in this moment that car doesnt exist";
        }
        return out;
    }
    /**
     * description: this method call other method in parking 
     * @param year must be full
     * @param year1 msut be full
     * @return must call other method
     */
    public String showParkingInRange(int year,int year1){

       return park.showRange(year, year1);

    }
    /**
     * description: this method call other method in parking 
     * @param know must be full
     * @return must call other method
     */
     public String showMore(int know){
         return park.showTime(know);
     }
     /**
      * description: this method call other method in parking 
      * @return must call other method
      */
     public int ShowPorcent(){
         return park.ShowPorcent();
     }

}
