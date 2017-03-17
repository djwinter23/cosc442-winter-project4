package edu.towson.cis.cosc442.project4.coffeemaker;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>CoffeeMakerTest</code> contains tests for the class <code>{@link CoffeeMaker}</code>.
 *
 * @generatedBy CodePro at 3/15/17 12:42 AM
 * @author Owner
 * @version $Revision: 1.0 $
 */
public class CoffeeMakerTest {
	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testCoffeeMaker_1()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the CoffeeMaker() constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testCoffeeMaker_2()
		throws Exception {

		CoffeeMaker result = new CoffeeMaker();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddInventory_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = 1;
		int amtChocolate = -1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 3;
		int amtMilk = 4;
		int amtSugar = 1;
		int amtChocolate = 2;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);
		Inventory increasedInventory = fixture.checkInventory();
		// add additional test code here
		assertEquals(true, result);
		assertEquals(18, increasedInventory.getCoffee());
		assertEquals(19, increasedInventory.getMilk());
		assertEquals(16, increasedInventory.getSugar());
		assertEquals(17, increasedInventory.getChocolate());
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddInventory_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 0;
		int amtMilk = 0;
		int amtSugar = 0;
		int amtChocolate = 0;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddInventory_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = -1;
		int amtSugar = 1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addInventory(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddInventory_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		int amtCoffee = 1;
		int amtMilk = 1;
		int amtSugar = -1;
		int amtChocolate = 1;

		boolean result = fixture.addInventory(amtCoffee, amtMilk, amtSugar, amtChocolate);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean addRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testAddRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		for (int i = 0; i < 4; i++)
		{
			fixture.addRecipe(r);
		}
		boolean result = fixture.addRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}
	
	/**
	 * Run the Inventory checkInventory() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testCheckInventory_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Inventory result = fixture.checkInventory();

		// add additional test code here
		assertNotNull(result);
		assertEquals("Coffee: 15\r\nMilk: 15\r\nSugar: 15\r\nChocolate: 15\r\n", result.toString());
		assertEquals(15, result.getChocolate());
		assertEquals(15, result.getSugar());
		assertEquals(15, result.getCoffee());
		assertEquals(15, result.getMilk());
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testDeleteRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Cappucino");
		r.setPrice(10);
		r.setAmtCoffee(3);
		r.setAmtMilk(2);
		r.setAmtSugar(3);
		r.setAmtChocolate(2);
		fixture.addRecipe(r);
		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testDeleteRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	
	/**
	 * Run the boolean deleteRecipe(Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testDeleteRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = null;

		boolean result = fixture.deleteRecipe(r);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testEditRecipe_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();
		
		oldRecipe.setName("Coffee");
		oldRecipe.setPrice(50);
		oldRecipe.setAmtCoffee(3);	
		oldRecipe.setAmtMilk(1);
		oldRecipe.setAmtSugar(1);
		oldRecipe.setAmtChocolate(0);
		fixture.addRecipe(oldRecipe);
		
		newRecipe.setName("Coffee");
		newRecipe.setPrice(50);
		newRecipe.setAmtCoffee(3);
		newRecipe.setAmtMilk(1);
		newRecipe.setAmtSugar(1);
		newRecipe.setAmtChocolate(0);
		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(true, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testEditRecipe_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testEditRecipe_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testEditRecipe_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the boolean editRecipe(Recipe,Recipe) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testEditRecipe_5()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe oldRecipe = RecipeFactory.createRecipe();
		Recipe newRecipe = RecipeFactory.createRecipe();

		boolean result = fixture.editRecipe(oldRecipe, newRecipe);

		// add additional test code here
		assertEquals(false, result);
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testGetRecipeForName_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testGetRecipeForName_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testGetRecipeForName_3()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe getRecipeForName(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testGetRecipeForName_4()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		String name = "";

		Recipe result = fixture.getRecipeForName(name);

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.toString());
		assertEquals(null, result.getName());
		assertEquals(0, result.getAmtChocolate());
		assertEquals(0, result.getAmtMilk());
		assertEquals(0, result.getAmtSugar());
		assertEquals(0, result.getAmtCoffee());
		assertEquals(0, result.getPrice());
	}

	/**
	 * Run the Recipe[] getRecipes() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testGetRecipes_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();

		Recipe[] result = fixture.getRecipes();

		// add additional test code here
		assertNotNull(result);
		assertEquals(4, result.length);
		assertNotNull(result[0]);
		assertEquals(null, result[0].toString());
		assertEquals(null, result[0].getName());
		assertEquals(0, result[0].getAmtChocolate());
		assertEquals(0, result[0].getAmtMilk());
		assertEquals(0, result[0].getAmtSugar());
		assertEquals(0, result[0].getAmtCoffee());
		assertEquals(0, result[0].getPrice());
		assertNotNull(result[1]);
		assertEquals(null, result[1].toString());
		assertEquals(null, result[1].getName());
		assertEquals(0, result[1].getAmtChocolate());
		assertEquals(0, result[1].getAmtMilk());
		assertEquals(0, result[1].getAmtSugar());
		assertEquals(0, result[1].getAmtCoffee());
		assertEquals(0, result[1].getPrice());
		assertNotNull(result[2]);
		assertEquals(null, result[2].toString());
		assertEquals(null, result[2].getName());
		assertEquals(0, result[2].getAmtChocolate());
		assertEquals(0, result[2].getAmtMilk());
		assertEquals(0, result[2].getAmtSugar());
		assertEquals(0, result[2].getAmtCoffee());
		assertEquals(0, result[2].getPrice());
		assertNotNull(result[3]);
		assertEquals(null, result[3].toString());
		assertEquals(null, result[3].getName());
		assertEquals(0, result[3].getAmtChocolate());
		assertEquals(0, result[3].getAmtMilk());
		assertEquals(0, result[3].getAmtSugar());
		assertEquals(0, result[3].getAmtCoffee());
		assertEquals(0, result[3].getPrice());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testPurchaseBeverage_1()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(1);
		int amtPaid = 60;
		
		int result = fixture.makeCoffee(r, amtPaid);
		Inventory decreasedInventory = fixture.checkInventory();
		// add additional test code here
		assertEquals(10, result);
		assertEquals(12, decreasedInventory.getCoffee());
		assertEquals(14, decreasedInventory.getMilk());
		assertEquals(14, decreasedInventory.getSugar());
		assertEquals(14, decreasedInventory.getChocolate());
	}

	/**
	 * Run the int makeCoffee(Recipe,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Test
	public void testMakeCoffee_2()
		throws Exception {
		CoffeeMaker fixture = CoffeeMakerFactory.createCoffeeMaker();
		Recipe r = RecipeFactory.createRecipe();
		r.setName("Coffee");
		r.setPrice(50);
		r.setAmtCoffee(3);
		r.setAmtMilk(1);
		r.setAmtSugar(1);
		r.setAmtChocolate(0);
		int amtPaid = 50;

		int result = fixture.makeCoffee(r, amtPaid);

		// add additional test code here
		assertEquals(0, result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 3/15/17 12:42 AM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(CoffeeMakerTest.class);
	}
}