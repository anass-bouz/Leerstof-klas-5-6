package be.odisee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetRockTest {

    @org.junit.jupiter.api.Test
    void getName() {
        PetRock rocky = new PetRock("Rocky");
        assertEquals("Rocky", rocky.getName());
    }


}