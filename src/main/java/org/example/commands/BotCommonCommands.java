package org.example.commands;

public class BotCommonCommands {
    @AppBotCommand(name = "/hello", description = "qwe", showInHelp = true)
    String hello() {
        return "Привет, друг!";
}

    @AppBotCommand(name = "/bye", description = "qwe", showInHelp = true)
    String bye() {
        return "Ты уже уходишь? Как жаль... Буду ждать :(";
    }

    @AppBotCommand(name = "/help", description = "qwe", showInKeyBoard = true)
    String help() {
        return "Вы воспользовались командой /help, скоро тут будут команды бота";
    }
}
