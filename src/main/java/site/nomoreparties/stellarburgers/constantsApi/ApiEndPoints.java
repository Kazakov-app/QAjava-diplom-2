package site.nomoreparties.stellarburgers.constantsApi;

public class ApiEndPoints {
    public static String BASE_URL = "https://stellarburgers.nomoreparties.site";
    public static String ORDER_CREATE_POST = "/api/orders/"; //Создание заказа
    public static String USER_CREATE_POST = "/api/auth/register"; //Создание и регистрация пользователя
    public static String USER_LOGIN_POST = "/api/auth/login"; //Логин пользователя
    public static String USER_UPDATES_DATA_PATCH = "/api/auth/user"; //Изменение данных пользователя
    public static String USER_RECEIVING_DATA_GET = "/api/auth/user"; //Получение данных конкретного пользователя
    public static String USER_RECEIPT_ORDERS_GET = "/api/orders"; //Получение заказов конкретного пользователя
    public static String USER_LOGOUT_POST = "/api/auth/logout"; //Выхода из системы
    public static String USER_DELETE = "/api/auth/user"; //Удаление пользователя
    public static String INGREDIENTS_GET = "/api/ingredients"; //Получение списка ингредиентов
}
