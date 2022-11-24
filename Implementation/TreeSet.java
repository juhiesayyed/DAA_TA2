import java.util.Collection;
import java.util.Iterator;

public class TreeSet<E extends Comparable<E>> implements TreeSetOperation<E>  {

    private Node<E> root;

    @Override
    public TreeSetOperation<E> add(E data) {

        //this will check wether data already is present or not
        //if present then do not do any thing as TreeSet Containt unique value
        if(checkcontains(data, root))
        {
            return this;
        }
        else{
        //new node is created for each data
        Node<E> node=new Node<>(data);
        node.ParentNode=null;
        node.leftChild=null;
        node.rightChild=null;

        //this add method will place the newly created node in the sutable place
        root=add(root,node);

        //after insertion recoloring and rotaition is done.
        recolorAndRotate(node);
        return this;
        }

    }

    public Node<E> add(Node<E> root2, Node<E> node){
        if (node == null) {
            return node;
        }
        if(root2==null)
        {
            root2=node;
            return root2;
        }
        else{
        if (node.getData().compareTo(root2.getData()) < 0) {
            root2.setLeftChild(add(root2.getLeftChild(), node));
            root2.getLeftChild().setParentNode(root2);
        } else if (node.getData().compareTo(root2.getData()) > 0) {
            root2.setRightChild(add(root2.getRightChild(), node));
            root2.getRightChild().setParentNode(root2);
        }
        }
        return root2;
    }

    private void recolorAndRotate(Node<E> node) {
        Node<E> parent = node.getParentNode();

        //if node is not root then we have to start coloring from that node to root node
        if (node != root && parent.getColor() == "red") {
            Node<E> grandParent = node.getParentNode().getParentNode();
            Node<E> uncle = parent.isItLeftChild()?grandParent.getRightChild() : grandParent.getLeftChild();
            // if uncle node of inserted node is Red then we have to just Recolore the nodes thill we reach root node.
            //if uncle node of inserted node is black then we have to perform rotations and recolor according to situation occure. 
            if (uncle != null && uncle.getColor() == "red") { 
                handleRecoloring(parent, uncle, grandParent);
            } else if (parent.isItLeftChild()) { // handles Left-Left or Left-Right situation
                handleLeftSituations(node, parent, grandParent);
            } else if (!parent.isItLeftChild()) { // handles Right-Right or Right-Left situation
                handleRightSituations(node, parent, grandParent);
            }
        }
        root.setColor("black"); // Color the root node black
    }


    private void handleRightSituations(Node<E> node, Node<E> parent, Node<E> grandParent) {
        if (node.isItLeftChild()) {
            rotateRight(parent);
        }
        parent.flipColor();
        grandParent.flipColor();
        rotateLeft(grandParent);
        recolorAndRotate(node.isItLeftChild() ? grandParent : parent);
    }

    private void handleLeftSituations(Node<E> node, Node<E> parent, Node<E> grandParent) {
        if (!node.isItLeftChild()) {
            rotateLeft(parent);
        }
        parent.flipColor();
        grandParent.flipColor();
        rotateRight(grandParent);
        recolorAndRotate(node.isItLeftChild() ? parent : grandParent);
    }

    private void rotateLeft(Node<E> node) {
        Node<E> rightNode = node.getRightChild();
        node.setRightChild(rightNode.getLeftChild());
        if (node.getRightChild() != null) {
            node.getRightChild().setParentNode(node);
        }
        rightNode.setLeftChild(node);
        rightNode.setParentNode(node.getParentNode());
        updateChildrenOfParentNode(node, rightNode);
        node.setParentNode(rightNode);
    }

    private void updateChildrenOfParentNode(Node<E> node, Node<E> node2) {
        if (node.getParentNode() == null) {
            root = node2;
        } else if (node.isItLeftChild()) {
            node.getParentNode().setLeftChild(node2);
        } else {
            node.getParentNode().setRightChild(node2);
        }
    
    }

    private void rotateRight(Node<E> node) {
        Node<E> leftNode = node.getLeftChild();
        node.setLeftChild(leftNode.getRightChild());
        if (node.getLeftChild() != null) {
            node.getLeftChild().setParentNode(node);
        }
        leftNode.setRightChild(node);
        leftNode.setParentNode(node.getParentNode());
        updateChildrenOfParentNode(node, leftNode);
        node.setParentNode(leftNode);
    }

    private void handleRecoloring(Node<E> parent, Node<E> uncle, Node<E> grandParent) {
        uncle.flipColor();
        parent.flipColor();
        grandParent.flipColor();
        recolorAndRotate(grandParent);
    }

    @Override
    public TreeSetOperation addAll(Collection c) {
        TreeSetOperation<E> temp;
        for (Iterator i = (Iterator) c.iterator(); i.hasNext(); ) 
            temp= add((E) i.next());
        
        return this;
    }

    @Override
    public boolean contains(E data) {

        return checkcontains(data,root);
     
    }

    private boolean checkcontains(E data, Node<E> node) {
        if (node != null) {
            if((node.data.compareTo(data))==0)
            {
                return true;
            }
            else if(node.data.compareTo(data)>0)
            {
                return checkcontains(data, node.getLeftChild());
            }
            else if(node.data.compareTo(data)<0)
            {
                return checkcontains(data, node.getRightChild());
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return root==null;
    }

    @Override
    public void iterator() {
        //Inorder traversal is used.
        //As Tree Set print its element in assending order by default.
        traverse(root);
    }

    public void traverse(Node<E> node) {
        if (node != null) {
            traverse(node.getLeftChild());
            System.out.println(node.data+" "+node.Color);
            traverse(node.getRightChild());
        }
        if(root==null)
        {
            System.out.println("Tree is empty");
        }
    }

    @Override
    public void remove(E data) {
        remove(data,root);
       
    }
      /* Make the tree logically empty */  
      public void empty()  
      {  
          root=null; 
      }  

    public void rootValue(){
        System.out.println(root.data);
    }

    private Node minimum(Node node) {
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
          }
          return node;
    }

    private void rbTransplant(Node u, Node v) {
        if (u.getParentNode() == null) {
            root=v;
          } else if (u==u.getParentNode().getLeftChild()) {
            u.getParentNode().setLeftChild(v);
          } else {
            u.getParentNode().setRightChild(v);
          }
          v.setParentNode(u.getParentNode());
    }

    private void remove(E data, Node<E> node) {
        Node z = null;
        Node x, y;

	//reaching to the desired data is present in tree or not
        while (node != null) {
          if ((node.data.compareTo(data))==0) {
            z = node;
          }
    
          if ((node.data.compareTo(data)) < 0 ) {
            node = node.getRightChild();
          } else {
            node = node.getLeftChild();
          }
        }
    
        if (z == null) {
          System.out.println("Couldn't find data in the tree");
          return;
        }
    
        //z contain node which is equal to data
        y = z;
        String OriginalColor = y.Color;
        
        //Case 1
        if (z.getLeftChild() == null) {
          x = z.getRightChild();
          rbTransplant(z, z.getRightChild());
        } 
        //Case 2
        else if (z.getRightChild() == null) {
          x = z.getLeftChild();
          rbTransplant(z, z.getLeftChild());
        } 
        //
        else {
          y = minimum(z.getRightChild());
          OriginalColor = y.Color;
          x = y.getRightChild();
          //Case 3
          if (y.getParentNode() == z) {//change kerna
            x.setParentNode(y);
          } 

          //Case 4
          else {
            rbTransplant(y, y.getRightChild());
            y.setRightChild(z.getRightChild());
            y.getRightChild().setParentNode(y);
          }
    
          //
          rbTransplant(z, y);
          y.setLeftChild( z.getLeftChild());
          y.getLeftChild().setParentNode(y);
          y.Color = z.Color;
        }
        if (OriginalColor.equals("black")) {
          BalanceDelete(x);
        }

    }

    //Balance the tree after deletion of a node
    //recoloring and rotation
    private void BalanceDelete(Node x) {
        Node s;
    while (x != root && x.Color.equals("black")) {
      if (x == x.getParentNode().getLeftChild()) {
        s = x.getParentNode().getRightChild();
        if (s.Color.equals("red")) {
          s.Color = "black";
          x.getParentNode().Color = "red";
          rotateLeft(x.getParentNode());
          s = x.getParentNode().getRightChild();
        }

        if (s.getLeftChild().Color.equals("black") && s.getRightChild().Color.equals("black")) {
          s.Color = "red";
          x = x.getParentNode();
        } else {
          if (s.getRightChild().Color.equals("black")) {
            s.getLeftChild().Color = "black";
            s.Color = "red";
            rotateRight(s);
            s = x.getParentNode().getRightChild();
          }

          s.Color = x.getParentNode().Color;
          x.getParentNode().Color = "black";
          s.getRightChild().Color = "black";
          rotateLeft(x.getParentNode());
          x = root;
        }
      } else {
        s = x.getParentNode().getLeftChild();
        if (s.Color.equals("red")) {
          s.Color = "black";
          x.getParentNode().Color = "red";
          rotateRight(x.getParentNode());
          s = x.getParentNode().getLeftChild();
        }

        if (s.getRightChild().Color.equals("black") && s.getRightChild().Color.equals("balck")){
          s.Color = "red";
          x = x.getParentNode();
        } else {
          if (s.getLeftChild().Color.equals("balck")) {
            s.getRightChild().Color = "black";
            s.Color = "red";
            rotateLeft(s);
            s = x.getParentNode().getLeftChild();
          }

          s.Color = x.getParentNode().Color;
          x.getParentNode().Color = "black";
          s.getLeftChild().Color = "black";
          rotateRight(x.getParentNode());
          x = root;
        }
      }
    }
    x.Color = "black";

        }

    @Override
    public E getMax() {
        if (isEmpty()) {
            return null;
        }
        return getMax(root);
    }

    private E getMax(Node<E> node) {
        if (node.getRightChild() != null) {
            return getMax(node.getRightChild());
        }
        return node.getData();
    }

    @Override
    public E getMin() {
        if(isEmpty()){
            return null;
        }
        return getMin(root);
    }

    private E getMin(Node<E> node) {
        if(node.getLeftChild()!=null)
        {
            return getMin(node.getLeftChild());
        }
        return node.getData();
    }

    
    
}
