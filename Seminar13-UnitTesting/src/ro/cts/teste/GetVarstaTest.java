package ro.cts.teste;

import org.junit.Test;
import ro.cts.clase.Persoana;
import ro.cts.exceptii.ExceptieCNPIncorect;
import ro.cts.exceptii.ExceptieCNPInexistent;

import static org.junit.Assert.*;

public class GetVarstaTest {

    private Persoana persoana;

    @org.junit.Before
    public void setUp() throws Exception {
        persoana = new Persoana();
    }

    @org.junit.Test
    public void getVarstaRight() {
        persoana =new Persoana("Popica","5030817430011");
        assertEquals(21,persoana.getVarsta());
    }
    @org.junit.Test
    public void getVarstaRight2() {
        persoana =new Persoana("Popica","1930817430011");
        assertEquals(31,persoana.getVarsta());
    }
    @org.junit.Test
    public void getVarstaBoundery1() {
        persoana =new Persoana("Popica","1991231430011");
        assertEquals(25,persoana.getVarsta());
    }
    @org.junit.Test
    public void getVarstaBoundery2() {
        persoana =new Persoana("Popica","5000101430011");
        assertEquals(25,persoana.getVarsta());
    }


    @org.junit.Test(expected = ExceptieCNPIncorect.class)
    public void getVarstaErrorCondition1() {
        persoana =new Persoana("Popica","5b00101430011");
        persoana.getVarsta();
    }

    @org.junit.Test(expected = ExceptieCNPIncorect.class)
    public void getVarstaErrorCondition2() {
        persoana =new Persoana("Popica","5001401430011");
        persoana.getVarsta();
    }

    @Test(timeout = 100)
    public void getVarstaPerformance() {
        persoana =new Persoana("Popica","5030817430011");
        persoana.getVarsta();
    }

    @Test
    public void getVarstaOrder(){
        persoana=new Persoana("Popica","5030817430011");
        Persoana persoana2= new Persoana("Ionica","1980817430011");
        persoana.getVarsta();
        persoana2.getVarsta();
        assertTrue(persoana2.getVarsta()>persoana.getVarsta());
    }

    @Test(expected = ExceptieCNPInexistent.class)
    public void getVarstaExistance(){
        persoana=new Persoana("Popica",null);
        persoana.getVarsta();
    }

    @Test
    public void getVarstaCardinality0(){
        persoana=new Persoana("Popica","5250117430011");
        assertEquals(0,persoana.getVarsta());
    }

    @Test
    public void getVarstaCardinality1(){
        persoana=new Persoana("Popica","5240417430011");
        assertEquals(1,persoana.getVarsta());
    }








}