package kopi_project;

public class Kopi_susu extends Kopi {
    private String jenis;
    Kopi_susu(int harga, String merek, float berat, String jenis){
        super(harga, merek, berat);
        this.jenis = jenis;
    }
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    public String getJenis(){
        return jenis;
    }

    @Override
    void lihat(){
        super.lihat();
        System.out.println("5. JENIS KOPI >>> " + this.jenis);
    }
    void lihat(boolean show){
        if(show) lihat();
        else super.lihat();
    }
}
