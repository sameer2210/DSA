package d1;

import java.util.ArrayList;
import java.util.Scanner;

public class ImplementationGraph {
    static void graphByMatrix(int mat[][] , int u , int v , Boolean isDirected) {
        if (isDirected){
            mat[u][v] =1;
        }else {
            mat[u][v] =1;
            mat[v][u] =1;
        }
    }

    static void graphByList(ArrayList<ArrayList<Integer>> adj , int u , int v, Boolean isDirected){
        if (isDirected){
            adj.get(u).add(v);
        }else{
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
      /* int mat[][] = new int[v][v];
        graphByMatrix(mat , 0,1, false);
        graphByMatrix(mat , 1,2, false);
        graphByMatrix(mat , 0,2, false);

        for (int i=0;i<mat.length;i++){
            System.out.println(Arrays.toString(mat[i]));
        }

       */


        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0;i<v;i++){
            list.add(new ArrayList<>());
        }
        graphByList(list, 0,1,false);
        graphByList(list, 0,2,false);
        graphByList(list, 1,2,false);
        graphByList(list, 2,3,false);
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
