answer = 0
def solution(numbers, target):
    
    dfs(numbers, target, 0, 0)
    return answer


def dfs(numbers, target, value, idx):
    global answer
    if idx == len(numbers):
        if value == target:
            answer += 1
        return
    
    dfs(numbers, target, value + numbers[idx], idx+1)
    dfs(numbers, target, value - numbers[idx], idx+1)