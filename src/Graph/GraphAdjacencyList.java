package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GraphAdjacencyList {
	private List<List<Integer>> adjList;
	 private int maxVerts;
	 private int numVerts;
	 private Vertex[] vertList;
	 
	 public GraphAdjacencyList(int maxVerts){
	  this.maxVerts = maxVerts;
	  numVerts = 0;
	  adjList = new ArrayList<List<Integer>>();
	  vertList = new Vertex[maxVerts];
	  for (int i = 0; i < maxVerts; i++) {
	   adjList.add(new LinkedList<Integer>());
	  }
	 }

	 public void addVertex(char label){
	  if(numVerts < maxVerts){
	   vertList[numVerts++] = new Vertex(label);
	  }
	 }
	 
	 public void addEdge(int src, int dest){
	  if(src < numVerts && dest < numVerts){
	   adjList.get(src).add(dest);
	   adjList.get(dest).add(src);
	  }
	 }
	 
	 public boolean hasEdge(int src, int dest){
	  return adjList.get(src).contains(dest);
	 }
	 
	 public void display(int idx){
	  System.out.print(vertList[idx].label);
	 }
	 
	 public void displayAllEdges(){
	  for (int i = 0; i < adjList.size(); i++) {
	   List<Integer> adjVertex = adjList.get(i);
	   for (int j = 0; j < adjVertex.size(); j++) {
	    System.out.print(""+vertList[i].label+""+vertList[adjVertex.get(j)].label+" ");
	   }
	  }
	  System.out.println();
	 }
	 
	 public static void main(String[] args) {
	  GraphAdjacencyList graph = new GraphAdjacencyList(5);
	  graph.addVertex('A'); //0
	  graph.addVertex('B'); //1
	  graph.addVertex('C'); //2
	  graph.addVertex('D'); //3
	  
	  graph.addEdge(0, 1);
	  graph.addEdge(0, 2);
	  graph.addEdge(1, 2);
	  graph.addEdge(2, 3);
	  
	  graph.displayAllEdges();
	  
	  System.out.println("Vertices adjacent to "+graph.vertList[0].label+" are ");
	  List<Integer> list = graph.adjList.get(0);
	  for (int i = 0; i < list.size(); i++) {
	   System.out.print(graph.vertList[list.get(i)].label);
	  }
	 }
}
