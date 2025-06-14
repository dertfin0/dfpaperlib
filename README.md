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

### Методы для работы со всеми игроками в сети
Используя `Global`, можно выполнять некоторые действия со всеми игроками в сети:

```java
Component reason = MiniMessage.miniMessage().deserialize("<red>Вас выкинули с сервера!</red>");
Component broadcastMessage = MiniMessage.miniMessage().deserialize("<green>Powered by <yellow>DFPaperLib</yellow>!</green>");

Global.kickAll(reason); // Кикает всех игроков с сервера
Global.kick(reason, player -> !player.isOp()) // Кикает всех игроков, у которых нет роли оператора
Global.kick(reason, player -> someCheck(player)) // Кикает всех игроков по определенному условию

Global.broadcastAll(broadcastMessage); // Отправляет всем игрокам в сети сообщение
Global.broadcast(broadcastMessage, player -> player.isOp()); // Отправляет всем игрокам в сети сообщение, у которых есть роли оператора
Global.broadcast(broadcastMessage, "some.permission"); // Отправляет сообщение всем игрокам, у которых есть пермишен "some.permission"
```