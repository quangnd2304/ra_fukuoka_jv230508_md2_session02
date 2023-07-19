import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //1. VÒNG LẶP FOR
        //In ra các số nguyên chẵn trong khoảng 1-10
        System.out.print("Các số nguyên chẵn trong khoảng 1-10 là:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.printf("%d\t", i);
            }
        }
        System.out.printf("\n");
        //2. VÒNG LẶP WHILE
        //In ra 10 số nguyên chia hết cho 2 bắt đầu từ 1
        int cnt = 0;
        System.out.print("10 số nguyên chia hết cho 2 bắt đầu từ 1 là: ");
        int a = 1;
        while (cnt < 10) {
            if (a % 2 == 0) {
                System.out.printf("%d\t", a);
                cnt++;
            }
            a++;
        }
        System.out.printf("\n");
        //4. VÒNG LẶP FOREACH
        int[] arrInt = {3, 5, 7, 9};
        System.out.print("Các phần tử trong mảng là: ");
        for (int element:arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.printf("\n");
        //3. VÒNG LẶP DO...WHILE
        /*
         * In ra menu sau:
         * **************MENU********************
         * 1. Phở bò Kobe
         * 2. Bánh mỳ trứng
         * 3. Mỳ tôm không người lái
         * 4. Thoát
         * Sự lựa chọn của bạn:
         * */
        //Menu lặp đi lặp lại nhiều lần và ít nhất 1 lần --> sử dụng vòng lặp để in --> do...while
        //Khi người dùng chọn --> duyệt giá trị chọn --> switch...case
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("**********MENU****************");
            System.out.println("1. Phở bò Kobe");
            System.out.println("2. Bánh mỳ trứng");
            System.out.println("3. Mỳ tôm không người lái");
            System.out.println("4. Thoát");
            System.out.print("Sự lựa chọn của bạn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Bạn vừa chọn phở bò Kobe");
                    break;
                case 2:
                    System.out.println("Bạn vừa chọn bánh mỳ trứng");
                    break;
                case 3:
                    System.out.println("Bạn vừa chọn mỳ tôm không người lái");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui lòng chọn giá trị từ 1-4");
            }
        } while (true);

    }
}
