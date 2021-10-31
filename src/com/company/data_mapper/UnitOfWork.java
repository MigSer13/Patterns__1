package com.company.data_mapper;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private static ThreadLocal threadLocal = new ThreadLocal();

    private List<DomainObject> newObjects = new ArrayList<>();
    private List<DomainObject> dirtyObjects = new ArrayList<>();
    private List<DomainObject> removeObjects = new ArrayList<>();

    public static void newCurrent(){
        setCurrent(new UnitOfWork());
    }

    public static void setCurrent(UnitOfWork unitOfWork) {
        threadLocal.set(unitOfWork);
    }

    public static UnitOfWork getThreadLocal() {
        return (UnitOfWork) threadLocal.get();
    }

    public void addNew(DomainObject domainObject){

    }
    public void addDirty(DomainObject domainObject){

    }
    public void addRemoved(DomainObject domainObject){

    }

    public void commit(){
        insertNew();
        updateDirty();
        deleteRemoved();
    }

}
