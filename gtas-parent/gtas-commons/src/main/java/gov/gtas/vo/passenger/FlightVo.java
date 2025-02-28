/*
 * All GTAS code is Copyright 2016, The Department of Homeland Security (DHS), U.S. Customs and Border Protection (CBP).
 * 
 * Please see LICENSE.txt for details.
 */
package gov.gtas.vo.passenger;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.fasterxml.jackson.annotation.JsonFormat;

import gov.gtas.vo.BaseVo;

public class FlightVo extends BaseVo {
    public static final String DATE_FORMAT = "yyyy-MM-dd HH:mm";
    public static final String SHORT_DATE_FORMAT = "yyyy-MM-dd";
    private static final SimpleDateFormat dtFormat = new SimpleDateFormat(DATE_FORMAT);
    
    private String flightId;
    private String carrier;
    private String flightNumber;
    private String fullFlightNumber;
    private String origin;
    private String originCountry;
    private String destination;
    private String destinationCountry;
    private boolean isOverFlight;
    private String direction;
    private String idTag;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = SHORT_DATE_FORMAT)
    private Date flightDate;
    private Date etd;
    private Date eta;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    private Date etdDate;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
    private Date etaDate;
    private CountDownVo countDown;
    private Integer passengerCount = 0;
    private Integer ruleHitCount = 0;
    private Integer listHitCount;
    private Integer graphHitCount;
    private Integer fuzzyHitCount;
    private Long paxWatchlistLinkHits = 0L;
    private int ruleHits;
    private int listHits;
    private int paxListHit;
    private int docListHit;
    private List <CodeShareVo> codeshares;
    public int getRuleHits() {
        return ruleHits;
    }
    public void setRuleHits(int ruleHits) {
        this.ruleHits = ruleHits;
    }
    public int getListHits() {
        return listHits;
    }
    public void setListHits(int listHits) {
        this.listHits = listHits;
    }
    public int getPaxListHit() {
        return paxListHit;
    }
    public void setPaxListHit(int paxListHit) {
        this.paxListHit = paxListHit;
    }
    public int getDocListHit() {
        return docListHit;
    }
    public void setDocListHit(int docListHit) {
        this.docListHit = docListHit;
    }
    public String getFlightId() {
        return flightId;
    }
    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }
    public String getIdTag() {
        return idTag;
    }
    public void setIdTag(String idTag) {
        this.idTag = idTag;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }
    public String getCarrier() {
        return carrier;
    }
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public String getFullFlightNumber() {
        return fullFlightNumber;
    }
    public void setFullFlightNumber(String fullFlightNumber) {
        this.fullFlightNumber = fullFlightNumber;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getOriginCountry() {
        return originCountry;
    }
    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDestinationCountry() {
        return destinationCountry;
    }
    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }
    public Date getFlightDate() {
        return flightDate;
    }
    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }
    public boolean isOverFlight() {
        return isOverFlight;
    }
    public void setOverFlight(boolean isOverFlight) {
        this.isOverFlight = isOverFlight;
    }
    public Integer getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(Integer passengerCount) {
        this.passengerCount = passengerCount;
    }
    public Integer getRuleHitCount() {
        return ruleHitCount;
    }
    public void setRuleHitCount(Integer ruleHitCount) {
        this.ruleHitCount = ruleHitCount;
    }
    public Integer getListHitCount() {
        return listHitCount;
    }
    public void setListHitCount(Integer listHitCount) {
        this.listHitCount = listHitCount;
    }

    public Date getEtd() {
        return etd;
    }

    public void setEtd(Date etd) {
        this.etd = etd;
    }

    public Date getEta() {
        return eta;
    }

    public void setEta(Date eta) {
        this.eta = eta;
    }
    
    public List <CodeShareVo> getCodeshares() {
		return codeshares;
	}
    
	public void setCodeshares(List <CodeShareVo> codeshares) {
		this.codeshares = codeshares;
	}
    
    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE); 
    }

    public Long getPaxWatchlistLinkHits() {
        return paxWatchlistLinkHits;
    }

    public void setPaxWatchlistLinkHits(Long paxWatchlistLinkHits) {
        this.paxWatchlistLinkHits = paxWatchlistLinkHits;
    }

    public Integer getGraphHitCount() {
        return graphHitCount;
    }

    public void setGraphHitCount(Integer graphHitcount) {
        this.graphHitCount = graphHitcount;
    }

    public Integer getFuzzyHitCount() {
        return fuzzyHitCount;
    }

    public void setFuzzyHitCount(Integer fuzzyHitcount) {
        this.fuzzyHitCount = fuzzyHitcount;
    }

    public CountDownVo getCountDown() {
        return countDown;
    }

    public void setCountDown(CountDownVo countDown) {
        this.countDown = countDown;
    }

    public Date getEtdDate() {
        return etdDate;
    }

    public void setEtdDate(Date etdDate) {
        this.etdDate = etdDate;
    }

    public Date getEtaDate() {
        return etaDate;
    }

    public void setEtaDate(Date etaDate) {
        this.etaDate = etaDate;
    }
}
