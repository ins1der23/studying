package View;

/**
 * Интрфейс для View
 */
public interface iView
{
    
    /**
     * Получение строки от пользователя
     * @param invite Сообщение пользователю
     * @param clear Очистить терминал
     * @return Строка, введенная пользователем
     */
    String getString(String invite, Boolean clear);

   
    
    /**
     * Вывод сообщения пользователю в консоль
     * @param message Сообщение пользователю
     * @param clear Сообщение пользователю
     */
    void showString(String message, Boolean clear);

        
    /**
     * Пауза выполнения до нажатие Enter
     * @param invite Сообщение пользователю
     */
    void pressEnter(String invite);
}