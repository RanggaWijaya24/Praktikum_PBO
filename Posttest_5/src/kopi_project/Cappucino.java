package kopi_project;

public final class Cappucino extends Kopi{
    private final String jenis;

    Cappucino(int id,int harga, String merek, float berat, String jenis){
        super(id,harga, merek, berat);
        this.jenis = jenis;
    }
    
    public final String getJenis(){
        return jenis;
    }

    @Override
    public void lihat(){
        System.out.println("==================================");
        System.out.println("1. NAMA  KOPI >>> " + this.produk_kopi);
        System.out.println("2. HARGA KOPI >>> " + this.Harga_kopi);
        System.out.println("4. BERAT KOPI >>> " + this.berat_kopi );
        System.out.println("5. JENIS KOPI >>> " + this.jenis);
    }
    public void lht(){
        System.out.println("==================================");
        System.out.println("1. NAMA  KOPI >>> " + this.produk_kopi);
        System.out.println("2. HARGA KOPI >>> " + this.Harga_kopi);
        System.out.println("4. BERAT KOPI >>> " + this.berat_kopi );
    }

    void lihat(boolean show){
        if(show) lihat();
        else lht();
    }
}
