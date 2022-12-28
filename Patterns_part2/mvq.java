package Patterns_part2;

// import javax.lang.model.util.ElementScanner14;

public class mvq {
    public static void holoRectangle(int r, int c) {
        for(int i=1; i<=r; i++) {
            for(int j=1; j<=c; j++) {
                if(i==1||i==r||j==1||j==c) {
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void inv_rot_pira(int n) {
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i+1; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    public static void inv_half_num(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyadTrag(int n) {
        int num =1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
    public static void binPira(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if((i+j)%2==0) {
                    System.out.print(" 1 ");
                }else {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {//star
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {//star
                System.out.print("*");
            }
            System.out.println();
        }
        // minror
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {//star
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {//star
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRombas(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {//space
                System.out.print("   ");
            }
            for(int j=1; j<=n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void holoRombas(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {//space
                System.out.print("   ");
            }
            for(int j=1; j<=n; j++) {
                if(i==1|| j==1||i==n||j==n) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void Dimand(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("   ");
            }
            for(int j=1; j<i; j++) {
                System.out.print(" * ");
            }
            for(int j=2; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        //miror
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("   ");
            }
            for(int j=1; j<i; j++) {
                System.out.print(" * ");
            }
            for(int j=2; j<i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void numberPira(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    public static void plaindroimicpat(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("   ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print(" "+j+" ");
            }
            for(int j=2; j<=i; j++) {
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // holoRectangle(5,5);
        // inv_rot_pira(5);
        // inv_half_num(5);
        // floyadTrag(5);
        // binPira(5);
        // butterfly(5);
        // solidRombas(5);
        // holoRombas(5);
        // Dimand(5);
        // numberPira(5);
        plaindroimicpat(5);
    }
}
