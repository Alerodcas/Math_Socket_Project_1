
package My_Challenge_box.Math_Socket_Project_1;

import java.util.Random;

public class Dice {
    private int maxValue;
    private int minValue;
    
    /**
     * Metodo constructor con un valor predeterminado para los atributos de la clase
     */
    public Dice(){
        maxValue = 4;
        minValue = 1;
    }
    
    /**
     * Produce un numero random entre los limites establecidos
     * @return un numero random
     */
    public int getRollResult(){
        Random dice = new Random();
        int roll = dice.nextInt((maxValue - minValue) + 1) + minValue;
        
        return roll;
    }
    
}
