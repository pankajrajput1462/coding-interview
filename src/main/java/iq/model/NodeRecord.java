package iq.model;

public record NodeRecord(int data, NodeRecord next) {
    public NodeRecord(int data) {
        this(data, null);
    }

}

