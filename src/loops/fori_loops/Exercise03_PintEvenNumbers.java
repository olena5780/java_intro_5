package loops.fori_loops;

public class Exercise03_PintEvenNumbers {
    public static void main(String[] args) {
        /*
        for(int i = 0; i <= 10; i += 2){
            System.out.println(i);
        }
        */ //not recomended



        for (int i = 1; i <= 10; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
