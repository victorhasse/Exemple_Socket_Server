import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Principal {

    public static void main(String[] args) {
        try {
            ServerSocket servidor = new ServerSocket(4444);
            System.out.println("Aguardando cliente!");
            Socket socket = servidor.accept(); // espera
            System.out.println("Chegou o cliente :"
                    + socket.getInetAddress().getHostAddress());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            String mensagem = "";
            while ((mensagem = in.readLine()) != null) {
                System.out.println(mensagem);
            }
        } catch (IOException e) {
            System.err.println("Problemas de IO");
        }
    }
}
