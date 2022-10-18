public class AccontExampleTest {
    private static AccontExample accontExample;
    private static final String[] validAccont=new String[]{
            "123abc_", "_abc123", "______", "123456","abcdefgh"
    };
    public static final String[] invalidAccont=new String[]{
            ".@", "12345", "1234_", "abcde"
    };

    public static void main(String[] args) {
        accontExample= new AccontExample();
        for (String accont:validAccont) {
            boolean isvalid=accontExample.validate(accont);
            System.out.println("Accont is "+accont+"is valid : "+isvalid);

        }
    }
}
