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
Проверка элементов в хедере страницы  
Проверка элементов в боковом меню страницы  
Проверка основных разделов страницы  
Проверка элементов в футере страницы  
Параметризированная проверка поиска по каталогу  
Проверка страницы логина  

## :arrow_forward: Сборка в Jenkins:
Перейти по [ссылке](https://jenkins.autotests.cloud/job/C32-nechaevanatalya-lesson14/)

Для запуска сборки необходимо кликнуть на "Build with parameters"

<img width="1419" alt="Снимок экрана 2025-03-08 в 16 11 55" src="https://github.com/user-attachments/assets/b80106e8-612a-4334-a594-a9832857f550" />


## :label: Параметры сборки в Jenkins:
browser (браузер, по умолчанию chrome)  
browserVersion (версия браузера, по умолчанию 122)  
browserSize (размер окна браузера, по умолчанию 1920x1080)  

## :bar_chart: Пример Allure отчета:

<img width="1425" alt="Снимок экрана 2025-03-08 в 16 14 20" src="https://github.com/user-attachments/assets/00c5ff94-f3ed-4cfc-a7d3-cc1c13c5275c" />

Результат выполнения тестов:

<img width="1425" alt="Снимок экрана 2025-03-08 в 16 41 11" src="https://github.com/user-attachments/assets/dcd37324-7426-417a-9b80-2361d065718e" />



## :bell: Уведомления в Telegram с использованием бота:
После завершения сборки Telegram-бот автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов
<img width="366" alt="Снимок экрана 2025-03-08 в 16 16 17" src="https://github.com/user-attachments/assets/8a2403eb-5370-463a-8a75-e45dce4dd2f0" />


