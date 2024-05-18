package list;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SampleBean {
	private BigDecimal bigdecimal1;
	private BigDecimal bigdecimal2;
	private LocalDateTime localdatetime;
	private LocalDate localdate;
	private String string1;
	private String string2;
	public BigDecimal getBigdecimal1() {
		return bigdecimal1;
	}
	public void setBigdecimal1(BigDecimal bigdecimal1) {
		this.bigdecimal1 = bigdecimal1;
	}
	public BigDecimal getBigdecimal2() {
		return bigdecimal2;
	}
	public void setBigdecimal2(BigDecimal bigdecimal2) {
		this.bigdecimal2 = bigdecimal2;
	}
	public LocalDateTime getLocaldatetime() {
		return localdatetime;
	}
	public LocalDate getLocaldate() {
		return localdate;
	}
	public void setLocaldate(LocalDate localdate) {
		this.localdate = localdate;
	}
	public void setLocaldatetime(LocalDateTime localdatetime) {
		this.localdatetime = localdatetime;
	}
	public String getString1() {
		return string1;
	}
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public String getString2() {
		return string2;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	@Override
	public String toString() {
		return "SampleBean [bigdecimal1=" + bigdecimal1 + ", bigdecimal2=" + bigdecimal2 + ", localdatetime="
				+ localdatetime + ", string1=" + string1 + ", string2=" + string2 + "]";
	}
}
