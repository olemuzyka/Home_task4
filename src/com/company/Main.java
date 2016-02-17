package com.company;

public class Main {

    public static void main(String[] args) {
        //TASK_1-------------------------------------------
        int[][] arrayC = new int[3][3];
        for (int i = 0; i < arrayC.length; i++) {
            for (int j = 0; j < arrayC.length; j++) {
                arrayC[i][j] = (int) (Math.random() * 100);
                System.out.print(arrayC[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int[][] arrayD = new int[3][3];
        for (int i = 0; i < arrayD.length; i++) {
            for (int j = 0; j < arrayD.length; j++) {
                arrayD[i][j] = (int) (Math.random() * 100);
                System.out.print(arrayD[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" SUM ");
        int[][] arrayX = new int[3][3];
        for (int i = 0; i < arrayX.length; i++) {
            for (int j = 0; j < arrayX.length; j++) {
                arrayX[i][j] = arrayC[i][j] + arrayD[i][j];
                System.out.print(arrayX[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" multiplication ");
        int[][] arrayZ = new int[3][3];
        for (int i = 0; i < arrayZ.length; i++) {
            for (int j = 0; j < arrayZ.length; j++) {
                arrayZ[i][j] += arrayC[i][j] * arrayD[i][j];
                System.out.print(arrayZ[i][j] + " ");
            }
            System.out.println(" ");
        }
        //Task_2----------------------------------------
//        int[][] array = new int[5][5];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = (int) (Math.random() * 21) - 10;
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i][j] < 0) {
//                    System.out.println("Array: " + i + " " + j + " ");
//                }
//
//            }
//        }
            //TASK_3---------------------------------------------
//        int[]arr = new int[40];
//        for (int i = 0; i <arr.length ; i++) {
//            arr[i]=(int)(Math.random()*200)+100;
//           System.out.print(arr[i]+ " ");
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i <arr.length ; i++) {
//            if(max<arr[i]){
//                max=arr[i];
//            }
//            if(min>arr[i]){
//                min=arr[i];
//            }
//            System.out.println("MAX: " + max);
//            System.out.println("MIN: " + min);
//
//        }

    }
}
