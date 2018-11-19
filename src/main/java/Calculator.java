public class Calculator {
    private double value1;
    private double value2;

    public Calculator(double value1,double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    public double add(){
        return value1 + value2;
    }

    public double subtract(){
        return value1 - value2;
    }

    public double multiply(){
        return value1 * value2;
    }

    public double divide(){
        return value1 / value2;
    }
}
