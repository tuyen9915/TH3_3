import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int a;
     int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        //  giá trị tuyệt đối của a, b
        a = Math.abs(a);
        b = Math.abs(b);

        if( a == 0 || b == 0){
            System.out.println(" a, b không có  vô số ước chung");
        }
        while (a !=  b){
            if ( a < b)
                b = b -a;
            else
                a = a - b;
        }
        System.out.println("Ước chung lớn nhất của a, b là: " + a);
    }
}