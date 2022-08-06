package AverageSalaryExcludingtheMinimumandMaximumSalary;

public class Solution {
    public static void main(String[] args) {
        int [] aa = new int[]{4000,3000,1000,2000};
        System.out.println(average(aa));
    }
    public static double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = 0;
        for (int i = 0; i < salary.length; i++) {
            var curValue = salary[i];
            if (curValue>maxSalary)maxSalary = curValue;
            if (curValue<minSalary)minSalary = curValue;
        }
        double totalSalary = 0;
        int counter = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] == maxSalary || salary[i] == minSalary) continue;
            totalSalary += salary[i];
            counter++;
        }
        return totalSalary / counter;
    }
}
