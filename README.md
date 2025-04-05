# Демопроект по автоматизации тестирования для сайта [Самокат](https://samokat.ru/)

> **Самокат** — сервис по доставке продуктов  

## :page_facing_up: Содержание:
Технологии и инструменты  
Реализованные проверки  
Сборка в Jenkins  
Параметры сборки в Jenkins  
Пример Allure отчета  
Уведомления в Telegram с использованием бота  

## :computer: Технологии и инструменты:
<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/logo/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/logo/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
<a href="https://telegram.org/"><img src="images/logo/Telegram.svg" width="50" height="50"  alt="Telegram"/></a>  
</p>


## :white_check_mark: Реализованные проверки:
Проверка наличия элементов на главной странице
Параметризированная проверка поиска по каталогу  
Проверка страницы логина  
Проверка добавления и удаления продукта из корзины

## :arrow_forward: Сборка в Jenkins:
Перейти по [ссылке](https://jenkins.autotests.cloud/job/C32-nechaevanatalya-lesson14/)

Для запуска сборки необходимо кликнуть на "Build with parameters"

<img width="1412" alt="Снимок экрана 2025-04-05 в 16 34 12" src="https://github.com/user-attachments/assets/41f9b4b5-419e-4ea5-aacc-ec40e8f4fdec" />

## :label: Параметры сборки в Jenkins:
browser (браузер, по умолчанию chrome)  
browserVersion (версия браузера, по умолчанию 122)  
browserSize (размер окна браузера, по умолчанию 1920x1080)  

## :bar_chart: Пример Allure отчета:

Для просмотра перейти по [ссылке](https://jenkins.autotests.cloud/job/C32-nechaevanatalya-lesson14/28/console)

Результат выполнения тестов:
<img width="1437" alt="Снимок экрана 2025-04-05 в 16 33 10" src="https://github.com/user-attachments/assets/c9d894ce-8299-4aa5-b38f-902dff4bac63" />


Видео с выполнением одного из тестов:
![allure-result.gif](images/gif/allure-result.gif)

## :bell: Уведомления в Telegram с использованием бота:
После завершения сборки Telegram-бот автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов

<img width="440" alt="Снимок экрана 2025-04-05 в 16 35 31" src="https://github.com/user-attachments/assets/86b5a8d6-5f52-4048-b8f9-555b7345c164" />




