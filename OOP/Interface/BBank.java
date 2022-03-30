package OOP.Interface;

public class BBank extends Main implements IBank,IDeneme{

    private String bankName;
    private String terminalId;
    private String password;

    public BBank(String bankName, String terminalId, String password) {
        this.bankName = bankName;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean connect(String ipAdress) {
        if(ipAdress.equals("123")){
            System.out.println("Makina ip :"+BBank.hostIpAdress);
            System.out.println(this.bankName +" bağlanıldı.");
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public boolean payment(double price, String cardNumber, String date, String cvc) {
        System.out.println("Bankadan cevap bekleniyor.");
        System.out.println("işlem başarılı oldu!");
        return true;
    }
}
