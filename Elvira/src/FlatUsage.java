public class FlatUsage {
    public static void main(String[] args) {
        //создаем 2 квартиры
        Flat MyFlat = Flat.setFlat(1000, 75, 2, 0, "Elvira Bogdan");
        Flat AnkeFlat = Flat.setFlat(299, 90, 3, 1, "Anke");
        Flat TomasFlat = Flat.setFlat(298,90,3,1,"Tomas");

        //заселяем жильца в 1 квартиру и выводим инфо
        MyFlat.setRoomer("Varvara");
       MyFlat.getRoomers();

        // заселяем 2х жильцов в квартиру 2, потом удаляем первого и выводим инфо
        AnkeFlat.setRoomer("Maksim");
        AnkeFlat.setRoomer("Andrei");
        AnkeFlat.removeRoomer("Maksim");
        AnkeFlat.showInfo();

        // выводим все квартиры в доме, а потом адрес
       Flat.getArrFlats();
//        Flat.getAddres();

        //выводим номера квартир
//        MyFlat.getNumberOfFlat();
//        AnkeFlat.getNumberOfFlat();

        //Методы toString() и equals() в Наследовании
      //  System.out.println(MyFlat.toString());
//        System.out.println(AnkeFlat.toString());
//        System.out.println(TomasFlat.toString());
//
//        System.out.println(MyFlat.equals(AnkeFlat)); // false
//        System.out.println(AnkeFlat.equals(TomasFlat)); // true

        // ИСПОЛЬЗОВАНИЕ ИНТЕРФЕЙСА (урок 20)
        // а) создание объекта с типом созданного интерфейса
//        Rentable Flat1 = new Flat(25,20,1,4,"");
//        Flat1.rentOut(10);
//        Flat1.terminateRental();
//        // б) работа с ранее созданными объектами (квартирами)
//        MyFlat.rentOut(3);
//        MyFlat.terminateRental();
    }
}
