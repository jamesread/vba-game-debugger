package vbagamedebugger.games.pokemon;

import vbagamedebugger.games.pokemon.red.pathFinder.Cell;

public class Block {
	public int tileCollection;

	public Tile contents[] = new Tile[16];

	public Cell tl, tr, bl, br;

	public int id;

	private final int x;
	private final int y;

	public Block(int blockId, int x, int y) {
		this.id = blockId;
		this.x = x;
		this.y = y;

		this.tl = new Cell(this);
		this.tr = new Cell(this);
		this.bl = new Cell(this);
		this.br = new Cell(this);
	}

	public Block fillWithTile(int tileId) {
		for (int i = 0; i < this.contents.length; i++) {
			this.contents[i] = new Tile(tileId);
		}

		return this;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	@Override
	public String toString() {
		return this.id + "";
	}
}
