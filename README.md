## Описание зависимостей
1. Spring Boot - фреймворк для создания и запуска приложений на Java.
2. Spring Web - модуль для разработки веб-приложений на Spring.
3. Lombok - библиотека, которая позволяет сократить количество написанного кода, уменьшить количество бойлерплейта и улучшить читаемость кода.
4. JUnit - библиотека для тестирования Java-кода.
5. Mockito - библиотека для мокирования объектов при написании тестов.

## Инструкции для сборки и запуска приложения
Клонируйте репозиторий к себе на локальную машину:
git clone https://github.com/VadimNaletov/digital_chief_test_task.git

Перейдите в директорию с проектом:
cd digital_chief_test_task

В файле application.yaml введите в соответствующие поля username и password от БД MySQL, а также *schema* в поле url

Соберите проект с помощью Maven:
mvn clean package

Запустите приложение:
java -jar target/digital_chief_test_task-1.0-SNAPSHOT.jar

После успешного запуска приложения, вы можете обратиться к его API с помощью любого HTTP-клиента (Postman, cURL и т.д.). 
В репозитории размещен файл requestsExamples.txt с примерами. API будет доступно по адресу:
http://localhost:8080/api

## Заключение

После выполнения указанных выше инструкций, вы сможете успешно собрать и запустить приложение, а также обратиться к его API для использования функционала.


