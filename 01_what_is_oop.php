<?php
class Hewan {
    public $nama;
    public $suara;

    public function bersuara() {
        echo $this->nama . " say " . $this->suara . "<br>";
    }
}

$kucing = new Hewan();
$kucing->nama = "Kucing";
$kucing->suara = "meow";
$kucing->bersuara();
?>