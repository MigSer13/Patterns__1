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
        newObjects.add(domainObject);
    }
    public void addDirty(DomainObject domainObject){
        dirtyObjects.add(domainObject);
    }
    public void addRemoved(DomainObject domainObject){
        removeObjects.add(domainObject);
    }

    public void commit(){
        insertNew();
        updateDirty();
        deleteRemoved();
    }

    private void insertNew() {
        for (DomainObject newObject : newObjects) {
            if(newObject.getClass().equals(Product.class)){
                ProductIdentityMap.getInstance().addProduct((Product) newObject);
                commit();
            }
        }
        newObjects.clear();
    }
    private void updateDirty() {
        for (DomainObject dirtyObject : dirtyObjects) {
            if(dirtyObjects.getClass().equals(Product.class)){
                ProductIdentityMap.getInstance().updateProduct((Product) dirtyObject);
                commit();
            }
        }
        dirtyObjects.clear();
    }


}
