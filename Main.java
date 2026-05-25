// mengimpor scanner untuk menangani operasi standar input dari keyboard
import java.util.Scanner;

// deklarasi driver class bernama main sebagai entri utama eksekusi progam
public class Main { 
    public static void main(String[] args) { // definisi main method sebagai fungsi entry point yang dieksekusi pertama kali oleh JVM
        // instansiasi objek input dari kelas scanner yang diarahkan pada stream system.in
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah hero yang ingin dimasukkan ke dalam tim: "); // menampilkan string prompt ke layar standar output 
        int jumlah = input.nextInt(); // membaca nilai masukan bertipe data primitif integer dan menyimpan ke variabel jumlah
        input.nextLine(); // mengeksekusi sisa karakter baris baru (\n) pada buffer untuk mencegah kegagalan input teks berikutnya

        // mengalokasikan memori array timkamup bertipe superclass MobaHero untuk demonstrasi konsep polimorfisme
        MobaHero[] timKamup = new MobaHero[jumlah];

        // struktut kontrol perulangan (for loop) untuk melakukan iterasi pengisian data objek sebanyak nilai variabel jumlah 
        for (int i = 0; i < jumlah; i++) {
            System.out.println("\n--- Input Data Hero ke-" + (i + 1) + " ---");
            System.out.print("Nama Hero    : "); // output string penanda indeks iterasi ke konsol
            String name = input.nextLine(); // membaca baris utuh dari masukan pengguna ke variabel name bertipe string
            System.out.print("HP           : "); // output string prompt untuk pengisian nilai health points
            int hp = input.nextInt(); // membaca masukan integer dari pengguna untuk dialokasikan ke variabel hp
            System.out.print("Attack       : "); // output string prompt untuk pengisian nilai daya serang
            int attack = input.nextInt(); // membaca masukan integer dari pengguna untuk dialokasikan ke variabel attack 
            
            System.out.println("Pilihan Role : \n1. Assassin \n2. Mage"); // menampilkan daftar menu pilihan peranan objek (karakter)
            System.out.print("Pilih Role (1/2): "); // output string prompt pemilih menu berdasarkan indeks angka
            int role = input.nextInt(); // membaca masukan integer penentu opsi percabangan ke variabel role
            input.nextLine(); // membersihkan sisa karakter baris baru pada buffer input stream

            // struktur kontrol percabangan switch case berdasarkan nilai variabel pilihan role
            switch (role) {
                case 1: // blok logika eksekusi jika pengguna memilih opsi nilai 1 (Assassin)
                    System.out.print("Physical Defense: "); // output string prompt nilai pertahanan physical
                    int physDef = input.nextInt(); // membaca masukan integer untuk nilai physical defense
                    System.out.print("Magic Defense   : "); // otput string prompt nilai pertahanan magic
                    int magDef = input.nextInt(); // membaca masukan integer untuk nilai magic defense
                    input.nextLine(); // membersihkan sisa karakter baris baru pada buffer
                    
                    // polimorfisme: menginstansiasi objek subclass MainAssassin dan menyimpannya ke elemen array bertipe superclass
                    timKamup[i] = new MainAssassin(name, hp, attack, physDef, magDef);
                    break; // keluar dari struktur percabangan switch case setelah kondisi terpenuhi
                    
                case 2: // blok logika eksekusi jika pengguna memilih opsi nilai 2 (Mage)
                    System.out.print("Magic Power     : "); // output string prompt nilai kekuatan magic
                    int magPower = input.nextInt(); // membaca masukan integer untuk dialokasikan ke variabel magPower
                    input.nextLine(); // membersihkan sisa karakter baris baru pada buffer
                    
                    // polimorfisme: menginstansiasi objek subclass MainMage dan menyimpannya ke elemen array bertipe superclass
                    timKamup[i] = new MainMage(name, hp, attack, magPower);
                    break; // keluar dari struktur percabangan switch case setelah kondisi terpenuhi
                    
                default: // blok logika fallback jika nilai variabel input tidak cocok dengan seluruh case yang tersedia
                    System.out.println("Role tidak valid. Otomatis diset sebagai Assassin Default."); // notifikasi kesalahan pilihan input
                    // instansiasi objek default menggunakan subclass MainAssassin dengan argumen pertahanan statis
                    timKamup[i] = new MainAssassin(name, hp, attack, 10, 10);
                    break; // keluar dari struktur percabangan switch case
            } // penutup blok switch case
        } // penutup blok perulangan for loop pengisian array

        // tampilan Eksekusi Program Menggunakan Perulangan untuk membuktikan Polimorfisme
        // output komponen visual pemisah konsol untuk kerapihan interface user
        System.out.println("\n=============================================");
        System.out.println("          DAFTAR HERO DI TIM KAMU            ");
        System.out.println("=============================================");

        // struktur perulangan for-each untuk melakukan iterasi traversal pada setiap elemen di dalam array polimorfik timKamup
        for (MobaHero hero : timKamup) {
            System.out.println("\n-----------------------------------------"); // output string pembatas antar objek hero
            // pemanggilan metode getter objek untuk membaca nilai atribut name yang dienkapsulasi
            System.out.println("Nama Hero   : " + hero.getName());
            // pemanggilan metode getter objek untuk membaca nilai atribut hp
            System.out.println("HP          : " + hero.getHp());
            // pemanggilan metode getter untuk objek membaca nilai atribut attack
            System.out.println("Attack      : " + hero.getAttack());

            // Run Time Type Information: memeriksa apakah tipe objek konkret dari referensi hero adalah MainAssassin
            if (hero instanceof MainAssassin) {
                MainAssassin ass = (MainAssassin) hero; // melakukan operasi downcasting dari tipe superclass ke subclass MainAssassin
                System.out.println("Role        : Assassin"); // menampilkan informasi label peran objek ke konsol
                System.out.println("Phy Defense : " + ass.getPhysicalDefense()); // mengakses properti physical spesifik milik subclass assassin
                System.out.println("Mag Defense : " + ass.getMagicDefense()); // mengakses properti magic spesifik milik subclass assassin
            } else if (hero instanceof MainMage) { // memeriksa apakah tipe objek konkret dari referensi hero adalah MainMage
                MainMage mage = (MainMage) hero; // melakukan operasi downcasting dari tipe superclass ke subclass MainMage
                System.out.println("Role        : Mage"); // menampilkan informasi label peran objek ke konsol
                System.out.println("Magic Power : " + mage.getMagicPower()); // mengakses properti kekuatan magic spesifik milik subclass mage
            } // penutup blok percabangan pemeriksaan tipe objek

            // eksekusi polimorfisme dinamis dengan memanggil konkret basicAttack() yang diwarisi dari superclass
            hero.basicAttack(); // Memanggil method reguler
            // eksekusi polimorfisme dinamis dengan memanggil metode castSkill() yang perilakunya terikat pada objek konkret saat runtime
            hero.castSkill();   // Memanggil method abstrak yang telah di-override
        } // penutup blok perulangan for-each percetakan data

        // memanggil fungsi close() pada objek scanner untuk membebaskan sumber daya sistem dan mencegah memory leak
        input.close();
    } // penutup main method
} // penutup kelas main