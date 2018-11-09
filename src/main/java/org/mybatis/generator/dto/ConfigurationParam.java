package org.mybatis.generator.dto;

import org.mybatis.generator.config.JavaClientGeneratorConfiguration;
import org.mybatis.generator.config.JavaModelGeneratorConfiguration;
import org.mybatis.generator.config.SqlMapGeneratorConfiguration;
import org.mybatis.generator.config.TableConfiguration;


public class ConfigurationParam {
    private String connectionUrl;
    private String driveClass;
    private String databaseUserId;
    private String databasePassword;
    private String javaFileTatgetPackage;
    private String javaFileTatgetProject;
    private String mapperFileTatgetPackage;
    private String mapperFileTatgetProject;
    private String mapperFileType;
    private String xmlFileTatgetPackage;
    private String xmlFileTatgetProject;
    private String tableName;
    private String poName;
    private String author;
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }



    public String getConnectionUrl() {
        return connectionUrl;
    }

    public void setConnectionUrl(String connectionUrl) {
        this.connectionUrl = connectionUrl;
    }

    public String getDriveClass() {
        return driveClass;
    }

    public void setDriveClass(String driveClass) {
        this.driveClass = driveClass;
    }

    public String getDatabaseUserId() {
        return databaseUserId;
    }

    public void setDatabaseUserId(String databaseUserId) {
        this.databaseUserId = databaseUserId;
    }

    public String getDatabasePassword() {
        return databasePassword;
    }

    public void setDatabasePassword(String databasePassword) {
        this.databasePassword = databasePassword;
    }

    public String getJavaFileTatgetPackage() {
        return javaFileTatgetPackage;
    }

    public void setJavaFileTatgetPackage(String javaFileTatgetPackage) {
        this.javaFileTatgetPackage = javaFileTatgetPackage;
    }

    public String getJavaFileTatgetProject() {
        return javaFileTatgetProject;
    }

    public void setJavaFileTatgetProject(String javaFileTatgetProject) {
        this.javaFileTatgetProject = javaFileTatgetProject;
    }

    public String getMapperFileTatgetPackage() {
        return mapperFileTatgetPackage;
    }

    public void setMapperFileTatgetPackage(String mapperFileTatgetPackage) {
        this.mapperFileTatgetPackage = mapperFileTatgetPackage;
    }

    public String getMapperFileTatgetProject() {
        return mapperFileTatgetProject;
    }

    public void setMapperFileTatgetProject(String mapperFileTatgetProject) {
        this.mapperFileTatgetProject = mapperFileTatgetProject;
    }

    public String getMapperFileType() {
        return mapperFileType;
    }

    public void setMapperFileType(String mapperFileType) {
        this.mapperFileType = mapperFileType;
    }

    public String getXmlFileTatgetPackage() {
        return xmlFileTatgetPackage;
    }

    public void setXmlFileTatgetPackage(String xmlFileTatgetPackage) {
        this.xmlFileTatgetPackage = xmlFileTatgetPackage;
    }

    public String getXmlFileTatgetProject() {
        return xmlFileTatgetProject;
    }

    public void setXmlFileTatgetProject(String xmlFileTatgetProject) {
        this.xmlFileTatgetProject = xmlFileTatgetProject;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getPoName() {
        return poName;
    }

    public void setPoName(String poName) {
        this.poName = poName;
    }


}
