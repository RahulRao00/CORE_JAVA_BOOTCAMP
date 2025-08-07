   
   class Student {
        String name;
        int roll;

        // This is a constructor function
        Student(String name, int roll) {
            this.name = name;
            this.roll = roll;
        }
    }

    public class L_1_Constructor {
        public static void main(String[] args) {

            Student st1 = new Student("Rahul", 101);
            Student st2 = new Student("Raj", 102);
            Student st3 = new Student("some", 103);
            Student st4 = new Student("any", 104);

            System.out.println("Student1 name: " + st1.name + ", RollNo " + st1.roll);
            System.out.println("Student2 name: " + st2.name + ", RollNo " + st2.roll);
            System.out.println("Student3 name: " + st3.name + ", RollNo " + st3.roll);
            System.out.println("Student4 name: " + st4.name + ", RollNo " + st4.roll);
        }
    }
