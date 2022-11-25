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
<ol><li>RB tree is used to implement CPU Scheduling in Linux. CFS(Completely Fair sceduler)</li>
<li>MySQL also uses the Red-Black tree for indexes on tables in order to reduce the searching and insertion time.</li>
<li>RB tree is used in C++ self-balancing BST library functions like map, multiset, and multimap</li>
<li>RB tree is used in java packages like java.util.TreeMap and java.util.TreeSet</li>
<li>RB tree is used in the K-mean clustering algorithm in machine learning for reducing time complexity.</li></ol>

<hr>

### - From above list of applications, I have chosen one application that is TreeSet package in java

### TreeSet in java:

- Java TreeSet class implements the Set interface that uses a tree for storage.
- Java TreeSet class contains unique elements only like HashSet.
- Java TreeSet class access and retrieval times are quiet fast.
- Java TreeSet class doesn't allow null element.
- Java TreeSet class is non synchronized.
- Java TreeSet class maintains ascending order.

So, I have created TreeSet package implementation using java language, In which you can create TreeSet object of any data type Like Integer,String, Collection, Float, Double, etc.In That you can perform some operations like
- Insert one by one data
- Insert a collection of data
- Delete data
- Clear all data which is already sored in TreeSet
- Printing the data which is stored in TreeSet(inorder traversal) with color which is associated with that node for visualising what happening in background of RB tree.
- Print Max value in TreeSet
- Print Min value in TreeSet
- Print root value
- Checker method which check that a perticular data is alredy present in TreeSet or not

## Insertion Operation in RB Tree
While inserting a new node, the new node is always inserted as a RED node. After insertion of a new node, if the tree is violating the properties of the red-black tree then, we do the following operations.

1) Recolor
2) Rotation

## Steps to Insert an Element in a Red Black Tree −
- Check whether the tree is empty or not. If the tree is empty, then insert a new node and color it as Black. (Because Root Node must be always Black in color)’

- Otherwise if the Tree is not empty then insert the new node as a leaf node to the end and color it as Red.

- If the parent of the new node is Red and its neighbouring(parent’s) node is also Red then Flip the color of the both neighbour and Parent and Grandparents (If it is not Root Node Otherwise Flip the color of the Parent and neighbour only) i.e., Black.

- If the parent of the new node is Red and its neighbouring(parent’s) node is empty or NULL, then Rotate (either Left-Left or Left-Right rotation) the new node and parent.

- There are two types of rotation that would apply- Left Left Rotation and Left Right Rotation. The Rotation would apply in some conditions only. The conditions are −

- If the parent of the new node is Red and the neighbouring node is empty or NULL, then rotate left or right rotation.

- In Left-Left Rotation flip the color of the parent and grandparent. Make the parent as Grandparent and grandparent as child.


## Deletion Operation in Red Black Tree
Deletion is fairly complex process.  To understand deletion, notion of double black is used.  When a black node is deleted and replaced by a black child, the child is marked as double black(DB). The main task now becomes to convert this double black to single black.


## Steps to Delete an Element in Red Black Tree

<img src="https://user-images.githubusercontent.com/86836506/203916703-ebe1313f-fbc4-4756-a6a5-58d84737dc53.png" width=50% height=50%>

## Test Cases of TreeSet implementation:
## Test Case 1:
- using Integer object
<img src="https://user-images.githubusercontent.com/86836506/203917750-c75efa03-eb15-4cc1-83f8-d0a2f021e7a6.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203917860-a8e9278f-0768-464b-9a72-b45ffd37131c.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203917880-5e046292-d51c-48d3-9ea1-358451fa2c3d.png" width=50% height=5%>

<img src="https://user-images.githubusercontent.com/86836506/203917901-67bacabe-8d4a-46b0-8bd5-c2ec1d0083ae.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203917932-fcd7ab5b-8b16-4982-b991-ef4803dd2c40.png" width=50% height=5%>

<img src="https://user-images.githubusercontent.com/86836506/203917952-7554d26f-a9bf-4f18-b8f8-4cc76f0861b3.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203917971-bb73ed3f-6229-4d90-8aa6-56ea7d9e11d2.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203917991-4ef5ec0a-1524-4765-b624-61cbedb40f37.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203918013-f251e85b-db17-4282-8ac0-ebd415d8fa54.png" width=50% height=5%>

## Explanation for above insertion process:
<img src="https://user-images.githubusercontent.com/86836506/203931395-2947dc42-40ce-475a-bd70-59188d4c432b.png" height=20% width=20%>
<img src="https://user-images.githubusercontent.com/86836506/203931451-59854fcd-4bb3-416f-9081-d15d24a75ec2.png" height=30% width=30%>

## Other operation on TreeSet:
<img src="https://user-images.githubusercontent.com/86836506/203960691-9e70adb1-521d-4e9a-8d8b-e7d6c7369644.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203961338-534459a8-9437-4777-a740-fa85646a136d.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203961403-a7921fde-6f2d-4cfc-8974-997e8890fe7b.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203961473-d3a4330e-c8c9-4b64-86e7-1e50045742e5.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203972725-b79f163f-b9e3-4b55-b15a-9c883e03b250.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203972765-655eb110-f835-43cf-9405-8e82d7fadc11.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203972906-79846034-a635-4713-9c2f-4fb9675bb021.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203972942-a796dd93-6843-4b5d-a319-cd8dfcf7dfae.png" width=50% height=5%>


## Deletion Operation:
<img src="https://user-images.githubusercontent.com/86836506/203961585-006b130d-c372-49e5-a89d-ca3d604b9344.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203962072-3e1b62e2-53de-4e83-86f1-6421f430b119.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203962128-44f383ed-dc7c-40c9-bf2d-19bcfd03f0e4.png" width=50% height=5%>


## Explanation for above deletion process:
<img src="https://user-images.githubusercontent.com/86836506/203971397-c156175e-6517-4762-859b-bfa5ef8a1e00.png" width=20% height=20%>
<img src="https://user-images.githubusercontent.com/86836506/203972986-45ee3b4d-e404-422b-b2aa-ba7157972eb4.png" width=50% height=5%>


## Other Example for delete opration:
<img src="https://user-images.githubusercontent.com/86836506/203974354-4a92674e-7998-407c-9600-2c9decf05264.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974405-8d57b5ef-f7dc-4662-8bd6-eda2696d0b3f.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974426-54da916f-7658-4c40-a785-4930ecbfabeb.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203977810-7dd8c16b-8727-4b46-bfca-1de1d902906d.png" width=50% height=5%>



## Test Case 2
- Testing TreeSet by making object of TreeSet as String:
<img src="https://user-images.githubusercontent.com/86836506/203973687-6bea6343-60bb-4b89-a4c7-7ae2e260956f.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973706-581537c4-8d99-4e00-a4ba-edab3a1146d8.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973744-0a6db6e0-c9c8-4367-b85a-daeb5f4cf120.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973768-845eb770-cd31-4fad-a121-fb6c14fdcc80.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973783-e09ab35c-9f53-43ab-a165-00cc70e3a8d9.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973794-e9474851-6925-4779-affd-3ebd557c0737.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973821-26af40e6-0d81-4932-8fae-1749aab08a5d.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973847-2b6a5704-55ef-45e4-a43b-b464f30aea79.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973870-b5c10de5-2144-4780-9faa-9f89653b9684.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973930-77904a29-55bd-485c-b7f4-94a92eb61035.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974033-458b24fa-6909-4a94-aacb-c2f04c4a7c13.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974073-e1363ef2-a92e-485a-ab4b-edb8972af871.png" width=50% height=5%>

<img src="https://user-images.githubusercontent.com/86836506/203973950-b2854720-4d7e-4527-b01c-dc647fe645cc.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203973982-91816dad-e414-47a1-ab34-e9f2a0e6d6e1.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974013-32711845-7c41-4158-a83b-790f1748eec0.png" width=50% height=5%>

<img src="https://user-images.githubusercontent.com/86836506/203974105-35db2ba6-2e5b-434e-b554-12c527c97d63.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974123-c782f072-f76b-4404-ba06-3b6736ded05d.png" width=50% height=5%>
<img src="https://user-images.githubusercontent.com/86836506/203974188-d7e715d5-535e-461f-bbbb-7e5a1e75c3b4.png" width=50% height=5%>






