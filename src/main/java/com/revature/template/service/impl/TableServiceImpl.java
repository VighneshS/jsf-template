package com.revature.template.service.impl;

import com.revature.template.dao.TableDAO;
import com.revature.template.model.Table;
import com.revature.template.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {
    @Autowired
    private TableDAO tableDAO;

    public TableDAO getTableDAO() {
        return tableDAO;
    }

    public void setTableDAO(TableDAO tableDAO) {
        this.tableDAO = tableDAO;
    }

    @Override
    public List<Table> getAllTables() {
        return getTableDAO().getAllTables();
    }
}
