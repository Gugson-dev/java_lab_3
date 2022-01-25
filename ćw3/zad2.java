public class zad2 {
    public static void main(String[] args) {
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

        String wyraz = "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo";
        int 
        o = 0, 
        p = 0, 
        x = 0, 
        z = 0, 
        q = 0, 
        inne = 0;

        for (int i = 0; i < wyraz.length(); i++) {
            switch (wyraz.charAt(i)) {
                case 'o':
                    o++;
                    break;

                case 'p':
                    p++;
                    break;

                case 'x':
                    x++;
                    break;

                case 'z':
                    z++;
                    break;

                case 'q':
                    q++;
                    break;

                default:
                    inne++;
                    break;
            }
        }
        System.out.println("Podany wyraz ma w sobie:");
        System.out.printf("Liter 'o' = %d\n", o);
        System.out.printf("Liter 'p' = %d\n", p);
        System.out.printf("Liter 'x' = %d\n", x);
        System.out.printf("Liter 'z' = %d\n", z);
        System.out.printf("Liter 'q' = %d\n", q);
        System.out.printf("Innych liter = %d", inne);
    }
}
