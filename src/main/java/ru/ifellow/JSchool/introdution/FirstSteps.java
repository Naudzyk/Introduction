package ru.ifellow.JSchool.introdution;

public class FirstSteps {

    public int sum (int x, int y){
        return x + y;
    }

    public int mul (int x, int y){
        return x * y;
    }

    public int div (int x, int y){
        return x / y;
    }

    public int mod (int x, int y){
        return x % y;
    }

    public boolean isEqual (int x, int y){
        return x == y;
    }

    public boolean isGreater (int x, int y){
        return x > y;
    }

    public boolean isInsideRect(int xLeft, int yTop, int xRight, int yBottom, int x, int y){
        return x >= xLeft && x <= xRight && y >= yTop && y <= yBottom;
    }

    public int sum(int[] array){
        int res = 0;
        for (int x : array){
            res += x;
        }
        return res;
    }

    public int mul(int[] array){
        int x = 0;
        if (array != null && array.length != 0) {
            x = 1;
            for (int i : array) {
                x *= i;
            }
        }
        return x;
    }

    public int min(int[] array){
        if(array == null || array.length == 0) return Integer.MAX_VALUE;
        int min = array[0];
        for(int x : array){
            if(min > x) min = x;
        }
        return min;
    }

    public int max(int[] array){
        if(array == null || array.length == 0) return Integer.MIN_VALUE;
        int max = array[0];
        for(int x : array){
            if(max < x) max = x;
        }
        return max;
    }

    public double average(int[] array){
        if(array == null || array.length == 0) return 0;
        long sum = 0;
        for(int x : array){
            sum += x;
        }
        return (double)sum / (double)array.length;
    }

    public boolean isSortedDescendant(int[] array){
        if(array != null || array.length != 0) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] <= array[i+1]) return false;
            }
        }
        return true;
    }

    public void cube(int[]array){
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * array[i] * array[i];
            }

    }

    public boolean find(int[]array, int value){
        for(int x : array){
            if(x == value) return true;
        }
        return false;
    }

    public void reverse(int[]array){
        int left = 0, right = array.length - 1;
        while(left < right){
            int tem = array[left];
            array[left] = array[right];
            array[right] = tem;
            left++;
            right--;
        }
    }

    public boolean isPalindrome(int[]array){
        if (array == null) return false;
        int left = 0, right = array.length - 1;
        while(left < right){
            if(array[left] != array[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public int sum(int[][] matrix){
        int res = 0;
        for(int[] row : matrix){
            for (int x : row){
                res += x;
            }
        }
        return res;
    }

    public int max(int[][] matrix){
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(int[] row : matrix){
            for (int x : row){
                if(max < x) max = x;
            }
        }
        return max;
    }

    public int diagonalMax(int[][] matrix){
        if (matrix == null || matrix.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length && i < matrix[i].length; i++) {
            if (matrix[i][i] > max) {
                max = matrix[i][i];
            }
        }
        return max;
    }

    public boolean isSortedDescendant(int[][] matrix){
        for(int[] row : matrix){
            if(!isSortedDescendant(row)){
                return false;
            }
        }
        return true;
    }

}
