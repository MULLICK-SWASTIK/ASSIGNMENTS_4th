package LAB4;

public class RabinKarp {
    public void Rabinkarp(String T, String P, int q, int d) {
        int n = T.length(),
                m = P.length(),
                // h = ((int) Math.pow(10, m - 1)) % q, //3
                p = 0,
                t = 0,
                h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        for (int i = 0; i < m; i++) {
            p = (d * p + (P.charAt(i) - 48)) % q;
            t = (d * t + (T.charAt(i) - 48)) % q;
        }

        for (int s = 0; s < n - m + 1; s++) {
            if (t == p) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (P.charAt(j) != T.charAt(s + j)) {
                        flag = false;
                    }
                }
                if (flag == true) {
                    System.out.println("Found at index: " + s);
                }
            }
            if (s < n - m) {
                t = (d * (t - (T.charAt(s) - 48) * h) + (T.charAt(s + m) - 48)) % q;
                if (t < 0) {
                    t += q;
                }
                // System.out.println(t);
            }
        }

    }

    public static void main(String[] args) {
        RabinKarp rk = new RabinKarp();
        rk.Rabinkarp("235902314152673991", "31415", 13, 10);
    }

}
