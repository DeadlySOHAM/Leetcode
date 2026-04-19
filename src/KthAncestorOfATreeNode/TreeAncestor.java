package KthAncestorOfATreeNode;

class TreeAncestor {

    public TreeAncestor(int n, int[] parent) {
        this.maxDepth = (int) (Math.log(n) / Math.log(2)) + 1;
        this.ancestors = fillAncestors(n,parent);
    }

    int[][] ancestors;
    int maxDepth;

    private final int[][] fillAncestors(int n, int[] parent) {
        int[][] data = new int[n][this.maxDepth];
        
        for(int i=0;i<parent.length;i++) data[i][0] = parent[i];
        for(int j=1;j<this.maxDepth;j++) {
            for(int i=0;i<parent.length;i++)
                if (data[i][j-1] == -1) data[i][j] = -1;
                else                    data[i][j] = data[data[i][j-1]][j-1];
        }
        return data;
    }

    public int getKthAncestor(int node, int k) {
        for(int i=0;i<maxDepth && node!=-1;i++) {
            if((k & (1 << i)) != 0)
                node = this.ancestors[node][i];
        }
        return node;
    }
}