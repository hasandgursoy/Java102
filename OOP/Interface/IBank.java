package OOP.Interface;


public interface IBank {

    final String hostIpAdress = "127.0.0.1";

    // Interfaceses do not have variables but they could be have final defined variables
    // Abstract classes could be have variables and must be extend
    // Interfaceses dont have variables and must be implement
    boolean connect (String ipAdress);

    boolean payment (double price, String cardNumber,String date,String cvc);

    
}