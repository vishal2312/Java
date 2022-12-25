public class AllPatterns {

    // Half Pyramid Star Pattern
    public static void Star(int n) {
        // Lines 
        for(int i = 1; i <= n; i++) {
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid Star Pattern
    public static void Inverted_Star(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Stars
            for(int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Half Pyramid Number Pattern
    public static void Half_Pyramid_Numbers(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Half Pyramid Character Pattern
    public static void Half_Pyramid_Characters(int n) {
        char ch = 'A';

        // Lines
        for(int i =1 ; i <= n; i++) {
            // Characters
            for(int j = 1; j <= i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }

    // Hollow Rectangle Pattern
    public static void Hollow_Rectangle(int r, int c) {
        // Lines 
        for(int i = 1; i <= r; i++) {
            // Stars 
            for(int j = 1; j <= c; j++) {
                // Stars Position
                if(i == 1 || i == r || j == 1 || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Inverted & Rotated Half Pyramid Pattern
    public static void Inverted_Rotated_Half_Pyramid(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Inverted Half Pyramid Numbers Pattern
    public static void Inverted_Half_Pyramid_Numbers(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Numbers
            for(int j = 1; j <= (n - i )+ 1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    // Floyds Triangle Pattern
    public static void Floyds_Triangle(int n) {
        int counter = 1;
        // Lines
        for(int i = 1; i <= n; i++) {
            // Numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    // Triangle 0-1 Pattern
    public static void Triangle_0_1(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Numbers
            for(int j = 1; j <= i; j++) {
                // i + j = even = 1 and i + j = odd = 0
                if((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // Butterfly Pattern
    public static void Butterfly(int n) {
        // Lines - 1st Half
        for(int i = 1; i <= n; i++) {
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lines - 2nd Half
        for(int i = n; i >= 1; i--) {
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Spaces
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    // Solid Rhombus Pattern
    public static void Solid_Rhombus(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Hollow Rhombus Pattern
    public static void Hollow_Rhombus(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= n; j++) {
                // Stars Position - Row 1, Row n, Column 1, Colun n
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    // Diamond Pattern
    public static void Diamond(int n) {
        // Lines - 1st Half
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i) ; j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lines - 2nd Half
        for(int i = n; i >= 1; i--) {
            // Spaces
            for(int j = 1; j <= (n - i) ; j++) {
                System.out.print("  ");
            }
            // Stars
            for(int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Numbers Pyramid Pattern
    public static void Numbers_Pyramid(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(i+"   ");
            }
            
            System.out.println();
        }
    }

    // Palindromic Numbers Pattern
    public static void Palindromic_Numbers(int n) {
        // Lines
        for(int i = 1; i <= n; i++) {
            // Spaces
            for(int j = 1; j <= (n - i); j++) {
                System.out.print("  ");
            }
            // Numbers - Descending order
            for(int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            // Numbers - Ascending order
            for(int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        //Star(4);

        //Inverted_Star(4);

        //Half_Pyramid_Numbers(4);

        //Half_Pyramid_Characters(4);

        //Hollow_Rectangle(4, 5);

        //Inverted_Rotated_Half_Pyramid(4);

        //Inverted_Half_Pyramid_Numbers(5);

        //Floyds_Triangle(5);

        //Triangle_0_1(5);

        //Butterfly(4);

        //Solid_Rhombus(5);

        //Hollow_Rhombus(5);

        //Diamond(4);

        //Numbers_Pyramid(5);

        Palindromic_Numbers(5);
    }
}
