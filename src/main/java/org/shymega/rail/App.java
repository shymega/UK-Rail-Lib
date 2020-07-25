package org.shymega.rail;

import com.thalesgroup.rtti._2017_10_01.ldbsv.types.ServiceItem;
import com.thalesgroup.rtti._2013_11_28.token.types.AccessToken;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardByCRSParams;
import com.thalesgroup.rtti._2017_10_01.ldbsv.GetBoardResponseType;
import com.thalesgroup.rtti._2017_10_01.ldbsv.LDBSVServiceSoap;
import com.thalesgroup.rtti._2017_10_01.ldbsv.Ldbsv;
import com.thalesgroup.rtti._2017_10_01.ldbsv.types.StationBoard;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.GregorianCalendar;
import java.util.List;

public class App
{
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
