package baithuchanh1904;
import java.util.Scanner;
public class Employee extends person{
   
    Scanner sc = new Scanner(System.in);
    public Employee(){}

    public void settennhanvien(){
        System.out.println("nhap ten nhan vien: ");
        ten= sc.nextLine();
    }

    public void gettennhanvien(){
        System.out.println( "ten nhan vien la: "+ ten);
    }

    public  void setgdanhso(){
        System.out.println("nhap danh so nhan vien");
        ID=sc.nextLine();
    }

}
