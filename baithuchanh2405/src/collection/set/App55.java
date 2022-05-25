package collection.set;
import java.util.HashSet;
import java.util.Scanner;

public class App55 {

public static void main(String[] args ) {
    String name;
    HashSet<String> hashSetString = new HashSet<>();
    Scanner scanner = new Scanner(System.in);

    hashSetString.add("Wilson");
    hashSetString.add("Nike");
    hashSetString.add("Volvo");
    hashSetString.add("Kia");
    hashSetString.add("Lenovo");
    hashSetString.add("Lenovo");

    System.out.println("Các phần tử có trong hashSetString: ");
    System.out.println(hashSetString);
    System.out.println("Nhập phần tử cần xoá: ");
    name = scanner.nextLine();

    if (hashSetString.contains(name)) {
        hashSetString.remove(name);
        System.out.println("Xoá thành công!");
        System.out.println("Các phần tử còn lại trong hashSetString: ");
        System.out.println(hashSetString);
    }
    else {
        System.out.println("Xoá không thành công!");
    }
}
}