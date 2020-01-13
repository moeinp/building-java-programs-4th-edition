package temp;
import java.util.Scanner;
import java.io.*;
abstract class Car{
   boolean isSedan;
   String seats;
   abstract String getSeats();
   abstract boolean getIsSedan();
   abstract String getMileage();

   void printCar(String in){
       boolean isSedan=this.getIsSedan();
           if(isSedan)
               System.out.print("A "+in+" is Sedan, ");
           else
               System.out.print("A "+in+" is not Sedan, ");
       String seats=this.getSeats();
           System.out.print(seats+", ");
       String mileAge=this.getMileage();
           System.out.print("Mileage is "+mileAge);
   }  
}
class WagonR extends Car{
   String mileAge;
   WagonR(int ma){
      
       mileAge=String.valueOf(ma);
       isSedan=false;
       seats="4";          
   }
   String getMileage(){
       return mileAge+" kmpl";  
   }
   boolean getIsSedan(){
       return isSedan;
   }
   String getSeats(){
       return "is "+seats+"-seater";
   }

  
}

class HondaCity extends Car{
   String mileAge;
   HondaCity(int ma){
       mileAge=String.valueOf(ma);
       isSedan=true;
       seats="4";          
   }
   String getMileage(){
       return mileAge+" kmpl";  
   }
   boolean getIsSedan(){
       return isSedan;
   }
   String getSeats(){
       return "is "+seats+"-seater";
   }
  
}

class InnovaCrysta extends Car{
   String mileAge;
   InnovaCrysta(int ma){
       mileAge=String.valueOf(ma);
       isSedan=false;
       seats="6";          
   }
   String getMileage(){
       return mileAge+" kmpl";  
   }
   boolean getIsSedan(){
       return isSedan;
   }
   String getSeats(){
       return "is "+seats+"-seater";
   }
  
}

public class Solution4{
      
   public static void main(String args[]) throws IOException{
       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
       int carType=Integer.parseInt(bufferedReader.readLine().trim());
       int carMileage=Integer.parseInt(bufferedReader.readLine().trim());
       if(carType==0){
           Car wagonR=new WagonR(carMileage);
           wagonR.printCar("WagonR");
       }
       if(carType==1){
           Car hondaCity=new HondaCity(carMileage);
           hondaCity.printCar("HondaCity");
       }
       if(carType==2){
           Car innovaCrysta=new InnovaCrysta(carMileage);
           innovaCrysta.printCar("InnovaCrysta");
       }
   }


}