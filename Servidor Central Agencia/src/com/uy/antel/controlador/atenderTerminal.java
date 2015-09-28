package com.uy.antel.controlador;

import java.net.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class atenderTerminal implements Runnable {

	
		  private Socket client;
		  
		//Constructor
		  atenderTerminal(Socket client) {
		    this.client = client;
		  }

		  public void run(){
		    String line;
		    BufferedReader in = null;
		    PrintWriter out = null;
		    try{
		      in = new BufferedReader(new 
		        InputStreamReader(client.getInputStream()));
		      out = new 
		        PrintWriter(client.getOutputStream(), true);
		    } catch (IOException e) {
		      System.out.println("in or out failed");
		      System.exit(-1);
		    }

		    while(true){
		      try{
		        line = in.readLine();
		//Send data back to client
		        //out.println(line);
		//Append data to text area
		        //textArea.append(line);
		       }catch (IOException e) {
		        System.out.println("Read failed");
		        System.exit(-1);
		       }
		    }
		  }
		


//		JTextArea.appendJTextArea.appendtextArea.append(line)synchronizedruntextArea.append(line)appendText(line)
//
//		  public synchronized void appendText(line){
//		    textArea.append(line);
//		  }

//		synchronizedtextAreatextArea
//
//		The finalize() method is called by the Java virtual machine (JVM)* before the program exits to give the program a chance to clean up and release resources. Multi-threaded programs should close all Files and Sockets they use before exiting so they do not face resource starvation. The call to server.close() in the finalize() method closes the Socket connection used by each thread in this program.

		  protected void finalize(){
		//Objects created in run method are finalized when
		//program terminates and thread exits
		     try{
		        client.close();
		    } catch (IOException e) {
		        System.out.println("Could not close socket");
		        System.exit(-1);
		    }
		  }

	
}
