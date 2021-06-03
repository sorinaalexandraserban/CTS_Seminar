package ro.ase.csie.cts.testare.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ro.ase.csie.cts.testare.exceptii.ExceptieNota;
import ro.ase.csie.cts.testare.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.testare.modele.Student;

public class TestStudentAlteTeste {

	// test fixture
	static Student student;
	static ArrayList<Integer> noteInitiale = new ArrayList<>();
	static String numeInitital;
	static int varstaInitiala;
	static int nrNoteInitiale;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numeInitital = "gigel";
		varstaInitiala = Student.MIN_VARSTA + 1;
		nrNoteInitiale = 3;
		for (int i = 0; i < nrNoteInitiale; i++) {
			noteInitiale.add(Student.MAX_NOTA - i);
		}
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeInitital, varstaInitiala, noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
		int varstaNoua = Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}

	@Test(expected = ExceptieVarsta.class)
	public void testSetVarstaRangeValoarePozitieMare() throws ExceptieVarsta {
		int varstaNoua = 200;
		student.setVarsta(varstaNoua);
	}

	@Test
	public void testSetVarstaBounderyLimitaInferioara() throws ExceptieVarsta {
		int varstaNoua = Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent = student.getVarsta();
		assertEquals("test pentru varsta minima", varstaNoua, varstaStudent);
	}

	@Test
	public void testSetVarstaBounderyLimitaSuperioara() throws ExceptieVarsta {
		int varstaNoua = Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent = student.getVarsta();
		assertEquals("test pentru varsta minima", varstaNoua, varstaStudent);
	}

	@Test
	public void testSetNoteReferenceDeepCopy() throws ExceptieNota {
		int[] noteStudent = new int[] { 9, 9, 10 };
		ArrayList<Integer> referintaNote = new ArrayList<>(Arrays.asList(9, 9, 10));

		student.setNote(referintaNote);

		referintaNote.set(0, 5);
		int noteExistente[] = new int[student.getNrNote()];
		for (int i = 0; i < student.getNrNote(); i++) {
			noteExistente[i] = student.getNota(i);

		}

		assertEquals("Test shallow copy pe setNote", noteStudent, noteExistente);
	}

}