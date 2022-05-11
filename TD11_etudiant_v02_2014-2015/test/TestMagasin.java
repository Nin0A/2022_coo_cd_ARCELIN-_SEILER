package test;
import XML.ChargeurMagasin;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestMagasin {

    /**
     * test du constructeur de lampe
     */
    @Test

    public void chargerMagasin_ok() {
        try{
            ChargeurMagasin m = new ChargeurMagasin("musicbrainzSimple");
            m.chargerMagasin();
        }
        catch(FileNotFoundException f){
           System.out.println("chargerMagasin OK");
        }
    }
    @Test
    public void chargerMagasinNon_ok() {
        try{
            ChargeurMagasin m = new ChargeurMagasin("patate");
            m.chargerMagasin();
        }
        catch(FileNotFoundException f){
            System.out.println("chargerMagasin OK");
        }
    }
}
