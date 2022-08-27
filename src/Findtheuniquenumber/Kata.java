package Findtheuniquenumber;

// Make sure your class is public
public class Kata {
    public static double findUniq(double[] arr) {
        if (arr.length == 0) return 0;

        var x0 = arr[0];
        var x1 = arr[1];
        var x2 = arr[2];
        var mainValue = 0d;
        if (x0 == x1) {
            mainValue = x0;
        } else if (x0 == x2) {
            mainValue = x0;
        } else {
            mainValue = x1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != mainValue) return arr[i];
        }
        return 0d;
    }
}