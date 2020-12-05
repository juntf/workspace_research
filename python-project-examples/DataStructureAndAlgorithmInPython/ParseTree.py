from pythonds.basic.stack import Stack
from pythonds.trees.binaryTree import BinaryTree

import operator

# P206;

def build_parse_tree(fpexp):
    fplist = fpexp.split()

    pstack = Stack()

    etree = BinaryTree("")

    pstack.push(etree)
    current_tree = etree

    for i in fplist:
        if i == '(':
            current_tree.insertLeft("")
            pstack.push(current_tree)
            current_tree = current_tree.getLeftChild()

        elif i not in ['+', '-', '*', '/', ')']:
            current_tree.setRootVal(int(i))
            parent = pstack.pop()
            current_tree = parent

        elif i in ['+', '-', '*', '/', ')']:
            current_tree.setRootVal(i)
            current_tree.insertRight("")
            pstack.push(current_tree)
            current_tree = current_tree.getRightChild()

        elif i == ')':
            current_tree = pstack.pop()

        else:
            raise ValueError

        return etree


def evaluate(parse_tree):
    opers = {'+': operator.add, '-': operator.sub, '*': operator.mul, '/': operator.truediv}

    leftC = parse_tree.getLeftChild()
    rightC = parse_tree.getRightChild()

    if leftC and rightC:
        fn = opers[parse_tree.getRootVal()]
        return fn(evaluate(leftC),  evaluate(rightC))
    else:
        return parse_tree.getRootVal()



if __name__ == '__main__':
    fp = "( ( 10 + 5 ) * 3 )"
    pt = build_parse_tree(fp)
    # rs = pt.postorder()

    print(evaluate(pt))
