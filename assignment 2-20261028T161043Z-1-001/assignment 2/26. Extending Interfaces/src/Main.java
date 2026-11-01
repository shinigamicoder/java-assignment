interface Readable {

    // Method for reading
    void read();
}

interface Writable {

    void write();
}

interface ReadableWritable extends Readable, Writable {
}

class Document implements ReadableWritable {

    @Override
    public void read() {
        System.out.println("Reading Document...");
    }

    @Override
    public void write() {
        System.out.println("Writing Document...");
    }
}

public class Main {
    public static void main(String[] args) {

        ReadableWritable document = new Document();

        document.read();
        document.write();
    }
}