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
		
