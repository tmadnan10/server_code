/**
 * QCRI, sPCA LICENSE
 * sPCA is a scalable implementation of Principal Component Analysis (PCA) on of Spark and MapReduce
 *
 * Copyright (c) 2015, Qatar Foundation for Education, Science and Community Development (on
 * behalf of Qatar Computing Research Institute) having its principle place of business in Doha,
 * Qatar with the registered address P.O box 5825 Doha, Qatar (hereinafter referred to as "QCRI")
 *
*/


package org.qcri.sparkpca;

import java.util.ArrayList;

public class AccumulationStat {
	public String appName=null;
	public String dataSet=null;
	public int nRows=0;
	public int nCols=0;
	public int nPCs=0;
	public int nPartitions=0;
	public int nIter=0;
	public double totalAccumulationTime=0;
	public double avgTime=0;
	public double IOTime=0;
	public ArrayList<Double> ppcaIterTime=new ArrayList<Double>();
	public ArrayList<Double> errorList=new ArrayList<Double>();
	public ArrayList<Double> dwList=new ArrayList<Double>();
	AccumulationStat(){
		
	}
	
}
