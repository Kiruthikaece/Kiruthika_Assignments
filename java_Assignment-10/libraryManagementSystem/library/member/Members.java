package libraryManagementSystem.library.member;

public class Members {
    private int memberaId;
    private String memberName;

    public Members(int memberaId,String memberName) {
        this.memberaId=memberaId;
        this.memberName=memberName;
    }
    public int getMemberaId() {
        return memberaId;
    }
    public void setMemberaId(int memberaId) {
        this.memberaId = memberaId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
