package org.ibase4j.mybatis.generator.dao;

import java.util.List;
import org.ibase4j.mybatis.generator.model.SysCatalog;

public interface SysCatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_catalog
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_catalog
     *
     * @mbggenerated
     */
    int insert(SysCatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_catalog
     *
     * @mbggenerated
     */
    SysCatalog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_catalog
     *
     * @mbggenerated
     */
    List<SysCatalog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_catalog
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(SysCatalog record);
}