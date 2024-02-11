public class MySQLDatabase implements Database {
    @Override
    public void read() {
        System.out.println("Reading data from MySQL database");
    }

    @Override
    public void write() {
        System.out.println("Writing data to MySQL database");
    }
}

