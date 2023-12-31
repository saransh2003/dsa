class Solution:
  # TC - O(n^2( 1-for loop, 2-while loop ) x nlogn( for sorting ))
  # SC - O(n)
    def threeSumClosest(self, nums, target):
        output = float('inf')
        nums = sorted(nums)

        # check if the addition of first 3 element is greater than 0 no need to go further
        temp = sum(nums[:3])
        if temp > target:
            return temp

            # check if the addition of last 3 element is less than 0 no need to go further
        temp = sum(nums[-3:])
        if temp < target:
            return temp

        for i in range(len(nums[:-2])):
            if nums[i] == nums[i-1] and i > 0:
                continue

            left = i+1
            right = len(nums)-1

            while left < right:
                sumHere = nums[i]+nums[left]+nums[right]
                if sumHere == target:
                    return sumHere
                if abs(sumHere - target) < abs(output - target):
                    output = sumHere
                if target >= sumHere:
                    left += 1
                    while left < right and nums[left] == nums[left-1]:
                        left += 1
                else:
                    right -= 1
        return output
