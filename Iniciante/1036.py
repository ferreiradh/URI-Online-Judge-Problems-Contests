from math import sqrt

a, b, c = (input().split(" "))
a = float(a)
b = float(b)
c = float(c)

if a == 0 or (b * b - 4 * a * c < 0):
    print('Impossivel calcular')
else:
    delta = b*b - 4*a*c
    x1 = (-b + sqrt(delta)) / (2*a)
    x2 = (-b - sqrt(delta)) / (2*a)   
    print(f'R1 = {x1:.5f}')
    print(f'R2 = {x2:.5f}')