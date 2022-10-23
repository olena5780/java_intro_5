package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {
        String name = ScannerHelper.getAName();

        int counter = 0;

        for (int i = 0; i < name.length(); i++) {
            if(name.charAt(i) == 'l' || name.charAt(i) == 'L') counter++; // name.toLowerCase.charAt(i) = 'l'
                                                                          //name.toUppercase.charAt(i) = "L"
        }
        System.out.println(counter);
    }
}