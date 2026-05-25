// deklarasi kelas abstrak MobaHero sebegai superclass/blueprint yang tidak dapat diinstansiasi langsung
public abstract class MobaHero {
    // atribut dideklarasikan dengan access modifier private untuk menerapkan prinsip enkapsulasi
    // enkapsulasi atribut name menggunakan hak akses private dengan tipe data string
    private String name;
    // enkapsulasi atribut hp menggunakan hak akses private dengan tipe data integer
    private int hp;
    // enkapsulasi atribut attack menggunakan hak akses private dengan tipe data integer
    private int attack;

    // konstruktor berparameter untuk mengisialisasi nilai state/atribut saat instansiasi objek kelas turunan
    public MobaHero(String name, int hp, int attack) {
        this.name = name; // mengisi atribut name milik kelas dengan nilai dari parameter untuk menghindari shadowing
        this.hp = hp; // mengisi atribut hp milik kelas dengan nilai dari parameter hp
        this.attack = attack; // mengisi atribut attack milik kelas dengan nilai dari parameter attack
    } // penutup dari blok konstruktor kelas

    // accessor method getter untuk membaca nilai dari atribut name yang dienkapsulasi
    public String getName() {
        return name; // mengembalikan referensi string yang tersimpan pada atribut name
    } // penutup getName

    // mutator method setter tanpa nilai kembalian (void) untuk memperbarui nilai atribut name
    public void setName(String name) {
        this.name = name; // memperbarui nilai atribut name kelas dengan nilai parameter baru
    } // penutup setName

    // acccessor method getter untuk membaca nilai integer dari atribut hp
    public int getHp() {
        return hp; // mengembalikan nilai integer yang tersimpan pada atribut hp
    } // penutup getName

    // mutator method setter tanpa nilai kembalian (void) untuk memodifikasi nilai atribut hp
    public void setHp(int hp) {
        this.hp = hp; // memperbarui nilai atribut hp kelas dengan nilai parameter baru
    } // penutup setHp

    // accessor method getter untuk membaca nilai integer dari atribut attack
    public int getAttack() {
        return attack; // mengembalikan nilai integer yang tersimpan pada atribut attack
    } // penutup getAttack

    // mutator method setter tanpa nilai kembalian (void) untuk memodifikasi nilai atribut attack
    public void setAttack(int attack) {
        this.attack = attack; // memperbarui nilai atribut attack kelas dengan nilai parameter baru
    } // penutup setAttack

    // deklarasi metode konkret untuk mendefinisikan perilaku (behavior) standar objek
    public void basicAttack() {
        // instruksi standar output ke konsol menggunakan teknik konkatenasi (penggabungan) string dan atribut
        System.out.println(name + " menyerang dengan damage " + attack);
    } // penutup basicAttack

    // deklarasi metode abstrak tanpa body yang wajib di override oleh subclass demi polimorfisme
    public abstract void castSkill();
} // penutup keseluruhan blok abstrak class MobaHero