
import java.util.HashSet;
import java.util.Scanner;
public class App54 {

    public static void main(String[]args){
        int number;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in); 
        hashSetInteger.add(0);
        hashSetInteger.add(3);
        hashSetInteger.add(1);
        hashSetInteger.add(4);
        hashSetInteger.add(2);
        hashSetInteger.add(8);
        System.out.println("các phần tử trong hashSetInteger: ");
        System.out.println(hashSetInteger);
        System.out.println("nhập phần tử cần thêm: ");
        number = scanner.nextInt();
        if (!hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println("THêm thành công");
            System.out.println("các phần tử trong hashSetInteger sau khi thêm");
            System.out.println(hashSetInteger);
        } else {
            System.out.println("phần tử" + number + "đã tồn tại!");
        }
    }
}