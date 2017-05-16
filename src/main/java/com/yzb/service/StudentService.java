package com.yzb.service;

import com.yzb.dao.IDao;

public class StudentService
{
    private IDao dao;

    public int countStudent()
    {
        // 处理逻辑...
        int count = dao.countStudent();
        // 处理逻辑...
        
        return count;
    }
    
    public void setDao(IDao dao)
    {
        this.dao = dao;
    }
}
