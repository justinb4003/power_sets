#!/usr/bin/env python

full = [1, 2, 3, 4, 5]

all_sets = []

for combo in range(2**len(full)):
    newset = []
    for pos in range(len(full)):
        if combo & (1 << pos):
            print('1', end='')
            newset.append(full[pos])
        else:
            print('0', end='')
    all_sets.append(newset)
    print('')
    print(combo)
print('All sets')
for s in all_sets:
    print(s)
print('Set count: ', len(all_sets))

odd_sets = []
for s in all_sets:
    if len(s) % 2 == 1:
        odd_sets.append(s)
print('Odd sets')
for s in odd_sets:
    print(s)
print('Odd Set count: ', len(odd_sets))