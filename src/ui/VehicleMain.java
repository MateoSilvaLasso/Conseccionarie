package ui;

import model.Concessionaire;
import java.util.*;
import java.text.DecimalFormat;

public class VehicleMain{
    
    private Concessionaire c;
    private Concessionaire d;
    private Scanner read;
    public VehicleMain(){
        c= new Concessionaire();
         read= new Scanner(System.in);
         initModel init= new initModel();
        d= new Concessionaire(init.vehicles(), init.park());
        
    }

    public static void main(String[] args){
        VehicleMain m= new VehicleMain();

        int option=0;

        do{
            option=m.menu();
            m.executeMenu(option);
        }while(option!=0);
    }

    public int menu(){

        System.out.println("1: Registrar auto\n"+
                           "2: Show the sell value\n"+
                           "3: show information\n"+
                           "4: show Soat or mecanic\n"+
                           "5: show parking ocupation\n"+
                           "6: show parking information\n"+
                           "0: out");
        int option=read.nextInt();

        return option;
    }

    public void executeMenu(int option){

        switch(option){
            case 1:
                registerVehicle();
                break;
            case 2:
                showValue();
                break;
            case 3:
              showInformation();
              break;
            case 4:
              ShowNumber();
              break;
            case 5:
              showParking();
              break;
            case 6: 
              showParkingInformation();
              break;
            case 0:
              System.out.println("bye,come please");
              break;
            

        }

    }
    /**
     * description: this vehicle register a new vehicle
     */
    public void registerVehicle(){
         
         
         String id;
         double baseValue;
         String mark;
         String model;
         double cilindraje;
         double kilometraje;
         String q;
         boolean neww=true;;
         String placa=null;
         int doorsNumber;
         boolean windowp;
         int type;
         System.out.println("digite el id");
         read.nextLine();
         id= read.nextLine();
         System.out.println("type the base value");
         baseValue=read.nextDouble();
         System.out.println("type the mark");
         read.nextLine();
         mark=read.nextLine();
         System.out.println("type the model");
         model= read.nextLine();
         System.out.println("type the cilindraje");
         cilindraje= read.nextDouble();
         System.out.println("type the kilometraje");
         kilometraje=read.nextDouble();
         System.out.println("the vehicle is new? YES/NO");
         read.nextLine();
         q=read.nextLine();
       
         if(q.equalsIgnoreCase("yes")){
             neww=true;
         }else if(q.equalsIgnoreCase("no")){
             neww=false;
         }

         if(neww==false){
             System.out.println("Type the placa");
             placa= read.nextLine();
         }

         System.out.println("type the doorsNumber");
         doorsNumber= read.nextInt();
         System.out.println("the windows are polarizaded? YES/NO");
         q=read.nextLine();
         read.nextLine();
         if(q.equalsIgnoreCase("yes")){
             windowp=true;
         }else{
             windowp=false;
         }

         System.out.println(" type 1: sedan or 2: camioneta");
         type= read.nextInt(); 

         System.out.println("what type is the vehicle \n"+
                            "1: gasoline\n"+
                            "2: electri\n"+
                            "3: hibryd\n"+
                            "4: Motocycle");
         int option= read.nextInt();
         double batteryConsum=0;
         switch(option){
             case 1:
              double tankCapacity;
              double oilConsume;
              char type1;

              System.out.println("type the tankCapacity");
              tankCapacity=read.nextDouble();
              oilConsume= tankCapacity*(cilindraje/150);
              System.out.println("type the gasoline type 1: corrient 2: diesel 3: extra");
              type1= read.next().charAt(0);
              String desi=null;
              System.out.println(baseValue);
              c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, type1);
              if(neww){
               
                c.setDocumentsInvehicle(0, id, 0, 0);
               
              }else if(!neww){
                
                System.out.println("the vehicle has completly documents YES/NO");
                read.nextLine();
                desi= read.nextLine();
                
                if(desi.equalsIgnoreCase("yes")){
                  double value;
                  int year;
                  System.out.println("type the value");
                  value= read.nextDouble();
                  System.out.println("type the year of the documents");
                  year= read.nextInt();
                  read.nextLine();
                  System.out.println("type the cobertura of the soat");
                  double cobertura= read.nextDouble();
                  System.out.println("type the gases levels of the tecnic mecanic");
                  double gases= read.nextDouble();
                  c.setDocumentsInvehicle(id, value, year, cobertura);
                  c.setDocumentsInvehicle(value, id, year, gases);
                }
               
              }
             
              break;

            case 2:
             double batteryDuration;
            
             int type2;

             System.out.println("type battery duration");
             batteryDuration= read.nextDouble();
             System.out.println("type the type pf the power 1: Normal 2: fast");
             type2=read.nextInt();
             if(type2==1){
                batteryConsum=(batteryDuration+18)*(cilindraje/100);
             }else{
              batteryConsum=(batteryDuration+13)*(cilindraje/100);
             }
             
            
             c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, batteryDuration, batteryConsum, type2);
             if(neww){
                double value=0;
                int year=2022;
                double gases= 0;
                c.setDocumentsInvehicle(value, id, year, gases);
              }else{
                System.out.println("the vehicle has completly documents YES/NO");
                desi= read.nextLine();
                read.nextLine();
                if(desi.equalsIgnoreCase("yes")){
                  double value;
                  int year;
                  System.out.println("type the value");
                  value= read.nextDouble();
                  System.out.println("type the year of the documents");
                  year= read.nextInt();
                  read.nextLine();
                  System.out.println("type the cobertura of the soat");
                  double cobertura= read.nextDouble();
                  System.out.println("type the gases levels of the tecnic mecanic");
                  double gases= read.nextDouble();
                  c.setDocumentsInvehicle(id, value, year, cobertura);
                  c.setDocumentsInvehicle(value, id, year, gases);
                }
              }
             break;
            case 3:
                 
                 System.out.println("type the tankCapacity");
                 tankCapacity=read.nextDouble();
                 oilConsume= tankCapacity*(cilindraje/180);
                 System.out.println("type the gasoline type 1: corrient 2: diesel 3: extra");
                 type1= read.next().charAt(0);
                 System.out.println("type battery duration");
                 batteryDuration= read.nextDouble();
                 System.out.println("type the type pf the power 1: Normal 2: fast");
                 type2=read.nextInt();
                 if(type2==1){
                  batteryConsum=(batteryDuration+7)*(cilindraje/200);
                 }else{
                  batteryConsum=batteryDuration*(cilindraje/200);
                 }
                 
                 

                 c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, batteryDuration, batteryConsum, type1, type2);
                 if(neww){
                    double value=0;
                    int year=2022;
                    double gases= 0;
                    c.setDocumentsInvehicle(value, id, year, gases);
                  }else{
                    System.out.println("the vehicle has completly documents YES/NO");
                    desi= read.nextLine();
                    read.nextLine();
                    if(desi.equalsIgnoreCase("yes")){
                      double value;
                      int year;
                      System.out.println("type the value");
                      value= read.nextDouble();
                      System.out.println("type the year of the documents");
                      year= read.nextInt();
                      read.nextLine();
                      System.out.println("type the cobertura of the soat");
                      double cobertura= read.nextDouble();
                      System.out.println("type the gases levels of the tecnic mecanic");
                      double gases= read.nextDouble();
                      c.setDocumentsInvehicle(id, value, year, cobertura);
                      c.setDocumentsInvehicle(value, id, year, gases);
                    }
                  }
                 break;
            case 4:
                double gasolineCapacity;
                double gasolineGasto;
                int type5;
                System.out.println("type the gasoline capacity");
                gasolineCapacity= read.nextDouble();
                gasolineGasto= gasolineCapacity*(cilindraje/75);
                System.out.println("type the type of the motocycle\n"+
                                   "1: Estandar\n"+
                                   "2: sport\n"+
                                   "3: scooter\n"+
                                   "4: Cross\n");
                type5= read.nextInt();
                c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, gasolineCapacity, gasolineGasto, type5);                   
              
                 if(neww){
                    double value=0;
                    int year=2022;
                    double gases= 0;
                    c.setDocumentsInvehicle(value, id, year, gases);
                  }else{
                    System.out.println("the vehicle has completly documents YES/NO");
                    desi= read.nextLine();
                    read.nextLine();
                    if(desi.equalsIgnoreCase("yes")){
                      double value;
                      int year;
                      System.out.println("type the value");
                      value= read.nextDouble();
                      System.out.println("type the year of the documents");
                      year= read.nextInt();
                      read.nextLine();
                      System.out.println("type the cobertura of the soat");
                      double cobertura= read.nextDouble();
                      System.out.println("type the gases levels of the tecnic mecanic");
                      double gases= read.nextDouble();
                      c.setDocumentsInvehicle(id, value, year, cobertura);
                      c.setDocumentsInvehicle(value, id, year, gases);
                    }
                  }
        }
    }
    /**
     * description: this method show value of one vehicle
     */
    public void showValue(){
     String id;
     

     System.out.println("type the id");
     read.nextLine();
     id= read.nextLine();
     
     double value= c.searchValue(id);
     if(value==0){
         System.out.println("In this moment this cars doesnt exist");
     }else{
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(5);
        System.out.println("the value of the car is " +df.format(value));
     }
    }
    /**
     * description: this method show information depending the type
     */
    public void showInformation(){
      if(!c.validAnyCar()){
        System.out.println("there arent any car in the system");
      }else{
            System.out.println("1: see for type\n"+
                           "2: see for combustible type\n"+
                           "3: see for new or used");
        int option= read.nextInt();
        int option1=1;
        switch(option){
            case 1: 
                System.out.println("1: see gasoline vehicles\n"+
                                   "2: see electric vehicles\n"+
                                   "3: see hybrid vehicles\n"+
                                   "4: see motocycles");
                option1= read.nextInt();
                break;
            case 2: 
                System.out.println("1: see gasoline corrient\n"+
                                   "2: see gasoline diesel\n"+
                                   "3: see gasoline extra\n"+
                                   "4: see normal charger\n"+
                                   "5: see fast charger");
                option1=read.nextInt();
                break;
            case 3: 
                System.out.println("1: new\n"+
                                   "2: used");
                option1= read.nextInt();
                break;
        }
        System.out.println(d.showInformation(option, option1)); 
      }
        
    }
    /**
     * description: this method show documents number 
     */
    public void ShowNumber(){
      if(!c.validAnyCar()){
        System.out.println("there arent any car in the system");
      }else{
        System.out.println("type the id");
        read.nextLine();
        String id=read.nextLine();
        
        System.out.println(c.showDocuments(id));
      }
        
    }
    /**
     * description: show the parking in console
     */
    public void showParking(){
        int [][] parking= d.showParking();
        for(int i=0; i<parking.length;i++){
          System.out.println("----------"); 
            for(int j=0; j<parking[0].length; j++){
                System.out.print("|"+parking[i][j]);
            }
            System.out.println();
        }
    }
    /**
     * description: this methos return information about cars in parking 
     */
    public void showParkingInformation(){
      System.out.println("you want see the information park: \n"+
                         "1: see in years range\n"+
                         "2: see oldest or youngest\n"+
                         "3: see porcent ocupation");
      int option= read.nextInt();

      if(option==1){
        System.out.println("type the inicial year");
        int year=read.nextInt();
        System.out.println("type the final year");
        int year1= read.nextInt();
       System.out.println(d.showParkingInRange(year, year1)); 
      }else if(option==2){
        System.out.println("1: oldest\n"+"2: youngest");
        int know= read.nextInt();
        System.out.println(d.showMore(know));
      }else if(option==3){
         System.out.println("el porcentaje de ocupacion del parqueadero es "+d.ShowPorcent()+"%");
      }
    }
}
