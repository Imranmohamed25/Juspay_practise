import java.util.*;
public class Problem1 {
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public static void dfs(int node,boolean vis [] ,ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> ans){
        vis[node]= true;
        ans.add(node);
        for (int it :adj.get(node)){
            if(!vis[it]){
                dfs(it,vis,adj,ans);
            }
        }
    }
    public static ArrayList<Integer> dfsofgraph(int N ,ArrayList<ArrayList<Integer>>adj){
        boolean vis [] = new boolean[N];
        ArrayList<Integer>ans = new ArrayList<>();
        dfs(0,vis,adj,ans);
        return ans;
    }

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int arr[] = new int[size];
        for ( int i =0 ; i< 23;i++){
            adj.add(new ArrayList<>());
//            arr[i]= sc.nextInt();
        }
//        int i= 0;
//        for (int val:arr)
//        {
//            adj.get(i).add(val);
//            i++;
//        }
        adj.get(0).add(4);
        adj.get(1).add(4);
        adj.get(2).add(1);
        adj.get(3).add(4);
        adj.get(4).add(13);
        adj.get(5).add(8);
        adj.get(6).add(8);
        adj.get(7).add(8);
        adj.get(8).add(0);
        adj.get(9).add(8);
        adj.get(10).add(14);
        adj.get(11).add(9);
        adj.get(12).add(15);
        adj.get(13).add(11);
        adj.get(14).add(-1);
        adj.get(15).add(10);
        adj.get(16).add(15);
        adj.get(17).add(22);
        adj.get(18).add(22);
        adj.get(19).add(22);
        adj.get(20).add(22);
        adj.get(21).add(22);
        adj.get(22).add(21);

        ArrayList<Integer> answer = dfsofgraph(23,adj);
        int  n = answer.size();
//        for(int i =0 ;i<n;i++){
//            System.out.println(answer.get(i)+" ");
//        }



        System.out.println(answer.size());
    }
}