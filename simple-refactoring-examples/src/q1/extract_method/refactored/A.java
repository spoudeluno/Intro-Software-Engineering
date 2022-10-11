package q1.extract_method.refactored;

import java.util.List;




public class A {
		
   Node m1(List<Node> nodes, String p) {
	  extractedMethod(nodes, p);
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	  extractedMethod(edgeList, p);
      return null;
   }

   <T extends NodesOrEdges> void extractedMethod(List<T> nodesOrEdges, String p)
   {
   	for (T nodeOrEdge : nodesOrEdges) {
   		if (nodeOrEdge.contains(p))
   			System.out.println(nodeOrEdge);
   	}
   }
}


class NodesOrEdges{
    String name;
	public boolean contains(String p) {
	      return name.contains(p);
	   }

}

class Node extends NodesOrEdges{  
}

class Edge extends NodesOrEdges{
}