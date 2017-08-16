package com.test.tcpip;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class Server {
    public static void main(String[] args){
        try {
            ServerSocket socket = new ServerSocket(8888);
            System.out.println("服务器端启动。等待客户端的接收---");
            Socket server =  socket.accept();
            InputStream is = server.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = null;
            while ((str=br.readLine())!=null){
                System.out.println("服务器端接收到客户端的信息为："+str);
            }


            //给客户端反馈信息
            OutputStream os = server.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("服务器已经接收到信息，欢迎你");
            pw.flush();

            pw.close();
            os.close();
            br.close();
            isr.close();
            is.close();
            server.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
