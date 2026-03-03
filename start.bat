@echo off

setlocal enabledelayedexpansion

REM Укажите путь к папке назначения
set "target_path=C:\Users\jtb49\IdeaProjects\koumiss"
REM Укажите путь к исходной папке
set "source_path=C:\Users\jtb49\
IdeaProjects\koumiss\out\artifacts\ascii_game_demo_jar"
REM Укажите имя файла для проверки
set "file_name=ascii_game_demo.jar"

REM Проверяем существование файла в целевой папке
if exist "%target_path%\%file_name%" (
    echo Файл "%file_name%" найден в "%target_path%"
    echo del...
    del "%target_path%\%file_name%"
    echo done.
) else (
    echo file "%file_name%" not found in "%target_path%"
)

REM Копируем файл из исходной папки
echo copy from "%source_path%"...

if exist "%source_path%\%file_name%" (
    copy "%source_path%\%file_name%" "%target_path%\"
    echo done.
) else (
    echo file "%file_name%" not found in "%source_path%"
)

java -jar ascii_game_demo.jar
pause