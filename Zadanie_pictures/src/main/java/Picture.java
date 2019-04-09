public class Picture {
    private final long id;
    private final String imgFile;
    public final long authorId;

    public Picture(long id, String imgFile, long authorId) {
        this.id = id;
        this.imgFile = imgFile;
        this.authorId = authorId;
    }

    public long getId() {
        return id;
    }

    public String getImgFile() {
        return imgFile;
    }

    public long getAuthorId() {
        return authorId;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", imgFile='" + imgFile + '\'' +
                ", authorId=" + authorId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Picture picture = (Picture) o;

        if (id != picture.id) return false;
        if (authorId != picture.authorId) return false;
        return imgFile != null ? imgFile.equals(picture.imgFile) : picture.imgFile == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (imgFile != null ? imgFile.hashCode() : 0);
        result = 31 * result + (int) (authorId ^ (authorId >>> 32));
        return result;
    }

}
