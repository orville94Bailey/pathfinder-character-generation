package pathfinder_char_gen;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import pathfinder_char_gen.global_enums.abilities;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This is a short project to help understand design patterns.
 * The Factory design pattern is implemented here.
 * @author Orville
 */
public class char_generator {
    
    public Integer ability_scores[];
    public abilities ability_order[];
    
    char_generator(String char_type)
    {
        Random random_generator = new Random();
        char_type = char_type.toLowerCase();
        switch(char_type)
        {
            case "barbarian":
                ability_order = new abilities[]{
                    abilities.STR,
                    abilities.CON,
                    abilities.DEX,
                    abilities.INT,
                    abilities.WIS,
                    abilities.CHA
            };
                break;
            case "bard":
                ability_order = new abilities[]{
                    abilities.CHA,
                    abilities.CON,
                    abilities.DEX,
                    abilities.INT,
                    abilities.WIS,
                    abilities.STR
                };
                break;
            case "dex fighter":
                ability_order = new abilities[]{
                    abilities.DEX,
                    abilities.CON,
                    abilities.WIS,
                    abilities.STR,
                    abilities.INT,
                    abilities.CHA
                };
                break;
            case "ranger":
                ability_order = new abilities[]{
                    abilities.DEX,
                    abilities.WIS,
                    abilities.CON,
                    abilities.STR,
                    abilities.CHA,
                    abilities.INT
                };
                break;
            case "rogue":
                ability_order = new abilities[]{
                    abilities.DEX,
                    abilities.INT,
                    abilities.CHA,
                    abilities.CON,
                    abilities.WIS,
                    abilities.STR
                };
                break;
            case "str fighter":
                ability_order = new abilities[]{
                    abilities.STR,
                    abilities.CON,
                    abilities.DEX,
                    abilities.WIS,
                    abilities.CHA,
                    abilities.INT
                };
                break;
            case "wizard":
                ability_order = new abilities[]{
                    abilities.INT,
                    abilities.CHA,
                    abilities.WIS,
                    abilities.CON,
                    abilities.DEX,
                    abilities.STR
                };
                break;
            default:
                ability_order = new abilities[]{
                    abilities.STR,
                    abilities.DEX,
                    abilities.CON,
                    abilities.WIS,
                    abilities.INT,
                    abilities.CHA
                };
                break;
        }
        
        ability_scores = new Integer[6];
        for(int i = 0; i < ability_scores.length; i++){
            ability_scores[i] = random_generator.nextInt(16) + 3;
        }
        
        Arrays.sort(ability_scores, Collections.reverseOrder());
    }
}