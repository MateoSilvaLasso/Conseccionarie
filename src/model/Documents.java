package model;
import java.util.Random;
public abstract class Documents {
    public static final int MAX_FILA=4;
    public static final int MAX_COLUMN=4;
    private double value;
    private int year;
    private int [][] image;
    private String number;
    private Random r= new Random();


    public Documents(double value, int year) {
        this.value = value;
        this.year = year;
        this.image = new int[MAX_FILA][MAX_COLUMN];
        
        for(int i=0; i<MAX_FILA; i++){
            for(int j=0; j<MAX_COLUMN; j++){
                image[i][j]+= r.nextInt(9);
            }
        }
        this.number= chooseNumber();

    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int [][] getImage(){
        return this.image;
    }

    public void setImage(int [][] image) {
        this.image = image;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public abstract String chooseNumber();

    




}
