public class EscovandoOsDentes implements Runnable {

    private Banheiro banheiro;

    public EscovandoOsDentes(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.escovaOsDentes();
    }
}
