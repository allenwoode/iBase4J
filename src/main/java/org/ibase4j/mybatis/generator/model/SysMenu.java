package org.ibase4j.mybatis.generator.model;

import java.io.Serializable;

public class SysMenu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_name
     *
     * @mbggenerated
     */
    private String menuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.menu_type
     *
     * @mbggenerated
     */
    private Integer menuType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.parent_id
     *
     * @mbggenerated
     */
    private Integer parentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.iconcls_
     *
     * @mbggenerated
     */
    private String iconcls;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.request_
     *
     * @mbggenerated
     */
    private String request;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.expand_
     *
     * @mbggenerated
     */
    private Integer expand;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.sortno_
     *
     * @mbggenerated
     */
    private Integer sortno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.leaf_
     *
     * @mbggenerated
     */
    private Integer leaf;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_menu.remark_
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_menu
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.id_
     *
     * @return the value of sys_menu.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.id_
     *
     * @param id the value for sys_menu.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_name
     *
     * @return the value of sys_menu.menu_name
     *
     * @mbggenerated
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_name
     *
     * @param menuName the value for sys_menu.menu_name
     *
     * @mbggenerated
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.menu_type
     *
     * @return the value of sys_menu.menu_type
     *
     * @mbggenerated
     */
    public Integer getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.menu_type
     *
     * @param menuType the value for sys_menu.menu_type
     *
     * @mbggenerated
     */
    public void setMenuType(Integer menuType) {
        this.menuType = menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.parent_id
     *
     * @return the value of sys_menu.parent_id
     *
     * @mbggenerated
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.parent_id
     *
     * @param parentId the value for sys_menu.parent_id
     *
     * @mbggenerated
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.iconcls_
     *
     * @return the value of sys_menu.iconcls_
     *
     * @mbggenerated
     */
    public String getIconcls() {
        return iconcls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.iconcls_
     *
     * @param iconcls the value for sys_menu.iconcls_
     *
     * @mbggenerated
     */
    public void setIconcls(String iconcls) {
        this.iconcls = iconcls == null ? null : iconcls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.request_
     *
     * @return the value of sys_menu.request_
     *
     * @mbggenerated
     */
    public String getRequest() {
        return request;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.request_
     *
     * @param request the value for sys_menu.request_
     *
     * @mbggenerated
     */
    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.expand_
     *
     * @return the value of sys_menu.expand_
     *
     * @mbggenerated
     */
    public Integer getExpand() {
        return expand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.expand_
     *
     * @param expand the value for sys_menu.expand_
     *
     * @mbggenerated
     */
    public void setExpand(Integer expand) {
        this.expand = expand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.sortno_
     *
     * @return the value of sys_menu.sortno_
     *
     * @mbggenerated
     */
    public Integer getSortno() {
        return sortno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.sortno_
     *
     * @param sortno the value for sys_menu.sortno_
     *
     * @mbggenerated
     */
    public void setSortno(Integer sortno) {
        this.sortno = sortno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.leaf_
     *
     * @return the value of sys_menu.leaf_
     *
     * @mbggenerated
     */
    public Integer getLeaf() {
        return leaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.leaf_
     *
     * @param leaf the value for sys_menu.leaf_
     *
     * @mbggenerated
     */
    public void setLeaf(Integer leaf) {
        this.leaf = leaf;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_menu.remark_
     *
     * @return the value of sys_menu.remark_
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_menu.remark_
     *
     * @param remark the value for sys_menu.remark_
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}