#include <iostream>
#include <string>
#include "mhs.cpp"

using namespace std;
#include <list>

class CRUD : public Mhs {
    private:
        list<Mhs> dataMhs; // untuk data mahasiswa
        string nama, nim, prodi, fakultas;

    public:
        CRUD() {}

        void Create() {
            cout << "\nMasukkan data mahasiswa :\n";
            cout << "Nama : ";
            cin >> nama;
            cout << "NIM : ";
            cin >> nim;
            cout << "Program Studi : ";
            cin >> prodi;
            cout << "Fakultas : ";
            cin >> fakultas;

            Mhs temp(nama, nim, prodi, fakultas);

            dataMhs.push_back(temp);

            cout << "Data berhasil ditambahkan\n";
        }

        void Update() {
            cout << "\nMasukkan NIM mahasiswa yang mau diupdate : ";
            cin >> nim;

            int x = 0;
            for (list<Mhs>::iterator it = dataMhs.begin(); it != dataMhs.end(); it++) {
                if (it->getNim() == nim) {
                    x = 1;

                    cout << "\nMasukkan data mahasiswa terbaru : ";
                    cout << "Nama : ";
                    cin >> nama;
                    cout << "NIM : ";
                    cin >> nim;
                    cout << "Program Studi : ";
                    cin >> prodi;
                    cout << "Fakultas : ";
                    cin >> fakultas;

                    // ubah yang sekarang
                    it->setNama(nama);
                    it->setNim(nim);
                    it->setProdi(prodi);
                    it->setFakultas(fakultas);
                }
            }
            if (x == 0) {
                cout << "NIM tidak ditemukan\n";
            } else {
                cout << "Data berhasil diubah\n";
            }
        }

        void Delete() {
            cout << "\nMasukkan NIM mahasiswa yang mau dihapus : ";
            cin >> nim;

            int x = 0;
            list<Mhs>::iterator it = dataMhs.begin();
            while (it != dataMhs.end() && x == 0) {
                if (it->getNim() == nim) {
                    x = 1;
                    dataMhs.erase(it);
                }
                it++;
            }

            if (x == 0) {
                cout << "NIM tidak ditemukan\n";
            } else {
                cout << "Data berhasil dihapus\n";
            }
        }

        void Print() {
            cout << "\nDATA MAHASISWA\n";
            int i = 1;
            
            for (list<Mhs>::iterator it = dataMhs.begin(); it != dataMhs.end(); it++) {
                cout << i << ". " << it->getNama() << " "
                    << it->getNim() << " " << it->getProdi() << " "
                    << it->getFakultas() << "\n";
            }
        }

        ~CRUD() {}
};
