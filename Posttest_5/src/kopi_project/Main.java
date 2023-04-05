package kopi_project;

import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Kopi> datakopi = new ArrayList<>();
    private static InputStreamReader p = new InputStreamReader(System.in);
    private static BufferedReader pilih = new BufferedReader(p);
    static Scanner input = new Scanner(System.in);

    static void sleep(int sec) {
        try {
            Thread.currentThread().sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void clear() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        boolean lanjut = true;
        while (lanjut) {
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
            switch (pilihan) {
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

    static void nambah_kopi() throws NumberFormatException, IOException {
        System.out.println("========================");
        System.out.println("1. Tambah KOPI      SUSU");
        System.out.println("2. Tambah KOPI CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");
        int p = Integer.parseInt(pilih.readLine());
        switch (p) {
            case 1:
                System.out.print("Masukkan id kopi >> ");
                int id_kopi = input.nextInt();
                System.out.print("Masukkan nama kopi >> ");
                String nm_kopi = input.next();
                System.out.print("Masukkan harga kopi >> ");
                int hr_kopi = input.nextInt();
                System.out.print("Masukkan berat kopi >> ");
                float br_kopi = input.nextFloat();
                Cappucino nCappucino = new Cappucino(id_kopi, hr_kopi, nm_kopi, br_kopi, "Kopi Cappucino");
                datakopi.add(nCappucino);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");
                pilih.readLine();
                break;
            case 2:
                System.out.print("Masukkan id kopi >> ");
                int id = input.nextInt();
                System.out.print("Masukkan nama kopi >> ");
                String nm = input.next();
                System.out.print("Masukkan harga kopi >> ");
                int hr = input.nextInt();
                System.out.print("Masukkan berat kopi >> ");
                float br = input.nextFloat();
                Kopi_susu kSusu = new Kopi_susu(id, hr, nm, br, "Kopi susu");
                datakopi.add(kSusu);
                System.out.println("");
                System.out.println("============================");
                System.out.println("=  DATA BERHASIL DITAMBAH  =");
                System.out.println("============================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");
                pilih.readLine();
                break;
            default:
                System.out.println("=================");
                System.out.println("pilihan tidak ada");
                System.out.println("=================");
                break;
        }
    }

    static void Update_data() throws NumberFormatException, IOException {
        System.out.println("=============================");
        System.out.println("1. UPDATE DATA KOPI SUSU     ");
        System.out.println("2. UPDATE DATA KOPI CAPPUCINO");
        System.out.println("=============================");
        System.out.print("Masukkan pilihan >> ");
        int p = input.nextInt();
        switch (p) {
            case 1:
                System.out.print("Masukkan nama kopi >>> ");
                String na = input.next();
                for (Kopi ks : datakopi) {
                    if (ks.getproduk_kopi().equals(na)) {
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
                        System.out.println("Tekan enter untuk melajutkan. . .");
                        pilih.readLine();
                        break;
                    }
                }
                break;
            case 2:
                System.out.print("Masukkan nama kopi >>> ");
                String n = input.next();
                for (Kopi c : datakopi) {
                    if (c.getproduk_kopi().equals(n)) {
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
                        System.out.println("Tekan enter untuk melajutkan. . .");
                        pilih.readLine();
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

    static void delete_data() throws NumberFormatException, IOException {
        System.out.println("======================");
        System.out.println("1.Hapus kopi      susu");
        System.out.println("2.Hapus kopi Cappucino");
        System.out.println("======================");
        System.out.print("Masukkan pilihan anda >> ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama kopi >>> ");
                String nm = input.next();
                for (int i = 0; i < datakopi.size(); i++) {
                    if (datakopi.get(i).getproduk_kopi().equals(nm)) {
                        datakopi.remove(i);
                    }
                }
                sleep(1);
                break;
            case 2:
                System.out.print("Masukkan nama kopi >>> ");
                String u_name = input.next();
                for (int i = 0; i < datakopi.size(); i++) {
                    if (datakopi.get(i).getproduk_kopi().equals(u_name)) {
                        datakopi.remove(i);
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

    static void lihat_data() throws NumberFormatException, IOException {
        System.out.println("Lihat data");
        System.out.println("========================");
        System.out.println("1. Lihat KOPI       SUSU");
        System.out.println("2. LIHAT KOPI  CAPPUCINO");
        System.out.println("========================");
        System.out.print("Masukkan pilihan >> ");
        int pil = input.nextInt();
        switch (pil) {
            case 1:
                for (Kopi kp : datakopi) {
                    kp.lihat();
                }
                System.out.println("==================================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");
                pilih.readLine();
                break;
            case 2:
                for (Kopi kp : datakopi) {
                    kp.lihat();
                }
                System.out.println("==================================");
                System.out.println("");
                System.out.println("Tekan enter untuk melajutkan. . .");
                pilih.readLine();
                break;
            default:
                System.out.println("===================");
                System.out.println(" Pilihan tidak ada ");
                System.out.println("===================");
                break;
        }
    }
}
