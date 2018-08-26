package designPattern.behave.cor;

public interface DispenseChain {
    void dispense(Currency currency);

    void setNextChain(DispenseChain nextChain);
}
