package vam.design.factory.simple;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public static void main(String[] args) {
        System.out.println("简单工厂");

        Operation op = createOperation("+");
        op.strNumberA = 1;
        op.strNumberB = 10;
        System.out.println("result: " + op.getResult());
    }

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperateAdd();
                break;
            case "-":
                operation = new OperateSub();
                break;
            default:
                break;
        }
        return operation;
    }
}
