Техническое задание для создания класса банка и пользователей
1. Класс "Пользователь"
Описание
Класс "Пользователь" будет представлять собой клиента банка с основной информацией и методами для управления его счетом.
Поля

•	firstName: Имя пользователя (тип: String)
•	lastName: Фамилия пользователя (тип: String)
•	age: Возраст пользователя (тип: int)
•	accountNumber: Номер счета пользователя (тип: int)
•	balance: Баланс на счете пользователя (тип: double)
Методы
•	User(String firstName, String lastName, int age, int accountNumber, double balance): Конструктор для инициализации полей.
•	deposit(double amount): Метод для внесения денег на счет.
•	withdraw(double amount): Метод для снятия денег со счета.
•	getBalance(): Метод для получения текущего баланса.
•	displayInfo(): Метод для вывода информации о пользователе.
2. Класс "Банк"
Описание
Класс "Банк" будет управлять списком пользователей и предоставлять методы для выполнения операций с пользователями.
Поля
•	users: Список пользователей (тип: List<User>)
Методы
•	Bank(): Конструктор для инициализации списка пользователей.
•	addUser(User user): Метод для добавления нового пользователя в список.
•	deposit(int accountNumber, double amount): Метод для внесения денег на счет пользователя.
•	withdraw(int accountNumber, double amount): Метод для снятия денег со счета пользователя.
•	displayUserInfo(int accountNumber): Метод для вывода информации о пользователе.
Общие замечания
•	Обеспечьте корректную обработку ошибок (например, недостатка средств при снятии денег).
•	Реализуйте гибкость в работе с балансами, обеспечивая возможность внесения и снятия денег.
Заключение
Это общий план технического задания для создания класса банка и пользователей. Он может быть доработан и дополнен в зависимости от вашей конкретной цели и потребностей. Удачи в разработке вашего проекта!



создать сервис где будет логика

displayInfo -> сделать tostirng

сделать проверку на меньше нуля у юзера где this.

использовать хешсет для юзеров