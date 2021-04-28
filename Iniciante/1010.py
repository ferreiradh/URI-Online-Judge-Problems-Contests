cod1, n1, valor1 = input().split(" ")

cod1 = int(cod1)
n1 = int(n1)
valor1 = float(valor1)

cod2, n2, valor2 = input().split(" ")

cod2 = int(cod2)
n2 = int(n2)
valor2 = float(valor2)

total = (n1 * valor1) + (n2 * valor2)

print(f'VALOR A PAGAR: R$ {total:.2f}')