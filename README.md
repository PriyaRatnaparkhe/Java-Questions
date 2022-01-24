1. Find all the permutations for n = 3: "123""132""213""231""312""321"and return the Kth in the sequence of order.
 Given n and k, return the kth permutation sequence.
 Example 1:
 Input: n = 3, k = 3 Output: "213"
 Example 2:
 Input: n = 4, k = 9 Output: "2314"
 Example 3:
 Input: n = 3, k = 1 Output: "123"
 Constraints:
 1 <= n <= 9
 1 <= k <= n!


2. Given a collection of input numbers and a target number, find all unique combinations in input where the candidate numbers sum to target.
 Each number in input may only be used once in the combination.
 Note: The solution set must not contain duplicate combinations.
 Example 1:
 Input: input = [10,1,2,7,6,1,5], target = 8 Output: [ [1,1,6], [1,2,5], [1,7], [2,6] ]
 Example 2:
 Input: input = [2,5,2,1,2], target = 5 Output: [ [1,2,2], [5] ]


3. From a list of strings, provide the anagrams as a list of lists together.
 Example 1:
 Input: strs = ["eat","tea","tan","ate","nat","bat"] Output: [["bat"],["nat","tan"],["ate","eat","tea"]]


4. Given a list of numbers and target, return target times most frequent elements in ascending order.
 Example 1:
 Input: nums = [1,1,1,1,2,2,2,3,3,4], k = 2 Output: [1,2]
 Example 2:
 Input: nums = [2,2,1,1,1,1,1,3,3,3,3,3,3,3], k = 2 Output: [1,3]
 Constraints:
 1 <= nums.length <= 105
 k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
