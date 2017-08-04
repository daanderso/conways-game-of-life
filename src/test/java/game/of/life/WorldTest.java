package game.of.life;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import game.of.life.World;

public class WorldTest {

	@Test
	public void ShouldTestANewCellWorldGridIsEmpty() {
		// Arrange
		World cellWorld = new World();

		// Act
		cellWorld.populateWorld();
		boolean result = cellWorld.isEmpty();

		// Assert
		assertEquals(true, result);
	}

	@Test
	public void ShouldTestThatACellHasBeenCreatedInCellWorldGrid() {
		// Arrange
		World cellWorld = new World();

		// Act
		cellWorld.populateWorld();
		cellWorld.addLivingCells(1,2);
		

		// Assert
		assertEquals(1, cellWorld.livingCellCount);
	}
	
	@Test
	public void ShouldTestThatTwoCellsHaveBeenCreatedInCellWorldGrid() {
		// Arrange
		World cellWorld = new World();

		// Act
		cellWorld.populateWorld();
		cellWorld.addLivingCells(1,2);
		cellWorld.addLivingCells(2,2);

		// Assert
		assertEquals(2, cellWorld.livingCellCount);
	}

	@Test 
	public void ShouldTestANewCellWorldGridIsNotEmpty() {
		
		// Arrange
		World cellWorld = new World();

		// Act
		cellWorld.populateWorld();
		cellWorld.addLivingCells(2,2);
		boolean result = cellWorld.isEmpty();

		// Assert
		assertEquals(1, cellWorld.livingCellCount);
		assertEquals(false, result);
	}
	
	
	
}
