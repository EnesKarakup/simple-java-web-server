import java.io.*;
import java.net.*;

public class SimpleWebServer {

    public static void main(String[] args) throws IOException {

        ServerSocket server = new ServerSocket(1989);
        System.out.println("Sunucu 1989 portundan çalışıyor...");

        while (true) {
            Socket client = server.accept();
            System.out.println("Yeni istek geldi " + client.getInetAddress());

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(client.getInputStream())
            );
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            String requestLine = in.readLine();
            System.out.println("istek: " + requestLine);

            String html = """
            <html>
            <head>
                <meta charset="UTF-8">
                <title>Kişisel Bilgi Sayfası</title>
                <style>
                    body {
                        background-color: #f2f2f2;
                        font-family: Arial, Helvetica, sans-serif;
                        color: #333333;
                        text-align: center;
                        margin-top: 80px;
                    }
                    h1 {
                        color: #003366;
                        font-size: 2em;
                        margin-bottom: 0.2em;
                    }
                    h2 {
                        color: #006699;
                        font-size: 1.3em;
                        margin-top: 0;
                        margin-bottom: 1em;
                    }
                    p {
                        font-size: 1em;
                        max-width: 600px;
                        margin: 0 auto;
                        line-height: 1.5;
                    }
                </style>
            </head>
            <body>
                <h1>Ad Soyad</h1>
                <h2>Öğrenci No</h2>
                <p>Kısa bir biyografi buraya yazılacaktır.</p>
            </body>
            </html>
            """;


            out.println("HTTP/1.1 200 OK");
            out.println("Content-Type: text/html; charset=UTF-8");
            out.println("Content-Length: " + html.getBytes().length);
            out.println();
            out.println(html);

            out.close();
        }
    }
}
