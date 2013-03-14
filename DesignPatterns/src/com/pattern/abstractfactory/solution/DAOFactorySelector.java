package com.pattern.abstractfactory.solution;

public class DAOFactorySelector {

	public static DAOFactory selectDAOFactory(String DAOFactoryName) {
		DAOFactory daoFactory = null;

		if ("Oracle".equals(DAOFactoryName)) {
			daoFactory = new OracleDAOFactory(new FactoryConfig());
		} else if ("Product".equals(DAOFactoryName)) {
			daoFactory = new FileDAOFactory(new FactoryConfig());
		}

		return daoFactory;
	}

}
