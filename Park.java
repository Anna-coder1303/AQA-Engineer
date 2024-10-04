public class Park {
    private String NamePark = "Парк развлечений";

    public class Attrakcion {
        private String title;
        private String time;
        private double cost;
        private void printData() {
            System.out.println("Аттракцион: " + title + ". Время работы: " + time + ". Стоимость: " + cost + " руб");
        }
    }
    public void createAttrakcion() {
        Attrakcion attrakcion = new Attrakcion();
        attrakcion.title = "Цепочки";
        attrakcion.time = "9.00-21.00";
        attrakcion.cost = 5.5;
        attrakcion.printData();
    }
    public static void main(String[] args) {
        Park park = new Park();
        park.createAttrakcion();
        Park.Attrakcion attrakcion1 = park.new Attrakcion ();
        Park.Attrakcion attrakcion2 = new Park().new Attrakcion();
    }
}
