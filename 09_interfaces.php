<?php
interface BisaMenyanyi {
    public function menyanyi();
}

interface BisaMenari {
    public function menari();
}

class Penyanyi implements BisaMenyanyi {
    public function menyanyi() {
        echo "la la la...<br>";
    }
}

class Artis implements BisaMenyanyi, BisaMenari {
    public function menyanyi() {
        echo "artis menyanyi<br>";
    }

    public function menari() {
        echo "artis menari<br>";
    }
}

$p = new Penyanyi();
$p->menyanyi();

$a = new Artis();
$a->menyanyi();
$a->menari();
?>