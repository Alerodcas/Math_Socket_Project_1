package com.mycompany.proyecto.Math_Socket_Project_1;

public class Player implements java.io.Serializable {

    public DoubleNode currentPosition;
    public int x;
    public int y;
    private int move = -100;

    /**
     * Metodo constructor
     * @param pos posicion actual del jugador
     * @param num1 posicion del jugador en x
     * @param num2 posicion del jugador en y
     */
    public Player(DoubleNode pos, int num1, int num2) {
        currentPosition = pos;
        x = num1;
        y = num2;
    }

    /**
     * @return posicion actual del jugador
     */
    public DoubleNode getCurrentPosition() {
        return currentPosition;
    }

    /**
     * @return la posicion en x del jugador
     */
    public int getX() {
        return x;
    }

    /**
     * @return la posicion en y del jugador
     */
    public int getY() {
        return y;
    }

    /**
     * Asigna la posicion en x del jugador
     * @param num nueva posicion en x del jugador
     */
    public void setX(int num) {
        this.x = num;
    }

    /**
     * Asigna la posicion en y del jugador
     * @param num nueva posicion en y del jugador
     */
    public void setY(int num) {
        this.y = num;
    }

    /**
     * mueve al jugador en el tablero
     * @param num cantidad de espacios que se va a mover
     */
    public void movePlayer(int num) {
        for (int i = 0; i < num; i++) {
            this.movePlace();
        }
    }

    /**
     * mueve al jugador en un trablero 4x4
     */
    public void movePlace() {
        if (this.x + move < 100 || this.x + move > 450) {
            setY(this.getY() + 50);
            this.move = -this.move;
        } else {
            setX(this.x + move);
        }
    }

    /**
     * Asigna la posicion actual del jugador
     *
     * @param pos nueva posicion
     */
    public void setCurrentPosition(DoubleNode pos) {
        currentPosition = pos;
    }

}
