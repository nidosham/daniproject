package lab4;

//---------------------------------------------------------
//Compare3.java 
//This class is used to implement the Comparable interface 
//to compare object values
//---------------------------------------------------------
public class Compare3 {

    //method largest 
    //compares variable of type comparable
    public static Comparable largest(Comparable val1, Comparable val2, Comparable val3) {
        if (val1.compareTo(val2) >= 0) {
            if (val1.compareTo(val3) >= 0) {
                return val1;
            }

        } 
         if (val2.compareTo(val3) >= 0) {
            return val2;
        } else {
            return val3;
        }
      
    }
    
}
