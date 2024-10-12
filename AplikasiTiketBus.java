import java.util.Scanner;

public class AplikasiTiketBus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tipe data yang digunakan
        int pilihanBus, jurusanBus, jumlahTiket;
        double hargaTiket = 0;
        double totalHarga;
        char ulang = 'y'; // Inisialisasi dengan 'y' agar masuk ke loop do-while

        do {
            // Menampilkan menu pilihan bus
            System.out.println("Selamat Datang di Aplikasi Pemesanan Tiket Bus");
            System.out.println("Pilih jenis bus yang diinginkan:");
            System.out.println("1. Bus Ekonomi");
            System.out.println("2. Bus Bisnis");
            System.out.println("3. Bus Eksekutif");
            System.out.print("Masukkan pilihan (1-3): ");
            pilihanBus = scanner.nextInt();

            // Menampilkan menu pilihan jurusan
            System.out.println("Pilih jurusan bus yang diinginkan:");
            System.out.println("1. Jakarta - Bandung");
            System.out.println("2. Jakarta - Yogyakarta");
            System.out.println("3. Jakarta - Surabaya");
            System.out.print("Masukkan pilihan jurusan (1-3): ");
            jurusanBus = scanner.nextInt();

            // Switch statement untuk menentukan harga tiket berdasarkan jenis bus dan jurusan
            switch (pilihanBus) {
                case 1: // Bus Ekonomi
                    switch (jurusanBus) {
                        case 1: // Jakarta - Bandung
                            hargaTiket = 50000;
                            break;
                        case 2: // Jakarta - Yogyakarta
                            hargaTiket = 70000;
                            break;
                        case 3: // Jakarta - Surabaya
                            hargaTiket = 90000;
                            break;
                        default:
                            System.out.println("Jurusan tidak valid!");
                            continue; // Jika pilihan jurusan salah, ulangi do-while dari awal
                    }
                    System.out.println("Anda memilih Bus Ekonomi.");
                    break;

                case 2: // Bus Bisnis
                    switch (jurusanBus) {
                        case 1: // Jakarta - Bandung
                            hargaTiket = 100000;
                            break;
                        case 2: // Jakarta - Yogyakarta
                            hargaTiket = 120000;
                            break;
                        case 3: // Jakarta - Surabaya
                            hargaTiket = 150000;
                            break;
                        default:
                            System.out.println("Jurusan tidak valid!");
                            continue; // Jika pilihan jurusan salah, ulangi do-while dari awal
                    }
                    System.out.println("Anda memilih Bus Bisnis.");
                    break;

                case 3: // Bus Eksekutif
                    switch (jurusanBus) {
                        case 1: // Jakarta - Bandung
                            hargaTiket = 150000;
                            break;
                        case 2: // Jakarta - Yogyakarta
                            hargaTiket = 180000;
                            break;
                        case 3: // Jakarta - Surabaya
                            hargaTiket = 200000;
                            break;
                        default:
                            System.out.println("Jurusan tidak valid!");
                            continue; // Jika pilihan jurusan salah, ulangi do-while dari awal
                    }
                    System.out.println("Anda memilih Bus Eksekutif.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    continue; // Jika pilihan bus salah, ulangi do-while dari awal
            }

            // Input jumlah tiket
            System.out.print("Masukkan jumlah tiket yang ingin dipesan: ");
            jumlahTiket = scanner.nextInt();

            // Menghitung total harga
            totalHarga = hargaTiket * jumlahTiket;
            System.out.println("Total harga untuk " + jumlahTiket + " tiket: Rp" + totalHarga);

            // Do-while loop untuk menanyakan apakah ingin memesan tiket lagi
            System.out.print("Apakah Anda ingin memesan tiket lagi (y/n)? ");
            ulang = scanner.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        // Akhir program
        System.out.println("Terima kasih telah menggunakan Aplikasi Pemesanan Tiket Bus.");
        scanner.close();
    }
}
