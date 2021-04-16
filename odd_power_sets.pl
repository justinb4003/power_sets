#!/usr/bin/env perl

use strict;

my @full_list = qw(1 2 3 4 5);
my @all_sets = ();
my $combo_count = 2**scalar(@full_list);

# Build every possible set
for (my $c = 0; $c < $combo_count; $c++) {
    # print("Combination from $c\n");
    my $bincode = '';
    my @newset = ();
    for (my $p = 0; $p < scalar(@full_list); $p++) {
        my $digit = @full_list[$p];
        if ($c & (1 << $p)) {
            $bincode .= '1';
            push(@newset, $digit);
        } else {
            $bincode .= '0';
        }
    }
    # print("Binary version: $bincode\n");
    # Add a reference to @newset to our master array
    push(@all_sets, \@newset);
}

print("All sets: \n");
my @odd_sets = ();
for my $s (@all_sets) {
    # We're iterating through an array of references so $s is a
    # reference, not an actuall array, and we need to dereference it, hence
    # the @{ $s } syntax. A shorter @$s would work but I prefer the longer
    # version
    print("{", join(", ", @{ $s }), "}\n");
    if (scalar(@{ $s }) % 2 == 1) {
        push(@odd_sets, $s);
    }
}

print("Odd sets: \n");
for my $s (@odd_sets) {
    print("{", join(", ", @{ $s }), "}\n");
}

print("Odd sets count: ", scalar(@odd_sets), "\n");