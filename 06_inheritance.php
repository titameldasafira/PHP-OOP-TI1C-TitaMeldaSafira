<?php
class Hewan {
    public $nama;

    function __construct($nama) {
        $this->nama = $nama;
    }

    public function makan() {
        echo $this->nama . " sedang makan<br>";
    }
}

class Kucing extends Hewan {
    public function mengeong() {
        echo $this->nama . " meow! meow!<br>";
    }
}

$kucing = new Kucing("Cat");
$kucing->makan();
$kucing->mengeong();
?>