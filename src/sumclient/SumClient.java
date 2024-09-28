
package sumclient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class SumClient {

    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Socket s = new Socket(InetAddress.getLocalHost(),1234);
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())),true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        System.out.print("Enter the first number:");  
        String num1= input.nextLine();
        System.out.print("Enter the first second:");  
        String num2= input.nextLine();
        String data= num1+" "+num2;
        out.println(data);
        System.out.println("Output:"+in.readLine());
    }
    
}
