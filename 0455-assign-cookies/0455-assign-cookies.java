class Solution {
    public int findContentChildren(int[] g, int[] s) {
        //g->children s-> cookies
        int nchild=g.length;
        int ncook=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        while(l<nchild && r<ncook){
            if(g[l]<=s[r]){
                l++;
                r++;
            }
            else{
                r++;
            }
        }
        return l;
    }
}