class Solution {
public:
    int majorityElement(vector<int>& nums) {
        map<int, int> map;
        for(int i=0;i<nums.size();i++){
            map[nums[i]]++;
        }
        int maxVal=0;
        int num;
        for(auto it: map){
            if(it.second>maxVal){
                maxVal=it.second;
                num=it.first;
            }
        }
        return num;

    }
};