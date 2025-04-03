class Tablet {
    public static void dissolve(String solventType, int dissolutionTime, boolean coatingEffect) {
    System.out.println("Tablet is dissolving in " + solventType + " for " + dissolutionTime + " minutes. Coating effect: " + coatingEffect);
    }
    public static void cure(String illnessType, int duration) {
        System.out.println("Tablet is curing " + illnessType + " in " + duration + " days");
    }
    public static void killThePain(String painType, int intensity) {
        System.out.println("Tablet is relieving " + painType + " pain with intensity " + intensity);
    }
    public static void react(String reactionType, boolean allergic) {
        System.out.println("Tablet is reacting as " + reactionType + ", Allergic: " + allergic);
    }
}
