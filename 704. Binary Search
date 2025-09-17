class Solution:
    def search(self, nums: List[int], target: int) -> int:
        lo = 0
        hi = len(nums)-1

        while lo <= hi:
            idx = (lo+hi)//2
            number = nums[idx]
            if number > target:
                hi = idx - 1
            elif number < target:
                lo = idx + 1
            else:
                return idx
        return -1
