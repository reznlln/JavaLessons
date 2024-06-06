package main.java.ru.yandex.praktikum.lessons;

public class Ticket {

    public static void main (String[] args){
    CashBox cashBox = new CashBox((short)1101);
    String[] electronicQueue = new String[]{"№1","№2","№3","№4","№5","№6","№7"};

        for (int i = 0; i < electronicQueue.length; i++)
        {
            increaseTicketNumber(cashBox);
            System.out.println("Клиент" + electronicQueue[i] + ", талон номер " + cashBox.ticketNumber + ", подойдите к кассе");
        }
    }


    private static void increaseTicketNumber (CashBox cashBox)
    {
        cashBox.ticketNumber = increase(cashBox.ticketNumber, (byte)1);
    }

    public static short increase (short numberToIncrease, byte increaser){
    return numberToIncrease = (short)(numberToIncrease + increaser);
    }
}



class CashBox {
    short ticketNumber;

    public CashBox(short initialNumber) {
        ticketNumber = initialNumber;
    }
}
