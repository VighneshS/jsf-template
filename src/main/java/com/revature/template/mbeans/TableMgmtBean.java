package com.revature.template.mbeans;

import com.revature.template.service.TableService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class TableMgmtBean {

    @ManagedProperty(value = "#{tableServiceImpl}")
    private transient TableService tableService;

    public TableService getTableService() {
        return tableService;
    }

    public void setTableService(TableService tableService) {
        this.tableService = tableService;
    }

    @PostConstruct
    void init() {
        System.out.println("Initialized");
    }

    public String doGetAllTables() {
        getTableService().getAllTables();
        return "Hai";
    }
}
