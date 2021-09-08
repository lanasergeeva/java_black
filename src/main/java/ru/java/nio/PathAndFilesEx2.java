package ru.java.nio;

import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class PathAndFilesEx2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
        Path directoryPath = Paths.get("C:\\Users\\Лана\\Desktop\\X");
        Path directoryFilePath = Paths.get("C:\\Users\\Лана\\Desktop\\File");
        Path filePath2 = Paths.get("C:\\Users\\Лана\\Desktop");
        System.out.println(filePath2.relativize(directoryPath));
     /*   File[] array = filePath2.toFile().listFiles();
        System.out.println(Arrays.toString(array));*/
        /*DirectoryStream<Path> dr = Files.newDirectoryStream(filePath2);
        for(Path path: dr) {
            System.out.println(path.toAbsolutePath());
        }*/
        DirectoryStream.Filter<Path> dr = (file) -> Files.isRegularFile(file);
        try (var stream = Files.newDirectoryStream(filePath2, dr)) {
            for (Path path : stream) {
                System.out.println(path.toAbsolutePath());
            }
        }
        System.out.println(filePath.toFile().isDirectory());
        Path test = Paths.get("uty.txt");
        System.out.println(test.toAbsolutePath());
        try (OutputStream out = Files.newOutputStream(filePath, APPEND)) {
            out.write(123);
            out.flush();
            System.out.println("done");
        }



        /*Console console = System.console();
        if(console!=null){
            // считываем данные с консоли
            String login = console.readLine("Введите логин:");
            char[] password = console.readPassword("Введите пароль:");

            console.printf("Введенный логин: %s \n", login);
            console.printf("Введенный пароль: %s \n", new String(password));
        }*/
      /*  String io = console.reader()
        System.out.println(io);*/
        /*Path p = Paths.get("/");
        String name = null;
        System.out.println(name = String.valueOf(p.getFileName()));
        System.out.println(Files.exists(p));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace('\t'));
        System.out.println(Character.isWhitespace(' '));*/
/*
        Scanner scanner = new Scanner(System.in);
        String nameyh = scanner.nextLine();
        System.out.println(nameyh);
        String na = scanner.next();
        System.out.println(na);

        Scanner scanner2 = new Scanner("нанананана нанан:"
        + "yjdfid ddbhfbf:"
        +"db7834hdi jdidndjd");
        scanner2.useDelimiter(":");
        while (scanner2.hasNext()) {
            System.out.println(scanner2.next());
        }*/
        //ObjectInputStream obj = new ObjectInputStream(new FileInputStream("my_test.bin"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String value = reader.readLine();
        System.out.println(value);


/*
        Files.copy(filePath, directoryPath.resolve(filePath),
                StandardCopyOption.REPLACE_EXISTING);*/
        //чтобы не было ошибки, если файл перезаписывать
        //Files.copy(filePath, directoryPath.resolve(filePath));
        //Files.copy(filePath, directoryPath.resolve("test11.txt"));
        //Files.copy(directoryFilePath, directoryPath.resolve("File"));


        //Files.move(filePath, directoryPath.resolve("test10.txt"));
        //Files.move(Paths.get("test4.txt"), Paths.get("test44.txt"));
       /* Files.delete(Paths.get("test66.txt"));
        System.out.println("Done");*/

    }
}
