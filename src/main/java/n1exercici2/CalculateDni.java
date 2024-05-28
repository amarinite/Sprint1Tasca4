package n1exercici2;

public class CalculateDni {
    public static void main(String[] args) {
        System.out.println(calculateDni(34627472));
    }

    public static char calculateDni(int dniNumber) {
        String dniLetters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int index  = dniNumber % 23;

        return dniLetters.charAt(index);
    }
}
