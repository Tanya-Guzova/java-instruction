
public class Request {

	private int id;
	private int userId;
	private String description;
	private String justification;
	private String dateNeeded;
	private String deliveryMode;
	private String status;
	private double total;
	private String submittedDate;
	private String reasonForRejection;
	
	public Request() {
		super();
	}

	public Request(int id, int userId, String description, String justification, String dateNeeded, String deliveryMode,
			String status, double total, String submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.userId = userId;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getDateNeeded() {
		return dateNeeded;
	}

	public void setDateNeeded(String dateNeeded) {
		this.dateNeeded = dateNeeded;
	}

	public String getDeliveryMode() {
		return deliveryMode;
	}

	public void setDeliveryMode(String deliveryMode) {
		this.deliveryMode = deliveryMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getSubmittedDate() {
		return submittedDate;
	}

	public void setSubmittedDate(String submittedDate) {
		this.submittedDate = submittedDate;
	}

	public String getReasonForRejection() {
		return reasonForRejection;
	}

	public void setReasonForRejection(String reasonForRejection) {
		this.reasonForRejection = reasonForRejection;
	}
	
	public String toString() {
		String str = "***************************************\n";
		str += "ID:\t\t" + id + "\n";
		str += "User Id:\t\t" + userId + "\n";
		str += "Description:\t\t" + description + "\n";
		str += "Justification:\t\t\t" + justification + "\n";
		str += "Date Needed:\t\t\t" + dateNeeded + "\n";
		str += "Delivery Mode:\t\t\t" + deliveryMode + "\n";
		str += "Status:\t\t\t" + status + "\n";
		str += "Total:\t" + total + "\n";
		str += "Submitted Date:\t" + submittedDate + "\n";
		str += "Reason for Rejection:\t" + reasonForRejection + "\n";
		
		str += "***************************************\n";

		return str;
	}
	
}
