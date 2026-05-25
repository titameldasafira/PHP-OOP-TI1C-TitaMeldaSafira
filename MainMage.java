// deklarasi subclass MainMage melakukan pewarisan (inheritance) dari superclass MobaHero menggunakan keyword extends
public class MainMage extends MobaHero {
    // enkapsulasi atribut magicPower dengan hak akses private tipe data primitif integer
    private int magicPower;

    // konstruktor berparameter untuk menginisialisasi nilai state/atribut objek MainMage saat instansiasi
    public MainMage(String name, int hp, int attack, int magicPower) {
        // memanggil konstruktor superclass (MobaHero) lewat keyword super untuk menginisialisasi atribut name, hp, attack
        super(name, hp, attack);
        // mengisi atribut magicPower kelas dengan nilai parameter untuk menghindari shadowing
        this.magicPower = magicPower;
    } // penutup blok konstruktor kelas

    // accessor method getter dengan hak akses publik untuk membaca nilai integer dari atribut magicPower
    public int getMagicPower() {
        return magicPower; // mengembalikan nilai integer yang tersimpan di dalam atribut magicPower
    } // penutup getMagicPower

    @Override // anotasi kompiler untuk memvalidasi penimpaan (overriding) methode abstrak castSkill dari superclass
    public void castSkill() {
        // instruksi standar output dengan teknik konkatenasi string, mengakses atribut nama via metode getName() milik superclass
        System.out.println(getName() + " mengeluarkan skill Mage: Memanggil Hujan Meteor dengan full damage " + magicPower + "!");
    } // penutup implementasi castSkill
} // penutup keseluruhan blok subclass MainMage 