/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan29.warnakepribadian;

/**
 *
 * @author Fiona Avila
 */

import java.util.Scanner;

public class WarnaKepribadian {
    
    static Scanner scan = new Scanner(System.in);
    
    String warna, nama;
    
    String netral = "\u001b[0m";
    String merah = "\u001b[31m";
    String merah2 = "\u001b[41m";
    String biru = "\u001b[34m";
    String biru2    = "\u001b[44m";
    String kuning = "\u001b[33m";
    String kuning2  = "\u001b[43m";
    String ungu = "\u001b[35m";
    String ungu2    = "\u001b[45m";
    String hijau = "\u001b[32m";
    String hijau2   = "\u001b[42m";
    String putih ="\u001b[37m";
    
    public void inputWarna(){
        System.out.println(merah + "YUK " + hijau + "CEK " + kuning + "KEPRIBADIAN " + biru + "DARI " + ungu + "WARNA " + biru + "FAVORITMU" + netral + "\n");
        System.out.println(merah2 + putih + "         MERAH        " + netral);
        System.out.println(biru2 + putih + "         BIRU         " + netral);
        System.out.println(kuning2 + putih + "         KUNING       " + netral);
        System.out.println(ungu2 + putih + "         UNGU         " + netral);
        System.out.println(hijau2 + putih + "         HIJAU        " + netral);
        System.out.print("\nPILIH WARNA FAVORITMU\t: ");
        warna = scan.next();
        warna = warna.toUpperCase();
    }
    
    public String inputNama(){
        System.out.print("NAMA KAMU\t\t: ");
        nama = scan.next();
        nama = nama.toUpperCase();
        System.out.println();
        return nama;
    }
    
    public void sifatMerah(){
        System.out.println("Warna Favoritmu adalah " + netral + merah + warna);
        System.out.println("1. Melambangkan kekuatan, kesehatan, dan vitalitas\n" +
                        "2. Terbuka\n" +
                        "3. Agresif\n" +
                        "4. Impulsif\n" +
                        "5. Penuh semangat\n" +
                        "6. Optimisme\n" +
                        "7. Rasa disiplin yang tinggi\n" +
                        "8. Bersikap dinamis\n" +
                        "9. Terlalu ambisius\n" +
                        "10. Terlalu subjektif\n" +
                        "11. Mudah menghakimi orang lain");
    }
    
    public void sifatBiru(){
        System.out.println("Warna Favoritmu adalah " + netral + biru + warna);
        System.out.println("1. Melambangkan kehati-hatian, konservatisme, dan introspeksi\n" +
                        "2. Memberikan kesan lembut\n" +
                        "3. Menenangkan\n" +
                        "4. Perhatian\n" +
                        "5. Sabar\n" +
                        "6. Sensitif\n" +
                        "7. Pengendalian diri yang bagus\n" +
                        "8. Mudah menyadari kesalahannya\n" +
                        "9. Bijaksana dan stabil\n" +
                        "10. Loyal jika sudah meyakini sesuatu\n" +
                        "11. Sikap yang terlalu hati-hati\n" +
                        "12. Menyukai sesuatu yang bersifat konservatif\n" +
                        "13. Sering curiga pada orang-orang yang memiliki kepribadian serba spontan dan menonjol");
    }
    
    public void sifatKuning(){
        System.out.println("Warna Favoritmu adalah " + netral + kuning + warna);
        System.out.println("1. Melambangkan keceriaan, kebijaksanaan, dan imajinasi\n" +
                        "2. Haus petualangan dan menyukai hal-hal baru\n" +
                        "3. Berkepribadian cerah\n" +
                        "4. Cerdik\n" +
                        "5. Berbakat dalam bisnis\n" +
                        "6. Memiliki selera humor yang baik\n" +
                        "7. Menyukai kebebasan\n" +
                        "8. Orang yang independen\n" +
                        "9. Suka melalaikan tanggung jawab\n" +
                        "10. Sulit bekerja dengan orang lain");
    }
    
    public void sifatUngu(){
        System.out.println("Warna Favoritmu adalah " + netral + ungu + warna);
        System.out.println("1. Individualistik\n" +
                        "2. Jenaka\n" +
                        "3. Sensitif\n" +
                        "4. Selalu ingin tampil beda\n" +
                        "5. Menyukai hal-hal unik dan berbeda\n" +
                        "6. Dipenuhi ide-ide kreatif\n" +
                        "7. Tidak menyukai hal-hal yang konvensional\n" +
                        "8. Cocok memimpin\n" +
                        "9. Toleran\n" +
                        "10. Cenderung rewel\n" +
                        "11. Temperamental\n" +
                        "12. Berharga diri tinggi\n" +
                        "13. Suka menarik diri dan bersikap kasar jika ada orang yang salah paham terhadap mereka");
    }    
    
    public void sifatHijau(){
        System.out.println("Warna Favoritmu adalah " + netral + hijau + warna);
        System.out.println("1. Melambangkan harmoni dan keseimbangan\n" +
                        "2. Mewakili harapan dan perdamaian\n" +
                        "3. Lembut\n" +
                        "4. Jujur\n" +
                        "5. Terus terang dalam berkata-kata\n" +
                        "6. Suka berada dalam komunitas\n" +
                        "7. Mampu bersosialisasi dengan baik\n" +
                        "8. Menyukai kedamaian hidup\n" +
                        "9. Tidak suka mencari masalah dan pemecahan lewat jalan kekerasan\n" +
                        "10. Lebih memilih untuk tidak menonjolkan diri saat berinteraksi dalam komunitas\n" +
                        "11. Sederhana\n" +
                        "12. Sabar");
    }
    
    public String kepribadian(){
        switch (warna) {
            case ("MERAH") :
                sifatMerah();
                break;
            case ("BIRU") :
                sifatBiru();
                break;
            case ("HIJAU") :
                sifatHijau();
                break;
            case ("KUNING") :
                sifatKuning();
                break;
            case ("UNGU") :
                sifatUngu();
                break;
            default:
                System.out.println("Oops.. Warna kesukaanmu belum teridentifikasi!");
        }
        return warna;
    }

    public void tampilHasil(){
        System.out.println("===HASIL TEST KEPRIBADIAN "+nama+"===");
        System.out.println(kepribadian());
    }

    public static void main(String[] args) {
	    WarnaKepribadian sifat = new WarnaKepribadian();
            sifat.inputWarna();
            sifat.inputNama();
            sifat.tampilHasil();
   
            System.out.println();
            System.out.println("SOURCE :");
            System.out.println("https://www.merdeka.com/gaya/melihat-tipe-kepribadian-seseorang-berdasar-warna-kesukaannya.html?page=7");
    }
    
}
