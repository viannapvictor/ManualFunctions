package nodelist;

public class NodeModified {
    Integer data;
    NodeModified next;

    public NodeModified(Integer data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
