package httpserver;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

public interface CustomHttpServer {
  void start(HttpHandler handler)  throws IOException;
  void configureHttpHandler(HttpServer server, HttpHandler handler);
}
