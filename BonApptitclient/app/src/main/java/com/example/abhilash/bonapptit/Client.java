package com.example.abhilash.bonapptit;

import android.os.AsyncTask;

import java.io.ByteArrayOutputStream;
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
    Socket socket;

    Client(String order) {
        destAddress="172.20.10.5";
        port=8080;
        this.order = order;
    }


        @Override
            protected Void doInBackground(String... strings) {

                try{
                    socket=new Socket(destAddress,port);
                    OutputStream outputStream=socket.getOutputStream();
                    PrintStream printStream=new PrintStream(outputStream);
                    printStream.print(order);
//                    int bytesRead;
//                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(
//                            1024);
//                    byte[] buffer = new byte[1024];
                    socket.close();
                } catch (UnknownHostException e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
                return null;
            }
        }

