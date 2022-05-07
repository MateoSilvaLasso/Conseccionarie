package ui;

import model.Concessionaire;
import java.util.*;
import java.text.DecimalFormat;
public class VehicleMain {
    
    private Concessionaire c;
    private Concessionaire d;
    private Scanner read;
    public VehicleMain(){
        c= new Concessionaire();
         read= new Scanner(System.in);
         initModel init= new initModel();
      d= new Concessionaire(init.vehicles());
        
    }

    public static void main(String[] args) {
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
                           "3: show information");
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

        }

    }

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
         mark=read.nextLine();
         read.nextLine();
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
         switch(option){
             case 1:
              double tankCapacity;
              double oilConsume;
              char type1;

              System.out.println("type the tankCapacity");
              tankCapacity=read.nextDouble();
              System.out.println("type the oilConsume");
              oilConsume= read.nextDouble();
              System.out.println("type the gasoline type 1: corrient 2: diesel 3: extra");
              type1= read.next().charAt(0);
              String desi=null;
              System.out.println(baseValue);
              c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, type1);
              if(neww){
               
                c.setDocumentsInvehicle(0, mark, model, 0, 0);
               
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
                  c.setDocumentsInvehicle(mark, model, value, year, cobertura);
                  c.setDocumentsInvehicle(value, mark, model, year, gases);
                }
               
              }
             
              break;

            case 2:
             double batteryDuration;
             double batteryConsum;
             int type2;

             System.out.println("type battery duration");
             batteryDuration= read.nextDouble();
             System.out.println("type the vehicle consume");
             batteryConsum=read.nextDouble();
             System.out.println("type the type pf the power 1: Normal 2: fast");
             type2=read.nextInt();
             c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, batteryDuration, batteryConsum, type2);
             if(neww){
                double value=0;
                int year=2022;
                double gases= 0;
                c.setDocumentsInvehicle(value, mark, model, year, gases);
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
                  c.setDocumentsInvehicle(mark, model, value, year, cobertura);
                  c.setDocumentsInvehicle(value, mark, model, year, gases);
                }
              }
             break;
            case 3:
                 
                 System.out.println("type the tankCapacity");
                 tankCapacity=read.nextDouble();
                 System.out.println("type the oilConsume");
                 oilConsume= read.nextDouble();
                 System.out.println("type the gasoline type 1: corrient 2: diesel 3: extra");
                 type1= read.nextLine().charAt(0);
                 System.out.println("type battery duration");
                 batteryDuration= read.nextDouble();
                 System.out.println("type the vehicle consume");
                 batteryConsum=read.nextDouble();
                 System.out.println("type the type pf the power 1: Normal 2: fast");
                 type2=read.nextInt();

                 c.addVehicle(id,baseValue, mark, model, cilindraje, kilometraje, neww, placa, doorsNumber, windowp, type, tankCapacity, oilConsume, batteryDuration, batteryConsum, type1, type2);
                 if(neww){
                    double value=0;
                    int year=2022;
                    double gases= 0;
                    c.setDocumentsInvehicle(value, mark, model, year, gases);
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
                      c.setDocumentsInvehicle(mark, model, value, year, cobertura);
                      c.setDocumentsInvehicle(value, mark, model, year, gases);
                    }
                  }
                 break;
            case 4:
                double gasolineCapacity;
                double gasolineGasto;
                int type5;
                System.out.println("type the gasoline capacity");
                gasolineCapacity= read.nextDouble();
                System.out.println("type the gasoline gast");
                gasolineGasto= read.nextDouble();
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
                    c.setDocumentsInvehicle(value, mark, model, year, gases);
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
                      c.setDocumentsInvehicle(mark, model, value, year, cobertura);
                      c.setDocumentsInvehicle(value, mark, model, year, gases);
                    }
                  }
        }
    }

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

    public void showInformation(){
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
