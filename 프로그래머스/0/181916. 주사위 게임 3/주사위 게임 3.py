def solution(a, b, c, d):
    answer = 0
    a,b,c,d = sorted((a, b, c, d))
    
    if a==d:
        return 1111 * a
    elif a == c:
        return (10 * a + d)**2
    elif b == d:
        return (10 * b + a)**2
    elif a == b and c == d:
        return (a+c) * abs(c-a)
    elif a == b and b != c and c != d:
        return c * d
    elif b == c and a != b and c != d:
        return a * d
    elif c == d and a != b and b != c:
        return b * a
    elif a == d and a != b and b != c:
        return b * c
    else:
        return min(a,b,c,d)
    return answer