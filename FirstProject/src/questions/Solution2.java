package questions;

class EmployeeSalarySlip{
	
	public static final String COMPANY_NAME = "XYZ Pvt. Ltd.";
	private byte employee_id;
	private String name;
	private String designation;
	private byte years;
	private byte months;
	private float basicSalary;
	private boolean loanTaken;
	private float HRA;
	private float DA;
	private float TA;
	private float MA;
	private float PF;
	private float EMI;
	private float tax;
	private float grossSalary;
	private float netSalary;
	
	public byte getEmployee_id() {
		return employee_id;
	}
	public String getName() {
		return name;
	}
	public String getDesignation() {
		return designation;
	}
	public byte getYears() {
		return years;
	}
	public byte getMonths() {
		return months;
	}
	public float getBasicSalary() {
		return basicSalary;
	}
	public boolean isLoanTaken() {
		return loanTaken;
	}
	public float getHRA() {
		return HRA;
	}
	public float getDA() {
		return DA;
	}
	public float getTA() {
		return TA;
	}
	public float getMA() {
		return MA;
	}
	public float getPF() {
		return PF;
	}
	public float getEMI() {
		return EMI;
	}
	public float getTax() {
		return tax;
	}
	public float getGrossSalary() {
		return grossSalary;
	}
	public float getNetSalary() {
		return netSalary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setYears(byte years) {
		this.years = years;
	}
	public void setMonths(byte months) {
		this.months = months;
	}
	public boolean setBasicSalary(float basicSalary) {
		if(basicSalary > 0) {
			this.basicSalary = basicSalary;
			return true;
		}
		return false;
	}
	public void setLoanTaken(boolean loanTaken) {
		this.loanTaken = loanTaken;
	}
	private void setHRA() {
		HRA = (float) (0.10 * basicSalary);
	}
	private void setDA() {
		DA = (float) (0.05 * basicSalary);
	}
	private void setTA() {
		TA = (float) (0.03 * basicSalary);
	}
	private void setMA() {
		MA = (float) (0.07 * basicSalary);
	}
	private void setPF() {
		PF = (float) (0.05 * basicSalary);
	}
	private void setEMI() {
		if(loanTaken) {
			EMI = (float) (0.10 * basicSalary);
		}
		else {
			EMI = 0;
		}
	}
	private void setTax() {
		if(basicSalary * 12 > 1000000) {
			tax = (float) 0.30 * basicSalary;
		}
		else if(basicSalary * 12 > 700000) {
			tax = (float) 0.20 * basicSalary;
		}
		if(basicSalary * 12 > 500000) {
			tax = (float) 0.10 * basicSalary;
		}
		else {
			tax = 0;
		}
	}
	private void setGrossSalary() {
		this.grossSalary = basicSalary + HRA + DA + TA + MA - PF;
	}
	private void setNetSalary() {
		this.netSalary = grossSalary - tax - EMI;
	}
	
	public EmployeeSalarySlip(int employee_id, String name, String designation, float basicSalary, boolean loanTaken) {
		this.employee_id = (byte) employee_id;
		this.name = name;
		this.designation = designation;
		this.basicSalary = basicSalary;
		this.loanTaken = loanTaken;
		setHRA();
		setDA();
		setTA();
		setMA();
		setPF();
		setTax();
		setEMI();
		setGrossSalary();
		setNetSalary();
	}
	
}

public class Solution2 {

	public static void main(String[] args) {
		
	}

}
