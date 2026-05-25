<?php
class Buah {
    public $nama;
    public $warna;

    public function info() {
        echo "Buah: " . $this->nama . " warna: " . $this->warna . "<br>";
    }
}

$buah1 = new Buah();
$buah1->nama = "Jeruk";
$buah1->warna = "Orange";
$buah1->info();

$buah2 = new Buah();
$buah2->nama = "Anggur";
$buah2->warna = "Purple";
$buah2->info();
?>