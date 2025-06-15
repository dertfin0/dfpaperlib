package ru.dfhub;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.tag.resolver.Placeholder;

import static net.kyori.adventure.text.minimessage.MiniMessage.miniMessage;

/**
 * Work with text formatting
 */
public class Formatter {

    /**
     * Make component black
     * @param component Component
     * @return Component wrapped in black
     */
    public static Component black(Component component) {
        return wrap(component, "black");
    }

    /**
     * Make text black
     * @param text Text
     * @return Text wrapped in black
     */
    public static Component black(String text) {
        return wrap(Component.text(text), "black");
    }

    /**
     * Make component dark blue
     * @param component Component
     * @return Component wrapped in dark blue
     */
    public static Component darkBlue(Component component) {
        return wrap(component, "dark_blue");
    }

    /**
     * Make text dark blue
     * @param text Text
     * @return Text wrapped in dark blue
     */
    public static Component darkBlue(String text) {
        return wrap(Component.text(text), "dark_blue");
    }

    /**
     * Make component dark green
     * @param component Component
     * @return Component wrapped in dark green
     */
    public static Component darkGreen(Component component) {
        return wrap(component, "dark_green");
    }

    /**
     * Make text dark green
     * @param text Text
     * @return Text wrapped in dark green
     */
    public static Component darkGreen(String text) {
        return wrap(Component.text(text), "dark_green");
    }

    /**
     * Make component dark aqua
     * @param component Component
     * @return Component wrapped in dark aqua
     */
    public static Component darkAqua(Component component) {
        return wrap(component, "dark_aqua");
    }

    /**
     * Make text dark aqua
     * @param text Text
     * @return Text wrapped in dark aqua
     */
    public static Component darkAqua(String text) {
        return wrap(Component.text(text), "dark_aqua");
    }

    /**
     * Make component dark red
     * @param component Component
     * @return Component wrapped in dark red
     */
    public static Component darkRed(Component component) {
        return wrap(component, "dark_red");
    }

    /**
     * Make text dark red
     * @param text Text
     * @return Text wrapped in dark red
     */
    public static Component darkRed(String text) {
        return wrap(Component.text(text), "dark_red");
    }

    /**
     * Make component dark purple
     * @param component Component
     * @return Component wrapped in dark purple
     */
    public static Component darkPurple(Component component) {
        return wrap(component, "dark_purple");
    }

    /**
     * Make text dark purple
     * @param text Text
     * @return Text wrapped in dark purple
     */
    public static Component darkPurple(String text) {
        return wrap(Component.text(text), "dark_purple");
    }

    /**
     * Make component gold
     * @param component Component
     * @return Component wrapped in gold
     */
    public static Component gold(Component component) {
        return wrap(component, "gold");
    }

    /**
     * Make text gold
     * @param text Text
     * @return Text wrapped in gold
     */
    public static Component gold(String text) {
        return wrap(Component.text(text), "gold");
    }

    /**
     * Make component gray
     * @param component Component
     * @return Component wrapped in gray
     */
    public static Component gray(Component component) {
        return wrap(component, "gray");
    }

    /**
     * Make text gray
     * @param text Text
     * @return Text wrapped in gray
     */
    public static Component gray(String text) {
        return wrap(Component.text(text), "gray");
    }

    /**
     * Make component dark gray
     * @param component Component
     * @return Component wrapped in dark gray
     */
    public static Component darkGray(Component component) {
        return wrap(component, "dark_gray");
    }

    /**
     * Make text dark gray
     * @param text Text
     * @return Text wrapped in dark gray
     */
    public static Component darkGray(String text) {
        return wrap(Component.text(text), "dark_gray");
    }

    /**
     * Make component blue
     * @param component Component
     * @return Component wrapped in blue
     */
    public static Component blue(Component component) {
        return wrap(component, "blue");
    }

    /**
     * Make text blue
     * @param text Text
     * @return Text wrapped in blue
     */
    public static Component blue(String text) {
        return wrap(Component.text(text), "blue");
    }

    /**
     * Make component green
     * @param component Component
     * @return Component wrapped in green
     */
    public static Component green(Component component) {
        return wrap(component, "green");
    }

    /**
     * Make text green
     * @param text Text
     * @return Text wrapped in green
     */
    public static Component green(String text) {
        return wrap(Component.text(text), "green");
    }

    /**
     * Make component aqua
     * @param component Component
     * @return Component wrapped in aqua
     */
    public static Component aqua(Component component) {
        return wrap(component, "aqua");
    }

    /**
     * Make text aqua
     * @param text Text
     * @return Text wrapped in aqua
     */
    public static Component aqua(String text) {
        return wrap(Component.text(text), "aqua");
    }

    /**
     * Make component red
     * @param component Component
     * @return Component wrapped in red
     */
    public static Component red(Component component) {
        return wrap(component, "red");
    }

    /**
     * Make text red
     * @param text Text
     * @return Text wrapped in red
     */
    public static Component red(String text) {
        return wrap(Component.text(text), "red");
    }

    /**
     * Make component light purple
     * @param component Component
     * @return Component wrapped in light purple
     */
    public static Component lightPurple(Component component) {
        return wrap(component, "light_purple");
    }

    /**
     * Make text light purple
     * @param text Text
     * @return Text wrapped in light purple
     */
    public static Component lightPurple(String text) {
        return wrap(Component.text(text), "light_purple");
    }

    /**
     * Make component yellow
     * @param component Component
     * @return Component wrapped in yellow
     */
    public static Component yellow(Component component) {
        return wrap(component, "yellow");
    }

    /**
     * Make text yellow
     * @param text Text
     * @return Text wrapped in yellow
     */
    public static Component yellow(String text) {
        return wrap(Component.text(text), "yellow");
    }

    /**
     * Make component white
     * @param component Component
     * @return Component wrapped in white
     */
    public static Component white(Component component) {
        return wrap(component, "white");
    }

    /**
     * Make text white
     * @param text Text
     * @return Text wrapped in white
     */
    public static Component white(String text) {
        return wrap(Component.text(text), "white");
    }

    /**
     * Make component rainbow
     * @param component Text
     * @return Component wrapped in rainbow color
     */
    public static Component rainbow(Component component) {
        return wrap(component, "rainbow");
    }

    /**
     * Make text rainbow
     * @param text Text
     * @return Text wrapped in rainbow color
     */
    public static Component rainbow(String text) {
        return wrap(Component.text(text), "rainbow");
    }

    /**
     * Make component bold
     * @param component Component
     * @return Component wrapped in bold
     */
    public static Component bold(Component component) {
        return wrap(component, "b");
    }

    /**
     * Make text bold
     * @param text Text
     * @return Text wrapped in bold
     */
    public static Component bold(String text) {
        return wrap(Component.text(text), "b");
    }

    /**
     * Make component bold
     * @param component Component
     * @return Component wrapped in bold
     */
    public static Component b(Component component) {
        return wrap(component, "b");
    }

    /**
     * Make text bold
     * @param text Text
     * @return Text wrapped in bold
     */
    public static Component b(String text) {
        return wrap(Component.text(text), "b");
    }

    /**
     * Make component italic
     * @param component Component
     * @return Component wrapped in italic
     */
    public static Component italic(Component component) {
        return wrap(component, "i");
    }

    /**
     * Make text italic
     * @param text Text
     * @return Text wrapped in italic
     */
    public static Component italic(String text) {
        return wrap(Component.text(text), "i");
    }

    /**
     * Make component italic
     * @param component Component
     * @return Component wrapped in italic
     */
    public static Component i(Component component) {
        return wrap(component, "i");
    }

    /**
     * Make text italic
     * @param text Text
     * @return Text wrapped in italic
     */
    public static Component i(String text) {
        return wrap(Component.text(text), "i");
    }

    /**
     * Make component underline
     * @param component Component
     * @return Component wrapped in underline
     */
    public static Component underline(Component component) {
        return wrap(component, "u");
    }

    /**
     * Make text underline
     * @param text Text
     * @return Text wrapped in underline
     */
    public static Component underline(String text) {
        return wrap(Component.text(text), "u");
    }

    /**
     * Make component underline
     * @param component Component
     * @return Component wrapped in underline
     */
    public static Component u(Component component) {
        return wrap(component, "u");
    }

    /**
     * Make text underline
     * @param text Text
     * @return Text wrapped in underline
     */
    public static Component u(String text) {
        return wrap(Component.text(text), "u");
    }

    /**
     * Make component strikethrough
     * @param component Component
     * @return Component wrapped in strikethrough
     */
    public static Component strikethrough(Component component) {
        return wrap(component, "st");
    }

    /**
     * Make text strikethrough
     * @param text Text
     * @return Text wrapped in strikethrough
     */
    public static Component strikethrough(String text) {
        return wrap(Component.text(text), "st");
    }

    /**
     * Make component strikethrough
     * @param component Component
     * @return Component wrapped in strikethrough
     */
    public static Component st(Component component) {
        return wrap(component, "st");
    }

    /**
     * Make text strikethrough
     * @param text Text
     * @return Text wrapped in strikethrough
     */
    public static Component st(String text) {
        return wrap(Component.text(text), "st");
    }

    /**
     * Make component obfuscated
     * @param component Component
     * @return Obfuscated component
     */
    public static Component obfuscated(Component component) {
        return wrap(component, "obf");
    }

    /**
     * Make text obfuscated
     * @param text Text
     * @return Obfuscated text
     */
    public static Component obfuscated(String text) {
        return wrap(Component.text(text), "obf");
    }

    /**
     * Make component obfuscated
     * @param component Component
     * @return Obfuscated component
     */
    public static Component obf(Component component) {
        return wrap(component, "obf");
    }

    /**
     * Make text obfuscated
     * @param text Text
     * @return Obfuscated text
     */
    public static Component obf(String text) {
        return wrap(Component.text(text), "obf");
    }

    /**
     * Show text when hovering over text
     * @param component Text
     * @param hover Hover text. Can be formatted in MiniMessage
     * @return Text with hover-component
     */
    public static Component hover(Component component, String hover) {
        return wrap(component, "hover:show_text:'%s'".formatted(hover), "hover");
    }

    /**
     * Insert command into chat when clicking on text
     * @param component Text
     * @param command Command
     * @return Text with click-suggestion
     */
    public static Component suggestCommand(Component component, String command) {
        return wrap(component, "click:suggest_command:'%s'".formatted(command), "click");
    }
    /**
     * Run command when clicking on text
     * @param component Text
     * @param command Command
     * @return Text with command, running when clicked
     */
    public static Component runCommand(Component component, String command) {
        return wrap(component, "click:run_command:'%s'".formatted(command), "click");
    }

    /**
     * Open link when clicking on text
     * @param component Text
     * @param url Link
     * @return Text with link, opening when clicked
     */
    public static Component link(Component component, String url) {
        return wrap(component, "click:open_url:'%s'".formatted(url), "click");
    }

    /**
     * Wrap component with custom color
     * @param component Component
     * @param color Default color or hex
     * @return Colored component
     */
    public static Component color(Component component, String color) {
        return wrap(component, "color:%s".formatted(color), "color");
    }

    /**
     * Wrap text with custom color
     * @param text Text
     * @param color Default color or hex
     * @return Colored text
     */
    public static Component color(String text, String color) {
        return wrap(Component.text(text), "color:%s".formatted(color), "color");
    }

    /**
     * Adds shadow to component
     * @param component Component
     * @param color Shadow color (default or hex)
     * @return Component with shadow
     */
    public static Component shadow(Component component, String color) {
        return wrap(component, "shadow:%s".formatted(color), "shadow");
    }

    /**
     * Adds shadow to text
     * @param text Text
     * @param color Shadow color (default or hex)
     * @return Text with shadow
     */
    public static Component shadow(String text, String color) {
        return wrap(Component.text(text), "shadow:%s".formatted(color), "shadow");
    }

    /**
     * Wrap component with gradient
     * @param component Component
     * @param color Gradient colors, separated by semicolons
     * @return Component with gradient
     */
    public static Component gradient(Component component, String color) {
        return wrap(component, "gradient:%s".formatted(color), "gradient");
    }

    /**
     * Wrap text with gradient
     * @param text Text
     * @param color Gradient colors, separated by semicolons
     * @return Text with gradient
     */
    public static Component gradient(String text, String color) {
        return wrap(Component.text(text), "gradient:%s".formatted(color), "gradient");
    }

    /**
     * Make component monospaced
     * @param component Component
     * @return Monospaced component
     */
    public static Component code(Component component) {
        return wrap(component, "font:uniform", "font");
    }

    /**
     * Make text monospaced
     * @param text Text
     * @return Monospaced text
     */
    public static Component code(String text) {
        return wrap(Component.text(text), "font:uniform", "font");
    }

    /**
     * Get line break character
     * @return Component with line break character
     */
    public static Component br() {
        return miniMessage().deserialize("<br>");
    }

    /**
     * Combine multiple components
     * @param components Components
     * @return Combined component
     */
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
