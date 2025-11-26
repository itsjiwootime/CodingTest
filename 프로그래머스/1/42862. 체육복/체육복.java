import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        

        List<Integer> lostList = new ArrayList<>();
        List<Integer> reserveList = new ArrayList<>();

        for (int l : lost) lostList.add(l);
        for (int r : reserve) reserveList.add(r);

        Iterator<Integer> itL = lostList.iterator();
        while (itL.hasNext()) {
            int l = itL.next();
            if (reserveList.contains(l)) {
                reserveList.remove((Integer) l);
                itL.remove();
            }
        }


        for (Iterator<Integer> it = lostList.iterator(); it.hasNext();) {
            int l = it.next();

            if (reserveList.contains(l - 1)) {
                reserveList.remove((Integer)(l - 1));
                it.remove();
            } else if (reserveList.contains(l + 1)) {
                reserveList.remove((Integer)(l + 1));
                it.remove();
            }
        }


        return n - lostList.size();
    }
}
