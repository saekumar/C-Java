
def JumpingNmbr(n):
    if n<=10:
        return True
    digits = [int(digit) for digit in str(n)]
    for i in range(len(digits)-1):
        if(abs(digits[i]-digits[i+1])!=1):
            return False
    return True

n = int(input())
print(JumpingNmbr(n))
    
        
