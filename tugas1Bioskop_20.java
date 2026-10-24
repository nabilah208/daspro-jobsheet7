import java.util.Scanner;

public class tugas1Bioskop_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int hargaTiket = 50000;
        int jumlahTiket, diskon, hargaNormal, hargaDiskon, totalBayar;
        int totalTiket = 0, totalPenjualan = 0;

        System.out.println("=== Pernjualan Tiket Bioskop ===");

        do {
            System.out.print("Masukkan jumlah tiket: ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan lagi!");
                continue;
            }

            if (jumlahTiket > 0) {
                diskon = 0;
                if (jumlahTiket > 10) {
                    diskon = 15;  
                } else if (jumlahTiket > 4) {  
                    diskon = 10; 
                }
                hargaNormal = jumlahTiket * hargaTiket;
                hargaDiskon = hargaNormal * diskon / 100;
                totalBayar = hargaNormal - hargaDiskon;

                System.out.println("Harga normal : Rp " + hargaNormal);
                System.out.println("Diskon " + diskon + "% : Rp" + hargaDiskon);
                System.out.println("Total bayar : Rp " + totalBayar);

                totalTiket += jumlahTiket;
                totalPenjualan += totalBayar;
            }
        } while (jumlahTiket !=0);

        System.out.println("=== REKAP PENJUALAN TIKET ===");
        System.out.println("Total tiket yang terjual : " + totalTiket);
        System.out.println("Total penjualan : Rp " + totalPenjualan);

        sc.close();
    }
    
}
