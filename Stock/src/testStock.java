public class testStock {
    public static void main(String[] args) {
        Stock sb1 = new Stock("SBER", "ПАО Сбербанк", 281.50);
        sb1.setCurrentPrice(282.87);
        System.out.print("Стоимость акции " + sb1.symbol + " - ");
        System.out.print(sb1.name + " изменилось на " + sb1.getChangePercent() + " процентов.");
    }
}
