#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<vector<int>> result;
        vector<int> solution;
        backtrack(candidates, target, 0, 0, solution, result);
        return result;
    }

    void backtrack(vector<int>& candidates, int target, int start, int currentSum, vector<int>& solution, vector<vector<int>>& result) {
        if (currentSum == target) {
            result.push_back(solution);
            return;
        }
        if (currentSum > target || start == candidates.size()) {
            return;
        }

        backtrack(candidates, target, start + 1, currentSum, solution, result);

        solution.push_back(candidates[start]);
        backtrack(candidates, target, start, currentSum + candidates[start], solution, result);
        solution.pop_back();
    }
};
