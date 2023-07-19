import java.util.Scanner;

public class BaiTapUngDung3 {
    public static void main(String[] args) {
        /*
         * YC1. Nhập vào một số nguyên từ bàn phím
         * YC2. In ra menu và thực hiện chức năng theo menu
         * *************MENU****************
         * 1. Kiểm tra chẵn lẻ
         * 2. Kiểm tra chia hết cho 3 và 5
         * 3. Kiểm tra số nguyên tố
         * 4. Kiểm tra số hoàn hảo
         * 5. Thoát
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int number = Integer.parseInt(scanner.nextLine());
        do {
            System.out.println("*****************MENU***************");
            System.out.println("1. Kiêm tra chẵn lẻ");
            System.out.println("2. Kiểm tra chia hết cho 3 và 5");
            System.out.println("3. Kiểm tra số nguyên tố");
            System.out.println("4. Kiểm tra số hoàn hảo");
            System.out.println("5. Thoát");
            System.out.print("Sự lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    if (number % 2 == 0) {
                        System.out.printf("%d là một số chẵn\n", number);
                    } else {
                        System.out.printf("%d là một số lẻ\n", number);
                    }
                    break;
                case 2:
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.printf("%d chia hết cho 3 và 5\n", number);
                    } else {
                        System.out.printf("%d không chia hết cho cả 3 và 5\n", number);
                    }
                    break;
                case 3:
                    boolean checkPrime = true;
                    if (number >= 2) {
                        for (int i = 2; i <= Math.sqrt(number); i++) {
                            if (number%i==0){
                                checkPrime = false;
                                break;
                            }
                        }
                    }else{
                        checkPrime = false;
                    }
                    if (checkPrime){
                        System.out.printf("%d là số nguyên tố\n",number);
                    }else{
                        System.out.printf("%d không phải là số nguyên tố\n",number);
                    }
                    break;
                case 4:
                    int sum = 0;
                    for (int i = 1; i < number; i++) {
                        if (number%i==0){
                            sum+=i;
                        }
                    }
                    if (sum==number){
                        System.out.printf("%d là số hoàn hảo\n",number);
                    }else{
                        System.out.printf("%d không phải là số hoàn hảo",number);
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn từ 1 đến 5");
            }
        } while (true);
    }
}
