package FindingtheUsersActiveMinutes;
/**
 * Input: logs = [[0,5],[1,2],[0,2],[0,5],[1,3]], k = 5
 * Output: [0,2,0,0,0]
 * Explanation:
 * The user with ID=0 performed actions at minutes 5, 2, and 5 again. Hence, they have a UAM of 2 (minute 5 is only counted once).
 * The user with ID=1 performed actions at minutes 2 and 3. Hence, they have a UAM of 2.
 * Since both users have a UAM of 2, answer[2] is 2, and the remaining answer[j] values are 0.
 * Приколюха в том, что надо посчитать количество действий в минуту, среди пользователей,
 * Результирующий массив это группировка Индекс:КоличествоДействий, ЗначениеЭлемента: Сумма(КолвоПользователей)
 *
 *
 * */
public class Solution {
    public static void main(String[] args) {

    }
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

    }
}
