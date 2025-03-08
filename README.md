# Демопроект по автоматизации тестирования для сайта [Самокат](https://samokat.ru/)

## :page_facing_up: Содержание:
Технологии и инструменты
Реализованные проверки
Сборка в Jenkins
Параметры сборки в Jenkins
Пример Allure отчета
Уведомления в Telegram с использованием бота

## :computer: Технологии и инструменты:

## :white_check_mark: Реализованные проверки:
:white_check_mark: Проверка элементов в хедере страницы
:white_check_mark: Проверка элементов в боковом меню страницы
:white_check_mark: Проверка основных разделов страницы
:white_check_mark: Проверка элементов в футере страницы
:white_check_mark: Параметризированная проверка поиска по каталогу
:white_check_mark: Проверка страницы логина

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


## :wrench: Команда для запуска из терминала:
При выполнении данной команды в терминале IDE тесты запустятся удаленно в Selenoid

## :bell: Уведомления в Telegram с использованием бота:
После завершения сборки Telegram-бот автоматически обрабатывает и отправляет сообщение с отчетом о прогоне тестов
<img width="366" alt="Снимок экрана 2025-03-08 в 16 16 17" src="https://github.com/user-attachments/assets/8a2403eb-5370-463a-8a75-e45dce4dd2f0" />


