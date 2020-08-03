public class App {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        //Passando a tarefa e o nome do Thread
        Thread convidado1 = new Thread(new TarefaNumero1(banheiro), "João");
        Thread convidado2 = new Thread(new TarefaNumero2(banheiro), "Pedro");
        Thread donoDaCasa = new Thread(new EscovandoOsDentes(banheiro), "Alex");
        convidado1.start();
        convidado2.start();
        donoDaCasa.start();
    }
}

//podemos fazer a execução atômica através da sincronização ou de chaves
