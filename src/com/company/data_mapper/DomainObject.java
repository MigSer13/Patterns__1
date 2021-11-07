package com.company.data_mapper;

public class DomainObject {
    public void markNew(){
        UnitOfWork.getThreadLocal().addNew(this);
    }
    public void markDirty(){
        UnitOfWork.getThreadLocal().addDirty(this);
    }
    public void markRemoved(){
        UnitOfWork.getThreadLocal().addRemoved(this);
    }
}
