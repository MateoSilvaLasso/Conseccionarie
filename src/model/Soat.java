package model;

public class Soat extends Documents{
    private double cobertura;


    public Soat(double value, int year,double cobertura) {
        super(value, year);
        this.cobertura = cobertura;
        super.setNumber(chooseNumber());
    }

    public double getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }
    
    public String chooseNumber(){
        int [][]matrix= super.getImage();
        String out="";
        for(int i=0; i<MAX_FILA; i++){
            for(int j=0; j<=0; j++){
                out+=Integer.toString(matrix[i][j]);
            }
        }

        for(int i=MAX_FILA; i<=MAX_FILA; i++){
            for(int j=0; j<=MAX_COLUMN; j++){
                out+=Integer.toString(matrix[i][j]);
            }
        }

        //int number= Integer.parseInt(out);
        return out;
        
    }
    

}
