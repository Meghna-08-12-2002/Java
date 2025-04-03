class Engine {       
    public static void displayInfo(String type, int horsepower, String fuel, float displacement, boolean isTurbocharged, 
                                   int cylinders, String coolingType, String compressionRatio, int valves, String engineBlock, 
                                   double torque, String ignitionSystem, String emissionsStandard, boolean hybrid, int maxRPM, 
                                   String fuelInjection, double bore, double stroke, String timingBelt, String lubricationSystem, 
                                   boolean directInjection, String engineMount, String turboType, double efficiency, String countryOfOrigin) {                    
        System.out.println("Type: " + type + ", Horsepower: " + horsepower + ", Fuel: " + fuel + ", Displacement: " + displacement + 
                           ", Turbocharged: " + isTurbocharged + ", Cylinders: " + cylinders + ", Cooling Type: " + coolingType + 
                           ", Compression Ratio: " + compressionRatio + ", Valves: " + valves + ", Engine Block: " + engineBlock + 
                           ", Torque: " + torque + ", Ignition System: " + ignitionSystem + ", Emissions Standard: " + emissionsStandard + 
                           ", Hybrid: " + hybrid + ", Max RPM: " + maxRPM + ", Fuel Injection: " + fuelInjection + ", Bore: " + bore + 
                           ", Stroke: " + stroke + ", Timing Belt: " + timingBelt + ", Lubrication System: " + lubricationSystem + 
                           ", Direct Injection: " + directInjection + ", Engine Mount: " + engineMount + ", Turbo Type: " + turboType + 
                           ", Efficiency: " + efficiency + ", Country of Origin: " + countryOfOrigin);            
    }    
}  
