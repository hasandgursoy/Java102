package OOP.Interface;


public interface IBank {

    final String hostIpAdress = "127.0.0.1";

    // Interfaceses do not have variables but they could be have final defined variables

    boolean connect (String ipAdress);

    boolean payment (double price, String cardNumber,String date,String cvc);

    
}