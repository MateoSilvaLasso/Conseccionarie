package model;

public abstract class Vehicle{
    private String id;
    private double baseValue;
    private double sellValue;
    private String mark;
    private String model;
    private double cilindraje;
    private double kilometraje;
    private boolean neww;
    private String placa;
    private int doorsNumber;
    private boolean windowp;
    private IvehicleType vehicleType;
    private Documents documentsSoat;
    private Documents documentsMecanic;
    private int propietyTarjet;


    public Vehicle(String id,double baseValue, String mark, String model, double cilindraje, double kilometraje, Boolean neww, String placa, int doorsNumber, boolean windowp, int type) {
        this.id=id;
        this.baseValue = baseValue;
        this.mark = mark;
        this.model = model;
        this.cilindraje = cilindraje;
        this.kilometraje = kilometraje;
        this.neww=neww;
        if(neww){
            this.placa=null;
        }else{
            this.placa = placa;
        }
        this.doorsNumber = doorsNumber;
        this.windowp = windowp;
        switch(type){
            case 1:
                this.vehicleType=IvehicleType.SEDAN;
                break;
            case 2: 
                this.vehicleType=IvehicleType.CAMIONETA;
                break;
        }
        this.sellValue=sellValue();
    }

    public double getBaseValue() {
        return this.baseValue;
    }

    public void setBaseValue(double baseValue) {
        this.baseValue = baseValue;
    }

    public double getSellValue() {
        return this.sellValue;
    }

    public void setSellValue(double sellValue) {
        this.sellValue = sellValue;
    }

    public String getMark() {
        return this.mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCilindraje() {
        return this.cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getKilometraje() {
        return this.kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getDoorsNumber() {
        return this.doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public boolean isWindowp() {
        return this.windowp;
    }

    public boolean getWindowp() {
        return this.windowp;
    }

    public void setWindowp(boolean windowp) {
        this.windowp = windowp;
    }

    public IvehicleType getVehicleType() {
        return this.vehicleType;
    }

    public void setVehicleType(IvehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean getNeww() {
        return this.neww;
    }

    public void setNeww(boolean neww) {
        this.neww = neww;
    }

    public void setImageInDocument(int [][] image){
        documentsSoat.setImage(image);
    }

    public boolean isNeww() {
        return this.neww;
    }

    public Documents getDocumentsSoat() {
        return this.documentsSoat;
    }

    public void setDocumentsSoat(Documents documentsSoat) {
        this.documentsSoat = documentsSoat;
    }

    public Documents getDocumentsMecanic() {
        return this.documentsMecanic;
    }

    public void setDocumentsMecanic(Documents documentsMecanic) {
        this.documentsMecanic = documentsMecanic;
    }
    public void setImageInDocumentM(int [][] image){
        documentsMecanic.setImage(image);
    }

    public String getSoatNumber(){
        return this.documentsSoat.getNumber();
    }

    public String getMecanicNumber(){
        return this.documentsMecanic.getNumber();
    }

    public int getPropietyTarjet() {
        return this.propietyTarjet;
    }

    public void setPropietyTarjet(int propietyTarjet) {
        this.propietyTarjet = propietyTarjet;
    }

    public String getId(){
        return this.id;
    }
    public abstract double sellValue();

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "\n" +
            ", baseValue='" + getBaseValue() + "\n" +
            ", sellValue='" + getSellValue() + "\n" +
            ", mark='" + getMark() + "\n" +
            ", model='" + getModel() + "\n" +
            ", cilindraje='" + getCilindraje() + "\n" +
            ", kilometraje='" + getKilometraje() + "\n" +
            ", neww='" + isNeww() + "\n" +
            ", placa='" + getPlaca() + "\n" +
            ", doorsNumber='" + getDoorsNumber() + "\n" +
            ", windowp='" + isWindowp() + "\n" +
            ", vehicleType='" + getVehicleType() + "\n" +
            ", documentsSoat='" + getDocumentsSoat() + "\n" +
            ", documentsMecanic='" + getDocumentsMecanic() + "\n" +
            ", propietyTarjet='" + getPropietyTarjet() + "\n" +
            "}";
    }


    

    




}
