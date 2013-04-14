package dtran.mcifelli.game.junit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dtran.mcifelli.game.objects.Player;
import dtran.mcifelli.game.objects.Utilities;
import dtran.mcifelli.game.objects.Utility;
import dtran.mcifelli.game.objects.Weapons;
/**
 * JUnit Class for Player object class
 * Tests object's methods
 * @author dtran2
 *
 */
public class TestPlayer {
	Player player;
	@Before
	public void setUp(){
		player = new Player(12, 76);
	}

	@Test
	public void testGetPosition() {
		assertEquals(player.getPosition().getX(), 12);
		assertEquals(player.getPosition().getY(), 76);
	}
	@Test
	public void testGetWeapon(){
		assertSame(player.getWeapon(), Weapons.blade);
	}
	@Test
	public void testGetUtility(){
		assertSame(player.getUtility(), Utilities.solarPanel);
	}
	@Test
	public void testGetHealth(){
		assertEquals(player.getHealth(), 100);
	}
	@Test
	public void testGetEnergy(){
		assertEquals(player.getEnergy(), 100);
	}
	@Test
	public void testGetSpeed(){
		assertEquals(player.getSpeed(), 10);
	}
	@Test
	public void testGetPowerUp(){
		assertEquals(player.getPowerUp(), 0);
	}
	@Test
	public void testMove(){
		player.movePlayer(5, 8);
		assertEquals(player.getPosition().getX(), 5);
		assertEquals(player.getPosition().getY(), 8);
	}
}
