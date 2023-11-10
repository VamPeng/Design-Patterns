package vam.design.factory.simple;

public class OperateSub extends Operation{

    @Override
    public int getResult() {
        return strNumberA-strNumberB;
    }
}
