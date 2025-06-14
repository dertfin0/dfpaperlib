# DFPaperLib
DFPaperLib - небольшая библиотека-дополнение к Paper API с некоторыми упрощениями и новыми фишками

## Использование
Добавить в `dependencies` как jar или через GitHub-репозиторий
```groovy
dependencies {
    implementation files("libs/dfpaperlib.jar")
    // или
    implementation 'ru.dfhub:dfpaperlib:1.2'
}
```

## Фичи
### Удобное получение материалов
Используя класс `MaterialUtil`, можно получить материалы по их названию, указывая их в естественном формате - в любом регистре, с пробелами
```java
// Реализация через Paper API, которая позволяет получить Material только в том случае, если название указано в приведённом ниже формате
Material.getMaterial("ENDER_PEARL");
Material.getMaterial("BEDROCK");
Material.getMaterial("COOKED_PORKCHOP");

// Реализация через DFPaperLib
MaterialUtil.get("ender pearl"); // Можно использовать пробелы
MaterialUtil.get("bEdrOcK"); // Регистр не имеет значения
MaterialUtil.get("Cooked Porkchop"); // Более удобный формат для чтения
```