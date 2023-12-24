package Classes;

/**
 * Класс, описывающий клиентов, участвующих в акциях
 */

public class PromoClient extends Actor {

    private static int total = 2; // общее количество участников в акции
    private static int promoCounter = 1; // счетчик участников в акции

    private int id; // порядковый номер участника акции
    private String promoName; // название акции
    private boolean isPromo; // boolean значение для проверки PromoClient на возмоность участия в акции
    

    /**
     * Конструктор, принимающий в качестве аргументов name и promoname, присваюващий
     * isPromo true в случае соотвествия порядкового номера PromoClient общему числу
     * участников
     * акции. 
     * 
     * @param name
     * @param promoName
     */
    public PromoClient(String name, String promoName) {
        super(name);
        this.id = promoCounter++;
        this.promoName = promoName;
        if (id <= total) {
            isPromo = true;
        }
    }

    /**
     * Геттер id
     */
    public int getId() {
        return id;
    }

    /**
     * Геттер promoName
     */
    public String getPromoName() {
        return promoName;
    }

    /**
     * Оверрайд геттера name родительского класса
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Геттер isTakeOrder
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Геттер isMakeOrder
     */
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Геттер isReturnOrder
     */
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }

    /**
     * Сеттер для name
     */
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Сеттер isMakeOrder
     */
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    /**
     * Сеттер isTakeOrder присваюващий true в случае успешной проверки на
     * возможность участия в акции,
     * присваивает isCancelOrder true в случае неуспешной проверки
     */
    public void setTakeOrder(boolean isTakeOrder) {
        if (isPromo)
            super.isTakeOrder = isTakeOrder;
        else
            super.isCancelOrder = true;
    }

    /**
     * Сеттер isReturnOrder
     */
    public void setReturnOrder(boolean isReturnOrder) {
        super.isReturnOrder = isReturnOrder;
    }

    /**
     * Получение ссылки на самого себя
     */
    public Actor getActor() {
        return this;
    }

}
