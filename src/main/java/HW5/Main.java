package HW5;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        uniform(10000000);
        System.out.println();
        separate(10000000,2);
        System.out.println();


    }

    private static void uniform(int size){
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.printf("First method running time %s \n",String.valueOf(b-a));

    }

    private static void separate(int size, int numberOfParts){
        int h = size / numberOfParts;
        float[] arr = new float[size];
        Arrays.fill(arr, 1.0f);
        float [] [] arrays = new float[numberOfParts] [h];
        long a = System.currentTimeMillis();
        for (int i = 0; i < numberOfParts; i++) {
            float[] temp = new float[h];
            System.arraycopy(arr, h * (i+1) - h, temp, 0, h);
            arrays [i] = temp;
        }
        long b = System.currentTimeMillis();
        System.out.printf("Second method separation running time %s \n",String.valueOf(b-a));

        Thread [] threads = new Thread[numberOfParts];
        for (int i = 0; i < arrays.length; i++) {
            int finalI = i;
            threads [i] = new Thread(() -> thread(arrays[finalI], (finalI +1)));
            threads[i].start();
        }

        try {
            for (Thread thread : threads) {
                thread.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        a = System.currentTimeMillis();
        for (int i = 0; i < numberOfParts; i++) {
            System.arraycopy(arrays[i], 0, arr, h * (i + 1) - h, h);
        }
        b = System.currentTimeMillis();
        System.out.printf("Second method connection running time %s \n",String.valueOf(b-a));



    }

    private static void thread (float[] arr, int thread){
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long b = System.currentTimeMillis();
        System.out.printf("Second method thread %s running time %s \n",thread,String.valueOf(b-a));
    }

}
