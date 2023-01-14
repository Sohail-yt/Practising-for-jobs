class node:
    def __init__(self,data):
        self.data=data
        self.next=None
class linkedlist:
    def __init__(self):
        self.head=None
    def insert(self,ele):
        if self.head is None:
            self.head=ele
    def printing(self):
        currentnode=self.head
        print(currentnode.data)
        pass
add=node("I_got_inserted")
a=linkedlist()
a.insert(add)
a.printing()