import unittest
from checkneighbours import get_same_neighbours_ids

class TestFunctions(unittest.TestCase):
    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck5_wanneerGetSameNeighboursIds_dan2en4en10(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 5)
        # Assert
        self.assertEqual(result, [2,4,10])
        
    def test_gegevenVoorbeeldgridWith4Height4IndexToCheck15_wanneerGetSameNeighboursIds_dan10en14(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 15)
        # Assert
        self.assertEqual(result, [10,14])
        
    def test_gegevenVoorbeeldgridWith4Height5IndexToCheck17_wanneerGetSameNeighboursIds_dan13en14en16en18(self):
        # Arrange
        voorbeeld_grid = [ 0, 0, 1, 0,
                          1, 1, 0, 2,
                          2, 0, 1, 3,
                          0, 1, 1, 1, 
                          1, 1, 1, 1 ]
        # Act
        result = get_same_neighbours_ids(voorbeeld_grid, 4, 4, 15)
        # Assert
        self.assertEqual(result, [13,14,16,18])

if __name__ == '__main__':
    unittest.main()