from collections import deque
class Entry:
    def __init__(self,n,val):
        self.n = n
        self.val = val
        
def MinSteps(n):
    q = deque()
    q.append(Entry(n,0))
    while q:
        fir = q.popleft()
        if fir.n ==1:
            
            return fir.val
        if fir.n%3==0:
            q.append(Entry(fir.n//3,fir.val+1))
        if fir.n%2==0:
            q.append(Entry(fir.n//2,fir.val+1))
        q.append(Entry(fir.n-1,fir.val+1))
    return -1
n = int(input())
print(MinSteps(n))
    
