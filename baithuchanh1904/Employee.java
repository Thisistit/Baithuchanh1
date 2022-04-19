package baithuchanh;

import java.util.Scanner;

public class Employee extends person {
    public float NgheNghiep;
    public float NoiLamViec;
    
    public void nhapNgheNghiep(){
        System.out.println("Nghe Nghiep =");
        Scanner scanner = new Scanner(System.in);
        NgheNghiep = scanner.nextFloat();
    }
    public void nhapNoiLamViec(){
        System.out.println("Noi Lam Viec =");
        Scanner scanner = new Scanner(System.in);
        NoiLamViec = scanner.nextFloat();
    }


    
}
