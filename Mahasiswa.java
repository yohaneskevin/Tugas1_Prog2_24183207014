public class Mahasiswa {
    // 3 atribut / variabel
    private String nama;
    private String npm;
    private String jurusan;

    // inisialisasi objek
    public Mahasiswa(String nama, String npm, String jurusan) {
        this.nama = nama;
        this.npm = npm;
        this.jurusan = jurusan;
    }

    // Method untuk menampilkanData()
    public void tampilkanData() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + nama);
        System.out.println("Npm : " + npm);
        System.out.println("Jurusan: " + jurusan);
        System.out.println(); // Baris kosong untuk pemisah
    }
}