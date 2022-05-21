package model;
import java.text.DecimalFormat;
public class ElectricVehicle extends Vehicle{

    private double batteryDuration;
    private double batteryConsum;
    private ChargerType type;


    public ElectricVehicle( String id,double baseValue, String mark, String model, double cilindraje, double kilometraje,boolean neww, String placa, int doorsNumber, boolean windowp, int type,double batteryDuration, double batteryConsum, int chargerType) {
        super(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type);
        this.batteryDuration = batteryDuration;
        this.batteryConsum = batteryConsum;
        if(chargerType==1){
            this.type= ChargerType.NORMAL;
        }else{
            this.type=ChargerType.FAST;
        }
        //super.setSellValue(sellValue());
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

    public ChargerType getType() {
        return this.type;
    }

    public void setType(ChargerType type) {
        this.type = type;
    }
    /**
     * description: this method calculate sell value of one vehicle
     * @return need be inicializated
     */
    public double sellValue(){
        double p=super.getBaseValue();
        if(super.getDocumentsMecanic()==null && super.getDocumentsSoat()==null){
            p+=500000;
        }

        p*=1.2;

        if(!super.getNeww()){
            double desc=p*0.1;
            p-=desc;
        }
        return p;
    }
    

    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#");
        return "{" +
            "base value="+df.format(super.getBaseValue())+"\n"+
            "sell value="+df.format(super.getSellValue())+"\n"+
            "mark="+super.getMark()+"\n"+
            "model="+super.getModel()+"\n"+
            "cilindraje="+super.getKilometraje()+"\n"+
            "kilometraje="+super.getKilometraje()+"\n"+
            " batteryDuration='" + getBatteryDuration() + "\n" +
            ", batteryConsum='" + getBatteryConsum() + "\n" +
            ", type='" + getType() + "'" +
            "}";
    }
    


    
}
