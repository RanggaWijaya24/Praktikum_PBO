package kopi_project;

public class Kopis {
    // atribut kopi
    private int Harga_kopi;
    private String produk_kopi;
    private float berat_kopi;
    // constructor kopi
    Kopis(int harga, String merek, float berat){
        this.Harga_kopi = harga;
        this.produk_kopi = merek;
        this.berat_kopi = berat;
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

