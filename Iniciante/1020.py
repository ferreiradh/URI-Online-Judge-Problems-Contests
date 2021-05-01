idadeD = int(input())

print('%d ano(s)' % (idadeD // 365)); idadeD = idadeD % 365
print('%d mes(es)' % (idadeD // 30)); idadeD = idadeD % 30
print('%d dia(s)' % (idadeD))