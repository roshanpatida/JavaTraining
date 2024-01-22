

class Node{
	int data;
	Node left;
	Node right;
	
	Node(int data){
		 this.data = data;
		 this.left = null;
		 this.right= null;
	}
	
	
}
public class P160_Countnumberofleafnodesinatree {

	Node root;
	
	P160_Countnumberofleafnodesinatree(){
		root = null;
	}
	
	public static int countLeaf(Node node) {
		if(node == null) {
			return 0;
		}
		if(node.left == null && node.right == null) {
			return 1;
		}
		else {
		return countLeaf(node.left) + countLeaf(node.right);
	}
		}
	
	public static void main(String[] args) {
		P160_Countnumberofleafnodesinatree  tree = new P160_Countnumberofleafnodesinatree();
		tree.root = new Node(4);
		tree.root.left = new Node(1);
		
		
		int leaf = countLeaf(tree.root);
		System.out.println(leaf);
	}
}
