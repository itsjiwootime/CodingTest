import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int x = 0, y = 0;

        int dir = 3;
        
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if( c == 'L'){
                dir = (dir - 1) % 4;  
            }else if( c == 'R'){
                dir = (dir + 1) % 4; 
            }else{

                x += dx[dir];
                y += dy[dir];
            }
        }

        System.out.println(x + " "  +y);
    }
}