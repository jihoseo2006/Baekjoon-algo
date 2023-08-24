alphabet = [3]*3 + [4]*3 + [5]*3 + [6]*3 + [7]*3 + [8]*4 + [9]*3  +[10]*4
sum = 0
s = list(input())
for i in range(len(s)):
    sum += alphabet[ord(s[i])-65]
print(sum)