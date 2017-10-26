class Main {
  public static void main(String[] args) {
    System.out.println("hello world");
    BinaryTree tree = new BinaryTree(); 
    tree.insert(null, null, 500);
    tree.insert(null, null, 100);
    tree.insert(null, null, 600);
    tree.insert(null, null, 700);
  }
}

class BinaryTree{
  Node root;
  void insert(Node node, Node parent, int num){
    
    if(root == null){
      root = new Node(num);
      System.out.println("Inserted " + num + " at root");
      return; 
    }
    
    if(parent == null){
      parent = root; 
    }
    
    if(node == null){
        if(parent.value < num){
          parent.right = new Node(num);
          System.out.println("Inserted " + num + " right");
          return; 
        }else{
          parent.left = new Node(num);
          System.out.println("Inserted " + num + " left");
          return; 
        }
    }else{
      if(num > node.value){
        insert(node.right, node, num);
        return;
      }else{
        insert(node.left, node, num); 
        return;
      }
    }
  }
}

class Node{
  Node parent; 
  Node left; 
  Node right; 
  int value; 
  
  Node(int num){
    this.value = num; 
  }
  
}