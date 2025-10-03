
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for (int dayCount : birdsPerDay) {
            if (dayCount == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        int sum = 0;
        for (int i = 0; i < numberOfDays; i++) sum += birdsPerDay[i];
        return sum;
    }

    public int getBusyDays() {
        int total = 0;
        for (int dayCount : birdsPerDay) {
            if (dayCount >= 5) total++;
        }
        return total;
    }
}
