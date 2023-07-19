import java.util.Scanner;

public class DecisionMarking {
    public static void main(String[] args) {
        /*
         * Bài tập ứng dụng 1
         * Nhập vào một số nguyên, in ra số dư của số nguyên khi chia cho 5
         * --> switch...case
         * */
        //Bước 1: Nhập vào một số nguyên
        //-1.1. Khởi tạo 1 đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //-1.2. Thông báo nhập vào số nguyên
        System.out.println("Nhập vào một số nguyên");
        //-1.3. Lấy giá trị nhập từ bàn phím lưu vào biến
        int number = Integer.parseInt(scanner.nextLine());
        //Bước 2: in ra số dư trong phep chia 5
        switch (number % 5) {
            case 0:
                System.out.println(number + " chia hết cho 5");
                break;
            case 1:
                System.out.printf("%d chia 5 dư 1\n", number);
                break;
            case 2:
                System.out.printf("%d chia 5 dư 2\n", number);
                break;
            case 3:
                System.out.printf("%d chia 5 dư 3\n", number);
                break;
            default:
                System.out.printf("%d chia 5 dư 4\n", number);
        }

        /*
         * Bài tập ứng dụng 2
         * Nhập vào tuổi của người dùng, in ra tiền vé xe bus của người đó biết rằng:
         * age<6: 0 đồng
         * 6<=age<18: 3500 đồng
         * 18<=age<60: 7000 đồng
         * age>=60: 0 đồng
         * --> if...else if...else
         * */
        //Bước 1: Nhập vào tuổi người dùng
        System.out.println("Nhập vào tuổi của bạn");
        int age = Integer.parseInt(scanner.nextLine());
        //Bước 2: sử dụng if...else xét tuổi và in ra tiền vé xe bus
        if (age < 6 || age > 60) {
            System.out.println("Giá vé xe bus: 0 đồng");
        } else if (age < 18) {
            System.out.println("Giá vé xe bus: 3500 đồng");
        } else {
            System.out.println("Giá vé xe bus: 7000 đồng");
        }
    }
}
