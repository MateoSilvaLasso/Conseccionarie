package model;

public class Soat extends Documents{
    private double cobertura;


    public Soat(double value, int year,double cobertura){
        super(value, year);
        this.cobertura = cobertura;
       
    }

    public double getCobertura() {
        return this.cobertura;
    }

    public void setCobertura(double cobertura) {
        this.cobertura = cobertura;
    }
    /**
     * description: this method gives value to the document
     * @return f
     */
    public String chooseNumber(){
        int [][]matrix= super.getImage();
        String out="";
        for(int i=0; i<MAX_FILA; i++){
            out+=Integer.toString(matrix[i][0]);
        }

        for(int j=0; j<MAX_COLUMN; j++){
            out+=Integer.toString(matrix[MAX_FILA-1][j]);
        }
        

        //int number= Integer.parseInt(out);
        return out;
        
    }
    

}
