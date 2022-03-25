package AccessModifiers;

public class First {

    // Bir sınıfa private demek hatadır. Sınıfın anlamı kalmaz. Kalıtımda bu durum halledilebilir tabi de şuan değil.

    private String str;

    First(String str){
        this.str = str;
    }

    public String getStr (){
        return this.str;
    }

    public void setStr (String newStr){
        this.str = newStr;
    }

    // public = heryerden gel bana ulaş
    // private = bana sadece benim yapımdan yada sınıfımdan ulaş
    // protected = bana sadece paket içinden ulaş
}

/*
 * Private Erişim Belirleyici
 * 
 * 
 * Java'da private deyimi yazıldığı öğenin sadece ait olduğu sınıftan doğrudan
 * erişilebilir olduğunu ve o sınıfın dışındaki kod parçacıklarından doğrudan
 * erişilemeyeceğini tanımlar. Nesne Yönelimli Programlama'nın temel
 * ilkelerinden olan Sarmalama ilkesi gereği, sınıf içindeki değişkenler sadece
 * sınıf içinde doğrudan erişebilir olması gerekir. Bundan dolayı, genellikle
 * değişkenler "private" olarak tanımlanır. Bazı zamanlarda ise sadece o sınıfta
 * çağrılmasını istediğimiz değişkenler veya metotları da private olarak
 * tanımlarız.
 * 
 * 
 * 
 * Public Erişim Belirleyici
 * 
 * 
 * Java'da "public" deyimi , yazıldığı öğenin sadece olduğu sınıf için değil,
 * diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar. Sınıflara
 * ait nesnelerin ve diğer nesneler tarafından kullanılması istenilen metotlar
 * için "Public Erişim Düzenleyicisi" kullanılır.
 * 
 * 
 * 
 * Protected Erişim Belirleyici
 * 
 * 
 * Java'da "protected" deyimi , public ve private arasında kalan bir erişim
 * düzenleyicidir. Protected ile tanımlanan öğeler, kendisi ile aynı package
 * (paket) bulunan sınıflar tarafından doğrudan erişilir.
 * 
 * 
 */