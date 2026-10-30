package prak_10_kls;

public class PekerjaCetak extends Thread {
    private String namaPekerja;

    public PekerjaCetak(String namaPekerja) {
        this.namaPekerja = namaPekerja;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(namaPekerja + " sedang mencetak dokumen ke-" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(namaPekerja + " terinterupsi!");
            }
        }
        System.out.println("===> " + namaPekerja + " * SELESAI.*");
    }
}
