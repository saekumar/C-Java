
import math







def minVal(L):
	
	print("Okay")
	minimum = L[0] 
	for i in range(1, len(L)):  
		minimum = min(minimum, L[i])
	
	return minimum
		
	

L = list(map(int,input("").split()))
print(minVal(L))
print(divmod(27,5))
    