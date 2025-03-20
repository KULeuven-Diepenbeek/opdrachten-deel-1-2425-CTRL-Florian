package be.ses;

import org.junit.Test;
// import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CheckNeighboursInGridTest {

    @Test 
    public void gegevenGridWidth4Height4Index5_wanneerGetSameNeighboursIds_danArray2_4_10() {
        // 1. Arrange
        CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
        ArrayList<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1));

        // 2. Act
        Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 4, 5));

        // 3. Assert
        assertThat(result).isEqualTo(Arrays.asList(2, 4, 10));
    }

    @Test 
    public void gegevenGridWidth4Height4Index0_wanneerGetSameNeighboursIds_danArray1() {
        // 1. Arrange
        CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
        ArrayList<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1));

        // 2. Act
        Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 4, 0));

        // 3. Assert
        assertThat(result).isEqualTo(Arrays.asList(1));
    }

    @Test 
    public void gegevenGridWidth4Height4Index15_wanneerGetSameNeighboursIds_danArray10_14() {
        // 1. Arrange
        CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
        ArrayList<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1));

        // 2. Act
        Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 4, 15));

        // 3. Assert
        assertThat(result).isEqualTo(Arrays.asList(10, 14));
    }

    @Test 
    public void gegevenGridWidth4Height4Index16_wanneerGetSameNeighboursIds_danIndexOutOfBoundsException() {
        // when
        Throwable thrown = catchThrowable(() -> {
            // 1. Arrange
            CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
            List<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1));

            // 2. Act
            Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 4, 16));
        });

        // 3. Assert
        assertThat(thrown)
            .isInstanceOf(IndexOutOfBoundsException.class)
            .hasMessageContaining("Index");
    }

    @Test 
    public void gegevenGridWidth4Height5Index12_wanneerGetSameNeighboursIds_danArray9_17() {
        // 1. Arrange
        CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
        List<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1, 1, 0, 1, 1));

        // 2. Act
        Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 5, 12));

        // 3. Assert
        assertThat(result).isEqualTo(Arrays.asList(9, 17));
    }

    @Test 
    public void gegevenGridWidth4Height5Index18_wanneerGetSameNeighboursIds_danArray13_14_15_19() {
        // 1. Arrange
        CheckNeighboursInGrid checkNeighbours = new CheckNeighboursInGrid();
        ArrayList<Integer> grid = new ArrayList<>(Arrays.asList(0, 0, 1, 0, 1, 1, 0, 2, 2, 0, 1, 3, 0, 1, 1, 1, 1, 0, 1, 1));

        // 2. Act
        Iterable<Integer> result = (checkNeighbours.getSameNeighboursIds(grid, 4, 5, 18));

        // 3. Assert
        assertThat(result).isEqualTo(Arrays.asList(13, 14, 15, 19));
    }
}

// [
// 0 0 1 0
// 1 1 0 2
// 2 0 1 3
// 0 1 1 1
// ]

// [
// 0 0 1 0
// 1 1 0 2
// 2 0 1 3
// 0 1 1 1
// 1 0 1 1
// ]