package kopi_project;

public class Kopi {
    // atribut kopi
    int Harga_kopi;
    String produk_kopi;
    float berat_kopi;
    // constructor kopi
    Kopi(int harga, String merek, float berat){
        this.Harga_kopi = harga;
        this.produk_kopi = merek;
        this.berat_kopi = berat;
    }

    void lihat(){
        System.out.println("==================================");
        System.out.println("1. NAMA  KOPI >>> " + this.produk_kopi);
        System.out.println("2. HARGA KOPI >>> " + this.Harga_kopi);
        System.out.println("4. BERAT KOPI >>> " + this.berat_kopi );
    }

    public void setHarga(int harga){
        this.Harga_kopi = harga;
    }

    public void setnama_produk(String merek){
        this.produk_kopi = merek;
    }

    public void set_berat(float berat){
        this.berat_kopi = berat;
    }

    public int getHarga(){
        return Harga_kopi;
    }

    public String getproduk_kopi(){
        return produk_kopi;
    }

    public float getberat_kopi(){
        return berat_kopi;
    }
}

