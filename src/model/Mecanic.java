package model;

public class Mecanic extends Documents{

    private double gases;
    

    public Mecanic(double value, int year,double gases) {
        super(value, year);
        this.gases = gases;
       
       
    }

    public double getGases() {
        return this.gases;
    }

    public void setGases(double gases) {
        this.gases = gases;
    }
    /**
     * description: this method gives value to the document
     * @return f
     */
    public String chooseNumber(){
        int [][]matrix= super.getImage();
        String out="";
        int n=MAX_COLUMN-1;
        
            for(int j=0; j<MAX_COLUMN; j++){
                out+=Integer.toString(matrix[0][j]);
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
