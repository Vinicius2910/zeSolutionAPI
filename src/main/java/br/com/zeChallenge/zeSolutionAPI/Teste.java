package br.com.zeChallenge.zeSolutionAPI;

import java.io.IOException;

public class Teste {

        // Complete the getSequenceSum function below.
        static long getSequenceSum(int i, int j, int k) {
            i= 0;
            j=5;
            k=-1;
            int valor = 0;

            int valorA =  sumSequence(i, j);
            System.out.println("Soma 1: -"+ valor);
            int valorB = sumSequence(j,k);
            System.out.println("Soma 2: -"+ valor);

            return valorA + valorB;

        }

    public static int sumSequence(int a, int b){
        int result = 0;
        if(a>b){
            for(int count = a; a >= b; a--){
                System.out.println(a);
                result += a;
            }
        }
        else{
            for(int count = a; a <= b; a++){
                System.out.println(a);
                result += a;
            }
        }
        return result;
    }



    public static void main(String[] args) throws IOException {
            getSequenceSum(0, 5, -1);
        }
}
