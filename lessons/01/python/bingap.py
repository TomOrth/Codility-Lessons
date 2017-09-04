def solution(N):
    
    binary = bin(N)

    binary = binary[0:binary.rfind("1")].replace("0b", "").split("1")
    
    binary.sort()
    
    return len(binary[len(binary)-1])