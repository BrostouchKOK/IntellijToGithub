import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input n =");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.print("Input Number"+i +" = ");
            int number = scanner.nextInt();
            if(number%2 !=0){
                sum = sum + number;
            }

        }
        System.out.println("Sum = "+sum);
    }
}