
    class Calc {
        int num1; //changes are made directly to the maser branch---team lead. 
        int num2;
        int result;

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
