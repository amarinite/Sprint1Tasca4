package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class IndexOutOfBoundsTest {

    @Test
    void indexOutOfBoundsShouldThrowException() {
        String[] testArray = {"arr1", "arr2"};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            IndexOutOfBounds.getElementFromArr(4, testArray);
        });
    }
}