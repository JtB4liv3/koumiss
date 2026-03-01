@echo off

setlocal enabledelayedexpansion

REM Укажите путь к папке назначения
set "target_path=C:\Users\PDA\IdeaProjects\ascii_game_demo"
REM Укажите путь к исходной папке
set "source_path=C:\Users\PDA\IdeaProjects\ascii_game_demo\out\artifacts\ascii_game_demo_jar"
REM Укажите имя файла для проверки
set "file_name=ascii_game_demo.jar"

REM Проверяем существование файла в целевой папке
if exist "%target_path%\%file_name%" (
    echo Файл "%file_name%" найден в "%target_path%"
    echo Удаляем файл...
    del "%target_path%\%file_name%"
    echo Файл успешно удален.
) else (
    echo Файл "%file_name%" не найден в "%target_path%"
)

REM Копируем файл из исходной папки
echo Выполняется копирование из "%source_path%"...

if exist "%source_path%\%file_name%" (
    copy "%source_path%\%file_name%" "%target_path%\"
    echo Файл успешно скопирован!
) else (
    echo Ошибка: Файл "%file_name%" не найден в исходной папке "%source_path%"
)

java -jar ascii_game_demo.jar
pause