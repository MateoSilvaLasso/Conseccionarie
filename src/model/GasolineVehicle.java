package model;
import java.text.DecimalFormat;
public class GasolineVehicle extends Vehicle{

    private double tankCapacity;
    private double oilConsume;
    private GasolineType type;


    public GasolineVehicle(String id,double baseValue,  String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, char typeGasoline) {
        super(id,baseValue,  mark, model, cilindraje, kilometraje,neww, placa, doorsNumber, windowp, type);
        this.tankCapacity = tankCapacity;
        this.oilConsume = oilConsume;
        if(typeGasoline=='1'){
            this.type=GasolineType.CORRIENT;
        }else if(typeGasoline=='2'){
            this.type= GasolineType.DIESEL;
        }else if(typeGasoline=='3'){
            this.type= GasolineType.EXTRA;
        }
       // super.setSellValue(sellValue());
    }

    public double getTankCapacity() {
        return this.tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getOilConsume() {
        return this.oilConsume;
    }

    public void setOilConsume(double oilConsume) {
        this.oilConsume = oilConsume;
    }

    public GasolineType getType() {
        return this.type;
    }

    public void setType(GasolineType type) {
        this.type = type;
    }

    public double sellValue(){
        double p=super.getBaseValue();
        if(super.getDocumentsMecanic()==null && super.getDocumentsSoat()==null){
            p+=500000;
        }

        if(!super.getNeww()){
            double desc=p*0.1;
            p-=desc;
        }
        return p;
    }


    @Override
    public String toString() {
        DecimalFormat df= new DecimalFormat("#");
        return "{" +
            "base value="+df.format(super.getBaseValue())+"\n"+
            "sell value="+df.format(super.getSellValue())+"\n"+
            "mark="+super.getMark()+"\n"+
            "model="+super.getModel()+"\n"+
            "cilindraje="+super.getKilometraje()+"\n"+
            "kilometraje="+super.getKilometraje()+"\n"+
            " tankCapacity='" + getTankCapacity() + "\n" +
            ", oilConsume='" + getOilConsume() + "\n" +
            ", type='" + getType() + "\n" +
            "}";
    }

    
}
