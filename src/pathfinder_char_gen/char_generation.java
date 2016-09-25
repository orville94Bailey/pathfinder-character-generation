/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathfinder_char_gen;

import java.util.Scanner;

/**
 *
 * @author Orville
 */
public class char_generation {
    
    static Scanner scanner = new Scanner(System.in);
    static String char_type;
    static String char_name;
    //System.out.print("What type of character would you like to make: ");
    
    public static void main(String[] args) {
        do
        {
            System.out.println("what type of character would you like to make: ");
            char_type = scanner.nextLine();
            char_type = char_type.toLowerCase();
            
            if("quit".equals(char_type)){
                break;
            }
            
            System.out.println("Enter character name: ");
            char_name = scanner.nextLine();
            
            character create_char = new character(char_name);
            create_char.generate(new char_generator(char_type));
            
            System.out.print(create_char);
        }while (!"quit".equals(char_type));
    }
    
}
