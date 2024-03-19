package LAB4;

public class RabinKarp {
    public void Rabinkarp(String T, String P, int q, int d) {
        int n = T.length(), //18
            m = P.length(), //5
            h = ((int) Math.pow(10, m - 1)) % q, //3
            p = 0,
            t = 0;
        // h=1;

        // for (int i=0;i<m-1;i++){
        // h=(h*d)%q;
        // }

        for (int i = 0; i < m; i++) { //0 to 4
            p = (d * p + (P.charAt(i) - 48)) % q; //0: (10*0 + 3) % 13 = 3;  1: 
            t = (d * t + (T.charAt(i) - 48)) % q;
        }
        // System.out.println(p + " " + t);

        for (int s = 0; s < n - m; s++) {
            if (t == p) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (P.charAt(j) != T.charAt(s + j)) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.println(s);
                }
            }
            if (s < n - m) {
                t = (d * (t - (T.charAt(s + 1) - 48) * h) + (T.charAt(s + m) - 48)) % q;
                System.out.println(t);
                if (t<0){
                    t+=q;
                }
            }
        }

    }

    public static void main(String[] args) {
        RabinKarp rk = new RabinKarp();
        rk.Rabinkarp("235902314152673991", "31415", 13, 10);
    }

}
