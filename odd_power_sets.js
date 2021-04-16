full_set = [1, 2, 3, 4, 5];

all_sets = [];
all_set_combos = Math.pow(2, full_set.length);

for (combo = 0; combo < all_set_combos; combo++) {
    console.log(combo);
    bindigits = '';
    newset = [];
    for (pos = 0; pos < full_set.length; pos++) {
        if (combo & (1 << pos)) {
            bindigits += '1';
            newset.push(full_set[pos]);
        } else {
            bindigits += '0';
        }
    }
    all_sets.push(newset);
    console.log(bindigits);
}

console.log('All sets');
all_sets.forEach(s => {
    console.log(s);
});
console.log('All sets count: ', all_sets.length);

odd_sets = []
all_sets.forEach(s => {
    if (s.length % 2 == 1) {
        odd_sets.push(s);
    }
});

console.log('Odd sets');
odd_sets.forEach(s => {
    console.log(s);
});
console.log('Odd sets count: ', odd_sets.length);