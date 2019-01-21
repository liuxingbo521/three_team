/**
 * <pre>项目名称:ssm-test-user
 * 文件名称:ResultPage.java
 * 包名:com.jk.czh.util
 * 创建日期:2018年10月26日下午4:19:27
 * Copyright (c) 2018, All Rights Reserved.</pre>
 */
package com.jk.util;

import java.util.List;

public class ResultPage {

    private Integer total = 0;

    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    /**
     * <pre>创建一个新的实例 ResultPage.
     *
     * @param total
     * @param rows</pre>
     */
    public ResultPage(Integer total, List<?> rows) {
        super();
        this.total = total;
        this.rows = rows;
    }

    /**
     * <pre>创建一个新的实例 ResultPage.
     *    </pre>
     */
    public ResultPage() {
        super();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ResultPage [total=" + total + ", rows=" + rows + "]";
    }

}
