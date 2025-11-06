class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean up=false;
        boolean down=false;
        if(arr.length==1) return false;
        if(arr.length==2 && arr[0]>=arr[1]) return false;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]){
                if(down) return false;
                up=true;
            }
            else if(arr[i-1]>arr[i]){
                down=true;
            }
            else{
                return false;
            }
            if(down && !up) return false;

        }
        if(up && down) return true;
        return false;

    }
    
}