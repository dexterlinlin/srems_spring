package org.srems.models;

public class GenericRelation extends GenericModel {
    private String fnodeId;
    private String tnodeId;
    private String fnodeType;
    private String tnodeType;
    private int status=0;

    public String getFnodeId() {
        return fnodeId;
    }

    public void setFnodeId(String fnodeId) {
        this.fnodeId = fnodeId;
    }

    public String getTnodeId() {
        return tnodeId;
    }

    public void setTnodeId(String tnodeId) {
        this.tnodeId = tnodeId;
    }

    public String getFnodeType() {
        return fnodeType;
    }

    public void setFnodeType(String fnodeType) {
        this.fnodeType = fnodeType;
    }

    public String getTnodeType() {
        return tnodeType;
    }

    public void setTnodeType(String tnodeType) {
        this.tnodeType = tnodeType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
