package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    public AdjacencyListGraph() {
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if (!(vertices.contains(from) && vertices.contains(to))) {
            System.out.println(" Vertex not found ");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);
        Edge newEdgeReverse = new Edge(to, from, dist);

    }
    public void PrimsMST() {
        int[] Distance = new int[vertices.size()];
        String[] predecessor = new String[vertices.size()];
        boolean[] visited = new boolean[vertices.size()];
        MinHeap<Pair> Q = new MinHeap<>();

        ArrayList<Pair> VertexPairs = new ArrayList<>();
        Arrays.fill(Distance, Integer.MAX_VALUE);
        Arrays.fill(predecessor, "N/A");
        Arrays.fill(visited, false);
        int MST = 0;
        if (vertices.size() > 0) {
            Distance[0] = 0;
            }
            for (int i = 0; i < vertices.size(); i++) {
                VertexPairs.add(new Pair(Distance[i], i));
                Q.Insert(VertexPairs.get(i));
            }

            Vertex currentVertex;
            Edge currentEdge;
                while (!Q.isEmpty()) {
                    Pair u = Q.extractMin();
                    for (int v = 0; v < vertices.size(); v++) {
                        currentVertex = vertices.get(v);
                        for (int j = 0; j < currentVertex.getOutEdges().size(); j++) {
                            currentEdge = currentVertex.getOutEdges().get(j);
                            if (currentVertex.getOutEdges().size() > 0 && currentEdge.getWeight() < Distance[v]) {
                                Distance[v] = currentEdge.getWeight();
                                predecessor[v] = currentEdge.getToVertex().getName();
                                int pos = Q.getPosition(VertexPairs.get(v));
                                VertexPairs.get(v).distance = currentEdge.getWeight();
                                Q.decreasekey(pos);
                            }

                        }
                    }
                    MST+=Distance[u.index];
                }

        System.out.println("Minimum spanning Distance: " + MST);
                for (int i = 0; i< vertices.size(); i++){
                    System.out.println("Parent "+ predecessor[i] + " to " + vertices.get(i).getName() + " EdgeWeight: " + Distance[i]);
                }
        System.out.println(" ");
                System.out.println("Total pris for ledninger: " + (MST * 100000) + " DKK");
            }






        public void printGraph() {
            Vertex currentV;
            for (int i = 0; i < vertices.size(); i++) {
                currentV = vertices.get(i);
                System.out.println("Edges from Vertex: " + currentV.getName());
                for (int j = 0; j < currentV.getOutEdges().size(); j++) {
                    Edge currentE = currentV.getOutEdges().get(j);
                    System.out.println("To " + currentE.getToVertex().getName() + " weight " + currentE.getWeight());
                }
                System.out.println(" ");
            }
        }

    }

    class Vertex implements Comparable<Vertex> {
        private String Name;
        private ArrayList<Edge> outEdges;
        Integer dist = Integer.MAX_VALUE;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public ArrayList<Edge> getOutEdges() {
            return outEdges;
        }

        public void setOutEdges(ArrayList<Edge> outEdges) {
            this.outEdges = outEdges;
        }

        public void setDist(Integer dist) {
            this.dist = dist;
        }

        public Integer getDist() {
            return dist;
        }

        public Vertex(String id) {
            this.Name = id;
            outEdges = new ArrayList<>();
        }

        public void addOutEdge(Edge newEdge) {
            outEdges.add(newEdge);
        }


        @Override
        public int compareTo(Vertex o) {
            if (this.dist < o.dist)
                return -1;
            if (this.dist > o.dist)
                return 1;
            return 0;
        }
    }

    class Edge {
        private Vertex fromVertex;
        private Vertex toVertex;
        private Integer weight;

        public Vertex getFromVertex() {
            return fromVertex;
        }

        public void setFromVertex(Vertex fromVertex) {
            this.fromVertex = fromVertex;
        }

        public Vertex getToVertex() {
            return toVertex;
        }

        public void setToVertex(Vertex toVertex) {
            this.toVertex = toVertex;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public Edge(Vertex from, Vertex to, Integer cost) {
            fromVertex = from;
            toVertex = to;
            weight = cost;
            from.addOutEdge(this);
        }
    }

    class Pair implements Comparable<Pair> {
        Integer distance;
        Integer index;

        public Pair(Integer distance, Integer index) {
            this.distance = distance;
            this.index = index;
        }

        @Override
        public int compareTo(Pair p) {
            return this.distance.compareTo(p.distance);
        }
    }

