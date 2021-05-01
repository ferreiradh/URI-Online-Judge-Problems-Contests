n = int(input())

hora = n // 3600
n -= hora * 3600
min = n // 60
n -= min * 60
sec = n

print(f'{hora}:{min}:{sec}')