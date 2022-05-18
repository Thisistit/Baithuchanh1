
import java.util.HashSet;
import java.util.Scanner;
public class App56 {
    public static void main (String[]args){
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        try (Scanner scanner = new Scanner(System.in))   {
            hashSetString.add("wilson");
            hashSetString.add("volvo");
            hashSetString.add("Nike");
            hashSetString.add("Kia");
            hashSetString.add("Lenovo");
            System.out.println("các phần tử trong hashSetString: ");
            System.out.println(hashSetString);
            System.out.println("nhập phần tử cần xóa ");
            name= scanner.nextLine();
        }
        if (hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("xóa thành công!");
            System.out.println("các phần tử còn lại trong hashsetString: ");
            System.out.println(hashSetString);
        }else {
            System.out.println("xóa không thành công!");
        }
    }
}