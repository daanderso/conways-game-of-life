package game.of.life;

public class World {
	//creating the cell world grid
	public String[][] cellWorld = new String[6][8];
	public int livingCellCount = 0;

	//populates grid/array to avoid null pointer exception
	public void populateWorld() {

		for (int r = 0; r < cellWorld.length; r++) {
			for (int c = 0; c < cellWorld.length; c++) {
				cellWorld[r][c] = ".";
			}
		}
	}

	public boolean isEmpty() {
		boolean result = true;

		//populateWorld();

		// goes through world grid to check for cell *
		for (int i = 0; i < cellWorld.length; i++) {
			for (int j = 0; j < cellWorld.length; j++) {

				if (cellWorld[i][j].equals("*")) {
					result = false;
				}

			}
			//result = true;
		}
		return result;
	}// end is empty function

	public int addLivingCells(int row, int column) {

		populateWorld();

		// String cell = "*";
		cellWorld[row][column] = "*";

		for (int i = 0; i < cellWorld.length; i++) {

			for (int j = 0; j < cellWorld.length; j++) {

				if (cellWorld[i][j].equals("*")) {

					livingCellCount = livingCellCount + 1;
				}
			}
		}

		System.out.println(livingCellCount);
		
		return livingCellCount;
	}

}
