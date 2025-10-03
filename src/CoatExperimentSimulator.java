public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int numgottheircoat = 0;
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] == i + 1) {
                numgottheircoat++;
            }
        }
        return numgottheircoat;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int [] results = new int[iterations];
        for (int i = 0; i < iterations; i++) {
          int[] permutation = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            results[i] = numPplWhoGotTheirCoat(permutation);
        }
        return results;
    }

    public double answerToQuestionOne(int[] results) {
        int answer1 = 0;
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 0) {
                answer1++;
            }
        }
        return (double) answer1 / results.length; //calculates probability
    }

    public double answerToQuestionTwo(int[] results) {
        int answer2 = 0;
        for (int i = 0; i < results.length; i++) {
            answer2 += results[i];
        }
        return (double) answer2 / results.length; //calculates average
    }
}