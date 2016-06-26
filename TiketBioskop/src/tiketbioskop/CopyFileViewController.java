/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author ATI-Dhio
 */
public class CopyFileViewController {
    public CopyFileViewController(String asal, String tujuan) throws IOException{
        FileInputStream inFile = new FileInputStream(asal);
        FileOutputStream outFile = new FileOutputStream(tujuan);
        FileChannel inChannel = inFile.getChannel();
        FileChannel outChannel = outFile.getChannel();
        
        for (ByteBuffer buffer = ByteBuffer.allocate(1024 * 1024);
                inChannel.read(buffer) != -1;
                buffer.clear()) {
            buffer.flip();
            while (buffer.hasRemaining()){
                outChannel.write(buffer);
            }
        }
        inChannel.close();
        outChannel.close();
    }
}
