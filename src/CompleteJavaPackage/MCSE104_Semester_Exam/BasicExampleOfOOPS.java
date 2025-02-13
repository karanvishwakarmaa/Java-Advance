package CompleteJavaPackage.MCSE104_Semester_Exam;


    class Pen{
        String color;
        String type; //ballpoint;gel

        public void write(){
            System.out.println("Writing something...");
        }
        public void printColor(){
            System.out.println(this.color);
        }
    }

    public class BasicExampleOfOOPS{
        public static void main(String[] args) {
            Pen p1 = new Pen();
            p1.color = "blue";
            p1.type = "Gel";

            Pen p2 = new Pen();
            p2.color = "Black";
            p2.type = "Ballpoint";

            p1.printColor();
            p2.printColor();
        }

    }
