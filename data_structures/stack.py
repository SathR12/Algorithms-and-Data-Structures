class Stack:
    def __init__(self, array):
        self.array = []
        
    def push(self, element):
        self.array.append(element)
        
    def delete(self):
        self.array.pop()
        
    def getLength(self):
        return len(self.array)
    
    def __str__(self):
        return str(self.array)

s1 = Stack([])

[int(x) for x in range(10) if s1.push(x)]
print(s1)
s1.delete()
print(s1)
print(s1.getLength())

