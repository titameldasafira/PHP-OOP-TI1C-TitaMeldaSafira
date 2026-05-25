<?php
function cetakSemua(iterable $data) {
    foreach ($data as $item) {
        echo $item . "<br>";
    }
}

$nilai = [75, 80, 85, 90, 95];
cetakSemua($nilai);
?>