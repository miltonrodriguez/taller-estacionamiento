package com.uy.antel.controlador;

import java.net.*;
import java.awt.event.ActionEvent;
import java.io.*;

public class ctrlTerminal {

	ServerSocket server;
	public void listenSocket(){
		  try{
		    server = new ServerSocket(4444);
		  } catch (IOException e) {
		    System.out.println("Could not listen on port 4444");
		    System.exit(-1);
		  }
		  while(true){
		    atenderTerminal w;
		    try{
		//server.accept returns a client connection
		      w = new atenderTerminal(server.accept());
		      Thread t = new Thread(w);
		      t.start();
		    } catch (IOException e) {
		      System.out.println("Accept failed: 4444");
		      System.exit(-1);
		    }
		  }
		}

	

}
