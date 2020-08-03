import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Banheiro {

    public void fazNumero1() {
        synchronized (this) { //ao executarmos uma thread por vez
            // dizemos que sua execução é atômcia
            String nome = Thread.currentThread().getName();
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa rapida");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    public void fazNumero2() {
        synchronized (this) {
            String nome = Thread.currentThread().getName();
            System.out.println(nome + " entrando no banheiro");
            System.out.println(nome + " fazendo coisa demorada");
            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
        }
    }

    public void escovaOsDentes() {
        Lock lock = new ReentrantLock();
        lock.lock();
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " entrando no banheiro");
        System.out.println(nome + " escovando os dentes");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nome + " lavando a boca");
        System.out.println(nome + " secando a boca e a mão");
        System.out.println(nome + " saindo do banheiro");
        lock.unlock();
    }
}
