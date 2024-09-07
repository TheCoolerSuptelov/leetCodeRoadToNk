package beecrowd.T2006_identifying_tea;

public class IdentifyingTeaCompetition {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i < args.length -2; i++) {
            if (args[0] == args[i]){
                counter++;
            }
        }
    }
}
