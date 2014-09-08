public class MangeFeil {
    public static void main (String[] args) {
        
        boolean sannhetsverdi = true;

        sannhetsverdi = false;

        System.out.println("Her er det en feil");
        System.out.println("Og her er en annen");

        String s;
        int a = 54;

        sannhetsverdi = a < 3;

        if (sannhetsverdi) {
            s = "abc";
            System.out.println(s);
        }

        System.out.println(s);

        testmetode(a);
    }

    public static void testmetode(int a) {
        System.out.println(a);
    }
}