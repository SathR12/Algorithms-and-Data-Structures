class Tree(object):
    def __init__(self, value):
        self.right, self.left = None, None
        self.value = value
        
    
    #automatic sorting 
    def insertNode(self, val):
        if self.value != None:
            if val < self.value:
                if self.left == None:
                    self.left = Tree(val)
                else:
                    self.left.insertNode(val)
                    
            elif val > self.value:
                if self.right == None:
                    self.right = Tree(val)
                    
                else:
                    self.right.insertNode(val)
        else:
            self.value = val
            
    
    def show(self):
        if self.left != None:
            self.left.show()
            
        print(self.value)
        
        if self.right != None:
            self.right.show()
            
    
parent = Tree(100)
parent.insertNode(12)
parent.insertNode(9)
parent.show()
                
        
        
        
