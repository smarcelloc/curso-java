package poo.polimorfismo.universal.parametrico;

public class Par<T> {

    private T mPrimeiro;
    private T mSegundo;

    public Par(T pPrim, T pSeg) {
        this.mPrimeiro = pPrim;
        this.mSegundo = pSeg;
    }

    public T getPrimeiro() {
        return mPrimeiro;
    }

    public void setPrimeiro(T pPrimeiro) {
        mPrimeiro = pPrimeiro;
    }

    public T getSegundo() {
        return mSegundo;
    }

    public void setSegundo(T pSegundo) {
        mSegundo = pSegundo;
    }

}
