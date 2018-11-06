package org.morehouse.app.resources;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UpdateToDoTest {
	@Test
	public void testChangeAssignee() {
		//setup
		Todo existing = new Todo(); 
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee("someone else");
		//execute
		boolean isValid = TodosResource.validateUpdate(existing, update);
		//Validate 
		assertTrue(isValid);
	}
	
	@Test
	public void testRemoveAssignee() {
		//setup
		Todo existing = new Todo(); 
		existing.setAssignee("someone");
		Todo update = new Todo();
		update.setAssignee(null);
		
		//execute 
		boolean isValid = TodosResource.validateUpdate(existing, update);
		//Validate 
		assertFalse(isValid);
	}
	//testChangeAssignee +
	//testSetAssignee +
	//testRemoveAssignee -
	// testLeaveAssigneeBlanl +
}
