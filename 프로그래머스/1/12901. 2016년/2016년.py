def solution(a, b):
    
    week = ['FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', 'THU']
    day_zip = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    
    date = sum(day_zip[:a-1]) + b-1
    day = date % 7
    
    return week[day]