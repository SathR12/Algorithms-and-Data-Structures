class Queue:
    def __init__(self, array):
        self.array = []
        
    def push(self, element):
        self.array.insert(0, element)
        
    def delete(self):
        self.array.pop(0)
        
    def getLength(self):
        return len(self.array)
    
    def isEmpty(self):
        return len(self.array) == 0
    
    def __str__(self):
        return str(self.array)
    
    

q1 = Queue([])

[int(x) for x in range(10) if q1.push(x)]
print(q1)
q1.delete()
print(q1)
print(q1.getLength())
print(q1.isEmpty())


