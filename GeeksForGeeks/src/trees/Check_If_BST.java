package trees;

import java.util.ArrayList;
import java.util.Stack;

public class Check_If_BST {

	class Node
	{
	    int data;
	    Node left, right;
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	} 
	
	int isBST(Node root)  
    {
        // Your code here
        Stack<Node> stack = new Stack<Node>();
        Node curr;
        curr = root;
        //stack.push(curr);
        
        ArrayList<Integer> arr = new ArrayList<>();
        while(curr != null || stack.size() >0)
        {
            while(curr != null)
            {
                stack.push(curr);
                curr = curr.left;
                //System.out.println("stack:" + stack.toString() );
            }
            
            curr = stack.pop();
            
            //System.out.print(curr.data + " ");
            arr.add(curr.data);
            curr = curr.right;
        }
       // System.out.println(arr.toString());
        
        for(int i=0;i< arr.size()-1;i++)
        {
            if(arr.get(i) > arr.get(i+1))
                return 0;
        }
        return 1;
    }
}
