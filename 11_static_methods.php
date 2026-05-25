<?php
class Hitung {
    public static function tambah($a, $b) {
        return $a + $b;
    }

    public static function kali($a, $b) {
        return $a * $b;
    }
}

echo Hitung::tambah(8, 2) . "<br>";
echo Hitung::kali(5, 2) . "<br>";
?>