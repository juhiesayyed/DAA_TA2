# DAA_TA2
## Red Black Tree

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
<ol><li>RB tree is used in CFS(Completely Fair sceduler)</li></ol>
