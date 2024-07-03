class Solution {
    public double maxProbability(int n, int[][] edges, double[] s, int start, int end) {
        //build adjList, g[i] stores {neib of i, weigth}
        List<Pair>[] g = new ArrayList[n];
        for(int i=0; i<n; i++){
            g[i] = new ArrayList<>();
        }
        for(int i = 0; i<edges.length; i++){
            g[edges[i][0]].add(new Pair(edges[i][1], s[i]));
            g[edges[i][1]].add(new Pair(edges[i][0], s[i]));
        }
        
        // init a pq, put {parent node, probability}, bigger probability will be polled out first
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {  
            public int compare(Pair a, Pair b) {
                if(a.prob < b.prob) return 1;
                else if(a.prob > b.prob) return -1;
                return 0;
            }
        }); 
        //add start node, init probability = 1
        pq.offer(new Pair(start, 1));
        
        Set<Integer> visited = new HashSet<>();
        
        double res = Integer.MIN_VALUE;
        
        while(!pq.isEmpty()){
            Pair cur = pq.poll();
            if(cur.node == end) res = Math.max(res, cur.prob);
            visited.add(cur.node);
            for(Pair next : g[cur.node]){
                if(!visited.contains(next.node)){
                    pq.offer(new Pair(next.node, next.prob * cur.prob));
                }
            }
            
        }
        //if res is MIN, it means we cannot reach the end node     
        return res== Integer.MIN_VALUE? 0 : res;
    }
	
    class Pair{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
    }
}