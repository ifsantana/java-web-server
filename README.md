# java-web-server

Custom web server to count word occurrences in a massive book.

Book file is located on: /files

Search request example: 

GET `localhost:8000/search?word={wordToFind}`

To increase performance you can try to include more threads to the web server thread pool on `HttpServerConfig.DEFAULT_CUSTOM_THREAD_POOL`.

Current custom thread pool size = 1