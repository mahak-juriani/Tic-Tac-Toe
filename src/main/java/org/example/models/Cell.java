package org.example.models;

public class Cell {
    private int row;
    private int col;
    private eCellState cellState;
    private Player player;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState = eCellState.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public eCellState getCellState() {
        return cellState;
    }

    public void setCellState(eCellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
