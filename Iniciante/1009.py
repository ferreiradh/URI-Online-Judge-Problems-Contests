nome = input()
salarioFixo = float(input())
vendas = float(input())

total = salarioFixo + (vendas * 0.15)

print(f'TOTAL = R$ {total:.2f}')