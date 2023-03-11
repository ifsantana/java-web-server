package httpserver;

import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class HttpServerConfig implements CustomHttpServer {
  private HttpServer server;
  private static final int DEFAULT_CUSTOM_THREAD_POOL = 2;
  private Executor executor;

  @Override
  public void start(HttpHandler handler)  throws IOException {
    this.server = HttpServer.create(new InetSocketAddress(8000), 0);
    this.configureHttpHandler(this.server, handler);
    this.executor = Executors.newFixedThreadPool(DEFAULT_CUSTOM_THREAD_POOL);
    this.server.setExecutor(this.executor);
    this.server.start();
  }

  @Override
  public void configureHttpHandler(HttpServer server, HttpHandler handler) {
    server.createContext("/search", handler);
  }
}
