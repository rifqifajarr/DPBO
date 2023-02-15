#include <iostream>
#include <string>

using namespace std;

class Mhs {
    private:
        string nama, NIM, prodi, fakultas;
    
    public:
        // constructor
        Mhs () {
            this->nama = "";
            this->NIM = "";
            this->prodi = "";
            this->fakultas = "";
        }

        Mhs (string nama, string nim, string prodi, string fakultas) {
            this->nama = nama;
            this->NIM = nim;
            this->prodi = prodi;
            this->fakultas = fakultas;
        }

        // getter & setter
        // get nama
        string getNama () {
            return this->nama;
        }
        // set nama
        void setNama (string nama) {
            this->nama = nama;
        }

        // get nim
        string getNim () {
            return this->NIM;
        }
        // set nim
        void setNim (string nim) {
            this->NIM = nim;
        }

        // get prodi
        string getProdi () {
            return this->prodi;
        }
        // set prodi
        void setProdi (string prodi) {
            this->prodi = prodi;
        }

        // get fakultas
        string getFakultas () {
            return this->fakultas;
        }
        // set fakultas
        void setFakultas (string fakultas) {
            this->fakultas = fakultas;
        }

        // destructor
        ~Mhs() {}
};
