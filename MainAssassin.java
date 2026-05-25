// deklarasi subclass MainAssassin memperluas sifat dari superclass MobaHero melalui keyword extends
public class MainAssassin extends MobaHero {

    // enkapsulasi atribut physicalDefense menggunakan hak akses private dengan tipe data primitif integer
    private int physicalDefense;
    // enkapsulasi atribut magicDefense menggunakan hak akses private dengan tipe data primitif integer
    private int magicDefense;

    // konstruktor berparameter untuk menginisialisasi state objek MainAssassin saat instansiasi
    public MainAssassin(String name, int hp, int attack, int physicalDefense, int magicDefense) {
        // memanaggil konstruktor superclass (MobaHero) menggunakan keyword super untuk menginisialisasi atribut warisan
        super(name, hp, attack);
        this.physicalDefense = physicalDefense; // mengisi atribut physicalDefense kelas dengan nilai dari parameter
        this.magicDefense = magicDefense; // mengisi atribut magicDefense kelas dengan nilai dari parameter
    } // penutup blok konstruktor kelas

    // accessor method getter untuk membaca nilai integer dari atribut physicalDefense yang dienkapsulasi
    public int getPhysicalDefense() {
        return physicalDefense; // mengembalikan nilai integer yang tersimpan pada atribut physicalDefense
    } // penutup getPhysicalDefense

    // mutator method setter tanpa nilai kembalian (void) untuk mengubah nilai atribut physicalDefense
    public void setPhysicalDefense(int physicalDefense) {
        this.physicalDefense = physicalDefense; // memperbarui nilai atribut physicalDefense dengan nilai parameter baru
    } // penutup setPhysicalDefense

    // accessor method getter untuk membaca nilai integer dari atribut magicDefense
    public int getMagicDefense() {
        return magicDefense; // mengembalikan nilai integer yang tersimpan pada atribut magicDefense
    } // penutup getMagicDefense

    // mutator method setter tanpa nilai kembalian (void) untuk mengubah nilai atribut magicDefense
    public void setMagicDefense(int magicDefense) {
        this.magicDefense = magicDefense; // memperbarui nilai atribut magicDefense dengan nilai parameter baru
    } // penutup setMagicDefense

    @Override // anotasi kompiler untuk menegaskan perwujudan polimorfisme melalui override metode abstrak dari superclass
    public void castSkill() { 
        // instruksi standar output dengan konkatenasi string, memanggil getName() dari superclass karena name bersifat private
        System.out.println(getName() + " memanggil malam kegelapan, musuh kehilangan pandangan" + magicDefense + " magic defense");
    } // penutup implementasi castSkill
} // penutup keseluruhan blok subclass MainAssassin