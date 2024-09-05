import java.util.*;
public class Assign2_2 {
    public static void main(String[] args) {
        double weight;
        double height=178;
        Scanner x=new Scanner(System.in);
        System.out.println("Enter weight: ");
        weight=x.nextDouble();
        System.out.println("Enter Height: ");
        height=x.nextDouble();
        double bmi= (weight/(height*height))*10000;
        System.out.println("BMI is:" +bmi);
        if(bmi<=20)
        System.out.println("underwieght");
        else if(bmi<=25.0){
            System.out.println("normal");
            
        }
        else if(bmi<=29.0)
        System.out.println("overwight");
        else if (bmi > 29)
        System.out.println("obesity");
    }   
}
