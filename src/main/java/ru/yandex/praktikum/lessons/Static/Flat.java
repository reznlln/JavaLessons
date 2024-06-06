package main.java.ru.yandex.praktikum.lessons.Static;

public class Flat {
    int number;
    double area;
    int roomCount;
    static String company;

    public Flat (int number, double area, int roomCount)
    {
        this.number = number;
        this.area = area;
        this.roomCount = roomCount;
    }

    public static void main (String[] args)
    {
        Flat flat1 = new Flat(5,60.5,3);
        flat1.company = "Ентерпрайз 7";
        Flat flat2 = new Flat(6,30,1);
        System.out.println(flat2.company);//Для второй квартиры управляющую компанию не установили.
        // Но если спросить у программы, какая управляющая компания у flat2, она ответит «Ентерпрайз 7"»:
    }
}
