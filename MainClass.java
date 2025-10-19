public class MainClass {
    // Class utama untuk menjalankan program bro
    public static void main(String[] args) {
        // Buat dua objek berbeda dari class Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Wahyu Iqbal", "241001", "Hukum");
        Mahasiswa mhs2 = new Mahasiswa("Joko pangestu", "241002", "Informatika");

        // Panggil methodnya
        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
}