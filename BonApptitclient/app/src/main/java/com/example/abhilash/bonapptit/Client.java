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

    Client(String order) {
        destAddress="192.168.1.15";
        port=456;
        this.order = order;
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

