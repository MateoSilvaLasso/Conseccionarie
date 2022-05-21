package model;

public class parking {
    
    
    private Vehicle [][] parking;

    public parking(){
        this.parking= new Vehicle[10][5];
    }

    public parking(Vehicle [][] parking){
        this.parking=parking;
    }

    /**
     * description: add vehicle in parking
     * @param v must be inicializated
     */
    public void addVehicle(Vehicle v){
        if(hasSpace()){
            String s=v.getModel();
            int w= Integer.parseInt(v.getModel());
            boolean p=true;
            if(s.equals("2015")){
                for(int i=0; i<parking.length && p; i++){
                   if(parking[i][0]==null){
                       parking[i][0]=v;
                       p=false;
                   }
                }
            }else if(s.equals("2014")){
               
                    for(int i=0; i<parking.length && p; i++){
                       if(parking[i][1]==null){
                           parking[i][1]=v;
                           p=false;
                       }
                    }
            } else if(s.equals("2013")){
                
                    for(int i=0; i<parking.length && p; i++){
                       if(parking[i][2]==null){
                           parking[i][2]=v;
                           p=false;
                       }
                    }
            } else if(s.equals("2012")){
                for(int i=0; i<parking.length && p; i++){
                   if(parking[i][3]==null){
                       parking[i][3]=v;
                       p=false;
                   }
                }
            }else if(w<=2011){
                for(int i=0; i<parking.length && p; i++){
                    if(parking[i][4]==null){
                        parking[i][4]=v;
                        p=false;
                    }
                 }
            }
           
        }
    }

    public boolean hasSpace(){
        boolean p=false;

        for(int i=0; i<parking.length && p==false; i++){
            for(int j=0; j<parking[0].length && p==false; j++){
                if(parking[i][j]==null){
                    p=true;
                }
            }
        }

        return p;
    }

    public Vehicle[][] getParking(){
        return parking;
    }

    public String showRange(int year,int year1){
        String out="";
        if(year<=year1){
            for(int i=0; i<parking.length; i++){
                for(int j=0; j<parking[0].length; j++){
                    if(parking[i][j]!=null){
                        int s= Integer.parseInt(parking[i][j].getModel());
                        if(s>=year && s<=year1){
                            out+=parking[i][j].toString()+"\n";
                        }
                    }
                }
            }
        }else{
            for(int i=0; i<parking.length; i++){
                for(int j=0; j<parking[0].length; j++){
                    if(parking[i][j]!=null){
                        int s= Integer.parseInt(parking[i][j].getModel());
                        if(s>=year1 && s<=year){
                            out+=parking[i][j].toString()+"\n";
                        }
                    }
                }
            }
        }
       

        return out;
    }

    public String showTime(int know){
        String out="";
        int men=0,may=0;
        int initialf=0, initialc=0;
        Vehicle s=null,n=null;
        if(know==1){
            for(int i=parking.length-1; i>=0; i--){
                for(int j=parking[0].length-1; j>=0; j--){
                    if(parking[i][j]!=null){
                        initialc=j;
                        initialf=i;
                        break;
                    }
                }
            }

            men=Integer.parseInt(parking[initialf][initialc].getModel()); 
            s=parking[initialf][initialc];
            for(int i=parking.length-1; i>=0; i--){
                for(int j=parking[0].length-1; j>=0; j--){
                    if(parking[i][j]!=null && Integer.parseInt(parking[i][j].getModel())<men){
                        men= Integer.parseInt(parking[i][j].getModel()); 
                        s=parking[i][j];
                    }
                }
            }
            out=s.toString();
        }else if(know==2){
            for(int i=0; i<parking.length; i++){
                for(int j=0; j<parking[0].length; j++){
                    if(parking[i][j]!=null){
                        initialc=j;
                        initialf=i;
                        break;
                    }
                }
            }

            may=Integer.parseInt(parking[initialf][initialc].getModel()); 
            n=parking[initialf][initialc];
            for(int i=0; i<parking.length; i++){
                for(int j=0; j<parking[0].length; j++){
                    if(parking[i][j]!=null && Integer.parseInt(parking[initialf][initialc].getModel())>may){
                        may=Integer.parseInt(parking[initialf][initialc].getModel());
                        n=parking[i][j];
                    }
                }
            }
            out=n.toString();
        }

        return out;
    }

    public int ShowPorcent(){
        int out=0;
        int cont=0;
        for(int i=0; i<parking.length;i++){
            for(int j=0;j<parking[0].length; j++){
                if(parking[i][j]!=null){
                    cont++;
                }
            }
        }

        out= (cont*100)/(parking.length*parking[0].length);
        return out;
    }

   


}
