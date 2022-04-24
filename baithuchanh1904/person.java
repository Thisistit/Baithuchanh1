package baithuchanh1904;


import java.util.Scanner;
public class person {
    
    public String ten;
    public String ID;
    public String diachi;
    Scanner sc = new Scanner(System.in);

    public person(){}
    
    public void nhapID(){
        System.out.println("Nhap ID");
        Scanner sc = new Scanner(System.in);
        ID = sc.nextLine();
        sc.close();
    }

    public void nhapten(){
        System.out.println("Nhap ten");
        Scanner sc = new Scanner(System.in);
        ten = sc.nextLine();
        sc.close();
    }
    public void nhapdiachi(){
        System.out.println("Nhap diachi");
        Scanner sc = new Scanner(System.in);
        diachi = sc.nextLine();
        sc.close();
    }
}    