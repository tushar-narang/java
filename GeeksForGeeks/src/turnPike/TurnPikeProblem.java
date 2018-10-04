package turnPike;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class TurnPikeProblem {

	 public static void main( String[] args ) {
	        // DEFINE "L"!!!
	        int[] L = {4,7,3};
	        // DEFINE "L"!!!
	        int[] out = turnpike(L);
	        for(int i = 0; i < out.length; ++i) {
	            System.out.print(out[i] + " ");
	        }
	    }
	    
	    public static int[] turnpike( int[] Lin ) {
	        PriorityQueue<Integer> L = new PriorityQueue<>(Lin.length,Collections.reverseOrder());
	        for(int e : Lin) {
	            if(e > 0) {
	                L.add(e);
	            }
	        }
	        PriorityQueue<Integer> points = new PriorityQueue<>(L.size(),Collections.reverseOrder());
	        points.add(0);
	        points.add(L.poll());
	        if(solveRecursive(L,points)) {
	            int[] out = new int[points.size()];
	            for(int i = out.length-1; i >= 0; --i) {
	                out[i] = points.poll();
	            }
	            return out;
	        }
	        else {
	            return null;
	        }
	    }
	    
	    public static boolean solveRecursive( PriorityQueue<Integer> dist, PriorityQueue<Integer> points ) {
	        if(dist.isEmpty()) {
	            return true;
	        }
	        int maxDist = dist.peek();
	        int maxPoint = points.peek();
	        if(solveRecursive(dist,points,maxDist)) {
	            return true;
	        }
	        else if(solveRecursive(dist,points,maxPoint-maxDist)) {
	            return true;
	        }
	        else {
	            return false;
	        }
	    }
	    
	    public static boolean solveRecursive( PriorityQueue<Integer> dist, PriorityQueue<Integer> points, int pointToAdd ) {
	        Iterator pit = points.iterator();
	        LinkedList<Integer> distsToRemove = new LinkedList<>();
	        while(pit.hasNext()) {
	            int d = Math.abs((Integer)pit.next()-pointToAdd);
	            if(dist.contains(d)) {
	                distsToRemove.add(d);
	            }
	            else {
	                return false;
	            }
	        }
	        for(Integer e : distsToRemove) {
	            dist.remove(e);
	        }
	        points.add(pointToAdd);
	        if(solveRecursive(dist,points)) {
	            return true;
	        }
	        else {
	            points.remove(pointToAdd);
	            for(Integer e : distsToRemove) {
	                dist.add(e);
	            }
	            return false;
	        }
	    }
}
