package be.odisee;

public class PetRock {

    private String name;

    public PetRock(String name) {
        this.name = name;

    }
    public String getName() {
        return name;
    }

    class Apparaat {
        private boolean aan;
        public boolean isAan() { return aan;}
        public boolean toggleAanUit() { aan=!aan; return isAan(); }
    }
    public class aanUitTest {
        private Apparaat wasmachine=new Apparaat();
    }

}