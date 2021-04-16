<?php
$full = array(1, 2, 3, 4, 5);
$all_sets = array();
$all_set_combos = 2**count($full);

for ($c = 0; $c < $all_set_combos; $c++) {
    # echo "Combo number: " . $c . "\n";
    $bindigits = "";
    $newset = array();
    for ($p = 0; $p < count($full); $p++) {
        if ($c & (1 << $p)) {
            $bindigits .= "1";
            array_push($newset, $full[$p]);
        } else {
            $bindigits .= "0";
        }

    }
    # echo "Binary representation: ", $bindigits . "\n";
    array_push($all_sets, $newset);
}

$odd_sets = array();
echo "All sets: \n";
foreach ($all_sets as $s) {
    echo "{" . implode(", ", $s) . "}\n";
    if (count($s) % 2 == 1) {
        array_push($odd_sets, $s);
    }
}
echo "All sets count: " . count($all_sets) . "\n";

echo "Odd sets: \n";
foreach ($odd_sets as $s) {
    echo "{" . implode(", ", $s) . "}\n";
}
echo "Odd sets count: " . count($odd_sets) . "\n";

?>