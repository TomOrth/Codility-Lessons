def solution(X, Y, D):
    distance = abs(Y - X)
    jumps = distance / D
    jumps += 1 if distance % D > 0 else 0
    return jumps