package ru.dfhub;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;

import static net.kyori.adventure.text.minimessage.MiniMessage.miniMessage;

public class Formatter {

    public static Component black(Component component) {
        return wrap(component, "black");
    }

    public static Component black(String text) {
        return wrap(Component.text(text), "black");
    }

    public static Component darkBlue(Component component) {
        return wrap(component, "dark_blue");
    }

    public static Component darkBlue(String text) {
        return wrap(Component.text(text), "dark_blue");
    }

    public static Component darkGreen(Component component) {
        return wrap(component, "dark_green");
    }

    public static Component darkGreen(String text) {
        return wrap(Component.text(text), "dark_green");
    }

    public static Component darkAqua(Component component) {
        return wrap(component, "dark_aqua");
    }

    public static Component darkAqua(String text) {
        return wrap(Component.text(text), "dark_aqua");
    }

    public static Component darkRed(Component component) {
        return wrap(component, "dark_red");
    }

    public static Component darkRed(String text) {
        return wrap(Component.text(text), "dark_red");
    }

    public static Component darkPurple(Component component) {
        return wrap(component, "dark_purple");
    }

    public static Component darkPurple(String text) {
        return wrap(Component.text(text), "dark_purple");
    }

    public static Component gold(Component component) {
        return wrap(component, "gold");
    }

    public static Component gold(String text) {
        return wrap(Component.text(text), "gold");
    }

    public static Component gray(Component component) {
        return wrap(component, "gray");
    }

    public static Component gray(String text) {
        return wrap(Component.text(text), "gray");
    }

    public static Component darkGray(Component component) {
        return wrap(component, "dark_gray");
    }

    public static Component darkGray(String text) {
        return wrap(Component.text(text), "dark_gray");
    }

    public static Component blue(Component component) {
        return wrap(component, "blue");
    }

    public static Component blue(String text) {
        return wrap(Component.text(text), "blue");
    }

    public static Component green(Component component) {
        return wrap(component, "green");
    }

    public static Component green(String text) {
        return wrap(Component.text(text), "green");
    }

    public static Component aqua(Component component) {
        return wrap(component, "aqua");
    }

    public static Component aqua(String text) {
        return wrap(Component.text(text), "aqua");
    }

    public static Component red(Component component) {
        return wrap(component, "red");
    }

    public static Component red(String text) {
        return wrap(Component.text(text), "red");
    }

    public static Component lightPurple(Component component) {
        return wrap(component, "light_purple");
    }

    public static Component lightPurple(String text) {
        return wrap(Component.text(text), "light_purple");
    }

    public static Component yellow(Component component) {
        return wrap(component, "yellow");
    }

    public static Component yellow(String text) {
        return wrap(Component.text(text), "yellow");
    }

    public static Component white(Component component) {
        return wrap(component, "white");
    }

    public static Component white(String text) {
        return wrap(Component.text(text), "white");
    }

    public static Component rainbow(Component component) {
        return wrap(component, "rainbow");
    }

    public static Component rainbow(String text) {
        return wrap(Component.text(text), "rainbow");
    }

    public static Component bold(Component component) {
        return wrap(component, "b");
    }

    public static Component bold(String text) {
        return wrap(Component.text(text), "b");
    }

    public static Component b(Component component) {
        return wrap(component, "b");
    }

    public static Component b(String text) {
        return wrap(Component.text(text), "b");
    }

    public static Component italic(Component component) {
        return wrap(component, "i");
    }

    public static Component italic(String text) {
        return wrap(Component.text(text), "i");
    }

    public static Component i(Component component) {
        return wrap(component, "i");
    }

    public static Component i(String text) {
        return wrap(Component.text(text), "i");
    }

    public static Component underline(Component component) {
        return wrap(component, "u");
    }

    public static Component underline(String text) {
        return wrap(Component.text(text), "u");
    }

    public static Component u(Component component) {
        return wrap(component, "u");
    }

    public static Component u(String text) {
        return wrap(Component.text(text), "u");
    }

    public static Component strikethrough(Component component) {
        return wrap(component, "st");
    }

    public static Component strikethrough(String text) {
        return wrap(Component.text(text), "st");
    }

    public static Component st(Component component) {
        return wrap(component, "st");
    }

    public static Component st(String text) {
        return wrap(Component.text(text), "st");
    }

    public static Component obfuscated(Component component) {
        return wrap(component, "obf");
    }

    public static Component obfuscated(String text) {
        return wrap(Component.text(text), "obf");
    }

    public static Component obf(Component component) {
        return wrap(component, "obf");
    }

    public static Component obf(String text) {
        return wrap(Component.text(text), "obf");
    }

    public static Component hover(Component component, String hover) {
        return wrap(component, "hover:show_text:'%s'".formatted(hover), "hover");
    }

    public static Component suggestCommand(Component component, String command) {
        return wrap(component, "click:suggest_command:'%s'".formatted(command), "click");
    }

    public static Component runCommand(Component component, String command) {
        return wrap(component, "click:run_command:'%s'".formatted(command), "click");
    }

    public static Component link(Component component, String url) {
        return wrap(component, "click:open_url:'%s'".formatted(url), "click");
    }

    public static Component color(Component component, String color) {
        return wrap(component, "color:%s".formatted(color), "color");
    }

    public static Component color(String text, String color) {
        return wrap(Component.text(text), "color:%s".formatted(color), "color");
    }

    public static Component shadow(Component component, String color) {
        return wrap(component, "shadow:%s".formatted(color), "shadow");
    }

    public static Component shadow(String text, String color) {
        return wrap(Component.text(text), "shadow:%s".formatted(color), "shadow");
    }

    public static Component gradient(Component component, String color) {
        return wrap(component, "gradient:%s".formatted(color), "gradient");
    }

    public static Component gradient(String text, String color) {
        return wrap(Component.text(text), "gradient:%s".formatted(color), "gradient");
    }

    public static Component code(Component component) {
        return wrap(component, "font:uniform", "font");
    }

    public static Component code(String text) {
        return wrap(Component.text(text), "font:uniform", "font");
    }

    public static Component br() {
        return miniMessage().deserialize("<br>");
    }

    public static Component concat(Component... components) {
        Component result = Component.empty();
        for (Component component : components) {
            result = result.append(component);
        }
        return result;
    }

    private static Component wrap(Component component, String tag) {
        return miniMessage().deserialize("<%tag%><component></%tag%>".replaceAll("%tag%", tag), Placeholder.component("component", component));
    }

    private static Component wrap(Component component, String openTag, String closeTag) {
        return miniMessage().deserialize("<%tag1%><component></%tag2%>".replace("%tag1%", openTag).replace("%tag2%", closeTag), Placeholder.component("component", component));
    }
}
