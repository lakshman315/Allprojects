package exception_handlingpractice;
interface Calculator {
    void  calculate(int a, int b);
}
enum Operator implements Calculator {
    ADD {
       
        public void calculate(int a, int b) {
            System.out.print(a+b);
        }
    },
    SUBTRACT {
       
        public void calculate(int a, int b) {
        	System.out.print(a-b);
        }
    }, 
}

public class B {

	public static void main(String[] args) {
		Operator s=Operator.ADD;
		s.calculate(1,5);
		

	}

}
