
public class P156_ImplementBinaryTreeDataStructure {

	  static class Node{
		   int data;
		   Node left;
		   Node right;

		   
		   Node(int data) {
			   this.data = data;
			   this.left = null;
			   this.right = null;
		   }}
		   
		   static class BinaryTree{
			   static int idx = -1;
			   public static Node buildTree(int nodes[]) {
				   idx++;
				   if(nodes[idx]==-1) {
					   return null;
				   }
				Node newNode = new Node(nodes[idx]);
				newNode.left = buildTree(nodes);
				newNode.right = buildTree(nodes);
				return newNode;
				
				   
			   }
		   }
		   
		   
	  
	  
	  
	  public static void main(String[] args) {
		int nodes[] = {1,3,-1,4,-1,-1,2,5,2};
		BinaryTree s = new BinaryTree();
		Node root = s.buildTree(nodes);
		System.out.println(root.data);
	}
	  
}
