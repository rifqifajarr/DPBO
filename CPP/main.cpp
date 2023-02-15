#include <bits/stdc++.h>
#include "crud.cpp"

using namespace std;

// prosedur untuk print opsi
void welcome() {
    cout << "\nDATA MAHASISWA MAKMUR JAYA UNIVERSITY\n";
    cout << "=====================================\n";
    cout << "Mau ngapain?\n";
    cout << "1. Input data mahasiswa\n";
    cout << "2. Update data mahasiswa\n";
    cout << "3. Hapus data mahasiswa\n";
    cout << "4. Lihat data mahasiswa\n";
    cout << "5. Bang udah bang\n";
}

int main() {
    // membuat objek data mahasiswa
    CRUD dataMhs;
    // untuk menampung pilihan user
    int n;
    // print opsi
    welcome();
    // perulangan menggunakan while selama user tidak memilih no 5
    while (n != 5) {
        // menerima masukan
        cout << "> ";
        cin >> n;
        // untuk create
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
            cout << "Dadah~\n";
        }
        // untuk print opsi lagi apabila masukan nya bukan 5
        if (n != 5) welcome();
    }

    return 0;
}
