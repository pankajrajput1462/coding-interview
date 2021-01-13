package designpattern.behave.cor.one;

public interface DispenseChain {
    void dispense(Currency currency);

    void setNextChain(DispenseChain nextChain);
}
