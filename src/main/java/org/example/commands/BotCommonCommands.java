package org.example.commands;

public class BotCommonCommands {
    @AppBotCommand(name = "/hello", description = "qwe", showInHelp = true)
    String hello() {
        return "������, ����!";
}

    @AppBotCommand(name = "/bye", description = "qwe", showInHelp = true)
    String bye() {
        return "�� ��� �������? ��� ����... ���� ����� :(";
    }

    @AppBotCommand(name = "/help", description = "qwe", showInKeyBoard = true)
    String help() {
        return "�� ��������������� �������� /help, ����� ��� ����� ������� ����";
    }
}
