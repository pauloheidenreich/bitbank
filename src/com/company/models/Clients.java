package com.company.models;

public abstract class Clients {

    private String clientName;
    protected String clientCpf;
    private String clintOccupation;

    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public String getClientCpf() {
        return clientCpf;
    }
    public void setClientCpf(String clientCpf) {
        this.clientCpf = clientCpf;
    }
    public String getClintOccupation() {
        return clintOccupation;
    }
    public void setClintOccupation(String clintOccupation) {
        this.clintOccupation = clintOccupation;
    }
}
