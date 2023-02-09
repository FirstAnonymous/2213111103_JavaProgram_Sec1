public class FictionBook implements Author, Book{
	public static final int YEARS = 2023;
	private String authorName;
	private String email;
	private String title;
	private int publicYear;
	public FictionBook(String title, int publicYear) {
		this.title = title;
		this.publicYear = publicYear;
	}
	public String getTitle() {
		return title;
	}
	public int totalPublicYear() {
		return YEARS - publicYear;
	}
	public String getFirstName() {
		return authorName.substring(0, authorName.indexOf(" ")).toUpperCase();
	}
	public String getLastName() {
		return authorName.substring(authorName.lastIndexOf(" ")).toUpperCase();
	}
	public boolean checkEmail() {
		return email.contains("@hotmail.com") || email.contains("@windowslive.com");
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean checkFormatName() {
		return authorName.split(" ").length == 1;
	}
	public String toString() {
		return title + " write by " + getFirstName().charAt(0) + "." + getFirstName() + "(" + email + ")\n" + "Published for " + totalPublicYear() + " years.";
	}
}