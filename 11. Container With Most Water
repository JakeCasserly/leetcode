class Solution:
    def maxArea(self, height: List[int]) -> int:
        # Care as much about the width as the height

        L = 0
        R = len(height)-1

        maxArea = 0

        while L < R:
            currentArea = min(height[L], height[R]) * (R-L)
            if currentArea > maxArea:
                maxArea = currentArea
            
            if height[L] < height[R]:
                L += 1
            else:
                R -= 1
        
        return maxArea
