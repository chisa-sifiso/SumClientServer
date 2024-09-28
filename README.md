<h1>SumServerApp</h1>

<h2>Description</h2>

<p>
  <strong>SumServerApp</strong> is a simple Java application that demonstrates basic client-server communication using TCP sockets. This server listens on port <code>1234</code>, waits for a client to connect, receives two numbers from the client, computes their sum, and sends the result back to the client.
</p>

<h3>How it works:</h3>
<ul>
  <li>The server waits for a client to connect on port <code>1234</code>.</li>
  <li>Once a client connects, it receives a message in the form of two space-separated integers.</li>
  <li>The server splits the message, computes the sum of the two integers, and sends the result back to the client.</li>
</ul>

<h3>Features:</h3>
<ul>
  <li>Basic TCP communication between server and client.</li>
  <li>Real-time calculation of the sum of two numbers.</li>
  <li>Handles simple input and output using <code>BufferedReader</code> and <code>PrintWriter</code>.</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
  <li>Java Development Kit (JDK) 8 or higher</li>
  <li>An IDE or text editor like IntelliJ IDEA, Eclipse, or VS Code.</li>
  <li>Basic understanding of Java networking (TCP sockets).</li>
</ul>

<h3>Installation</h3>
<ol>
  <li>Clone the repository:</li>

  <pre><code>git clone https://github.com/your-username/SumServerApp.git</code></pre>

  <li>Navigate to the project directory:</li>

  <pre><code>cd SumServerApp</code></pre>

  <li>Open the project in your preferred IDE.</li>
</ol>

<h3>Running the Server</h3>
<ol>
  <li>Compile and run the server:</li>

  <pre><code>javac SumServer.java</code></pre>

  <li>Run the server:</li>

  <pre><code>java SumServer</code></pre>
</ol>

<p>
  Once the server is running, it will wait for a client to connect and send two integers to compute their sum.
</p>
