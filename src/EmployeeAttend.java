public class EmployeeAttend {
        static final int IS_PRESENT = 1;

        public static void main(String[] args) {
            System.out.println("Welcome to EmployeeWage Program");
            int attendance = (int) (Math.floor(Math.random() * 10)) % 2;
            if (attendance == IS_PRESENT) {
                System.out.println("Employee is present");
            } else {
                System.out.println("Employee is absent");
            }
        }
    }

