n = float(input())

print('NOTAS:')
aux = int(n // 100); print(f'{aux} nota(s) de R$ 100.00'); n = n % 100
aux = int(n // 50); print(f'{aux} nota(s) de R$ 50.00'); n = n % 50
aux = int(n // 20); print(f'{aux} nota(s) de R$ 20.00'); n = n % 20
aux = int(n // 10); print(f'{aux} nota(s) de R$ 10.00'); n = n % 10
aux = int(n // 5); print(f'{aux} nota(s) de R$ 5.00'); n = n % 5
aux = int(n // 2); print(f'{aux} nota(s) de R$ 2.00'); n = n % 2

print('MOEDAS:')
aux = int(n // 1); print(f'{aux} moeda(s) de R$ 1.00'); n = n % 1; n = n*100
aux = int(n // 50); print(f'{aux} moeda(s) de R$ 0.50'); n = n % 50
aux = int(n // 25); print(f'{aux} moeda(s) de R$ 0.25'); n = n % 25
aux = int(n // 10); print(f'{aux} moeda(s) de R$ 0.10'); n = n % 10
aux = int(n // 5); print(f'{aux} moeda(s) de R$ 0.05'); n = int(n % 5)
print(f'{n} moeda(s) de R$ 0.01')