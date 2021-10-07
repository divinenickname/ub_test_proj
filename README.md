# ub_test_proj
Test project for applying in unabank

Вам на ревью принесли код нового микросервиса.
Микросервис хранит основную информацию о пользователях. В MVP бизнес хочет видеть следующие фичи:
* ФИО
* Дата рождения
* Контактная информация
* Добавление новых данных
* Изменение данных
* Если ФИО + Дата рождения есть в системе - не добавлять данные
* Изменять на null нельзя.


## Задание 0
Посмотреть существующий проект и указать на недочеты. Проект компилируется.

## Задание 1
Добавить для таблиц дату создания и изменения записей. 

`created_at` - время создания записи

`updated_at` - время изменения записи
___

## Задание 2
1. Создать таблицу для `contact`
2. Создать контроллер для добавления контакта
3. Создать контроллер для получения списка контактов
4. Предусмотреть разные типы (email, телефон)
5. Добавить валидацию для контроллера контактов.

## Задание 3
1. После старта приложения посчитать количество `person` в базе и вывести их число.
2. В продакшене мы хотим считать еще и число `contact`. Приложение должно как-то понимать что оно в проде.


## Задание 4
Предусмотреть невозможность параллельного изменения сущностей бд. 
Поговорить про транзакции, уровни изоляций и блокировки.