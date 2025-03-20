package be.ses;

import java.util.ArrayList;
import java.util.List;

public class CheckNeighboursInGrid {
public CheckNeighboursInGrid(){}
/**
* This method takes a 1D Iterable and an element in the array and gives back an iterable containing the indexes of all neighbours with the same value as the specified element
*@return - Returns a 1D Iterable of ints, the Integers represent the indexes of all neighbours with the same value as the specified element on index 'indexToCheck'.
*@param grid - This is a 1D Iterable containing all elements of the grid. The elements are integers.
*@param width - Specifies the width of the grid.
*@param height - Specifies the height of the grid (extra for checking if 1D grid is complete given the specified width)
*@param indexToCheck - Specifies the index of the element which neighbours that need to be checked
*/
public static Iterable<Integer> getSameNeighboursIds(Iterable<Integer> grid,int width, int height, int indexToCheck){
    
    if (indexToCheck > (width * height) - 1){
        throw new IndexOutOfBoundsException("Index " + indexToCheck + " ligt buiten de grenzen van de array.");
    }

    /* 
    Eerste stappen:
        1) Aanmaken van een resultaatlijst die men terug kan geven (return)
        2) Kopieren van de Iterable "grid" naar een lijst, zodat elementen makkelijker uitgelezen worden
        3) Zoeken naar de waarde die men moet nakijken (Waarde kopieren op de gegeven index in de lijst).
    */

    ArrayList<Integer> result = new ArrayList<>();

    List<Integer> grid_listed = new ArrayList<>();
    for(Integer element : grid){
        grid_listed.add(element);
    }

    int value_to_check = grid_listed.get(indexToCheck);

    /*
    Vervolgens:
        4) Ophalen waar de index zich bevindt (rij, kolom).
        5) Kijken aan welke kant buren mogelijk zijn (boven, onder, links, rechts, links-boven, rechts-boven, links-onder en rechtsonder). 
        6) Buren (index) toevoegen als ze hetzelfde zijn.
    */

    int index_row = indexToCheck / width;
    int index_column = indexToCheck % width; 

    int possible_index;

        // Links-bovenbuur
    if (index_row > 0 && index_column > 0){                         // Is rij / kolom niet de bovenste / meest linkse?
        possible_index = indexToCheck - width - 1;                  // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Bovenbuur
    if (index_row > 0){                                             // Is de rij niet de bovenste?
        possible_index = indexToCheck - width;                      // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Rechts-bovenbuur
    if (index_row > 0 && index_column < (width - 1)){               // Is rij / kolom niet de bovenste / meest rechtse?
        possible_index = indexToCheck - width + 1;                  // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Linkse buur
    if (index_column > 0){                                          // Is kolom niet de meest linkse?
        possible_index = indexToCheck - 1;                          // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Rechtse buur
    if (index_column < (width - 1)){                                // Is kolom niet de meest rechtse?
        possible_index = indexToCheck + 1;                          // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Links-onderbuur
    if (index_row < (height - 1) && index_column > 0){              // Is rij / kolom niet de onderste / meest linkse?
        possible_index = indexToCheck + width - 1;                  // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Onderbuur
    if (index_row < (height - 1)){                                  // Is rij niet de onderste?
        possible_index = indexToCheck + width;                      // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

        // Rechts-onderbuur
    if (index_row < (height - 1) && index_column < (width - 1)){    // Is rij / kolom niet de onderste / meest rechtse?
        possible_index = indexToCheck + width + 1;                  // Verander de mogelijke index.
        if (grid_listed.get(possible_index) == value_to_check){     // Voeg de index toe als zijn waarde overeenkomt.
            result.add(possible_index);
        }
    }

    return result;
}

}