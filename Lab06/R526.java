public class R526 {
    public static void main(String[] args) {
        //A student with a GPA of at least 1.5, but less than 2, is on probation.
        //With less than 1.5, the student is failing.
        double GPA = 1;
        if (GPA > 1.5) {
        } else {
            System.out.println("Failing");
        }
        if (GPA < 2) {
            System.out.println("Probation");
            }


        if (GPA > 1.5) {

            if (GPA < 2) {
                System.out.println("Probation");
            }
        }
        else {
            System.out.println("Failing");
        }
        }
    }


