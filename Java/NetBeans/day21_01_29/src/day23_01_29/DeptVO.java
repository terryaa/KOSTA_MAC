/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package day23_01_29;

/**
 *
 * @author KOSTA
 */
public class DeptVO {
    private int deptno;
    private String dname,loc;
    Sawon sawon=null;

    public Sawon getSawon() {
        return sawon;
    }

    public void setSawon(Sawon sawon) {
        this.sawon = sawon;
    }
    
    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
    
    
    
}
