import java.io.BufferedReader;
import java.util.HashMap;

class Solution {

    /* public static void main(String[] args) {
        //BufferedReader br = new BufferedReader();
        twoSum(new int[]{2, 7, 11, 15}, 9);
    } */

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        // Este for se puede obviar y es mas optimo
        for(int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        int encontrado = -1;

        for(int i=0; i < nums.length; i++) {
            // podria calcular el complemento en esta linea
            encontrado = (hm.get(target-nums[i]) != null) 
                ? hm.get(target-nums[i]) 
                : -1;
            if(encontrado!=-1 && i!=encontrado) {
                return new int[]{i, encontrado};
            }
            // y guardar el complemento en hm en esta linea
        }
        return null;
    }
}