package theFloorRevolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	public static Room room = World.buildWorld();
	public static ArrayList<Item> inventory = new ArrayList<Item>();
	
	public static void print(Object obj) {
		System.out.println(obj);
	}
	
	public static void move(String dir) {
		if (dir.equals("east")) {
			if (room.getExit(0) == null) {
				print("You cannot move east!");
			} else {
				room = room.getExit(0);
				print("\nYou moved east to the "+room.getName()+"\n");
			}
		} else if (dir.equals("west")) {
			if (room.getExit(1) == null) {
				print("You cannot move west!");
			} else {
				room = room.getExit(1);
				print("\nYou moved west to the "+room.getName()+"\n");
			}
		} else if (dir.equals("north")) {
			if (room.getExit(2) == null) {
				print("You cannot move north!");
			} else {
				room = room.getExit(2);
				print("\nYou moved north to the "+room.getName()+"\n");
			}
		} else if (dir.equals("south")) {
			if (room.getExit(3) == null) {
				print("You cannot move south!");
			} else {
				room = room.getExit(3);
				print("\nYou moved south to the "+room.getName()+"\n");
			}
		} else if (dir.equals("up")) {
			if (room.getExit(4) == null) {
				print("You cannot move up!");
			} else {
				room = room.getExit(4);
				print("\nYou moved up to the "+room.getName()+"\n");
			}
		} else if (dir.equals("down")) {
			if (room.getExit(5) == null) {
				print("You cannot move down!");
			} else {
				room = room.getExit(5);
				print("\nYou moved down to the "+room.getName()+"\n");
			}
		}
	}
	
	public static void takeItem(String item) {
		if (room.getItem(item)!=null) {
			if (room.isHeavy(item)!=true) {
				print("\nYou've gotten a(n) "+room.getItem(item)+"!!");
				inventory.add(room.getItem(item));
				room.removeItem(item);
			} else
				print("You can't lift the "+room.getItem(item)+"!");
		} else {
			print("There is no "+item+" to be taken...");
		}
	}
	
	public static void runGame() {
		int running = 0;
		while (running == 0) {
			print(room+"\n");
			Scanner input = new Scanner(System.in);
			System.out.print("Please enter a command or direction to travel: "+"\n");
			String faker = input.nextLine().toLowerCase().replaceAll("\\b(the|to|out)\\b", "");
//			print(faker+"\n");
			String militia = faker.replaceAll("\\s+", " ");
//			print(militia+"\n");
			String[] commando = militia.split(" ");
//			for (String s:commando) {
//				print(s);
//			}
			switch(commando[0]) {
			case "go":
				switch(commando[1]) {
				case "up":
					move(commando[1]);
					break;
				case "down":
					move(commando[1]);
					break;
				case "north":
					move(commando[1]);
					break;
				case "south":
					move(commando[1]);
					break;
				case "east":
					move(commando[1]);
					break;
				case "west":
					move(commando[1]);
					break;
				}
				break;
			case "take":
				if (commando.length>1) {
					takeItem(commando[1]);
				} else {
					print("Take what?");
				}
				break;
			case "i":
				if (inventory.isEmpty() != true) {
					for (Item a:inventory) {
						System.out.print(a+" | ");
					}
				} else {
					print("You are carrying nothing.");
				}
				break;
			case "exit":
				print("\n\nAlright then, see you later!");
				input.close();
				running += 1;
				break;
			case "help":
				print("This is the move function! Input a direction (north, up, down, east, etc.) or enter 'exit' to quit the program!\n");
				break;
			default:
				print("What did you just say?");
			}
		}
	}
	
	public static void main(String[] args) {
		runGame();
	}
}

