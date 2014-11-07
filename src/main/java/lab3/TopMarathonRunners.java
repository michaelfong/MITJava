package lab3;

/**
 * A group of friends participate in the Boston Marathon.
 * Find the best performer.
 * Find the second best performer.
 * Created by mfong on 11/5/14.
 */
public class TopMarathonRunners {

    // declare a string array with initial size
    public static String[] marathonRunner = new String[] {"Mel Brooks", "Oscar Wilde", "Keisha Jones"};

       //create double array
    public static double[] marathonScore = {7240.276, 7072.376, 7529.832};


    public static void main(String[] arguments) {

        double topScore = 999999.9;
        int topScoreIndex = 0;
        double secondTopScore = 999999.9;
        int secondTopScoreIndex = 0;

        int i = 0;

        while (i < marathonScore.length) {
            if (marathonScore[i] < topScore) {
                secondTopScore = topScore;
                secondTopScoreIndex = topScoreIndex;
                topScore = marathonScore[i];
                topScoreIndex = i;
            } else if (marathonScore[i] < secondTopScore) {
                secondTopScore = marathonScore[i];
                secondTopScoreIndex = i;
            }
            i++;
        }

        System.out.println("The best runner score is " + marathonRunner[topScoreIndex] +
                ": " + marathonScore[topScoreIndex]);
        System.out.printf("The second best score is %s: %s%n",
                marathonRunner[secondTopScoreIndex], marathonScore[secondTopScoreIndex]);

    }
}
