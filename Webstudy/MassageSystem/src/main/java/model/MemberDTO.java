package model;

//DTO클래스 정의(데이터를 중간에 주고 받을 수 있는 객체)
//1. 테이블 컬럼기준으로 필드변수 선언
//2. 사용자 정의 생성자 구현
//3. Getter/Setter 구현
// 오른쪽클릭 -> Source -> Generate...
public class MemberDTO {
    private String email; 
    private String pw;
    private String tel;
    private String address;
	
    public MemberDTO(String email, String pw, String tel, String address) {

		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
		
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
    
    
}
