package ru.java.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class ChannelBufferEx1 {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile file =
                     new RandomAccessFile("C:\\Users\\Лана\\Desktop\\poem.txt", "rw");
             FileChannel channel = file.getChannel();) {
            ByteBuffer buffer = ByteBuffer.allocate(25);
            StringBuilder sb = new StringBuilder();
            int byteRead = channel.read(buffer);
            while (byteRead > 0) {
                System.out.println("Read" + byteRead);
                buffer.flip();
                while (buffer.hasRemaining()) {
                    sb.append((char) buffer.get());
                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(sb);

            String text = "\nBut thou, contracted to thine own bright eyes,\n"
                    + "Feed'st thy light'st flame with self-substantial fuel,\n"
                    + "Making a famine where abundance lies,\n"
                    + "Thyself thy foe, to thy sweet self too cruel.";
            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

            /*ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2);*/
        }
    }
}
