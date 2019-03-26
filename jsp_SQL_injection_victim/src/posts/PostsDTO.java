package posts;

public class PostsDTO {
	int postsId;
	String postsTitle;
	String postsContent;
	String userId;
	public int getPostsId() {
		return postsId;
	}
	public void setPostsId(int postsId) {
		this.postsId = postsId;
	}
	public String getPostsTitle() {
		return postsTitle;
	}
	public void setPostsTitle(String postsTitle) {
		this.postsTitle = postsTitle;
	}
	public String getPostsContent() {
		return postsContent;
	}
	public void setPostsContent(String postsContent) {
		this.postsContent = postsContent;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public PostsDTO(int postsId, String postsTitle, String postsContent, String userId) {
		this.postsId = postsId;
		this.postsTitle = postsTitle;
		this.postsContent = postsContent;
		this.userId = userId;
	}
	
	
	
	
}
