package java_8.workingWithResource;

import java_8.DesignLambda.Asset;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.function.Supplier;

public class FileWriterExample {
    private final FileWriter writer;

    public FileWriterExample(final String filename) throws IOException {
        writer = new FileWriter(filename);
    }

    public void writerStufd(final String filewriter) throws IOException {

            writer.write(filewriter);
    }

    public void finaliza() throws IOException {
        writer.close();
    }

    public static void main(String[] args) throws IOException {

        Supplier<Asset> add=()->new Asset(Asset.AssetType.BOND,120);
        final FileWriterExample writerExample=new FileWriterExample("peekado.txt");
        writerExample.writerStufd("hello world");
        writerExample.finaliza();
    }
}
