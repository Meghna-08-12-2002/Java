class PatientRunner {   
    public static void main(String[] args) {       
        Patient patient = new Patient();       
        System.out.println("Patient Name: " + patient.name);       
        System.out.println("Patient Age: " + patient.age);       
        System.out.println("Patient Disease: " + patient.disease);       
        System.out.println("Patient Is Admitted: " + patient.isAdmitted);        

        patient.name = "John Doe";       
        patient.age = 45;       
        patient.disease = "Flu";       
        patient.isAdmitted = true;        

        System.out.println("Updated Patient Name: " + patient.name);       
        System.out.println("Updated Patient Age: " + patient.age);       
        System.out.println("Updated Patient Disease: " + patient.disease);       
        System.out.println("Updated Patient Is Admitted: " + patient.isAdmitted);   
    } 
}
