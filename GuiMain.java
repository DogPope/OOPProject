package GameStopClone;

// Daniel Jameson T00158237
// Only Games menu has functionality. Don't waste time testing anything else.
/* This is the main application here for GameStopClone / AmazonClone or whatever
*  I'm calling it these days.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GuiMain extends JFrame implements ActionListener {
    Game residentEvil = new Game(1,"Resident Evil","Horror","Ca$hcom",-12f,"This one?");
    Game metalGearSolid = new Game(4,"Metal Gear Solid","Action","FromSoft",12.5f,"Romance");
    Game eldenRing = new Game(3,"Elden Ring","Action","FromSoft",12.5f,"Romance");
    Game doom = new Game(2,"Doom","Action","ID Software",12.50f,"Proper12");
    ArrayList<Game> alreadyExistingGames = new ArrayList<>(Arrays.asList(residentEvil,metalGearSolid,eldenRing,doom));

    String[] itemNames = {"Create","Remove","Delete","View"};
    JMenu customerMenu;
    JMenu gameMenu;
    JMenu employeeMenu;
    JMenu exitMenu;
    JMenuItem exitButton;
    JMenuItem items = null;

    /*private Game games;
    private Employee employees;*/

    public GuiMain() {
        super("Amazon");

        createCustomerMenu();
        createGameMenu();
        createEmployeeMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.orange);
        menuBar.add(customerMenu);
        menuBar.add(gameMenu);
        menuBar.add(employeeMenu);
        exitMenu = new JMenu("Exit");
        menuBar.add(exitMenu);
        exitButton = new JMenuItem("Close");
        exitMenu.add(exitButton);
        exitButton.addActionListener(this);

        ImageIcon icon = new ImageIcon("ebayLogo.png");
        setIconImage(icon.getImage());

        setVisible(true);
        setSize(1000, 500);
        setTitle("Login");
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel backgroundPanel = new JPanel();
        add(backgroundPanel);
        backgroundPanel.setBounds(0, 0, 1000, 500);
        backgroundPanel.setBackground(Color.blue);
    }
    public static void main(String[] args) {
        new GuiMain();
    }

    private void createFile() throws IOException {
        try{
            File file = new File("data.dat");
            if(file.exists()){
                ObjectInputStream output = new ObjectInputStream(new FileInputStream(file));
                alreadyExistingGames = (ArrayList<Game>) output.readObject();
            }
            else
                file.createNewFile();

        }
        catch(FileNotFoundException fnfe){
            JOptionPane.showMessageDialog(null,"The file requested could not be found!","Error",JOptionPane.ERROR_MESSAGE);
            fnfe.printStackTrace();
        }
        catch(ClassNotFoundException cnfe){
            JOptionPane.showMessageDialog(null,"The requested file could not be found!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    private void createCustomerMenu() {
        customerMenu = new JMenu("Customers");

        for (String itemName : itemNames) {
            items = new JMenuItem(itemName += " Customer");
            items.addActionListener(this);

            customerMenu.add(items);
        }
    }
    private void createGameMenu(){
        gameMenu = new JMenu("Games");

        for (String itemName : itemNames) {
            items = new JMenuItem(itemName += " Game");
            items.addActionListener(this);

            gameMenu.add(items);
        }
    }
    private void createEmployeeMenu(){
        employeeMenu = new JMenu("Employees");

        for (String itemName : itemNames) {
            items = new JMenuItem(itemName += " Employees");
            items.addActionListener(this);

            employeeMenu.add(items);
        }
    }

    private void addGame(ArrayList<Game> alreadyExistingGames){

        int IDNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter ID Number of the game:","ID entry",JOptionPane.INFORMATION_MESSAGE));
        String title = JOptionPane.showInputDialog(null,"Please enter the title of the game:","Name Field",JOptionPane.INFORMATION_MESSAGE);
        String description = JOptionPane.showInputDialog(null,"Please enter a description for the game:","Name Field",JOptionPane.INFORMATION_MESSAGE);
        String manufacturer = JOptionPane.showInputDialog(null,"Please enter the manufacturer of the game:","Name Field",JOptionPane.INFORMATION_MESSAGE);
        float price = Float.parseFloat(JOptionPane.showInputDialog(null,"Please enter the price of the game:","Name Field",JOptionPane.INFORMATION_MESSAGE));
        String genre = JOptionPane.showInputDialog(null,"Please enter the genre of the game:","Name Field",JOptionPane.INFORMATION_MESSAGE);

        Game entry = new Game(IDNumber,title,description,manufacturer,price,genre);
        alreadyExistingGames.add(entry);

        JOptionPane.showMessageDialog(null,"Product has been added to the Games page!","Entry added!",JOptionPane.INFORMATION_MESSAGE);

    }
    private void addCustomer(){

    }
    private void addEmployee(){

    }

    private void removeGame(ArrayList<Game> alreadyExistingGames){
        String search = JOptionPane.showInputDialog(null,"Please enter the name of the product you wish to destroy: ","Update Entry",JOptionPane.INFORMATION_MESSAGE);

        for (Game selectedGame : alreadyExistingGames) {
            if(selectedGame.getTitle().toLowerCase().contains(search.toLowerCase())){
                alreadyExistingGames.remove(selectedGame);
                JOptionPane.showMessageDialog(null,"The Game you entered has been removed!","Remove Product",JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    private void updateGame(ArrayList<Game> alreadyExistingGames){
        // Thinks its taking in void for some reason.
        // int gameID = JOptionPane.showMessageDialog(null,"Please enter the ID of the game you would like to Update: ","Update Game",JOptionPane.INFORMATION_MESSAGE);

        for (Game selectedGame : alreadyExistingGames) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Close"))
            if(JOptionPane.showConfirmDialog(null, "Are you sure you wish to exit the application?",
                    "Exiting Application", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null,"Saving object details before exiting!","Saving",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            } else{
                repaint();
            }
        if(e.getActionCommand().equals("Create Game"))
            addGame(alreadyExistingGames);
        if(e.getActionCommand().equals("Remove Game"))
            removeGame(alreadyExistingGames);
        if(e.getActionCommand().equals("Update Game"))
            updateGame(alreadyExistingGames);
    }
}
