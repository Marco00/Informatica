
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class myServer {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		final int PORTA = 9090;
		ServerSocket server = new ServerSocket(9090);
		Socket s = null;
		String userIn;
		PrintWriter out;
		BufferedReader in;
		while (true) {
			System.out.println("<<server started>>");
			s = server.accept();
			out = new PrintWriter(s.getOutputStream(), true);
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			boolean stillWorking = true;

			out.println("+OK pop3server ready");
			String user = in.readLine();
			if (user.contains("s.mattiello")) {
				out.println("+OK valid name");
			}
			String passwd = in.readLine();
			if (passwd.contains("alfa")) {
				out.println("+OK valid password");
			}

			System.out.println("CONNESSIONE ESEGUITA PROCEDERE");

			while (stillWorking) {
				userIn = "";
				userIn = in.readLine();
				System.out.println(userIn);
				switch (userIn) {
					case "ciao":
						out.println("ciao anche a te");
						break;
					case "port":
						out.println("stai usando la porta " + PORTA);
						break;
					case "exit":
						out.println("Exit in 2.. 1.. Bye");
						out.println("");
						stillWorking = false;
						break;
					case "getData":
						out.println(LocalDateTime.now());
						stillWorking = false;
						break;

					case "STAT":
						out.println("OK+ There are 2 emails .1424");
						break;

					case "LIST":
						out.println("+OK Here's your mail: \n" + "1 724 \n" + "2 700 \n" + ".");
						break;

					case "TOP 1":
						out.println("OK+ Message 1");
						out.println("Date : 31 Jan 2018");
						out.println("To : s.mattiello@localHost");
						out.println("From : a.anonymous@localHost");
						out.println("Subject : TEST");

						break;

					case "TOP 2":
						out.println("OK+ Message 2");
						out.println("Date : 1 Feb 2018");
						out.println("To : s.mattiello@localHost");
						out.println("From : a.anonymous@localHost");
						out.println("Subject : PROVA");

						break;

					default:
						out.println("comando non supportato!!!!");
						break;
				}
			}
		}
	}

}
