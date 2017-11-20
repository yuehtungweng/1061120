public class Main {

    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        Integer num, i;
        double factorial_value = 1;

        System.out.println("請輸入計算幾階乘");
        num = sc.nextInt();

        if (num >= 0) {
            for (i = 1; i <= num; i++) ;
            {

                factorial_value = factorial_value * i;
            }
            System.out.println(num + "!=" + factorial_value);
        }


        else
            {
                if (num < 0) {
                    System.out.println(num + "!,無定義");
                }

            }
        }
    }
