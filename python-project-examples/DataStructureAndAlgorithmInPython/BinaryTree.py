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

    def preorder(self):
        print(self.key)

        if self.leftChild:
            self.leftChild.preorder()

        if self.rightChild:
            self.rightChild.preorder()

    def postorder(self):

        if self.leftChild:
            self.leftChild.preorder()

        if self.rightChild:
            self.rightChild.preorder()

        print(self.key)

    def inorder(self):
        if self.leftChild:
            self.leftChild.preorder()

        print(self.key)

        if self.rightChild:
            self.rightChild.preorder()


def preorder(tree):
    if tree:
        print(tree.getRootVal())
        preorder(tree.getLeftChild())
        preorder(tree.getRightChild())


def postorder(tree):
    if tree:
        preorder(tree.getLeftChild())
        preorder(tree.getRightChild())
        print(tree.getRootVal())


def inorder(tree):
    if tree:
        preorder(tree.getLeftChild())
        print(tree.getRootVal())
        preorder(tree.getRightChild())


def level_order(root):
    if root is None:
        return None

    queue = [root]

    while queue:

        while len(queue) > 0:
            node = queue.pop(0)

            print(node.key)
            if node.leftChild:
                queue.append(node.leftChild)

            if node.rightChild:
                queue.append(node.rightChild)


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

    print("--- preorder ---")
    print(r.preorder())

    print("--- postorder ---")
    print(r.postorder())

    print("--- inorder ---")
    print(r.inorder())

    print("--- level_order ---")
    level_order(r)
