import javax.swing.*;

/**
 * Created by weiranfang on 4/9/14.
 */

//Class to precise who is connected : Client or Server
public class Login {

    public static void main(String [] args){

        Object[] selectioValues = { "Server","Client"};
        String initialSection = "Server";

        Object selection = JOptionPane.showInputDialog(null, "Login as : ", "MyChatApp", JOptionPane.QUESTION_MESSAGE, null, selectioValues, initialSection);
        if(selection.equals("Server")){
            String[] arguments = new String[] {};
            new MultiThreadChatServerSync().main(arguments);
        }else if(selection.equals("Client")){
            String IPServer = JOptionPane.showInputDialog("Enter the Server ip address");
            String[] arguments = new String[] {IPServer};
            new ChatClient().main(arguments);
        }

    }

}