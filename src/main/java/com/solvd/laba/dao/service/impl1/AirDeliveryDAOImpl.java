package com.solvd.laba.dao.service.impl1;

import com.solvd.laba.dao.model.AirDelivery;
import com.solvd.laba.dao.service.IAirDeliveryDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.io.Reader;

public class AirDeliveryDAOImpl implements IAirDeliveryDAO {
    private static final Logger LOGGER = LogManager.getLogger(AirDeliveryDAOImpl.class);
    private static IAirDeliveryDAO iAirDeliveryMapper;
    private static SqlSession sqlSession;
    private static final SqlSessionFactory sqlSessionFactory;
    private static Reader reader = null;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis.config.xml");
        } catch (IOException e) {
            LOGGER.info(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }

    @Override
    public void showAll() {

    }

    @Override
    public AirDelivery getEntityById(int id) {
        iAirDeliveryMapper = sqlSessionFactory.openSession().getMapper(IAirDeliveryDAO.class);
        AirDelivery airDelivery = iAirDeliveryMapper.getEntityById(id);
        return airDelivery;
    }

    @Override
    public void saveEntity(AirDelivery entity) {

    }

    @Override
    public void updateEntity(AirDelivery entity) {

    }

    @Override
    public void removeEntityById(int id) {

    }
}
