
public class Node<E extends Comparable<E>> {
     E data;

     //By default color is red.
     //if it is root node then it is changed to black while adding
     String Color = "red";
     Node<E> ParentNode;
     Node<E> leftChild;
     Node<E> rightChild;

     Node()
     {}

     Node(E data)
     {
        this.data =data;
     }

     public boolean isItLeftChild() {
        return this == ParentNode.getLeftChild();
    }
    public void flipColor() {
        if(Color.equals("red"))
        {
            Color="black";
        }
        else{
            Color="red";
        }
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Node<E> getParentNode() {
        return ParentNode;
    }

    public void setParentNode(Node<E> parentNode) {
        ParentNode = parentNode;
    }

    public Node<E> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<E> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<E> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<E> rightChild) {
        this.rightChild = rightChild;
    }

    
}



