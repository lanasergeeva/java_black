package ru.java.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExplicitChannelRead {
    public static void main(String[] args) throws IOException {
        int count;
        try (SeekableByteChannel channel = Files.newByteChannel(Paths.get("poem.txt"))) {
            //резервируем буфер
            ByteBuffer buf = ByteBuffer.allocate(128);
            do {
                //читаем в буфер
                count = channel.read(buf);
                if (count != -1) {
                    //подготовили буфер для чтения
                    buf.rewind();
                }
                //читаем байты в буфер и отображаем их
                for (int i = 0; i < count; i++) {
                    System.out.print((char) buf.get());
                }
            } while (count != -1);
            System.out.println();
        }
    }
}

/*Path filePath = null;
 *//*try {
            filePath = Paths.get("poem.txt");
        } catch (InvalidPathException e) {
            System.out.println(e);
        }*/