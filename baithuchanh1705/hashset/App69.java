
import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class App69 {
    public static void main (String[]args){
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        treeSetInteger.add(0);
        treeSetInteger.add(3);
        treeSetInteger.add(1);
        treeSetInteger.add(4);
        treeSetInteger.add(2);
        treeSetInteger.add(8);
        System.out.println("các phần tử trong treesetInteger: ");
        System.out.println(treeSetInteger);
        System.out.println("nhập phần tử  cần thêm: "); 
        number = scanner.nextInt();
        if (!treeSetInteger.contains(number)){
            treeSetInteger.add(number);
            System.out.println("thêm thành công!");
            System.out.println("các phần tử trong treeSetInteger sau khi thêm: ");
            System.out.println(treeSetInteger);
        } else {
            System.out.println("phần tử "+ number+ "đã tồn tại!");
        }
    }
}