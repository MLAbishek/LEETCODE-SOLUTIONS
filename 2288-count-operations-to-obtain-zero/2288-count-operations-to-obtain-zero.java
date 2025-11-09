class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        if(num1==num2){
            if(num1==0) return 0;
            return 1;
        }

        while(num1!=0 && num2!=0){
            if(num1>num2){
                int temp=num1-num2;
                num1=temp;
                count++;

            }
            else{
                int temp=num2-num1;
                num2=temp;
                count++;
            }
            System.out.println(num1+" "+num2);
        }
        return count;

    }
}