class CourseName {
    static void trainingCost(Course course) {
        if (course == Course.JAVA) {
            System.out.println("Training cost of " + course + " is 500rs");
        } else if (course == Course.PYTHON) {
            System.out.println("Training cost of " + course + " is 400rs");
        } else if (course == Course.JAVASCRIPT) {
            System.out.println("Training cost of " + course + " is 450rs");
        } else if (course == Course.C) {
            System.out.println("Training cost of " + course + " is 350rs");
        } else if (course == Course.DATA_SCIENCE) {
            System.out.println("Training cost of " + course + " is 600rs");
        } else {
            System.out.println("Course not found");
        }
    }
}