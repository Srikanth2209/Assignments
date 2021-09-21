
    class Calc {
        int num1;
        int num2;
        int result; //class_object file code chages to the master branch to form a new branch ---- team member 1.

        public void perform() {
            result = num1 + num2;
        }
    }

    public class class_object {
        public static void main(String[] args) {
            Calc obj = new Calc();
            obj.num1 = 5;
            obj.num2 = 6;

            obj.perform();

            System.out.println(obj.result);
        }

    }
