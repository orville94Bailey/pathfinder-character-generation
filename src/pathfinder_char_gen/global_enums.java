/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder_char_gen;

/**
 *
 * @author Orville
 */
public class global_enums {
    public enum abilities{ STR(0), DEX(1),CON(2), INT(3), WIS(4), CHA(5);
    
    private final int id;
    abilities(int id) {this.id = id;}
    public int getValue() {return id;}
    }
}
