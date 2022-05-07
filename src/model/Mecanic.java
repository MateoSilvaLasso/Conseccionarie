package model;
import java.util.Random;
public class Mecanic extends Documents{

    private double gases;
    private Random r;

    public Mecanic(double value, int year,double gases) {
        super(value, year);
        this.gases = gases;
        r= new Random();
        super.setNumber(chooseNumber());
    }

    public double getGases() {
        return this.gases;
    }

    public void setGases(double gases) {
        this.gases = gases;
    }
    
    public String chooseNumber(){
        int [][]matrix= super.getImage();
        String out="";
        int n=MAX_COLUMN-1;
        for(int i=0; i<=0; i++){
            for(int j=0; j<MAX_COLUMN; j++){
                out+=Integer.toString(matrix[i][j]);
            }
        }

        for(int i=1; i<MAX_FILA; i++){
            for(int j=n; j>=n; j--){
                out+=Integer.toString(matrix[i][j]);
            }
            n--;
        }

        for(int i=MAX_FILA-1; i<=MAX_FILA-1; i++){
            for(int j=1; j<MAX_COLUMN; j++){
                out+=Integer.toString(matrix[i][j]);
            }
        }

        //int number= Integer.parseInt(out);
        return out;
        

    }
    

    


    
}
