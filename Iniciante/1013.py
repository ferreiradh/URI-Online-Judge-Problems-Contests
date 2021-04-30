valor1, valor2, valor3 = input().split(" ")
valor1 = int(valor1)
valor2 = int(valor2)
valor3 = int(valor3)

if valor1 > valor2 and valor1 > valor3:
	print(f'{valor1} eh o maior')
elif valor2 > valor3:
	print(f'{valor2} eh o maior')
else:
	print(f'{valor3} eh o maior')