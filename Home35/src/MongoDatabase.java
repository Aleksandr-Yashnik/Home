public class MongoDatabase implements Database {
    @Override
    public void read() {
        System.out.println("Reading data from MongoDB");
    }

    @Override
    public void write() {
        System.out.println("Writing data to MongoDB");
    }
}

