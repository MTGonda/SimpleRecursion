import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        while(!flag){
            switch (scanner.nextLine().toUpperCase()){
                case "F" -> System.out.println(factorial(scanner.nextInt()));
                case "Q" -> {
                    System.out.println("Quitting");
                    flag =true;
                }

            }
        }
    }
    public static int factorial(int n) {
        int factorialSum;
        if(n>0){
            factorialSum=n*factorial(n-1);
        }
        else{
            return 1;
        }
        return factorialSum;
    }

}