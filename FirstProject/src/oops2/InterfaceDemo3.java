package oops2;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//abstract class is always inherited and single inheritance is allowed
//interfaces are always implemented and many interfaces can be implemented together
//interface - what to do - guideline - prototype - standard
//classes - logic - how to do things declared by interface
//interface is 100% abstract (till java 7)
// interface has each method as public abstract by default
// methods can use static and strictfp keywords also, if static is used fn needs a body
// interface has got each variable as public static final
// static means this variable or fn won't be inherited, it gets bind with class or interface


interface Player{
	public static final int START_HEALTH = 100;
	int MAX_POWER = 100;
	int MIN_POWER = 10;
	public static strictfp void getPlayerFeatures() {   // IEEE 754
		
//		10001001
//		sign | 7 digits for data
//		1110011100100001
//		sign | 8 bits for data after decimal | 23 bits for data
//		1 * 10^-3
//		50 ^ 10^-9
		
//		13245 /  53 -> 345.3553256778777
//		RIL -> KKR -> 2.32% -> $1kB
//		KKR -> 2.314564677%
//		KKR -> 2.32%
//		KKR -> 2.31457%
//		0.01 -> 43Cr
		System.out.println(START_HEALTH);
		System.out.println(MAX_POWER);
		System.out.println(MIN_POWER);
	}
	public abstract void kick();
	void punch();
	void attack();
	void defense();
	public default void entry() {
		System.out.println("Player will enter in some walking style");
	}
//	public abstract void entry();
//	static void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
}

interface StarPlayer{
//	public abstract void hide();
//	void fly();
	default void hide() {
		System.out.println("Player can hide");
	}
	default void fly() {
		System.out.println("Player can stay in air");
	}
	public default void entry() {
		System.out.println("Star Player will enter in some walking style");
	}
}

interface HybridPlayer extends Player, StarPlayer{
	void superPower();

	@Override
	default void entry() {
		Player.super.entry();
	}
	
	default void starEntry() {
		StarPlayer.super.entry();
	}
}

//interface StarPlayer extends Player{
//	public abstract void hide();
//	void fly();
//}

//abstract class CommonPlayer implements Player{
//	public abstract void kick();
//	
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
//}

//abstract class CommonHybridPlayer implements HybridPlayer{
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
//	@Override
//	public void hide() {
//		System.out.println("Player can hide");
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("Player can stay in air");
//	}
//}

//abstract class CommonStarPlayer implements StarPlayer{
//	@Override
//	public void hide() {
//		System.out.println("Player can hide");
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("Player can stay in air");
//	}
//	
//	@Override
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
//}

class Ryu implements Player{

	@Override
	public void kick() {
		System.out.println("high kick");
	}

	@Override
	public void punch() {
		System.out.println("strong and fast punch");
	}

	@Override
	public void attack() {
		System.out.println("special move");
	}

	@Override
	public void defense() {
		System.out.println("karate defense");
	}

//	@Override
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//		
//	}
	
}

class Honda implements Player{

	@Override
	public void kick() {
		System.out.println("low kick");
	}

	@Override
	public void punch() {
		System.out.println("heavy and slow punch");
	}

	@Override
	public void attack() {
		System.out.println("sit on other player");
	}

	@Override
	public void defense() {
		System.out.println("stand still");
	}

//	@Override
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
	
}

class Bison implements HybridPlayer{

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void punch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void superPower() {
		// TODO Auto-generated method stub
		
	}

		
}

//class Dhalsim implements Player, StarPlayer{    multiple implementation is allowed
class Dhalsim implements Player, StarPlayer{

	@Override
	public void kick() {
		System.out.println("normal kick");
	}

	@Override
	public void punch() {
		System.out.println("normal punch");
	}

	@Override
	public void attack() {
		System.out.println("do some magic");
	}

	@Override
	public void defense() {
		System.out.println("through magic");
	}

	@Override
	public void entry() {
		// TODO Auto-generated method stub
		StarPlayer.super.entry();
	}

//	@Override
//	public void hide() {
//		System.out.println("Player can hide");
//	}
//
//	@Override
//	public void fly() {
//		System.out.println("Player can stay in air");
//	}

//	@Override
//	public void entry() {
//		System.out.println("Player will enter in some walking style");
//	}
	
}

public class InterfaceDemo3 extends WindowAdapter{
	
	static void printDetails(Player player) {
		System.out.println(player.getClass().getSimpleName());
		player.attack();
		player.defense();
		player.entry();
		player.kick();
		player.punch();
		Player.getPlayerFeatures();
		System.out.println();
		
		HybridPlayer hp = (HybridPlayer)player;
		System.out.println(Player.START_HEALTH);
		hp.attack();
		hp.starEntry();
	}

	public static void main(String[] args) {
		
//		printDetails(new Ryu());
//		printDetails(new Honda());
		printDetails(new Bison());
//		printDetails(new Dhalsim());
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosed(e);
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowOpened(e);
	}

}
