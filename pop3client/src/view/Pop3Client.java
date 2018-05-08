package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio
 */
public class Pop3Client {

    public final InetAddress server;
    public final int port;

    private final String User;
    private final String Pass;

    private Socket s;
    private BufferedReader input;
    private PrintWriter out;

    /**
     *
     * @throws java.net.UnknownHostException
     */
    public Pop3Client() throws UnknownHostException {
        server = InetAddress.getByName("127.0.0.1");     //192.168.4.250
        port = 9090;                                     //110

        User = "s.mattiello";
        Pass = "alfa";
    }

    /**
     *
     * @return true if pop3 connection completed
     * @throws java.io.IOException
     */
    public boolean connect() throws IOException {
        boolean isConnected = false;

        s = new Socket(server, port);

        input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(s.getOutputStream(), true);

        String answer = input.readLine();
        System.out.println(answer);
        if (answer.contains("+OK")) {
            out.println("USER " + User);
            answer = input.readLine();
            System.out.println(answer);

            if (answer.contains("+OK")) {
                out.println("PASS " + Pass);
                answer = input.readLine();
                System.out.println(answer);
                if (answer.contains("+OK")) {
                    isConnected = true;
                }
            }

        }
        return isConnected;
    } // connect()

    /**
     *
     * @return @throws java.io.IOException
     */
    public int getNumOfMessages() throws IOException {
        int num = 0;

        String answer;
        String command = "STAT";

        out.println(command);

        answer = input.readLine(); // Dovrebbe essere +OK nn mmmm
        System.out.println(answer);
        if (answer.contains("+OK")) {
            num = Integer.parseInt(answer.split(" ")[1]);
        }
        return num;
    }

    public String sendCommand(String com) throws IOException {
        String commandLine = com;
        out.println(commandLine);
        String answer = input.readLine();                     //answer può essere formata da più righe
        return answer;
    }

}
