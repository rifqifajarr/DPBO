import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
// import Mhs.java;

class Crud extends Mhs {
    // atribut
    private String nama, nim, prodi, fakultas;
    ArrayList<Mhs> dataMhs = new ArrayList<>();

    // constructor
    public Crud() {}

    // method untuk create update delete
    public void Create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa :");
        System.out.print("Nama : ");
        if (sc.hasNext()) nama = sc.next();
        System.out.print("NIM : ");
        if (sc.hasNext()) nim = sc.next();
        System.out.print("Program Studi : ");
        if (sc.hasNext()) prodi = sc.next();
        System.out.print("Fakultas : ");
        if (sc.hasNext()) fakultas = sc.next();

        Mhs temp = new Mhs(nama, nim, prodi, fakultas);
        dataMhs.add(temp);

        System.out.println("Data berhasil ditambahkan\n");
        sc.close();
    }

    public void Update() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa yang mau diupdate : ");
        nim = sc.next();

        int x = 0;
        for (int i = 0; i < dataMhs.size(); i++) {
            if (dataMhs.get(i).getNim() == nim) {
                x = 1;

                // nerima input yang baru
                System.out.println("Masukkan data mahasiswa terbaru :");
                System.out.print("Nama : ");
                if (sc.hasNext()) nama = sc.next();
                System.out.print("NIM : ");
                if (sc.hasNext()) nim = sc.next();
                System.out.print("Program Studi : ");
                if (sc.hasNext()) prodi = sc.next();
                System.out.print("Fakultas : ");
                if (sc.hasNext()) fakultas = sc.next();

                // ubah yang sekarang
                dataMhs.get(i).setNama(nama);
                dataMhs.get(i).setNim(nim);
                dataMhs.get(i).setProdi(prodi);
                dataMhs.get(i).setFakultas(fakultas);
            }
        }

        if (x == 0) {
            System.out.println("NIM tidak ditemukan");
        } else {
            System.out.println("Data berhasil diubah");
        }

        sc.close();
    }

    public void Delete() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa yang mau dihapus : ");
        nim = sc.next();

        // int x = 0;
        // Iterator itr = dataMhs.iterator();
        // while (itr.hasNext()) {
        //     String temp = itr.getNim();
        //     if (temp == nim) {
        //         x = 1;
        //         dataMhs.remove(itr);
        //     }
        // }

        dataMhs.remove(String.valueOf(nim));

        // if (x == 0) {
        //     System.out.println("NIM tidak ditemukan");
        // } else {
            System.out.println("Data berhasil dihapus");
        // }

        sc.close();
    }

    public void Print() {
        System.out.println("DATA MAHASISWA");
        int itr = 1;

        for (int i = 0; i < dataMhs.size(); i++) {
            System.out.println(itr + ". " + dataMhs.get(i).getNama() + " " +
                                dataMhs.get(i).getNim() + " " +
                                dataMhs.get(i).getProdi() + " " +
                                dataMhs.get(i).getFakultas());
            i++;
        }
    }
}