package prak_10_kls;

public class MainThread {
    public static void main(String[] args) {
        System.out.println("Program Utama Dimulai...");

        PekerjaCetak pekerja1 = new PekerjaCetak("Thread-A");
        PekerjaCetak pekerja2 = new PekerjaCetak("Thread-B");

        pekerja1.start();
        pekerja2.start();

        System.out.println("Program Utama Selesai Mengeksekusi Baris Terakhir.");
    }
}
