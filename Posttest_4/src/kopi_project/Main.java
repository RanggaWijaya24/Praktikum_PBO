package kopi_project;
import java.util.*;
import java.io.*;
public class Main {
    static  ArrayList<Kopi> DataKopi = new ArrayList<>();
    static  ArrayList<Kopi_susu> data_kopi_susu = new ArrayList<>();
    static  ArrayList<Cappucino> data_Cappucino = new ArrayList<>();
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
        System.out.println("========================");
        System.out.println("1. TAMBAH KOPI     BIASA");
        System.out.println("2. Tambah KOPI      SUSU");
        System.out.println("3. Tambah KOPI CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");int p = Integer.parseInt(pilih.readLine());
        switch(p){
            case 1:
                System.out.print("Masukkan nama kopi >> ");
                String nama_kopi = input.next();
                System.out.print("Masukkan harga kopi >> ");
                int harga_kopi = input.nextInt();
                System.out.print("Masukkan berat kopi >> ");
                float berat_kopi = input.nextFloat();
                Kopi new_data = new Kopi(harga_kopi, nama_kopi, berat_kopi);
                DataKopi.add(new_data);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            case 2:
                System.out.print("Masukkan nama kopi >> ");
                String nm_kopi = input.next();
                System.out.print("Masukkan harga kopi >> ");
                int hr_kopi = input.nextInt();
                System.out.print("Masukkan berat kopi >> ");
                float br_kopi = input.nextFloat();
                Cappucino nCappucino = new Cappucino(hr_kopi, nm_kopi, br_kopi, "Kopi Cappucino");
                data_Cappucino.add(nCappucino);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            case 3:
                System.out.print("Masukkan nama kopi >> ");
                String nm = input.next();
                System.out.print("Masukkan harga kopi >> ");
                int hr = input.nextInt();
                System.out.print("Masukkan berat kopi >> ");
                float br = input.nextFloat();
                Kopi_susu kSusu = new Kopi_susu(hr, nm, br, "Kopi susu");
                data_kopi_susu.add(kSusu);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            default:
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    static void Update_data() throws NumberFormatException, IOException{
        System.out.println("=============================");
        System.out.println("1. UPDATE DATA KOPI BIASA    ");
        System.out.println("2. UPDATE DATA KOPI SUSU     ");
        System.out.println("3. UPDATE DATA KOPI CAPPUCINO");
        System.out.println("=============================");
        System.out.print("Masukkan pilihan >> ");int p = input.nextInt();
        switch(p){
            case 1: 
                System.out.print("Masukkan nama kopi >>> ");
                String nama_kopi = input.next();
                for(Kopi kopi : DataKopi){
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
                break;
            case 2:
                System.out.print("Masukkan nama kopi >>> ");String na = input.next();
                for(Kopi_susu ks : data_kopi_susu){
                    if(ks.getproduk_kopi().equals(na)){
                        System.out.print("Masukkan nama kopi >> ");
                        ks.setnama_produk(input.next());
                        System.out.print("Masukkan harga kopi >> ");
                        ks.setHarga(input.nextInt());
                        System.out.print("Masukkan berat kopi >> ");
                        ks.set_berat(input.nextFloat());
                        System.out.println("");
                        System.out.println("===========================");
                        System.out.println("=  DATA BERHASIL DIRUBAH  =");
                        System.out.println("===========================");
                        System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                        break;
                    }
                }
                break;
            case 3:
                System.out.print("Masukkan nama kopi >>> ");String n = input.next();
                for(Cappucino c : data_Cappucino){
                    if(c.getproduk_kopi().equals(n)){
                        System.out.print("Masukkan nama kopi >> ");
                        c.setnama_produk(input.next());
                        System.out.print("Masukkan harga kopi >> ");
                        c.setHarga(input.nextInt());
                        System.out.print("Masukkan berat kopi >> ");
                        c.set_berat(input.nextFloat());
                        System.out.println("");
                        System.out.println("===========================");
                        System.out.println("=  DATA BERHASIL DIRUBAH  =");
                        System.out.println("===========================");
                        System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                        break;
                    }
                }
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }

    static void delete_data() throws NumberFormatException, IOException{
        System.out.println("======================");
        System.out.println("1.Hapus kopi     biasa");
        System.out.println("2.Hapus kopi      susu");
        System.out.println("3.Hapus kopi Cappucino");
        System.out.println("======================");
        System.out.print("Masukkan pilihan anda >> ");int pilihan = input.nextInt();
        switch(pilihan){
            case 1:
                System.out.print("Masukkan nama kopi >>> ");String nama = input.next();
                for(int i = 0; i < DataKopi.size();  i++){
                    if(DataKopi.get(i).getproduk_kopi().equals(nama)){
                        DataKopi.remove(i);
                    }
                }
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama kopi >>> ");String nm = input.next();
                for(int i = 0; i < data_kopi_susu.size();  i++){
                    if(data_kopi_susu.get(i).getproduk_kopi().equals(nm)){
                        data_kopi_susu.remove(i);
                    }
                }
                sleep(1);
                break;
            case 3:
                System.out.print("Masukkan nama kopi >>> ");
                String u_name = input.next();
                for(int i = 0; i < data_Cappucino.size();  i++){
                    if(data_Cappucino.get(i).getproduk_kopi().equals(u_name)){
                        data_Cappucino.remove(i);
                    }
                }
                sleep(1);
                break;
            default:
                System.out.println("=================");
                System.out.println("Pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    static void lihat_data() throws NumberFormatException, IOException{
        System.out.println("Lihat data");
        System.out.println("========================");
        System.out.println("1. LIHAT KOPI      BIASA");
        System.out.println("2. Lihat KOPI       SUSU");
        System.out.println("3. LIHAT KOPI  CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");int pil = input.nextInt();
        switch(pil){
            case 1:
                for(Kopi kp : DataKopi){
                    kp.lihat();
                }
                System.out.println("==================================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            case 2:
                for(Kopi_susu kp : data_kopi_susu){
                    kp.lihat(false);
                }
                System.out.println("==================================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            case 3:
                for(Cappucino kp : data_Cappucino){
                    kp.lihat(false);
                }
                System.out.println("==================================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");pilih.readLine();
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;     
        }
    }
}
    

