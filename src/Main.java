import handlers.WordCounterHandler;
import httpserver.HttpServerConfig;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
  private static final String INPUT_FILE = "files/war_and_piece.txt";

  public static void main(String[] args) throws IOException {
    HttpServerConfig serverConfig = new HttpServerConfig();
    String text = new String(Files.readAllBytes(Paths.get(INPUT_FILE)));
    serverConfig.start(new WordCounterHandler(text));
  }
}