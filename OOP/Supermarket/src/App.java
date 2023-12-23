import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxInspector;



public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");
        Actor client3 = new SpecialClient("prezident", 1);
        Actor client4 = new TaxInspector();
        PromoClient client5 = new PromoClient("vazgen", "LadaTuning") ;
        PromoClient client6 = new PromoClient("kolyan", "LadaTuning");
        PromoClient client7 = new PromoClient("vasyan", "LadaTuning");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        
        client5.setReturnOrder(true);
        client2.setReturnOrder(true);
        
        
        magnit.update();
    }
}
