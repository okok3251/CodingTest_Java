def solution(n):
    answer = [[0 for _ in range(n)] for _ in range(n)]
    x,y,direction, num = 0,0,0,1
    while num <= n**2:
        answer[x][y] = num
        num += 1
        if direction == 0:
            if y < n-1 and answer[x][y+1] == 0:
                y += 1
            else:
                x += 1
                direction = 1
        elif direction == 1:
            if x < n-1 and answer[x+1][y] == 0:
                x += 1
            else:
                y -= 1
                direction = 2
        elif direction == 2:
            if y < n-1 and answer[x][y-1] == 0:
                y -= 1
            else:
                x -= 1
                direction = 3
        elif direction == 3:
            if x < n-1 and answer[x-1][y] == 0:
                x -= 1
            else:
                y += 1
                direction = 0
    
    return answer