package com.example.abhilash.bonapptit;

import android.os.AsyncTask;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Client extends AsyncTask<String,Void,Void> {
    String destAddress;
    int port;
    String order;

    Client(String destAddress, int port, String order) {
        this.destAddress = destAddress;
        this.order = order;
        this.port = port;
    }


        @Override
            protected Void doInBackground(String... strings) {
                Socket socket=null;
                try{
                    socket=new Socket(destAddress,port);
                    OutputStream outputStream=socket.getOutputStream();
                    PrintStream printStream=new PrintStream(outputStream);
                    printStream.print(order);
                    socket.close();
                } catch (UnknownHostException e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
                return null;
            }
        }

