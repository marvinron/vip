package com.shimo.vip.query;

import java.util.List;

/**
 * @author yukong
 * @version V1.0
 * @Package com.shimo.vip.model
 * @Description: 分页基类
 * @date 2018/2/8 15:46
 **/
public class BasePageQuery<T> {

    /**
     * 当前页数
     */
    private int currPage = 1;
    /**
     * 每页显示的个数
     */
    private int pageSize = 10;
    /**
     * 总记录数
     */
    private long total;
    /**
     * 查询起
     */
    private int start;
    /**
     * 查询止
     */
    private int end;
    /**
     * 分页查询的结果
     */
    private List<T> result;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getStart() {
        return start <= 0 ? (currPage - 1) * pageSize : start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end <= 0 ? currPage  * pageSize : start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
