package com.harsh.designpattern.structural.proxy;

/**
 * This pattern useful for to control the access of functionality.
 *
 * proxy pattern is surrogate / placeholder to another object to control access to it
 *
 * here instead of giving direct access to CommandExecutor implemenation we write a
 * seperacte class here we chk first that incoming user has certain permission or not and then
 * only we intialized and called particular functionality
 */
public class CommandExecutorProxy implements CommandExecutor {

    private CommandExecutor commandExecutor;

    public CommandExecutorProxy(String user, String password) {
        if (user.equalsIgnoreCase("harshal") && password.equals("pass")) {
            commandExecutor = new CommandExecutorImpl();
        }
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (commandExecutor != null) {
            commandExecutor.runCommand(cmd);
        } else
            System.out.println("Permission Denied!");
    }
}
