public class Mhs {
    private String nama, nim, prodi, fakultas;

    // constructor
    public Mhs() {
        this.nama = "";
        this.nim = "";
        this.prodi = "";
        this.fakultas = "";
    }

    public Mhs(String nama, String nim, String prodi, String fakultas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    // getter and setter
    // get nama
    public String getNama() {
        return this.nama;
    }
    // set nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // get nim
    public String getNim() {
        return this.nim;
    }
    // set nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // get prodi
    public String getProdi() {
        return this.prodi;
    }
    // set prodi
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    // get fakultas
    public String getFakultas() {
        return this.fakultas;
    }
    // set fakultas
    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
}
