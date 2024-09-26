package net.javaguides.springboot.service;



import java.util.List;

import java.util.Optional;

import net.javaguides.springboot.model.College;
import net.javaguides.springboot.model.Dao;
import org.apache.catalina.*;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class CollegeServiceImpl implements Service {

    @Autowired
    private Dao dao;

    @Override
    public List<College> getCollegeDetail() {
        // TODO Auto-generated method stub
        return dao.findAll();
    }

    @Override
    public Optional<College> getCollegeDetail(Long id) {
        // TODO Auto-generated method stub
        return dao.findById(id);
    }

    @Override
    public College addCollege(College college) {
        // TODO Auto-generated method stub
        dao.save(college);
        return college;
    }

    @Override
    public College updateCollege(College college) {
        // TODO Auto-generated method stub
        dao.save(college);
        return college;
    }

    @Override
    public void deleteCollege(long parseLong) {
        // TODO Auto-generated method stub
        College cl = dao.getReferenceById(parseLong);
        dao.delete(cl);

    }

    @Override
    public Engine getContainer() {
        return null;
    }

    @Override
    public void setContainer(Engine engine) {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String s) {

    }

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public void setServer(Server server) {

    }

    @Override
    public ClassLoader getParentClassLoader() {
        return null;
    }

    @Override
    public void setParentClassLoader(ClassLoader classLoader) {

    }

    @Override
    public String getDomain() {
        return "";
    }

    @Override
    public void addConnector(Connector connector) {

    }

    @Override
    public Connector[] findConnectors() {
        return new Connector[0];
    }

    @Override
    public void removeConnector(Connector connector) {

    }

    @Override
    public void addExecutor(Executor executor) {

    }

    @Override
    public Executor[] findExecutors() {
        return new Executor[0];
    }

    @Override
    public Executor getExecutor(String s) {
        return null;
    }

    @Override
    public void removeExecutor(Executor executor) {

    }

    @Override
    public Mapper getMapper() {
        return null;
    }

    @Override
    public void addLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public LifecycleListener[] findLifecycleListeners() {
        return new LifecycleListener[0];
    }

    @Override
    public void removeLifecycleListener(LifecycleListener lifecycleListener) {

    }

    @Override
    public void init() throws LifecycleException {

    }

    @Override
    public void start() throws LifecycleException {

    }

    @Override
    public void stop() throws LifecycleException {

    }

    @Override
    public void destroy() throws LifecycleException {

    }

    @Override
    public LifecycleState getState() {
        return null;
    }

    @Override
    public String getStateName() {
        return "";
    }
}