class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int[] col=new int[n];
        Arrays.fill(col,-1);
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
                while(!q.isEmpty()){
                    int curr=q.remove();
                    for(int neigh:graph[curr]){
                        if(col[neigh]==-1){
                            col[neigh]=col[curr]==0?1:0;
                            q.add(neigh);
                        }
                        else if(col[neigh]==col[curr]){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}