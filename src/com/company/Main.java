package com.company;

import java.security.spec.EncodedKeySpec;

public class Main {

    public static void main(String[] args) {

        AdjacencyListGraph adjGraph = new AdjacencyListGraph();
        Vertex Eskildstrup = new Vertex ("Eskildstrup");
        adjGraph.addVertex(Eskildstrup);
        Vertex Haslev = new Vertex("Haslev");
        adjGraph.addVertex(Haslev);
        Vertex Jægerspris = new Vertex("Jærgerspris");
        adjGraph.addVertex(Jægerspris);
        Vertex Kalundborg = new Vertex("Kalundborg");
        adjGraph.addVertex(Kalundborg);
        Vertex Korsør = new Vertex("Korsør");
        adjGraph.addVertex(Korsør);
        Vertex Køge = new Vertex("Køge");
        adjGraph.addVertex(Køge);
        Vertex Maribo = new Vertex("Maribo");
        adjGraph.addVertex(Maribo);
        Vertex Næstved = new Vertex("Næstved");
        adjGraph.addVertex(Næstved);
        Vertex Ringsted = new Vertex("Ringsted");
        adjGraph.addVertex(Ringsted);
        Vertex Slagelse = new Vertex("Slagelse");
        adjGraph.addVertex(Slagelse);
        Vertex NykøbingF  = new Vertex("NykøbingF");
        adjGraph.addVertex(NykøbingF);
        Vertex Vordingborg = new Vertex("Vordingborg");
        adjGraph.addVertex(Vordingborg);
        Vertex Sorø = new Vertex("Sorø");
        adjGraph.addVertex(Sorø);
        Vertex Nakskov = new Vertex("Nakskov");
        adjGraph.addVertex(Nakskov);
        Vertex Roskilde = new Vertex("Roskilde");
        adjGraph.addVertex(Roskilde);
        Vertex Holbæk = new Vertex("Holbæk");
        adjGraph.addVertex(Holbæk);


        adjGraph.newEdge(Eskildstrup,Maribo, 28);
        adjGraph.newEdge(Eskildstrup,NykøbingF, 13);
        adjGraph.newEdge(Eskildstrup, Vordingborg, 24);
        adjGraph.newEdge(Haslev,Korsør, 60);
        adjGraph.newEdge(Haslev,Køge, 24);
        adjGraph.newEdge(Haslev,Næstved, 25);
        adjGraph.newEdge(Haslev,Ringsted, 19);
        adjGraph.newEdge(Haslev,Roskilde, 47);
        adjGraph.newEdge(Haslev,Slagelse, 48);
        adjGraph.newEdge(Haslev,Sorø, 34);
        adjGraph.newEdge(Haslev,Vordingborg, 40);
        adjGraph.newEdge(Holbæk,Jægerspris, 34);
        adjGraph.newEdge(Holbæk,Kalundborg, 44);
        adjGraph.newEdge(Holbæk, Korsør, 66);
        adjGraph.newEdge(Holbæk,Ringsted, 36);
        adjGraph.newEdge(Holbæk, Roskilde,32);
        adjGraph.newEdge(Holbæk, Slagelse, 46);
        adjGraph.newEdge(Holbæk, Sorø, 34);
        adjGraph.newEdge(Jægerspris, Korsør, 95);
        adjGraph.newEdge(Jægerspris,Køge, 58);
        adjGraph.newEdge(Jægerspris, Ringsted, 56);
        adjGraph.newEdge(Jægerspris, Roskilde, 33);
        adjGraph.newEdge(Jægerspris, Slagelse, 74);
        adjGraph.newEdge(Jægerspris, Sorø, 63);
        adjGraph.newEdge(Kalundborg, Ringsted, 62);
        adjGraph.newEdge(Kalundborg, Roskilde, 70);
        adjGraph.newEdge(Kalundborg, Slagelse, 39);
        adjGraph.newEdge(Kalundborg, Sorø, 51);
        adjGraph.newEdge(Korsør, Næstved, 45);
        adjGraph.newEdge(Korsør, Slagelse, 20);
        adjGraph.newEdge(Køge, Næstved, 45);
        adjGraph.newEdge(Køge, Ringsted, 28);
        adjGraph.newEdge(Køge, Roskilde, 25);
        adjGraph.newEdge(Køge, Vordingborg, 60);
        adjGraph.newEdge(Maribo, Nakskov, 27);
        adjGraph.newEdge(Maribo, NykøbingF, 26);
        adjGraph.newEdge(Næstved, Roskilde, 57);
        adjGraph.newEdge(Næstved, Ringsted, 26);
        adjGraph.newEdge(Næstved, Slagelse, 37);
        adjGraph.newEdge(Næstved, Sorø, 32);
        adjGraph.newEdge(Næstved, Vordingborg, 28);
        adjGraph.newEdge(Ringsted, Roskilde, 31);
        adjGraph.newEdge(Ringsted, Sorø, 15);
        adjGraph.newEdge(Ringsted, Vordingborg, 58);
        adjGraph.newEdge(Slagelse, Sorø, 14);

        //adjGraph.printGraph();
        adjGraph.PrimsMST();

    }
}
