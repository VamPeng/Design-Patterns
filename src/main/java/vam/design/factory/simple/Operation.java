package vam.design.factory.simple;

abstract class Operation implements IOperation {

    public int strNumberA;
    public int strNumberB;

    @Override
    public int getResult() {
        return 0;
    }
}
