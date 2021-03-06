package test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import bcccp.tickets.season.*;

public class TestSeasonTicket {
	
	List<IUsageRecord> usages;
	IUsageRecord currentUsage = null;
	
	@Before
	public void setUp() throws Exception {
		id = mock(ticketId.class);
		carparkId = mock(carparkId.class);
		startValidPeriod = mock(startValidPeriod.class);
		endValidPeriod = mock(endValidPeriod.class);
		
		sut = new SeasonTicket(id, carparkId, startValidPeriod, endValidPeriod);
	}
	
	@After
	public void tearDown() throws Exception {
		sut = null;
	}
	
	@Test
	public void testInit() {
		assertTrue(sut instanceof ISeasonTicket);
		assertEquals(sut.getId(), ticketId);
		assertEquals(sut.getcarparkId(), carparkId);
		assertEquals(sut.getStartValidPeriod(), startValidPeriod);
		assertEquals(sut.getEndValidPeriod(), endValidPeriod);
	}
	
	@Test(expected=RuntimeException.class) 
	public void testConstructorWithNullTicketId() {
		sut = new SeasonTicket(null, id, carparkId, startValidPeriod, endValidPeriod);	
		fail("Should bave thrown exception");
	}
	
	@Test(expected=RuntimeException.class) 
	public void testConstructorWithendValidPeriodLessThanstartValidPeriod() {
		sut = new SeasonTicket(null, id, carparkId, startValidPeriod, endValidPeriod);	
		fail("Should bave thrown exception");
	}
	
	@Test
	public void testCommit() {
		//setup
		
		//execute
		sut.commit(1);
		//verifies and asserts
		verify(id).startValidPeriod(sut);
		verify(carparkId).addSeasonTicket(sut);
		assertEquals(sut.getId(),ISeasonTicket.State.CURRENT);
		assertTrue(1 == sut.getId());
		}
		
	@Test
	public void testUpdateCurrentDateEqualDue() {
		sut.commit(1);
		LocalDate currentDate = dueDate;
		sut.update(currentDate);
		
		assertEquals(sut.getState(),ILoan.State.CURRENT);
	}
}

