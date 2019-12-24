import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        String num = in.nextLine();

        int sum=0;
        int a;
        int c;

        for (int i = 0; i < num.length(); i++) {
            c = num.charAt(num.length() - 1 - i);

            if(c == '1' || c == '0') {
                if (c == '1')
                    a = 1;
                else a = 0;
            } else {
                System.out.println("Неверный ввод!");
                break;
            }
            sum += (a * Math.pow(2, i));
        }

        System.out.println(sum);
    }}
