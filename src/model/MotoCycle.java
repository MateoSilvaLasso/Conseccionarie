package model;
import java.text.DecimalFormat;
public class MotoCycle extends Vehicle{
    
    private double gasolineCapacity;
    private double gasolineGasto;
    private MotoCycleType type;

    public MotoCycle(String id,double baseValue, String mark, String model, double cilindraje, double kilometraje, Boolean neww, String placa, int doorsNumber, boolean windowp, int type,double gasolineCapacity, double gasolineGasto, int type1) {
       super(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type1);
        this.gasolineCapacity = gasolineCapacity;
        this.gasolineGasto = gasolineGasto;
        switch(type){
            case 1: 
                this.type=MotoCycleType.ESTANDAR;
                break;
            case 2: 
                this.type= MotoCycleType.DEPORTIVA;
                break;
            case 3: 
                this.type= MotoCycleType.SCOOTER;
                break;
            case 4: 
                this.type= MotoCycleType.CROSS;
                break;

            default:
               this.type= MotoCycleType.ESTANDAR;
        }
        //super.setSellValue(sellValue());
    }


    public double getGasolineCapacity() {
        return this.gasolineCapacity;
    }

    public void setGasolineCapacity(double gasolineCapacity) {
        this.gasolineCapacity = gasolineCapacity;
    }

    public double getGasolineGasto() {
        return this.gasolineGasto;
    }

    public void setGasolineGasto(double gasolineGasto) {
        this.gasolineGasto = gasolineGasto;
    }

    public MotoCycleType getType() {
        return this.type;
    }

    public void setType(MotoCycleType type) {
        this.type = type;
    }

    public double sellValue(){
        double p=super.getBaseValue();
        if(super.getDocumentsMecanic()==null && super.getDocumentsSoat()==null){
            p+=500000;
        }

        if(super.getNeww()){
            p*=1.04;
        }else{
            p*=1.02;
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
            " gasolineCapacity='" + getGasolineCapacity() + "'" +
            ", gasolineGasto='" + getGasolineGasto() + "'" +
            ", type='" + getType() + "'" +
            "}";
    }


}
