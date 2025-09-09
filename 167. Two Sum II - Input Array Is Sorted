class Solution(object):
    def twoSum(self, numbers, target):
        """
        :type numbers: List[int]
        :type target: int
        :rtype: List[int]
        """
        
        p1 = 0
        p2 = len(numbers) - 1

        while p1 < p2:
            if target < numbers[p1] + numbers[p2]:
                p2 -= 1
            elif target > numbers[p1] + numbers[p2]:
                p1 += 1
            else:
                return [p1+1, p2+1]
