public class Author {

    private final long id;
    private final String fullname;
    private final String email;
    private final long teamId;

    public Author(long id, String fullname, String email, long teamId) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.teamId = teamId;
    }

    public long getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public long getTeamId() {
        return teamId;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", teamId=" + teamId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (id != author.id) return false;
        if (teamId != author.teamId) return false;
        if (fullname != null ? !fullname.equals(author.fullname) : author.fullname != null) return false;
        return email != null ? email.equals(author.email) : author.email == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (fullname != null ? fullname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) (teamId ^ (teamId >>> 32));
        return result;
    }


}
