package trees;

import java.util.LinkedHashMap;
import java.util.Map;

public class LeftViewOfTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

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
	
	void leftView(Node root)
    {
      // Your code here
      Map<Node, Integer> queue = new LinkedHashMap<>();
      queue.put(root, 0);
      //System.out.println(queue.toString());
      
      int temp =0;
      System.out.print(root.data);
      
      while(queue.keySet().size()!=0)
      {
          // System.out.println(queue.toString());
          Node n = queue.keySet().iterator().next();
          int ht = queue.get(n);
          queue.remove(n);
          
          if(ht > temp)
          {
              temp++;
              System.out.print(" " + n.data);
          }
          if(n.left!=null)
            queue.put(n.left, ht+1);
          if(n.right!=null)
            queue.put(n.right, ht+1);
      }
    }
}
