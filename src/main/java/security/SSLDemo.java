package security;

import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SSLDemo {

    protected void createSSLHandshake(String host, int portNumber) throws IOException {
        try (Socket socket = SSLSocketFactory.getDefault().createSocket(host, portNumber)) {
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream();
            out.write(1);
            while (in.available() > 1) {
                System.out.println(in.read());
            }
        }
    }
}
