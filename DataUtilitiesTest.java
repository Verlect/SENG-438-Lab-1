package org.jfree.data;

import static org.junit.Assert.*;

import org.junit.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;

/**
 * 
 * @author Group 21 (Lauraine Baffot, Alexis Hamrak, Abhay Khosla, Rachel
 *         Renegado). Class in which is for testing the methods of the Range
 *         Class Using boundaries and edge cases to create the following test
 *         cases for each method.
 *
 */
public class DataUtilitiesTest {

	// -----------------------------------------------------------------------------------------
	// The following code was taken from the SENG438 Lab Document
	// -----------------------------------------------------------------------------------------
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// This calls the setUpBefore even the class exists and does nothing.
	}

	@Before
	public void setUp() throws Exception {
		// Before each test case nothing is ready
	}
	// -----------------------------------------------------------------------------------------
	// End of Lab Document Code
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// CODE CREATED BY ABHAY AND RACHEL
	// -----------------------------------------------------------------------------------------
	/* Abhay codes and Rachel Reviews */

	// ------------- createNumberArray2D(double[][] data) Tests -----------

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 5 row, 2 column
	 * array of positive doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfFive() {
		Number[][] expectedArray = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 24.0, 12.0, 7.0, 4.0, 5.0 }, { 24.0, 12.0, 7.0, 4.0, 5.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of positive doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfOne() {
		Number[][] expectedArray = { { 21.0 }, { 21.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 21.0 }, { 21.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of negative doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfNegativeValues() {
		Number[][] expectedArray = { { -22.0 }, { -23.0 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { -22.0 }, { -23.0 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The test asserts that the expected 2 row, 1 column
	 * array of positive large value doubles is created.
	 */
	@Test
	public void createNumberRegular2DArrayOfHugeValues() {
		Number[][] expectedArray = { { 555e8 }, { 556e8 } };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 555e8 }, { 556e8 } };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a null double array and passing the object
	 * to a createNumberArray2D. The test asserts that the operation will throw an
	 * exception.
	 */
	@Test
	public void createNumber2DNullArray() {
		try {
			double[][] arrayToPass = null;
			// creating a null double 2D array
			DataUtilities.createNumberArray2D(arrayToPass);
			// passing the null object to the createNumberArray2D function
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The double array passed contains one row of 2
	 * positive double elements and one empty row. The test asserts that the
	 * expected 2 row array of doubles with one empty row is created.
	 */
	@Test
	public void createNumber2DEmptyArrayOne() {
		Number[][] expectedArray = { { 32.0, 33.0 }, {} };
		// creating the expected 2D array to be used in the assert
		double[][] arrayToPass = { { 32.0, 33.0 }, {} };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed the correct array values are.", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 2D array of doubles and passing the object
	 * to a createNumberArray2D. The double array passed contains 2 empty rows. The
	 * test asserts that the expected 2D empty of doubles is created.
	 */
	@Test
	public void createNumber2DEmptyArrayEmpty() {
		Number[][] expectedArray = { {}, {} };
		// creating the expected empty 2D array to be used in the assert
		double[][] arrayToPass = { {}, {} };
		// creating a 2D array of type double to pass to createNumberArray2D()
		Number[][] actualArray = DataUtilities.createNumberArray2D(arrayToPass);
		// calling the function to test
		assertArrayEquals("createNumberArray failed and is not an empty 2D array { {}, {} }; .", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	// ------------- **** calculateRowTotal(Values2D data, int row) Tests*****
	/**
	 * This test will simulate creating an empty Values2D table. The empty table is
	 * passed to calculateRowTotal() with a row number of 0 and expects that the
	 * total of the values in the row equal to 0.
	 */
	@Test
	public void calculateRowTotalEmptyChart() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(0));
				// will always returns 0 when getColumnCount() is called

				one(values).getRowCount();
				// invocation of getRowCount is expected once
				will(returnValue(0));
				// will always returns 0 when getRowCount is called
			}
		});
		int rowNumber = 0; // setting rowNumber to have an int value of 0
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with values and rowNumber
		assertEquals("The row total is adding up to 0", 0, result, .000000001d);
		// asserting the result adds up to 0
	}

	/**
	 * This test will simulate passing a null object to calculateRowTotal() with a
	 * row number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test
	public void calculateRowTotalNull() {
		try {
			DataUtilities.calculateRowTotal(null, 0);
			// calling calculateRowTotal() with a null object
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a Values2D table with positive values. The
	 * table is passed to calculateRowTotal() with a row number of 1 and expects
	 * that the total of the values in the row is correct.
	 */
	@Test
	public void calculateRowTotalPositive() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(4));
				// will always returns 4 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(4.0));
				// will always returns 4 when getValue(1, 3) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an int value of 1
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1
		assertEquals("The row total is adding up to 10", 10, result, .000000001d);
		// asserting the result adds up to 10 (1 + 2 + 3 + 4 = 10)
	}

	/**
	 * This test will simulate creating a Values2D table with negative values. The
	 * table is passed to calculateRowTotal() with a row number of 1 and expects
	 * that the total of the values in the row is correct.
	 */
	@Test
	public void calculateRowTotalNegative() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(5));
				// will always returns 5 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(-1.0));
				// will always returns -1.0 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(-2.0));
				// will always returns -2.0 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(-3.0));
				// will always returns -3.0 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(-4.0));
				// will always returns -4.0 when getValue(1, 3) is called

				one(values).getValue(1, 4);
				// invocation of getValue(1, 4) is expected once
				will(returnValue(-5.0));
				// will always returns -5.0 when getValue(1, 4) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an int value of 1
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1
		assertEquals("The row total is adding up to -15", -15, result, .000000001d);
		// asserting the result adds up to 15
		// (-1) + (-2) + (-3) + (-4) + (-5) = (-15)
	}

	/* Rachel codes and Abhay Reviews */

	/**
	 * This test will simulate creating a Values2D table with a negative index.
	 * Expectation is that an exception should be thrown.
	 */
	@Test
	public void calculateRowTotalNegativeIndex() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(2));
				// will always returns 5 when getColumnCount() is called

				one(values).getValue(-1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(-1.0));
				// will always returns -1.0 when getValue(1, 0) is called

				one(values).getValue(-1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(-2.0));
				// will always returns -2.0 when getValue(1, 1) is called
			}
		});

		int rowNumber = -1; // setting rowNumber to have an int value of -1
		try {
			DataUtilities.calculateRowTotal(values, rowNumber);
			// calling calculateRowTotal with Values2D = values and at rowNumber -1
			fail("This method should throw an exception!");
			// creating a failure message for if an exception is not thrown
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	// ------------- createNumberArray(double[] data) Tests ----------------------

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains 3 positive double
	 * elements. The test asserts that the expected positive 3 element array of
	 * doubles is created.
	 */
	@Test
	public void createNumberArrayPositiveDouble() {
		Number[] expectedArray = { 1.7, 2.2, 3.4 };
		// creating the expected 1D array with positive values to be used in the assert
		double[] arrayToPass = { 1.7, 2.2, 3.4 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {1.7, 2.2, 3.4}", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains 3 negative double
	 * elements. The test asserts that the expected negative 3 element array of
	 * doubles is created.
	 */
	@Test
	public void createNumberArrayNegativeDouble() {
		Number[] expectedArray = { -1.7, -2.2, -3.4 };
		// creating the expected 1D array with negative values to be used in the assert
		double[] arrayToPass = { -1.7, -2.2, -3.4 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {-1.7, -2.2, -3.4}", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a null double array and passing the object
	 * to a createNumberArray. The test asserts that the operation will throw an
	 * exception.
	 */
	@Test
	public void createNumberArrayNull() {
		try {
			double[] arrayToPass = null;
			// creating a null double 1D array
			DataUtilities.createNumberArray(arrayToPass);
			// passing the null object to the createNumberArray2D function
			fail("This method should throw an exception!");
			// creating a failure message for if createNumberArray2D does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed contains one elements of the
	 * value 0.0. The test asserts that the expected single element array of 0.0 is
	 * created.
	 */
	@Test
	public void createNumberArrayZero() {
		Number[] expectedArray = { 0.0 };
		// creating the expected 0.0 1D array to be used in the assert
		double[] arrayToPass = { 0.0 };
		// creating an 0.0 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {0.0}", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an empty array. The test
	 * asserts that the expected empty array of doubles is created.
	 */
	@Test
	public void createNumberArrayEmpty() {
		Number[] expectedArray = {};
		// creating the expected empty 1D array to be used in the assert
		double[] arrayToPass = {};
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {}", expectedArray, actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array with a positive
	 * and negative element. The test asserts that the expected array matching the
	 * passed array is created of type Number.
	 */
	@Test
	public void createNumberArrayNegativePositive() {
		Number[] expectedArray = { 1.2, -1.2 };
		// creating the expected 1D array to be used in the assert
		double[] arrayToPass = { 1.2, -1.2 };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain double values of {1.2, -1.2};", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array containing 4
	 * elements of the max double value. The test asserts that the expected array of
	 * max positive doubles is created.
	 */
	@Test
	public void createNumberArrayMaxDoubleFour() {
		Number[] expectedArray = { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
		// creating the expected 1D array of max double values to be used in the assert
		double[] arrayToPass = { Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain 4 elements of the max double value;", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}

	/**
	 * This test will simulate creating a 1D array of doubles and passing the object
	 * to a createNumberArray. The double array passed is an array containing 4
	 * elements of the minimum double value. The test asserts that the expected
	 * array of minimum negative doubles is created.
	 */
	@Test
	public void createNumberArrayMinDoubleFour() {
		Number[] expectedArray = { Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE };
		// creating the expected 1D array of minimum double values to be used in the
		// assert
		double[] arrayToPass = { Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE };
		// creating a 1D array of type double to pass to createNumberArray()
		Number[] actualArray = DataUtilities.createNumberArray(arrayToPass);
		// calling the function to test
		assertArrayEquals("The expected array should contain 4 elements of the min double value;", expectedArray,
				actualArray);
		// asserting the resulting Number array created matches the expected array
	}
	// -----------------------------------------------------------------------------------------
	// End of code created by Abhay and Rachel
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// Code created by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------
	/* Lauraine codes and Alexis reviews */

	// ------------- calculateColumnTotal(Values2D data, int column) Tests
	// ---------------------

	/**
	 * This test will simulate creating an empty Values2D table. The empty table is
	 * passed to calculateColumnTotal() with a column number of 0 and expects that
	 * the total of the values in the row equal to 0.
	 */
	@Test
	public void calculateColumnTotalEmptyChart() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(0));
			}
		});
		int columnumber = 0;
		double result = DataUtilities.calculateColumnTotal(values, columnumber);
		assertEquals("The column total is adding up to 0", 0, result, .000000001d);
	}

	/**
	 * This test will simulate passing a null object to calculateColumnTotal() with
	 * a column number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test(expected = IllegalArgumentException.class)
	public void calculateColumnTotalNull() {
		double result = DataUtilities.calculateColumnTotal(null, 0);
		assertEquals("The exception thrown type is IllegalArgumentException", 0.0, result, .000000001d);
	}

	/**
	 * This test will simulate passing a negative number for the column. The
	 * negative number is passed to calculateColumnTotalNegativeColumnNumber() with
	 * a Values2D table and expects that an IllegalArgumentException is thrown.
	 */
	@Test
	public void calculateColumnTotalNegativeColumnNumber() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(2));

				one(values).getValue(0, -1);
				will(returnValue(5.0));

				one(values).getValue(1, -1);
				will(returnValue(10.0));
			}
		});

		int columnNumber = -1;
		try {
			DataUtilities.calculateColumnTotal(values, columnNumber);
			// calling calculateRowTotal with Values2D = values and at rowNumber -1
			fail("This method should throw an exception!");
			// creating a failure message for if an exception is not thrown
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate creating a Values2D table with positive values. The
	 * table is passed to calculateColumnTotal() with a column number of 1 and
	 * expects that the total of the values in the column is correct.
	 */
	@Test
	public void calculateColumnTotalPositive() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(3));

				one(values).getValue(0, 1);
				will(returnValue(0.1));

				one(values).getValue(1, 1);
				will(returnValue(0.23));

				one(values).getValue(2, 1);
				will(returnValue(0.009));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The column total is adding up to 0.339", 0.339, result, .000000001d);
	}

	/**
	 * This test will simulate creating a Values2D table with negative values. The
	 * table is passed to calculateColumnTotal() with a column number of 1 and
	 * expects that the total of the values in the column is correct.
	 */
	@Test
	public void calculateColumnTotalNegative() {
		Mockery mockingContext = new Mockery();
		final Values2D values = mockingContext.mock(Values2D.class);

		mockingContext.checking(new Expectations() {
			{
				one(values).getRowCount();
				will(returnValue(2));

				one(values).getValue(0, 1);
				will(returnValue(-45.8));

				one(values).getValue(1, 1);
				will(returnValue(-5569.9));
			}
		});
		int columnNumber = 1;
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		assertEquals("The row total is adding up to -5615.7", -5615.7, result, .000000001d);
	}

	/* Alexis codes and Lauraine reviews */
	// ------------- equal(double[][] a, double[][] b) Tests ---------------------

	/**
	 * This test will check the equals() function to see if two equal (and same
	 * length) double 2D arrays can be passed in as arguments and are found to be
	 * equal.
	 */
	@Test
	public void testEqualityOfEqualArrays_SameLength() {
		double[][] array1 = { { 4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11 },
				{ 4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1 } };
		double[][] equalArray = { { 4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11 },
				{ 4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1 } };

		boolean equality = DataUtilities.equal(array1, equalArray);

		assertEquals("The equality should be true", true, equality);
	}

	/**
	 * This test will check the equals() function to see if two different (but same
	 * length) double 2D arrays can be passed in as arguments and are found not
	 * equal.
	 */
	@Test
	public void testEqualityOfUnequalArrays_SameLength() {
		// set up two equal length unequal valued arrays
		double[][] array1 = { { 4, -19, 20.4, 2.22, 17.2, 10, 8.7, 6.999, 30, 1.21 },
				{ 100.22, -66.2, 20.33, 4, 17, 10.01, 8, 17, 9.4, 2039.22 } };
		double[][] array2 = { { 1.0, -15, -11, 4.88, -17, 10, 8.66, 6, -78.22, 1 },
				{ 4.88, -19.4, 16, 17, -9.44, 10, 10.00, 6.4, 30, 1.6524 } };

		boolean equality = DataUtilities.equal(array1, array2);

		assertEquals("The equality should be false", false, equality);
	}

	/**
	 * This test will check the equals() function to see if two different length
	 * double 2D arrays can be passed in as arguments and are found to be not equal.
	 */
	@Test
	public void testEqualityOfArrays_DifferentLength() {
		// set up 2 arrays of different length
		double[][] array1 = { { 4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11 },
				{ 4.1, -19, 20.44, 4, 17.1234, 10, 8.77, 6, 30, 1 } };
		double[][] array2 = { { 4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11 }, { 4.1, -19, 20.44, 4, 17.1234 } };

		boolean equality = DataUtilities.equal(array1, array2);

		assertEquals("The equality should be true", false, equality);
	}

	/**
	 * This test will check the equals() function to see if a null and double array
	 * can be passed in as arguments and are found to be not equal.
	 */
	@Test
	public void testEqualityOfFirstNullArray() {
		// set up first array as null, second with values
		double[][] array1 = null;
		double[][] array2 = { { 55, -1, 0, 23, 777 }, { 1000, -63, 620 } };

		boolean equality = DataUtilities.equal(array1, array2); // check if arrays are equal

		assertEquals("The equality should be false", false, equality);
	}

	/**
	 * This test will check the equals() function to see if a null and double array
	 * can be passed in as arguments and are found to be not equal.
	 */
	@Test
	public void testEqualityOfSecondNullArray() {
		// set up second array as null, first with values
		double[][] array2 = null;
		double[][] array1 = { { 55, -1, 0, 23, 777 }, { 1000, -63, 620 } };

		boolean equality = DataUtilities.equal(array1, array2); // check if arrays are equal

		assertEquals("The equality should be false", false, equality);
	}

	/**
	 * This test will check the equals() function to see if two null arrays can be
	 * passed in as arguments and are found to be equal.
	 */
	@Test
	public void testEqualityOfTwoNullArrays() {
		// set up two null arrays
		double[][] array1 = null;
		double[][] array2 = null;

		boolean equality = DataUtilities.equal(array1, array2); // check if arrays are equal

		assertEquals("The equality should be true", true, equality);
	}

	// -----------------------------------------------------------------------------------------
	// End of code created by Alexis and Lauraine
	// -----------------------------------------------------------------------------------------

	// -----------------------------------------------------------------------------------------
	// CODE CREATED BY ABHAY AND LAURAINE
	// -----------------------------------------------------------------------------------------
	/* Abhay codes and Lauraine Reviews */

	// ------------- getCumulativePercentages(KeyedValues data) Tests -----------
	/**
	 * This test will create a mock object of the type KeyedValues with it's key and
	 * the values of the it. Later then this will be passed into
	 * getCumulativePercentage for these values which are inside the keys, and it
	 * expects the percentage will be calculated properly and with accuracy as well.
	 */
	@Test
	public void cumulativePercentageForIndexZeroSixteen() {
		Mockery mockingContext = new Mockery(); // This here is creating a new mock object called mockingContext.
		final KeyedValues data = mockingContext.mock(KeyedValues.class); // Using the mock object in the stored value
																			// above locally
		// and creating another local object data which is the type of final and
		// KeyedValues.

		mockingContext.checking(new Expectations() { // This is the start of the mock expectation block in where we use
														// will to ensure the
			// proper values are being returned.
			{
				atLeast(1).of(data).getItemCount(); // Here we call the ItemCount to get the number of values which will
													// be passed in.
				will(returnValue(2)); // We pass in the return value of 2 which will be returned whenever getItemCount
										// is called.

				atLeast(1).of(data).getValue(0); // This is calling the getValue method of data and that at minimum
													// there is a value at 0.
				will(returnValue(1.0)); // The return value will always be 1.0 when the getValue(0) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getValue(1); // This is calling the getValue method of data and that at minimum
													// there is a value at 1.
				will(returnValue(5.0)); // The return value will always be 5.0 when the getValue(1) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getKey(0); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 0.
				will(returnValue(25.0)); // The return value will always be 25.0 when the getKey(0) is called ensuring
											// the mock object is built correctly.

				atLeast(1).of(data).getKey(1); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 1.
				will(returnValue(26.0)); // The return value will always be 26.0 when the getKey(1) is called ensuring
											// the mock object is built correctly.

			}
		});
		// First adds 1 + 5 together all of the values and then it takes the key
		// at the index of 0 and then does 25/6 where 25 is the running total and 6 is
		// the total from all of the values
		// So 25/6 = 4.166666667 - 4 = 0.166666667 * 100 which is 16.6 percent(16.6%)
		KeyedValues result = DataUtilities.getCumulativePercentages(data); // Calls the getCumulativePercentage method
																			// to pass in the data
		// which is created by the mock objects and is being stored in a local variable
		// result.
		assertEquals("The value at the index of 0 is 0.166666667", 0.166666667, result.getValue(0).doubleValue(),
				.000000001d); // Asserting that the value is correct at the index of 0 which is 16.6% of the
								// percentage added up.
	}

	/**
	 * This test will create a mock object of the type KeyedValues with it's key and
	 * the values of the it. Later then this will be passed into
	 * getCumulativePercentage for these values which are inside the keys, and it
	 * expects the percentage will be calculated properly and with accuracy as well
	 * this test also covers a test that at different index other than 0 is summing
	 * up to 100 or not the percentage overall.
	 */
	@Test
	public void cumulativePercentageForIndexOneHundred() {
		Mockery mockingContext = new Mockery(); // This here is creating a new mock object called mockingContext.
		final KeyedValues data = mockingContext.mock(KeyedValues.class); // Using the mock object in the stored value
																			// above locally
		// and creating another local object data which is the type of final and
		// KeyedValues.

		mockingContext.checking(new Expectations() {// This is the start of the mock expectation block in where we use
													// will to ensure the
			// proper values are being returned.
			{
				atLeast(1).of(data).getItemCount(); // Here we call the ItemCount to get the number of values which will
													// be passed in.
				will(returnValue(2)); // We pass in the return value of 2 which will be returned whenever getItemCount
										// is called.

				atLeast(1).of(data).getValue(0); // This is calling the getValue method of data and that at minimum
													// there is a value at 0.
				will(returnValue(1.0)); // The return value will always be 1.0 when the getValue(0) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getValue(1); // This is calling the getValue method of data and that at minimum
													// there is a value at 1.
				will(returnValue(5.0)); // The return value will always be 5.0 when the getValue(1) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getKey(0);// This is calling the getKey method of data and that at minimum there is
												// a key placed at 0.
				will(returnValue(19.0)); // The return value will always be 19.0 when the getKey(0) is called ensuring
											// the mock object is built correctly.

				atLeast(1).of(data).getKey(1); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 1.
				will(returnValue(26.0)); // The return value will always be 26.0 when the getKey(1) is called ensuring
											// the mock object is built correctly.

			}
		});
		// First adds 1 + 5 + 19 together all of the values and then it takes the key
		// at the index of 1 and then does 26/(1+5+19) where 26 is the running total and
		// 6 + 19 is
		// the total from all of the values
		// So 26/25 = 1.04 * 100 which is 100 percent(100.04%)
		KeyedValues result = DataUtilities.getCumulativePercentages(data);// Calls the getCumulativePercentage method to
																			// pass in the data
		// which is created by the mock objects and is being stored in a local variable
		// result.
		assertEquals("The value at the index of 0 is 1.0", 1.0, result.getValue(1).doubleValue(), .000000001d);// Asserting
																												// that
																												// the
																												// value
																												// is
																												// correct
																												// at
																												// the
																												// index
																												// of 1
																												// which
																												// is
																												// 100%
																												// of
																												// the
																												// percentage
																												// added
																												// up.
	}

	/**
	 * This test will create a local object of the type KeyedValues which will be
	 * assigned null and then passing it in the method getCumulativePercentages to
	 * test wheter an exception is being thrown or not as part of the test creation.
	 */
	@Test
	public void cumulativePercentageDataNullCheck() {
		try {
			final KeyedValues dataToPass = null; // This is creating a local variable of the KeyedValues type and then
													// passing it in as a null.
			DataUtilities.getCumulativePercentages(dataToPass);
			// calling getCumulativePercentages() with a null data object
			fail("This method should throw an exception!");
			// creating a failure message for if getCumulativePercentages() does not throw
			// an exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will create a mock object of the type KeyedValues with it's key and
	 * the values of the it. Later then this will be passed into
	 * getCumulativePercentage for these values which are inside the keys, and it
	 * expects the percentage will be calculated properly and with accuracy as well
	 * this test also covers a test that at one of the index of values it is equal
	 * to null and if the percentage method performs the same functionality.
	 */
	@Test
	public void cumulativePercentageForIndexZeroSixteenPercentNullIncluded() {
		Mockery mockingContext = new Mockery(); // This here is creating a new mock object called mockingContext.
		final KeyedValues data = mockingContext.mock(KeyedValues.class);// Using the mock object in the stored value
																		// above locally
		// and creating another local object data which is the type of final and
		// KeyedValues.

		mockingContext.checking(new Expectations() {// This is the start of the mock expectation block in where we use
													// will to ensure the
			// proper values are being returned.
			{
				atLeast(1).of(data).getItemCount(); // Here we call the ItemCount to get the number of values which will
													// be passed in.
				will(returnValue(3)); // We pass in the return value of 3 which will be returned whenever getItemCount
										// is called.

				atLeast(1).of(data).getValue(0); // This is calling the getValue method of data and that at minimum
													// there is a value at 0.
				will(returnValue(1.0)); // The return value will always be 1.0 when the getValue(0) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getValue(1); // This is calling the getValue method of data and that at minimum
													// there is a value at 1.
				will(returnValue(5.0)); // The return value will always be 5.0 when the getValue(1) is called ensuring
										// the mock object is built correctly.

				atLeast(1).of(data).getValue(2); // This is calling the getValue method of data and that at minimum
													// there is a value at 2.
				will(returnValue(null)); // The return value will always be null when the getValue(2) is called ensuring
											// the mock object is built correctly.

				atLeast(1).of(data).getKey(0); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 0.
				will(returnValue(25.0)); // The return value will always be 25.0 when the getKey(0) is called ensuring
											// the mock object is built correctly.

				atLeast(1).of(data).getKey(1); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 1.
				will(returnValue(26.0)); // The return value will always be 26.0 when the getKey(1) is called ensuring
											// the mock object is built correctly.

				atLeast(1).of(data).getKey(2); // This is calling the getKey method of data and that at minimum there is
												// a key placed at 2.
				will(returnValue(27.0)); // The return value will always be 27.0 when the getKey(2) is called ensuring
											// the mock object is built correctly.

			}
		});
		// First adds 1 + 5 + null together all of the values and then it takes the key
		// at the index of 0 and then does 25/6 where 25 is the running total and 6 also
		// including null is
		// the total from all of the values
		// So 25/6 = 4.166666667 - 4 = 0.166666667 * 100 which is 16.6 percent(16.6%)
		KeyedValues result = DataUtilities.getCumulativePercentages(data); // Calls the getCumulativePercentage method
																			// to pass in the data
		// which is created by the mock objects and is being stored in a local variable
		// result.
		assertEquals("The value at the index of 0 is 0.166666667", 0.166666667, result.getValue(0).doubleValue(),
				.000000001d); // Asserting that the value is correct at the index of 0 which is 16.6% of the
								// percentage added up.
	}

	// ------------- calculateRowTotal(Values2D data, int row, int[] validCols)
	// Tests -------------
	/**
	 * This test will simulate passing a null object to calculateRowTotal() with a
	 * row number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test
	public void calculateRowTotalNullChecking() { // This is the three parameter version of what was done in Lab 2
		try {
			final Values2D valueToPass = null; // This is the local variable of the type Values2D which is assigned null
			final int rowNumberToPass = 0; // This is the local variable of the type of integer and is rowNumbers which
											// is assigned 0
			final int[] validColumnsToPass = { 0 }; // This is the local variable of the type of integer which is
													// assigned 0 as there is no valid columns
			DataUtilities.calculateRowTotal(valueToPass, rowNumberToPass, validColumnsToPass);
			// calling calculateRowTotal() with a null data object the three parameter
			// version is called
			fail("This method should throw an exception!");
			// creating a failure message for if calculateRowTotal() does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate passing a null object to calculateRowTotal() with a
	 * row number of 1 and is expected to calculate the total properly with the
	 * valid columns as the new parameter in this test which is also 1. Result adds
	 * up to 10 (1 + 2 + 3 + 4 = 10) which is correct expected output This test also
	 * includes null as one of the values in the row.
	 */
	@Test
	public void calculateRowTotalWithNull() { // This is the three parameter version of what was done in Lab 2
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(4));
				// will always returns 4 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(null));
				// will always returns 4 when getValue(1, 3) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an integer value of 1 as there was only one row
							// being built in the mock object
		final int[] validColumnsToPass = { 0, 1, 2, 3 }; // This is the valid columns which in this mock object are just one
												// column
		double result = DataUtilities.calculateRowTotal(values, rowNumber, validColumnsToPass);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1 and the
		// columns which are correct in this object only 1.
		assertEquals("The row total is adding up to 6.0", 6.0, result, .000000001d);
		// asserting the result adds up to 10 (1 + 2 + 3 + 4 = 10) for the three
		// parameter version
	}

	// ------------- calculateColumnTotal(Values2D data, int column, int[]
	// validRows) Tests -------------
	/**
	 * This test will simulate passing a null object to calculateColumnTotal() with
	 * a row number of 0 and expects that an IllegalArgumentException is thrown.
	 */
	@Test
	public void calculateColumnTotalNullChecking() {
		try {
			final Values2D valueToPass = null; // This is the local variable of the type Values2D which is assigned null
			final int columnNumberToPass = 0; // This is the local variable of the type of integer and is columnNumbers
												// which is assigned 0
			final int[] validRowsToPass = { 0 }; // This is the local variable of the type of integer which is assigned
													// 0 as there is no valid rows
			DataUtilities.calculateColumnTotal(valueToPass, columnNumberToPass, validRowsToPass);
			// calling calculateColumnTotal() with a null data object the three parameter
			// version is called
			fail("This method should throw an exception!");
			// creating a failure message for if calculateColumnTotal() does not throw an
			// exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass());
			// catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will simulate passing a null object to calculateColumnTotal() with
	 * a column number of 1 and is expected to calculate the total properly with the
	 * valid rows as the new parameter in this test which is also 1. Result adds up
	 * to 10 (1 + 2 + 3 + 4 = 10) which is correct expected output. This test also
	 * includes null as one of the values in the column.
	 */
	@Test
	public void calculateColumnTotalWithNull() { // This is the three parameter version of what was done in Lab 2
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getRowCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(4));
				// will always returns 4 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(4.0));
				// will always returns 4 when getValue(1, 3) is called
			}
		});
		int columnNumber = 1; // setting columnNumber to have an integer value of 1 as there was only one
								// column being built in the mock object
		final int[] validRowsToPass = { 1 }; // This is the valid rows which in this mock object are just one row
		double result = DataUtilities.calculateColumnTotal(values, columnNumber, validRowsToPass);
		// calling calculateColumnTotal with Values2D = values and at columnNumber 1 and
		// the row which are correct in this object only 1.
		assertEquals("The column total is adding up to 2.0", 2.0, result, .000000001d);
		// asserting the result adds up to 10 (1 + 2 + 3 + 4 = 10) for the three
		// parameter version
	}

	/* Lauraine codes and Abhay Reviews */

	// ------------- equal(double[][] a, double[][] b) Test -----------
	/**
	 * This test will be testing the equal function where the 2D arrays are
	 * different lengths.
	 */
	@Test
	public void testEqualityOfArrays_DifferentArrayLength() {
		// set up 2 arrays of different length
		double[][] array1 = { { 4, -19.23, 20, 4, 17.2233, 10, 8, 6.00, 30, 1.11 } };
		double[][] array2 = { { 4, -19.23, 20, 4 }, { 4.1, -19, 20.44, 4, 17.1234 } };

		boolean equality = DataUtilities.equal(array1, array2); // checks if arrays are equal

		assertEquals("The equality should be false", false, equality); // not equal
	}

	// --------- calculateColumnTotal(Values2D data, int column) Test ---------
	/**
	 * This test will be testing the calculateColumnTotal function when a value in
	 * the data table is null.
	 */
	@Test
	public void calculateColumnTotalNullData() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getRowCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(2));
				// will always returns 2 when getColumnCount() is called

				one(values).getValue(0, 1);
				// invocation of getValue(0, 1) is expected once
				will(returnValue(-25.98));
				// will always returns -25.98 when getValue(1, 1) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(null));
				// will always returns null when getValue(0, 1) is called
			}
		});
		int columnNumber = 1; // setting columnNumber to have an int value of 1
		double result = DataUtilities.calculateColumnTotal(values, columnNumber);
		// calling calculateColumnTotal with Values2D = values and at columnNumber 1
		assertEquals("The column total is adding up to -25.98", -25.98, result, .000000001d);
		// asserting the result adds up to -25.98
	}

	// ------------- calculateRowTotal(Values2D data, int row) Test -----------
	/**
	 * This test will be testing the calculateRowTotal function when a value in the
	 * data table is null.
	 */
	@Test
	public void calculateRowTotalNullData() {
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(2));
				// will always returns 2 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(null));
				// will always returns null when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(3.5));
				// will always returns 3.5 when getValue(1, 0) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an int value of 1
		double result = DataUtilities.calculateRowTotal(values, rowNumber);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1
		assertEquals("The row total is adding up to 3.5", 3.5, result, .000000001d);
		// asserting the result adds up to 3.5
	}

	// ------------- clone(double[][] source) Tests -----------
	/**
	 * This test will be testing the clone function when the 2D array is null.
	 */
	@Test
	public void cloneNullParameter() {
		try {
			double[][] array = null; // set up a null array
			DataUtilities.clone(array); // try to clone this null array
			fail("This method should throw an exception!"); // creating a failure message for if clone does not throw
															// an exception
		} catch (Exception e) {
			assertEquals("The exception thrown type is IllegalArgumentException", IllegalArgumentException.class,
					e.getClass()); // catching the exception, asserting that an IllegalArgumentException was thrown
		}
	}

	/**
	 * This test will be testing the clone function when the 2D array is empty.
	 */
	@Test
	public void cloneEmptyArray() {
		double[][] array = { {} }; // set up an empty array
		double[][] resultArray = DataUtilities.clone(array); // clone empty array
		assertArrayEquals("createNumberArray failed and is not an empty 2D array { {} }; .", array, resultArray);
		// assert that the clone function worked and the resultArray is also empty
	}

	/**
	 * This test will be testing the clone function when the 2D array contains a
	 * null value.
	 */
	@Test
	public void cloneNullDataInArray() {
		double[][] array = { { 2, 4, 5 }, null, { 19, 345 } }; // set an array with a null value
		double[][] resultArray = DataUtilities.clone(array); // clone array
		assertArrayEquals("createNumberArray failed the correct array values are {{ {2, 4, 5}, {19, 345} }; .", array,
				resultArray); // assert that the clone function worked and skipped the null value
	}

	/**
	 * This test will be testing the clone function when the 2D array contains big
	 * positive values.
	 */
	@Test
	public void cloneArrayOfBigAndPositiveValues() {
		double[][] array = { { 2425.0, 1285.0, 7697.0, 4845.0, 59415.0 }, { 24665.0, 1255.0, 798.0, 4232.0, 5000.0 } };
		// set an array with large positive values
		double[][] actualArray = DataUtilities.clone(array); // clone array
		assertArrayEquals(
				"createNumberArray failed the correct array values are { { 2425.0, 1285.0, 7697.0, 4845.0, 59415.0 }, { 24665.0, 1255.0, 798.0, 4232.0, 5000.0 } }; .",
				array, actualArray); // assert that the clone function worked correctly
	}

	/**
	 * This test will be testing the clone function when the 2D array contains small
	 * negative values.
	 */
	@Test
	public void cloneArrayOfSmallAndNegativeValues() {
		double[][] array = { { -0.025 }, { -0.000560 } }; // set an array with small negative values
		double[][] actualArray = DataUtilities.clone(array); // clone array
		assertArrayEquals("createNumberArray failed the correct array values are { { -0.025 }, { -000056.0 } }; .",
				array, actualArray); // assert that the clone function worked correctly
	}

	// -----------------------------------------------------------------------------------------
	// End of code created by Abhay and Lauraine
	// -----------------------------------------------------------------------------------------
	
	// -----------------------------------------------------------------------------------------
	// CODE CREATED BY ABHAY AND RACHEL
	// -----------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------
	// Start of Lab 4
	// -----------------------------------------------------------------------------------------
	// --------- calculateColumnTotal(Values2D data, int column) Test ---------
	/**
	 * This test will simulate passing a object to calculateColumnTotal() with a
	 * column number of 1 and row count that is smaller than the valid total rows. Since
	 * row > rowCount, the result should be 0. Killed '2. negated conditional
	 * KILLED' Mutation
	 */
	@Test
	public void calculateColumnTotalRowGreaterRowTotal() { // This is the three parameter version of the method
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() { // a mock expectation block containing expectations of value
			{
				one(values).getRowCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(1));
				// will always returns 1 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called

				one(values).getValue(1, 3);
				// invocation of getValue(1, 3) is expected once
				will(returnValue(4.0));
				// will always returns 4 when getValue(1, 3) is called
			}
		});
		int columnNumber = 1; // setting columnNumber to have an integer value of 1 as there was only one
		// column being built in the mock object
		final int[] validRowsToPass = { 4 }; // This is the valid rows which in this mock object are just four rows
		double result = DataUtilities.calculateColumnTotal(values, columnNumber, validRowsToPass);
		// calling calculateColumnTotal with Values2D = values and at columnNumber 1 and
		// the row which are correct in this object only 1.
		assertEquals("The column total is adding up to 0.0", 0.0, result, .000000001d);
		// asserting the result adds up to 0 since there is more valid rows but in actual only one for the three
		// parameter version
	}

	/**
	 * This test will simulate passing a object to calculateColumnTotal() with a
	 * column number of 1 and row count that is equal to the valid rows. Since
	 * row = rowCount, the result should be 0. Expected to kill mutation '1. changed
	 * conditional boundary'
	 */
	@Test
	public void calculateColumnTotalRowEqualRowTotal() { // This is the three parameter version of the method
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getRowCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(1));
				// will always returns 1 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called

				one(values).getValue(1, 1);
				// invocation of getValue(1, 1) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 1) is called

				one(values).getValue(1, 2);
				// invocation of getValue(1, 2) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(1, 2) is called
			}
		});
		int columnNumber = 1; // setting columnNumber to have an integer value of 1 as there was only one
								// column being built in the mock object
		final int[] validRowsToPass = { 1 }; // This is the valid rows which in this mock object are just one row
		double result = DataUtilities.calculateColumnTotal(values, columnNumber, validRowsToPass);
		// calling calculateColumnTotal with Values2D = values and at columnNumber 1 and
		// the row which are correct in this object only 1.
		assertEquals("The column total is adding up to 0.0", 0.0, result, .000000001d);
		// asserting the result adds up to 0 since there should be more than valid rows for the three
		// parameter version
	}

	/**
	 * This test will simulate passing a object to calculateColumnTotal() with a
	 * column number of 0 and 4 row count and where one row has a value of n = null.
	 * Expected to kill mutation '3. removed conditional - replaced equality check
	 * with true'
	 */
	@Test
	public void calculateColumnTotalNEqualNull() { // This is the three parameter version of the method being tested
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getRowCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(4));
				// will always returns 4 when getColumnCount() is called

				one(values).getValue(0, 0);
				// invocation of getValue(0, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(0, 0) is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(2.0));
				// will always returns 2 when getValue(1, 0) is called

				one(values).getValue(2, 0);
				// invocation of getValue(2, 0) is expected once
				will(returnValue(3.0));
				// will always returns 3 when getValue(2, 0) is called

				one(values).getValue(3, 0);
				// invocation of getValue(3, 0) is expected once
				will(returnValue(null));
				// will always returns null when getValue(3, 0) is called
			}
		});
		int columnNumber = 0; // setting columnNumber to have an integer value of 1 as there was only one
								// column being built in the mock object
		final int[] validRowsToPass = { 0, 1, 2, 3 }; // This is the valid rows which in this mock object which are 4 valid rows which this object has
		double result = DataUtilities.calculateColumnTotal(values, columnNumber, validRowsToPass);
		// calling calculateColumnTotal with Values2D = values and at columnNumber 1 and
		// the row which are correct in this object only 1.
		assertEquals("The column total is adding up to 6.0", 6.0, result, .000000001d);
		// asserting the result adds up to 6.0 (1 + 2 + 3 = 6) since the null is not taken into the addition of it this is for the three
		// parameter version method
	}
	
	// ------------- calculateRowTotal(Values2D data, int row, int[] validCols)
	// Tests -------------
	/**
	 * This test is performing that the row count is equal to the valid rows in which we are trying to removing the 
	 * survived mutation from our original source code. This test is also using Mocking to create a mock object which 
	 * can be used to increase the mutation coverage. 
	 * Expected to kill mutation '1. changed conditional boundary' as our plan was to the test the boundary conditions 
	 * which may have not been covered in the previous labs. 
	 */
	@Test
	public void calculateRowTotalChangedConditional() { // This is the three parameter version of the method being tested
		Mockery mockingContext = new Mockery();
		// creating a new mock object called mockingContext
		final Values2D values = mockingContext.mock(Values2D.class);
		// mock object (mockingContext) is stored in the local variable 'values'
		// 'values' is final so it can be referred to from within expectation blocks

		mockingContext.checking(new Expectations() {
			// a mock expectation block containing expectations of value
			{
				one(values).getColumnCount();
				// invocation of getColumnCount() is expected once
				will(returnValue(1));
				// will always returns 1 when getColumnCount() is called

				one(values).getValue(1, 0);
				// invocation of getValue(1, 0) is expected once
				will(returnValue(1.0));
				// will always returns 1 when getValue(1, 0) is called
			}
		});
		int rowNumber = 1; // setting rowNumber to have an integer value of 1 as there was only one row
							// being built in the mock object
		final int[] validColumnsToPass = {1}; // This is the valid columns which in this mock object are just one column
		double result = DataUtilities.calculateRowTotal(values, rowNumber, validColumnsToPass);
		// calling calculateRowTotal with Values2D = values and at rowNumber 1 and the
		// columns which are correct in this object only 1.
		assertEquals("The row total is adding up to 0.0", 0.0, result, .000000001d);
		// asserting the result adds up to 0 since there is an equal amount valid rows and of row count which the method does not account for. This is for the three
		// parameter version method
	}
	// -----------------------------------------------------------------------------------------
	// END OF CODE CREATED BY ABHAY AND RACHEL
	// -----------------------------------------------------------------------------------------
	// -----------------------------------------------------------------------------------------
	// End of Lab 4
	// -----------------------------------------------------------------------------------------
	
	// -----------------------------------------------------------------------------------------
	// The following code was taken from the SENG438 Lab Document
	// -----------------------------------------------------------------------------------------
	@After
	public void tearDown() throws Exception {
		// Tear down function for after running the tests it does nothing.
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// Do nothing once the class is over running the cases in the SUT
	}
	// -----------------------------------------------------------------------------------------
	// End of Lab Document Code
	// -----------------------------------------------------------------------------------------
}