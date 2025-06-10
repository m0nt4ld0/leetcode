class Solution {

    /*
     * Implementacion basica del algoritmo de sliding windows
     * Dado un array nums de n elementos, encontrar un subarray de k elementos
     * cuyo promedio sea el máximo posible.
     * De esta manera reduzco la complejidad de una implementacion naive a O(1)
     */
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length < k)
            return -1;

        double acum = 0;
        // Primero calculo la sumatora de todo el array
        for(int i=0; i<k; i++) {
            acum += nums[i];
        }

        double max = acum;
        /* Ahora me voy a desplazar en la ventana de k elementos, primero saco
         * el elemento que quedo atras acum - nums[i-k] y le sumo el que viene + nums[i]
         */
        for(int i=k; i<nums.length; i++) {
            acum = acum - nums[i-k] + nums[i];
            if((acum) > max)
                max = acum;
        }

        return max/k;
    }
    
}