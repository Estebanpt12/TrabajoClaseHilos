package implJoin;

public class NumeroFibonacci extends Thread{

    private int number;

    public NumeroFibonacci (int number){
        this.number = number;
    }

    @Override
    public void run(){
        int num1 = 0, num2 = 1, suma = 1;         
        for (int i = 1; i < number; i++) {
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
        number = suma;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
