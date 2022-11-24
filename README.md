# Red Black Tree

### Problem Statement : Give an application and its implementation to demonstrate the rotations operations RB [Red-Black trees]

<hr>


### Red Black Tree:
A red-black tree is a kind of self-balancing binary search tree and it is just like binary search tree. where each node has an extra bit, and that bit is often interpreted as the color (red or black). These colors are used to ensure that the tree remains balanced during insertions and deletions. Although the balance of the tree is not perfect, it is good enough to reduce the searching time and maintain it around O(log n) time, where n is the total number of elements in the tree. This tree was invented in 1972 by Rudolf Bayer. 

### Why Red-Black Trees?
Most of the BST operations (e.g., search, max, min, insert, delete.. etc) take O(h) time where h is the height of the BST. The cost of these operations may become O(n) for a skewed Binary tree. If we make sure that the height of the tree remains O(log n) after every insertion and deletion, then we can guarantee an upper bound of O(log n) for all these operations. The height of a Red-Black tree is always O(log n) where n is the number of nodes in the tree. 

### Properties of Red-Black tree
<ul>
  <li>It is a self-balancing Binary Search tree. Here, self-balancing means that it balances the tree itself by either doing the rotations or recoloring the nodes.</li>
  <li>In the Red-Black tree, the root node is always black in color.</li>
  <li>There are no two adjacent red nodes (A red node cannot have a red parent or red child).</li>
  <li>All leaf nodes are black nodes.</li>
  <li>Every path from a node (including root) to any of its descendants NULL nodes has the same number of black nodes.</li>
</ul>

### Application of Red-Black Tree are:
<ol><li>RB tree is used to implement CPU Scheduling in Linux.CFS(Completely Fair sceduler)</li>
<li>MySQL also uses the Red-Black tree for indexes on tables in order to reduce the searching and insertion time.</li>
<li>RB tree is used in C++ self-balancing BST library functions like map, multiset, and multimap</li>
<li>RB tree is used in java packages like java.util.TreeMap and java.util.TreeSet</li>
<li>RB tree is used in the K-mean clustering algorithm in machine learning for reducing time complexity.</li></ol>

<hr>

### - From above list of applications, I have choosen one application that is TreeSet package in java

### TreeSet in java:

- Java TreeSet class implements the Set interface that uses a tree for storage.
- Java TreeSet class contains unique elements only like HashSet.
- Java TreeSet class access and retrieval times are quiet fast.
- Java TreeSet class doesn't allow null element.
- Java TreeSet class is non synchronized.
- Java TreeSet class maintains ascending order.

So, I have created TreeSet package implementation using java language, In which you can create TreeSet object of any data type Like Integer,String, Collection, Float, Double, etc.In That you can perform some operations like
- insert one by one data
- insert a collection of data
- delete data
- clear all data which is already sored in TreeSet
- printing the data which is stored in TreeSet(inorder traversal) with color which is associated with that node for visulizing what happening in background of RB tree.
- print Max value in TreeSet
- print Min value in TreeSet
- print root value
- checker method which check that a perticular data is alredy present in TreeSet or not

## Insertion Operation in RB Tree
While inserting a new node, the new node is always inserted as a RED node. After insertion of a new node, if the tree is violating the properties of the red-black tree then, we do the following operations.

1) Recolor
2) Rotation

## Steps to Insert an Element in a Red Black Tree −
Check whether the tree is empty or not. If the tree is empty, then insert a new node and color it as Black. (Because Root Node must be always Black in color)’

Otherwise if the Tree is not empty then insert the new node as a leaf node to the end and color it as Red.

If the parent of the new node is Red and its neighbouring(parent’s) node is also Red then Flip the color of the both neighbour and Parent and Grandparents (If it is not Root Node Otherwise Flip the color of the Parent and neighbour only) i.e., Black.

If the parent of the new node is Red and its neighbouring(parent’s) node is empty or NULL, then Rotate (either Left-Left or Left-Right rotation) the new node and parent.

There are two types of rotation that would apply- Left Left Rotation and Left Right Rotation. The Rotation would apply in some conditions only. The conditions are −

If the parent of the new node is Red and the neighbouring node is empty or NULL, then rotate left or right rotation.

In Left-Left Rotation flip the color of the parent and grandparent. Make the parent as Grandparent and grandparent as child.


## Deletion Operation in Red Black Tree
Deletion is fairly complex process.  To understand deletion, notion of double black is used.  When a black node is deleted and replaced by a black child, the child is marked as double black. The main task now becomes to convert this double black to single black.


## Steps to Delete an Element in Red Black Tree
<ol>
<li>1) Perform standard BST delete. When we perform standard delete operation in BST, we always end up deleting a node which is either leaf or has only one child (For an internal node, we copy the successor and then recursively call delete for successor, successor is always a leaf node or a node with one child). So we only need to handle cases where a node is leaf or has one child. Let v be the node to be deleted and u be the child that replaces v (Note that u is NULL when v is a leaf and color of NULL is considered as Black).</li>

<li>Simple Case: <b>If either u or v is red,</b> we mark the replaced child as black (No change in black height). Note that both u and v cannot be red as v is parent of u and two consecutive reds are not allowed in red-black tree.</li>

<li><b>If Both u and v are Black.</b>
<ol><li>Color u as double black.  Now our task reduces to convert this double black to single black. Note that If v is leaf, then u is NULL and color of NULL is considered as black. So the deletion of a black leaf also causes a double black.</li>
<li>Do following while the current node u is double black and it is not root. Let sibling of node be s.
    <ol>
    
    <li>If sibling s is black and at least one of sibling’s children is red, perform rotation(s). Let the red child of s be r. This case can be divided in four subcases depending upon positions of s and r.
    <ol><li>Left Left Case (s is left child of its parent and r is left child of s or both children of s are red). This is mirror of right right case shown in below diagram.</li>
  <li>Left Right Case (s is left child of its parent and r is right child). This is mirror of right left case shown in below diagram.</li>
  <li>Right Right Case (s is right child of its parent and r is right child of s or both children of s are red)</li> </ol></li>
  
  <li>If sibling is black and its both children are black, perform recoloring, and recur for the parent if parent is black.</li>
    <li>If sibling is red, perform a rotation to move old sibling up, recolor the old sibling and parent. 
    The new sibling is always black (See the below diagram). 
    This mainly converts the tree to black sibling case (by rotation) and  leads to case (a) or (b). This case can be divided in two subcases.</li></ol> </li>
    
    <li>If u is root, make it single black and return (Black height of complete tree reduces by 1).</li>


</ol>
</li>
</ol>



