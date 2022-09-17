public class Main {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numerosTwo = new int[10];

        int h = numeros.length;
        int j = 0;
        for (int i = 0; i < numeros.length / 2; i++) {
            numerosTwo[j++] = numeros[i];
            numerosTwo[j++] = numeros[--h];
        }

        for (int i = 0; i < numerosTwo.length; i++) {
            System.out.println(numerosTwo[i]);
        }
    }
}