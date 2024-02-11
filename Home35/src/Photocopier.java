public class Photocopier implements Machine {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }
}
