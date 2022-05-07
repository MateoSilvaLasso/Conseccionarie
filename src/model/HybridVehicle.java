package model;
import java.text.DecimalFormat;
public class HybridVehicle extends Vehicle{
    private double tankCapacity;
    private double oilConsume;
    private GasolineType gasolineType;
    private double batteryDuration;
    private double batteryConsum;
    private ChargerType chargerType;


    public HybridVehicle(String id,double baseValue, String mark, String model, double cilindraje, double kilometraje, boolean neww, String placa, int doorsNumber, boolean windowp, int type,double tankCapacity, double oilConsume, double batteryDuration, double batteryConsum, int gasolineType, int chargerType) {
        super(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type);
        this.tankCapacity = tankCapacity;
        this.oilConsume = oilConsume;
        this.batteryDuration = batteryDuration;
        this.batteryConsum = batteryConsum;
        switch(gasolineType){
            case 1: 
                this.gasolineType=GasolineType.CORRIENT;
                break;
            case 2: 
                this.gasolineType=GasolineType.DIESEL;
                break;
            case 3: 
            this.gasolineType=GasolineType.EXTRA;
        }

        if(chargerType==1){
            this.chargerType=ChargerType.NORMAL;
        }else{
            this.chargerType=ChargerType.FAST;
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

    public GasolineType getGasolineType() {
        return this.gasolineType;
    }

    public void setGasolineType(GasolineType gasolineType) {
        this.gasolineType = gasolineType;
    }

    public double getBatteryDuration() {
        return this.batteryDuration;
    }

    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }

    public double getBatteryConsum() {
        return this.batteryConsum;
    }

    public void setBatteryConsum(double batteryConsum) {
        this.batteryConsum = batteryConsum;
    }

    public ChargerType getChargerType() {
        return this.chargerType;
    }

    public void setChargerType(ChargerType chargerType) {
        this.chargerType = chargerType;
    }
    public double sellValue(){
        double p=super.getBaseValue();
        if(super.getDocumentsMecanic()==null && super.getDocumentsSoat()==null){
            p+=500000;
        }

        p*=1.15;

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
            " tankCapacity='" + getTankCapacity() + "'" +
            ", oilConsume='" + getOilConsume() + "'" +
            ", gasolineType='" + getGasolineType() + "'" +
            ", batteryDuration='" + getBatteryDuration() + "'" +
            ", batteryConsum='" + getBatteryConsum() + "'" +
            ", chargerType='" + getChargerType() + "'" +
            "}";
    }





}
