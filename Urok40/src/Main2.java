public class Main2 {
    static  Greeter ruGreeter= new Greeter() {
        @Override
        public void Greeter() {
        }
        @Override
        public void printGreeting() {
            System.out.println(" Привет мир");
        }
    };
    static Greeter engGreeter = new Greeter() {
        @Override
        public void Greeter() {
        }

        @Override
        public void printGreeting() {
            System.out.println("Hello World");
        }
    };
    public static void main(String[] args) {

        engGreeter.printGreeting();


    }

}
