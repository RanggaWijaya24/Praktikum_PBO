package kopi_project;
import java.util.*;
import java.io.*;
public class mains {
    static  ArrayList<Kopis> DataKopi = new ArrayList<>();
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader pilih = new BufferedReader(p);
    static Scanner input = new Scanner(System.in);
    static void sleep(int sec){
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    

    static void clear(){
        System.out.print("\033[H\033[2J");  
        System.out.flush();
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean lanjut = true;
        while(lanjut){
            clear();
            System.out.println("======================");
            System.out.println("=      Data kopi     =");
            System.out.println("======================");
            System.out.println("= 1.  Tambah Kopi    =");
            System.out.println("= 2.  Lihat  Kopi    =");
            System.out.println("= 3.  Update Kopi    =");
            System.out.println("= 4.  Hapus  Kopi    =");
            System.out.println("= 5.  Keluar Program =");
            System.out.println("======================");
            System.out.print("Masukkan pilihan Anda >> ");
            int pilihan = Integer.parseInt(pilih.readLine());
            switch(pilihan){
                case 1:
                    clear();
                    System.out.println("Tambah data");
                    nambah_kopi();
                    break;
                case 2:
                    clear();
                    lihat_data();
                    sleep(1);
                    break;
                case 3:
                    clear();
                    System.out.println("Update Data");
                    Update_data();
                    break;
                case 4:
                    clear();
                    System.out.println("hapus data");
                    delete_data();
                    break;
                case 5:
                    clear();
                    System.exit(0);
                    break;
                default:
                    System.out.println("=================");
                    System.out.println("pilihan tidak ada");
                    System.out.println("=================");
                    break;
            }
        }
    }

    static void nambah_kopi()throws NumberFormatException, IOException{
        System.out.print("Masukkan nama kopi >> ");
        String nama_kopi = input.next();
        System.out.print("Masukkan harga kopi >> ");
        int harga_kopi = input.nextInt();
        System.out.print("Masukkan berat kopi >> ");
        float berat_kopi = input.nextFloat();
        Kopis new_data = new Kopis(harga_kopi, nama_kopi, berat_kopi);
        DataKopi.add(new_data);
        System.out.println("");
        System.out.println("============================");
        System.out.println("=  DATA BERHASIL DITAMBAH  =");
        System.out.println("============================");
        System.out.println("");
        System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
    }

    static void Update_data() throws NumberFormatException, IOException{
        System.out.print("Masukkan nama kopi >>> ");
        String nama_kopi = input.next();
        for(Kopis kopi : DataKopi){
            if(kopi.getproduk_kopi().equals(nama_kopi)){
                System.out.print("Masukkan nama kopi >> ");
                kopi.setnama_produk(input.next());
                System.out.print("Masukkan harga kopi >> ");
                kopi.setHarga(input.nextInt());
                System.out.print("Masukkan berat kopi >> ");
                kopi.set_berat(input.nextFloat());
                System.out.println("");
                System.out.println("===========================");
                System.out.println("=  DATA BERHASIL DIRUBAH  =");
                System.out.println("===========================");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            }
        }
    }

    static void delete_data() throws NumberFormatException, IOException{
        System.out.print("Masukkan nama kopi >>> ");
        String nama_kopi = input.next();
        for(int i=0; i < DataKopi.size();i++){
            if(DataKopi.get(i).getproduk_kopi().equals(nama_kopi)){
                DataKopi.remove(i);
                System.out.println("=========================");
                System.out.println("= Data berhasil dihapus =");
                System.out.println("=========================");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            }
        }
    }

    static void lihat_data() throws NumberFormatException, IOException{
        for(int i =0; i < DataKopi.size(); i++){
            System.out.println("==================================");
            System.out.println("KOPI KE- " + (i + 1));
            System.out.println("==================================");
            System.out.println("1. NAMA  KOPI >>> " + DataKopi.get(i).getproduk_kopi());
            System.out.println("2. HARGA KOPI >>> " + DataKopi.get(i).getHarga());
            System.out.println("4. BERAT KOPI >>> " + DataKopi.get(i).getberat_kopi());
        }
        System.out.println("==================================");
        System.out.println("");
        System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
    }
    
}
