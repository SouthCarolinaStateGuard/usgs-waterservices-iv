/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov.sc.sg.engineering.hydro.client;

import gov.sc.sg.engineering.hydro.LatLonPointType;
import gov.sc.sg.engineering.hydro.SiteInfoType;
import gov.sc.sg.engineering.hydro.SourceInfoType;
import gov.sc.sg.engineering.hydro.TimeSeriesResponseType;
import gov.sc.sg.engineering.hydro.TimeSeriesType;
import gov.sc.sg.engineering.hydro.TsValuesSingleVariableType;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.moxy.json.MoxyJsonFeature;

/**
 *
 * @author jyeary
 */
public class RestClient {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient()
                .register(MoxyJsonFeature.class);
        WebTarget target = client.target("https://waterservices.usgs.gov")
                .path("/nwis/iv")
                .queryParam("stateCd", "sc")
                .queryParam("parameterCd", "00065")
                .queryParam("siteStatus", "active");
        TimeSeriesResponseType tsrt = target.request(MediaType.APPLICATION_JSON_TYPE).get(TimeSeriesResponseType.class);
        List<TimeSeriesType> tst = tsrt.getTimeSeries();
        System.out.println("Number of Results: " + tst.size());
        for (TimeSeriesType t : tst) {
            System.out.println(t.getName());
            SourceInfoType sit = t.getSourceInfo();

            if (sit instanceof SiteInfoType) {
                SiteInfoType sif = (SiteInfoType) sit;
                System.out.println(sif.getSiteName());
                SiteInfoType.GeoLocation gl = sif.getGeoLocation();
                System.out.println(gl.getGeogLocation().getSrs());
                if (gl.getGeogLocation() instanceof LatLonPointType) {
                    LatLonPointType lls = (LatLonPointType) (gl.getGeogLocation());
                    System.out.println(lls.getLatitude());
                    System.out.println(lls.getLongitude());
                }
            }
            System.out.println(t.getVariable().getVariableCode().get(0).getValue());
            System.out.println(t.getVariable().getUnit().getUnitCode());
            for (TsValuesSingleVariableType tvsvt : t.getValues()) {
                System.out.println(tvsvt.getValue().get(0).getValue());
                System.out.println(tvsvt.getValue().get(0).getDateTime());
            }
        }
    }
}
