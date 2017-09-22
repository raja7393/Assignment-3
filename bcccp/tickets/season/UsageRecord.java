package bcccp.tickets.season;

public class UsageRecord implements IUsageRecord {
	
	String ticketId;
	long startDateTime;
	long endDateTime;
	
	
	
	public UsageRecord(String ticketId, long startDateTime) {
		this.ticketId = ticketId;
		this.startDateTime = startDateTime;

	}
	
	
	
	public void finalise(long endDateTime) {
		this.endDateTime = endDateTime;
	}
	
	
	
	@Override
	public long getStartTime() {
             System.out.print(startDateTime);
		return startDateTime;
	}



	@Override
	public long getEndTime() {
              System.out.print(endDateTime);
		return endDateTime;
	}



	@Override
	public String getSeasonTicketId() {
		return ticketId;
                 System.out.print(ticketId);
	}

	
	
	public String toString() {
		return ("Usage : startDateTime : " + startDateTime + ", endDateTime: " + endDateTime);
	}




}
