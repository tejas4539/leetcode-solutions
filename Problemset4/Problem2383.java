package Problemset4;

public class Problem2383 {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        int training = 0;
        int totalEnergy = 0;
        for (int n : energy) {
            totalEnergy += n;
        }
        if (initialEnergy <= totalEnergy) {
            training += totalEnergy - initialEnergy + 1;
        }
        for (int n : experience) {
            if (n >= initialExperience) {
                int diff = n - initialExperience + 1;
                training += diff;
                initialExperience += diff;
            }
            initialExperience += n;
        }
        return training;
    }
}
