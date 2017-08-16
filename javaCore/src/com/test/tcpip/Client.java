package com.test.tcpip;

import java.io.*;
import java.net.Socket;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
public class Client {
    public static void main(String[] args){
        try {
            //创建客户端socket监听8888端口
            Socket client = new Socket("localhost",8888);
            OutputStream os = client.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            pw.write("我是客户端：用户名为：fanyy;密码为：123456");
            pw.flush();
            client.shutdownOutput();//关闭输出流
            //客户端接收服务器端的反馈信息
            BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String str = null;
            while ((str=br.readLine())!=null){
                System.out.println("客户端接收到服务器端的信息为："+str);
            }
            br.close();
            pw.close();
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
