class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String[] v = video_len.split(":");
        int video_mm = Integer.parseInt(v[0]);
        int video_ss = Integer.parseInt(v[1]);

        String[] p = pos.split(":");
        int mm = Integer.parseInt(p[0]);
        int ss = Integer.parseInt(p[1]);

        String[] s = op_start.split(":");
        int op_start_mm = Integer.parseInt(s[0]);
        int op_start_ss = Integer.parseInt(s[1]);

        String[] e = op_end.split(":");
        int op_end_mm = Integer.parseInt(e[0]);
        int op_end_ss = Integer.parseInt(e[1]);

        int curSec = mm * 60 + ss;
        int opStartSec = op_start_mm * 60 + op_start_ss;
        int opEndSec = op_end_mm * 60 + op_end_ss;
        if (curSec >= opStartSec && curSec <= opEndSec) {
            mm = op_end_mm;
            ss = op_end_ss;
        }

        for (String cmd : commands) {
            if (cmd.equals("next")) {
                ss += 10;
                if (ss >= 60) {
                    mm += ss / 60;
                    ss %= 60;
                }

                if (mm > video_mm || (mm == video_mm && ss > video_ss)) {
                    mm = video_mm;
                    ss = video_ss;
                }
            } else if (cmd.equals("prev")) {
                ss -= 10;
                if (ss < 0) {
                    mm -= 1;
                    ss += 60;
                    if (mm < 0) {
                        mm = 0;
                        ss = 0;
                    }
                }
            }

            curSec = mm * 60 + ss;
            if (curSec >= opStartSec && curSec <= opEndSec) {
                mm = op_end_mm;
                ss = op_end_ss;
            }
        }

        return String.format("%02d:%02d", mm, ss);
    }
}
