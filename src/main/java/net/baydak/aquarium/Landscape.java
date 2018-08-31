package net.baydak.aquarium;

import java.util.*;

public class Landscape {
    private String landscapeLineStr;
    private int[] landscapeLineInt;


    public int calculateVolume(int[] landscapeLineInt) {
        int volume = 0;
        boolean zeroPosBool = false;
        int zeroPosIndex = landscapeLineInt.length;

        int leftMax = 0;
        int rightMax = 0;
        int left;
        int right;

        for (int i = 0; i < landscapeLineInt.length - 1; i++) {
            if (landscapeLineInt[i] == 0) {
                continue;
            } else {
                for (int j = i + 1; j < landscapeLineInt.length; j++) {
                    if (landscapeLineInt[j] == 0) {
                        zeroPosBool = true;
                        zeroPosIndex = j;
                        break;
                    }
                }
                if (zeroPosBool) {
                    left = i;
                    right = zeroPosIndex - 1;
                    i = zeroPosIndex;
                } else {
                    left = i;
                    right = landscapeLineInt.length - 1;
                    i = landscapeLineInt.length;
                }
                zeroPosBool = false;
            }

            while (left < right) {
                if (landscapeLineInt[left] > leftMax) {
                    leftMax = landscapeLineInt[left];
                }
                if (landscapeLineInt[right] > rightMax) {
                    rightMax = landscapeLineInt[right];
                }
                if (leftMax >= rightMax) {
                    volume += rightMax - landscapeLineInt[right];
                    right--;
                } else {
                    volume += leftMax - landscapeLineInt[left];
                    left++;
                }
            }

            leftMax = 0;
            rightMax = 0;
            leftMax = 0;
            rightMax = 0;
        }
        System.out.println();

        return volume;
    }


    public static int[] parseStringToIntArr(String arr) {

        String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

        int[] results = new int[items.length];

        for (int i = 0; i < items.length; i++) {
            try {
                results[i] = Integer.parseInt(items[i]);
            } catch (NumberFormatException nfe) {
                //NOTE:
            }

        }
        return results;
    }

    public void arr1dTO2d (String arrStr) {
        int[] arr = Landscape.parseStringToIntArr(arrStr);
        int max = arr[0];

        System.out.println("Введённый массив: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i ++) {
            if (arr[i] > max) max = arr[i];
        }

        char[][] arr2d = new char[max][arr.length];

        for (int i = 0; i < arr2d.length; i ++) {
            for (int j = 0; j < arr2d[i].length; j ++) {

                if (max - i - arr[j] <= 0) {
                    arr2d[i][j] = 'M';
                } else arr2d[i][j] = ' ';

                System.out.print(arr2d[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public Landscape() {
    }

    public Landscape(String landscapeLineStr) {
        this.landscapeLineStr = landscapeLineStr;
    }

    public String getLandscapeLineStr() {
        return landscapeLineStr;
    }

    public void setLandscapeLineStr(String landscapeLineStr) {
        this.landscapeLineStr = landscapeLineStr;
    }

    @Override
    public String toString() {
        return "Landscape{" +
                "landscapeLineInt=" + Arrays.toString(landscapeLineInt) +
                '}';
    }
}

