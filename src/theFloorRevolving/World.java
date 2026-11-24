package theFloorRevolving;

//import java.util.Scanner;

public class World {
	public static Room buildWorld() {
		Room cubicle = new Room("Cubicle", "\nThis is your home... and your prison where you're destined to work illegal wages until you somehow find a better job!! \n There's a computer on the lock screen in front of you, along with papers scattered about and a coffee mug on the table you got from Jerry. \nOn second thought, you should probably report your boss for paying Jerry in pieces of gum.");
		Room floor1a = new Room("Floor 1", "\nAround you, is a whole bunch of people looking at their cubicles or taking breaks watching videos and chatting. \nUsually you wouldn't talk much, but for some reason, it seems that you've magically forgotten where the bathroom is. \nSurely one of these empty-bladdered folk could help you out?");
		Room cafeteria = new Room("Cafeteria", "\nThis is a spacious area, with meals of varying levels of appeal sitting in front of hungry workers. \nThe place seems a little like your highschool cafeteria, which scares you slightly. \nAfter all, what point is there to a cafeteria without chocolate milk?");
		Room office = new Room("Office", "\nThis is a pretty sad-looking office, besides the chalkboard there's no decoration of any kind. \nThen again, you're not really supposed to be in here. Your boss just happened to be in the bathroom.. \nEven though he hasn't come back in an hour. \nSurely he wouldn't mind if you ate some chalk? ");
		Room floor1b = new Room("Floor 1?", "\nDespite what you read on the sign and what the room description tells you, \nyou have a sneaking suspicion that the floor above the first floor shouldn't be named 'Floor 1'. \nDespite that, there's no bathroom in sight, and it seems like everything warped a little. \nThere's even a Cafeteria here... as far as you remember (which isn't very long ago), there wasn't a Cafeteria on the first floor. Maybe you could grab something to eat? ");
		Room floor1c = new Room("Floor 1...", "So, this is definitely not the first floor. \nThere's no people around, and the only thing left are empty cubicles with weird non-euclidean desks. \nYou definitely won't stay for long... but, there is a cafeteria in the distance.");
		Room floor1d = new Room("Floor 1.", "Again? You thought you'd be done by now... however, there was a change in scenery! \nYou can't tell if that's a good or bad thing, but you definitely needed that. \nAround you is a grassy garden, with a nice stream running through the middle. \nHowever, of course, you're enclosed in concrete walls and a ceiling. \nYour only way forward seems to be a single elevator, but its inoperational. \nMaybe you can look around and find something?");
		Room floor2 = new Room("Floor 2", "Uhh... second floor poggies?");
		Room bathroom = new Room("Bathroom", "\nThis is it, what you've done all this work to do. \nWhat most would see as a semi-sanitary, basic bathroom with one broken soap dispenser, looks more like heaven right now than a dingy restroom. \nBut... the stalls are locked. It doesn't seem like there's any water to flush the Men's Room urinals either... \nRather than leaving a gift in there, you decide to figure something out in lieu of losing your job over sanitation concerns. ");
		
		cubicle.addExit(floor1a, 0); // 0=east
		floor1a.addExit(cubicle, 1); // 2=north // 1=west
		floor1a.addExit(floor1b, 4); // 4=up
		floor1b.addExit(floor1a, 5); // 5=down
		floor1b.addExit(office, 0); 
		floor1b.addExit(floor1c, 4);
		office.addExit(floor1b, 1);
		floor1c.addExit(floor1b, 5);
		floor1c.addExit(cafeteria, 0); // 3=south
		floor1c.addExit(floor1d, 4); 
		cafeteria.addExit(floor1c, 1);
		floor1d.addExit(floor1c, 5);
		floor1d.addExit(floor2, 4);
		floor2.addExit(floor1d, 5);
		floor2.addExit(bathroom, 2);
		bathroom.addExit(floor2, 0);
		
		cubicle.addItem("jevilscythe", new Item("Jevil Scythe"));
		cubicle.addHeavyItem("desk", new Item("Desk"));
		floor1a.addItem("floor2keycarda", new Item("Floor 2 Keycard A"));
		cafeteria.addItem("gourmetlunch", new Item("Gourmet Lunch"));
		cafeteria.addItem("moss", new Item("Moss"));
		return cubicle;		
	}
	public static void main(String[] args) {
		System.out.println("Wait you aren't supposed to be here go to theFloorRevolving/src/theFloorRevolving/Game.java bro");
	}
	
}
