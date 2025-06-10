public class Solution {

    public static void main(String[] args) {
        //BufferedReader br = new BufferedReader();
        //String s = "abciiidef";
        //Por enunciado ya sabemos que la cadena viene en minusculas
        String s = "a".repeat(100000);
        System.out.println(
        maxVowels( s,50000));
    }

    public static int maxVowels(String s, int k) {
        int max = 0;
        // Primera ventana
        for(int i=0; i<k; i++) {
            if(esVocal(s.charAt(i)))
                max++;
        }
        // Resto de la cadena
        int aux = max;
        for(int i=k; i < s.length(); i++) {
            if((esVocal(s.charAt(i-k))))
                aux--;
            if((esVocal(s.charAt(i))))
                aux++;
            if(aux > max)
                max = aux;
        }

        return max;
    }

    public static boolean esVocal(char c)
    {
        return (c == 'a' || c == 'e'
                         || c == 'i' || c == 'o'
                         || c == 'u');
    }
}