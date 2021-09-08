package ru.java.io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) throws IOException {
        try (FileChannel channel = (FileChannel) Files.newByteChannel(Paths.get("niowrite.txt"),
                StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            //создаем буфер
            ByteBuffer buffer = ByteBuffer.allocate(26);
            //записываем в буфер
            for (int i = 0; i < 26; i++) {
                buffer.put((byte) ('A' + i));
            }
            //подготовка буфера к записию Обнуляем позицию
            buffer.rewind();
            //записываем буфер в файл
            channel.write(buffer);
        }
    }
}
