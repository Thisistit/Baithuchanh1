package baithuchanh;


import java.util.Scanner;

public class student extends person {
    public float truong;
    public float lop;
    public float MSV;
    private Scanner scanner;

    public student() {
        scanner = new Scanner(System.in);
    }
    public void nhaptruong(){
        System.out.println("Ten truong =");
        truong =scanner.nextFloat();
    }
    public void nhaplop(){
        System.out.println("Ten lop =");
         lop = scanner.nextFloat();
    }
    public void nhapMSV(){
        System.out.println("MSV = ");
        MSV = scanner.nextFloat();
    }
}
   
    

