package trees;

import java.util.Stack;

public class Print_LeafNodes {

	class Node {
	    int data; //data of the node
	    int hd; //horizontal distance of the node
	    Node left, right; //left and right references
	    public Node(int key)
	    {
	        data = key;
	        hd = Integer.MAX_VALUE;
	        left = right = null;
	    }
	}
	
	public void bottomView(Node root)
    {
		Stack<Node> stack = new Stack<>();
	    Node curr = root;
	    
	    while(curr!= null || stack.size() >0)
	    {
	        while(curr != null)
	        {
	            stack.push(curr);
	            curr = curr.left;
	        }
	        
	        curr = stack.pop();
	        if(curr.left == null && curr.right == null)
	            System.out.print(curr.data + " ");
	            
	        curr = curr.right;
	    }
    }
    
}
