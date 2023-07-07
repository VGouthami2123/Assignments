import java.util.Scanner;
class Taxcalculation{
     public static void main(String[] args){
          Scanner s=new Scanner(System.in);
          System.out.println("enter the income amount");
          double income=s.nextDouble();
          income=income*12;
          double taxAmount=Taxcalculation(income);
          System.out.println("Tax is"+ taxAmount);
                    }
public static double Taxcalculation(double income){
  if(income <= 250000){
      return 0;
}else if(income <= 500000){
      return(income-250000)*0.1;
}else if(income <= 1000000){
      return 25000+(income-500000)*0.2;
}else{
    return 125000+(income-1000000)*0.3;
     }
  }
}
