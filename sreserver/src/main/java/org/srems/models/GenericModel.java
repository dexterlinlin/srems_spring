package org.srems.models;

import org.srems.utils.IdWorker;

public class GenericModel {
    protected String id;
    private static IdWorker IDWORKER = new IdWorker(0,1);

    public GenericModel()
    {
        id = String.valueOf(IDWORKER.nextId());
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
