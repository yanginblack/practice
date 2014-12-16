public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<numbers.length; i++) {
                int value = numbers[i];
                if (map.containsKey(target-value)) {
                    return new int[] {map.get(target-value)+1, i+1};
                }
                else 
                    map.put(value, i);

        }
        return new int[] {0, 0};
    }

    public int[] twoSum_bruteforce(int[] numbers, int target) {
        int remaining = 0;
        for (int i=0; i<numbers.length(); i++) {
            if (numbers[i] >= target) continue; 
            remaining = target - numbers[i];
            for (int j=i; j<numbers.length();j++) {
                if (numbers[j] == remaining) {
                    if (numbers[i] < numbers[j]) return array(i, j);
                    else return array(j, i);
                }
            }
        }
    }
}