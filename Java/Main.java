import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Crud dataMhs = new Crud();

        int n = 0;
        Scanner sc = new Scanner(System.in);

        while (n != 5) {
            // n = 0;
            if (n != 5) {
                System.out.println("DATA MAHASISWA MAKMUR JAYA UNIVERSITY");
                System.out.println("=====================================");
                System.out.println("Mau ngapain?");
                System.out.println("1. Input data mahasiswa");
                System.out.println("2. Update data mahasiswa");
                System.out.println("3. Hapus data mahasiswa");
                System.out.println("4. Lihat data mahasiswa");
                System.out.println("5. Bang udah bang");
            }
            System.out.print("> ");
            try {
                n = sc.nextInt();
            } catch (Exception e) {}
            System.out.println("n " + n);

            if (n == 1) {
                dataMhs.Create();
            // untuk update
            } else if (n == 2) {
                dataMhs.Update();
            // untuk delete
            } else if (n == 3) {
                dataMhs.Delete();
            // untuk print
            } else if (n == 4) {
                dataMhs.Print();
            // untuk mengakhiri program
            } else if (n == 5) {
                System.out.println("Dadah~");
            }
        }
        sc.close();
    }
}
