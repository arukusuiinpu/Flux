p,q = map(int, input().split())

print("1" if (r := p != 0) else "2")

p1,q1 = map(int, input().split())

if any([i == 0 for i in [p, q, p1, q1]]):
    print("r")
elif any([(p == [q, q+1, q-1][i]) and (p1 == [q1, q1+1, q1-1][i]) for i in range(3)]):
    print("c")
elif any([p == [q+1, q-1][i] for i in range(2)]) and any([p1 == [q1+1, q1-1][i] for i in range(2)]):
    print("c")
elif abs(p - p1) == 1 and abs(q - q1) == 1:
    print("r")
else:
    print("c")