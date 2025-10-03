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
        int [] matchesPerTrial = new int[iterations];
        for (int i = 0; i < iterations; i++) {
          int[] permutation = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            matchesPerTrial[i] = numPplWhoGotTheirCoat(permutation);
        }
        return matchesPerTrial;
    }

    public double answerToQuestionOne(int[] results) {
        return 0.0;
    }

    public double answerToQuestionTwo(int[] results) {
        return 0.0;
    }
}