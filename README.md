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

Для работы большинства функций необходимо вызвать `DFPaperLib.init(Plugin)` при загрузке плагина, например, в `onEnable()`
```java
public void onEnable() {
    DFPaperLib.init(this);
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
Plugin plugin = MyPlugin.getInstance(); // Ваш плагин

Global.kickAll(reason); // Кикает всех игроков с сервера
Global.kick(reason, player -> !player.isOp()) // Кикает всех игроков, у которых нет роли оператора
Global.kick(reason, player -> someCheck(player)) // Кикает всех игроков по определенному условию

Global.broadcastAll(broadcastMessage); // Отправляет всем игрокам в сети сообщение
Global.broadcast(broadcastMessage, player -> player.isOp()); // Отправляет всем игрокам в сети сообщение, у которых есть роли оператора
Global.broadcast(broadcastMessage, "some.permission"); // Отправляет сообщение всем игрокам, у которых есть пермишен "some.permission"
```

Некоторые методы принимают в себя лямбду - это фильтр. В фильтр передается игрок, а из него возвращается `boolean`. 
Метод проверяет каждого игрока на этот фильтр и выполняет действие, если игрок подходит. Например, чтобы выполнить действие
только на операторах, можно использовать фильтр `player -> player.isOp()`.

### Ваниш
Используя `Vanish`, можно упростить логику создания ваниша на вашем сервере:
```java
Vanish.vanish(plugin, Bukkit.getPlayer("dertfin1")); // Прячет игрока dertfin1 от всех остальных игроков
Vanish.vanish(plugin, Bukkit.getPlayer("dertfin1"), player -> !player.isOp()); // Прячет игрока dertfin1 от всех игроков, кроме операторов
Vanish.unvanish(plugin, Bukkit.getPlayer("dertfin1")) // Показывает всем игрока dertfin1
Vanish.isVanished(plugin, Bukkit.getPlayer("dertfin1")) // Проверяет, является ли игрок dertfin1 ванишем
```

Также DFPaperLib автоматически скрывает сообщения о входе/выходе скрытых игроков и сохраняет статус ваниша между перезаходами игрока и рестартами сервера.  
При желании можно отключить стандартные ивенты ваниша, используя `Vanish.Handler.unregister()`

### Кастомный MOTD
Используя `CustomMotd`, можно опционально менять параметры MOTD
```java
CustomMotd.setMotd(Component.text("Powered by DFPaperLib")); // Устанавливает новое описание сервера
CustomMotd.setMotd(null); // Возвращает стандартный или установленный другим плагином MOTD
CustomMotd.setMaxPlayers(64);
CustomMotd.setOnlinePlayers(5);
CustomMotd.setCustomPlayerList(List.of("Player 1", "Player 2")); // Меняет строки в списке онлайн-игроков
CustomMotd.setServerIcon(new File("path/to/icon.png"));
```