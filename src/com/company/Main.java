package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Task 1");
        String s1 = "Hello";
        String s2 = "World";
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(s1 + ", ");
            }
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(s2 + ", ");
            }
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print(s1 + s2 + ", ");
            }
            if (i == 100) {
                System.out.println(100);
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println("Task 2");
        Random rand = new Random();
        int[] array = new int[10];
        double sr = 0;
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(11) + 10;
            sr = sr + array[i];
        }
        sr = sr / 10;
        System.out.println(Arrays.toString(array));
        System.out.println("Average:" + sr);
        System.out.println("Task 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        int ncount = 0;
        for (int i = 1; i < n + 1; i++) {
            if (n % i == 0) {
                ncount++;
            }
        }
        if (ncount == 2) {
            System.out.println("Number is simple");
        } else {
            for (int i = 1; i < n + 1; i++) {
                if (n % i == 0) {
                    System.out.println(i + " ");
                }
            }
        }
        System.out.println("Task 4");

        System.out.println("Task 5");
        for (int i = 1; i < 31; i++) {
            System.out.print("(" + i + ")");
        }
        System.out.println();
        System.out.println("Task 6");
        int m = 5, h = 6, count = 0;
        int[][] arr = new int[m][h];
        int[] arr2 = new int[m * h];
        System.out.println("Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < h; j++) {
                arr[i][j] = rand.nextInt(100);
                System.out.print(arr[i][j] + " ");
                arr2[count] = arr[i][j];
                count++;
            }
            System.out.println();
        }
        Arrays.sort(arr2);
        System.out.println("Sorted array:");
        for (int i = 0; i < m * h; i++) {
            System.out.print(arr2[i] + " ");
            if ((i + 1) % h == 0) {
                System.out.println();
            }
        }
        System.out.println("Task 7");
        getWordCount("file.txt");
        System.out.println("Task 9");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter data: ");
        String data = scan.nextLine();
        System.out.println(Time.time(data));
        System.out.println("Task 11");
        List<Object> objects=new ArrayList<>();
        Object object1=new Object(16,"pineapple");
        Object object2=new Object(15,"apple");
        Object object3=new Object(17,"orange");
        Object object4=new Object(15,"banana");
        Object object5=new Object(25,"chary");
        Object object6=new Object(16,"pepper");
        Object object7=new Object(25,"potato");
        Object object8=new Object(15,"tomato");
        objects.add(object1);
        objects.add(object2);
        objects.add(object3);
        objects.add(object4);
        objects.add(object5);
        objects.add(object6);
        objects.add(object7);
        objects.add(object8);
        System.out.println(objects);
        System.out.println(Object.deleter(objects));
        System.out.println("Task 12");
        Board board = new Board();
        System.out.println(board.count());

    }
    private static class Ball {

    }
    private static class Board {
        private List<Ball> balls=new ArrayList<>();
        public Board() {
            List<Ball> balls = new ArrayList<>();
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }
        public int count() {
            return balls.size();
        }
    }
    public static void getWordCount(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        int words = 0;
        int lines = 0;
        int symbols=0;
        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
            words = words + array.length;
            char[] sArray=scanner.toString().toCharArray();
            symbols=symbols+sArray.length;
        }

        System.out.println("Number of words: " + words);
        System.out.println("Number of lines: " + lines);
        System.out.println("Number of symbols: "+symbols);
        scanner.close();
    }
}
