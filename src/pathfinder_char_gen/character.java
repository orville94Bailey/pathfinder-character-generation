/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder_char_gen;

import pathfinder_char_gen.global_enums.abilities;

/**
 *
 * @author Orville
 */
public class character {
    public Integer ability_scores[];
    public String char_name;

    character(String char_name) {
        this.ability_scores = new Integer[6];
        this.char_name = char_name;
    }
    
    public void generate(char_generator gen)
    {
        for(int i = 0; i < gen.ability_order.length; i ++){
            this.ability_scores[gen.ability_order[i].getValue()] = gen.ability_scores[i];
        }
    }
    
    @Override
    public String toString() {
        
        return char_name + '\n' +
                "###ABILITIES###" + '\n' + 
                "STR: " + ability_scores[abilities.STR.getValue()] + '\n' + 
                "DEX: " + ability_scores[abilities.DEX.getValue()] + '\n' + 
                "CON: " + ability_scores[abilities.CON.getValue()] + '\n' + 
                "INT: " + ability_scores[abilities.INT.getValue()] + '\n' +
                "WIS: " + ability_scores[abilities.WIS.getValue()] + '\n' + 
                "CHA: " + ability_scores[abilities.CHA.getValue()] + '\n';
        
    }
}
