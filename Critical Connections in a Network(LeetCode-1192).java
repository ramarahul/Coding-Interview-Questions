//Great explanation for this problem can be found here: https://www.youtube.com/watch?v=erlX-1MJlv8



class Solution {
    
    int[] visitedTimes;
    int[] lowTimes;
    List<List<Integer>> criticalConnections;
    ArrayList<Integer>[] graph;
    int time;
    
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        visitedTimes = new int[n];
        lowTimes = new int[n];
        time=0;
        graph = new ArrayList[n];
        criticalConnections = new ArrayList<>();
        buildGraph(connections,n);
        boolean[] visited = new boolean[n];
        dfs(visited,0,-1);
        
        return criticalConnections;
    }
    
    public void dfs(boolean[] visited, int currNode, int parentNode){
        visited[currNode] = true;
        visitedTimes[currNode] = lowTimes[currNode] = time++;
        
        for(int neighbour: graph[currNode]){
            if(neighbour==parentNode){
                continue;
            }
            
            if(visited[neighbour]){
                lowTimes[currNode] = Math.min(lowTimes[currNode], visitedTimes[neighbour]);
            }
            else{
                
                dfs(visited, neighbour, currNode);
                lowTimes[currNode] = Math.min(lowTimes[currNode],lowTimes[neighbour]);
                if(visitedTimes[currNode]<lowTimes[neighbour]){
                    criticalConnections.add(Arrays.asList(currNode,neighbour));
                }
            }
        }
    }
    
    public void buildGraph(List<List<Integer>> connections, int n){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<Integer>();
        }
        
        for(List<Integer> connection : connections){
            graph[connection.get(0)].add(connection.get(1));
            graph[connection.get(1)].add(connection.get(0));
        }
    }
}
