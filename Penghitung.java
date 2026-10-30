package prak_10_kls;

public class Penghitung {
    private int nilai = 0;

    public synchronized void tambah() {
        nilai++;
    }

    public int getNilai() {
        return nilai;
    }
}
