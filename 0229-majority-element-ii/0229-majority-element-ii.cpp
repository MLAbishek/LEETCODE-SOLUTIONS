class Solution {
public:
    vector<int> majorityElement(vector<int>& nums) {
        vector<int> res;
        int candOne = 0 , candTwo = 1;
        int countOne = 0 , countTwo = 0;
        for(int num:nums){
            if(num == candOne && candOne != candTwo){
                countOne++;
            }else if(num == candTwo && candOne != candTwo){
                countTwo++;
            }else if(countOne == 0){
                candOne = num;
                countOne++;
            }else if(countTwo == 0){
                candTwo= num;
                countTwo++;
            }else{
                countOne--;
                countTwo--;
            }
        }
        countOne = countTwo = 0;
        for(int num:nums){
            if(num == candOne) countOne++;
            if(num == candTwo) countTwo++;
        }
        if(countOne > (nums.size() / 3)) res.push_back(candOne);
        if(countTwo > (nums.size()  / 3)) res.push_back(candTwo);
        return res;
    }
};