from random import randint

def mult(some_tuple: tuple) -> float:
    result = 3.14
    if some_tuple.count(some_tuple[0]) != len(some_tuple):
        for x in some_tuple: result*=x
        return result
    else: return 0

orbits = [(6, 4), (7, 7), (7, 6), (2, 5), (4, 1), (1, 5), (2, 7), (2, 7), (6, 2), (8, 1)]
orbits = list(set(orbits))
print(orbits)

orbits_sq = [mult(item) for item in orbits]
print(orbits_sq)
print(orbits[orbits_sq.index(max(orbits_sq))])

orbits_lambda = list(filter(lambda x: x[0] != x[1], orbits))
orbits_lambda = list(map(lambda x: x[0]*x[1]*3.14,orbits_lambda))


orbits_lambda = list(filter(lambda x: x[0]*x[1]*3.14 == max(orbits_lambda), orbits))
print(orbits_lambda)




