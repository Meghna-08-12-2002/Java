class Anchor {  
    String type;  
    int weight;  
    String material;  
    boolean isRustProof;  

    Anchor() {  
        System.out.println("Explicitly defining the anchor");  
    }  
}  
/*Key Concepts Used
Class and Object Creation – The Anchor class defines a blueprint, and AnchorRunner creates an object using new Anchor().

Constructor Definition – A user-defined no-argument constructor prints a message when the object is created.

Default Field Values – Java automatically assigns default values (null, 0, false) to instance variables before assignment.

Instance Variable Access – Fields are accessed and updated using the object reference (e.g., anchor.type = "Fluke";).

Object State Modification – Values of fields are updated after object creation to reflect changes in state.

Console Output – System.out.println() is used to observe field values before and after updates, supporting clear understanding of object behavior.

Simple Testing – AnchorRunner acts as a test class to verify object creation and field updates.*/

