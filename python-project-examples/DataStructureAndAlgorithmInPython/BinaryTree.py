# PDF-P198 - P200;

class BinaryTree:
    def __init__(self, rootObj):
        self.key = rootObj
        self.leftChild = None
        self.rightChild = None

    # 老-左节点 插入到 newNode的左节点
    def insertLeft(self, newNode):
        if not self.leftChild:
            self.leftChild = BinaryTree(newNode)
        else:
            t = BinaryTree(newNode)
            t.leftChild = self.leftChild
            self.leftChild = t

    # 老-右节点 插入到 newNode的右节点；
    def insertRight(self, newNode):
        if not self.rightChild:
            self.rightChild = BinaryTree(newNode)
        else:
            t = BinaryTree(newNode)
            t.rightChild = self.rightChild
            self.rightChild = t

    def getRightChild(self):
        return self.rightChild

    def getLeftChild(self):
        return self.leftChild

    def getRootVal(self):
        return self.key

    def setRootVal(self, newVal):
        self.key = newVal


if __name__ == '__main__':
    r = BinaryTree('a')
    print(r.getRootVal())
    print(r.getLeftChild())

    r.insertLeft('b')

    print(r.getLeftChild().key)
    print("r.getLeftChild().getRootVal() => ", r.getLeftChild().getRootVal())
    r.insertRight('c')
    print(r.getRightChild().key)
    print(r.getRightChild().getRootVal())
    r.getRightChild().setRootVal('hello')
    print(r.getRightChild().getRootVal())
