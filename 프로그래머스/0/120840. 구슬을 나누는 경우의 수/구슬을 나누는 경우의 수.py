#순열과 조합 itertolls로 풀어보자

def solution(b,s):
    return fac(b) / (fac(b-s) * fac(s))

def fac(num):
    factorial = 1
    while num>0:
        factorial *= num
        num -= 1
    return factorial
    