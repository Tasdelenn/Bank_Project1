

public class Account {

    // FIELDS
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;
    private static int nextId=9000;

    // CONSTRUCTORS
    public Account() {
    }

    public Account( int customerId, AccountType accountType) {
        this.accountId = ++nextId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    // GETTER AND SETTER METHODS
    // TODO GETTER VE SETTER METODLARINI OLUŞTURUN

    public int getAccountId() {
        return accountId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public AccountType getAccountType() {
        return accountType;
    }



    ////////////////////////////////////////////////////////////////////////////


    // TODO PARA EKLE (DEPOSIT) METODU
    //  YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {
    /*
      1. BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
      2. YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN
      3. BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN
      4. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...
     */
        if (amount >=0 ) {
            balance += amount;
            System.out.println( amount + " TL, hesabınıza aktarıldı" );
            System.out.println("Bakiye (TL) = " + balance);
        }else {
            System.out.println("Yatırılacak tutar sıfırdan büyük olmalıdır; Tekrar deneyiniz.");
        }
/**
 * tutar>0 ise
 *      bakiye = bakiye + tutar
 *      tutar "hesabınıza aktarıldı"
 *      "güncel bakiye =" bakiye
 *  değilse
 *      "yatırılacak tutar sıfırdan büyük olmalı, lütfen tekrar deneyiniz..
 *
 *
 */

}




    ////////////////////////////////////////////////////////////////////////////////////////


    // TODO PARA ÇEK (WITHDRAW) METODU
    //  ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {

        /*
         1. BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
         2. ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN
         3. ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN
         4. ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE,BAKİYEDEN DÜŞÜP,YENİ BAKİYEYİ KULLANICIYA BİLDİRİN...
         5. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN
         */
        if(amount >= 0)
        {
            if (amount <= balance)
            {
                balance -= amount;
                System.out.println(amount + " TL hesabınızdan çekildi.");
                System.out.println("Güncel bakiye = " +balance);
            }else {
                System.out.println(amount + " TL tutarı için, yetersiz bakiye");
                System.out.println("Güncel bakiye = " +balance);
            }

        }else System.out.println("Çekilecek tutar sıfırdan büyük olmalıdır; Tekrar deneyiniz.");






    }
    /////////////////////////////////////////////////////////////////////////////////////

    // TODO TO STRING METODUNU OLUŞTURUN

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", customerId=" + customerId +
                ", balance=" + balance +
                ", accountType=" + accountType +
                '}';
    }


    ////////////////////////////////////////////////////////////////////////////////////////
}
