package LeeJaeHun.solid.ocp;

public class Client {


        public static void main(String[] args) {
            Calculator calculator = new Calculator(
                    new AddOperation(),
                    new SubstractOperation(),
                    new MultiplyOperation(),
                    new DivideOperation()
            );

            int firNum = 140;
            int secNum = 60;

            int answer = calculator.add(firNum, secNum);
            System.out.println(" + answer = " + answer);

            answer = calculator.substract(firNum, secNum);
            System.out.println(" - answer = " + answer);

            answer = calculator.multiply(firNum, secNum);
            System.out.println(" * answer = " + answer);

            answer = calculator.divide(firNum, secNum);
            System.out.println(" / answer = " + answer);

    }

}
