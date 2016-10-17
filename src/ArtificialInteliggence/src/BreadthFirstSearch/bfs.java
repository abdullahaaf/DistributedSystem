/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BreadthFirstSearch;
import java.util.*;
/**
 *
 * @author vectorr
 */
public class bfs {
    static class Node
    {
        int data;
        boolean visited;

        public Node(int data) {
            this.data = data;
        }
        
    }
    
    private Queue<Node> queue;
    static ArrayList<Node> nodes = new ArrayList<Node>();
    
        public bfs()
        {
            queue = new LinkedList<Node>();
        }
        
       // menemukan tetangga node menggunakan matrix adjacency
        
       public ArrayList<Node> findneighbours (int am[][],Node x )
       {
           int nodeIndex = -1;
           
           ArrayList<Node> neighbours = new ArrayList<Node>();
           for (int i = 0 ; i < nodes.size() ; i++)
           {
               if (nodes.get(i).equals(x))
               {
                   nodeIndex = i;
                   break;
               }
           }
           
           if (nodeIndex != -1)
           {
               for (int j = 0 ; j < am[nodeIndex].length ; j++)
               {
                   if (am[nodeIndex][j]==1)
                   {
                       neighbours.add(nodes.get(j));
                   }
               }
           }
           
           return neighbours;
       }
       
       public void breadth (int am[][], Node node)
       {
           queue.add(node);
           node.visited = true;
           while (!queue.isEmpty()) {               
               Node element = queue.remove();
               System.out.println(element.data + "\t");
               ArrayList<Node> neighbours = findneighbours(am, element);
               for (int i = 0 ; i < neighbours.size() ; i++)
               {
                   Node n = neighbours.get(i);
                   if (n!= null && !n.visited)
                   {
                       queue.add(n);
                       n.visited = true;
                   }
               }
           }
       }
       
       public static void main(String[] args) {
        Node node40 = new Node(40);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node50 = new Node(50);
        Node node10 = new Node(10);
        Node node60 = new Node(60);
        Node node70 = new Node (70);
        
        int adjacency[][] =
        {
            {0,1,1,0,0,0,0}, // node 1 = 40
            {0,0,0,1,0,0,0}, // node 2 = 20
            {0,0,1,1,0,0,1}, // node 3 = 30
            {0,0,0,0,0,1,0}, // node 4 = 50
            {0,1,0,1,0,1,0}, // node 5 = 10
            {0,0,0,0,1,1,1}, // node 6 = 60
            {1,1,1,0,0,0,1}, // node 7 = 70
        };
        
           System.out.println("BFS Traversal adalah : ");
           bfs example = new bfs();
           example.breadth(adjacency, node40);
    }
}
