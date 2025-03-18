public class GuitarInventorySystem
{
    public static Guitar[] inventory = new Guitar[10];
    public static void main(String[] args)
    {
        //Insert Guitar
        for(int i = 0; i< inventory.length; i++) {
            //make guitar
            Guitar newGuitar = new Guitar();
            //set guitar properties
            System.out.println("Enter Guitar name : ");
            newGuitar.name = System.console().readLine();
            newGuitar.price = 100;

            //Add the new guitar to the inventory
            inventory[i] = newGuitar;
        }
    }
}