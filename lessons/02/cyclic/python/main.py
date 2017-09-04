def solution(A, K):

    if(len(A) == 0 or len(A) == K): return A
    
    for i in xrange(K):
        
        temp = A[len(A)-1]
        
        for j in xrange(len(A)-1, 0, -1):
            
            A[j] = A[j-1]
        
        A[0] = temp
    
    return A