//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.13 at 09:03:47 PM EDT 
//


package gov.sc.sg.engineering.hydro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gov.sc.sg.engineering.hydro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Extension_QNAME = new QName("http://www.cuahsi.org/waterML/1.1/", "extension");
    private final static QName _VariablesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.1/", "variablesResponse");
    private final static QName _SitesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.1/", "sitesResponse");
    private final static QName _TimeSeriesResponse_QNAME = new QName("http://www.cuahsi.org/waterML/1.1/", "timeSeriesResponse");
    private final static QName _VariableInfoTypeTimeScale_QNAME = new QName("http://www.cuahsi.org/waterML/1.1/", "timeScale");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gov.sc.sg.engineering.hydro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DataSetInfoType }
     * 
     */
    public DataSetInfoType createDataSetInfoType() {
        return new DataSetInfoType();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo }
     * 
     */
    public DataSetInfoType.TimeZoneInfo createDataSetInfoTypeTimeZoneInfo() {
        return new DataSetInfoType.TimeZoneInfo();
    }

    /**
     * Create an instance of {@link VariableInfoType }
     * 
     */
    public VariableInfoType createVariableInfoType() {
        return new VariableInfoType();
    }

    /**
     * Create an instance of {@link VariableInfoType.Categories }
     * 
     */
    public VariableInfoType.Categories createVariableInfoTypeCategories() {
        return new VariableInfoType.Categories();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related }
     * 
     */
    public VariableInfoType.Related createVariableInfoTypeRelated() {
        return new VariableInfoType.Related();
    }

    /**
     * Create an instance of {@link QueryInfoType }
     * 
     */
    public QueryInfoType createQueryInfoType() {
        return new QueryInfoType();
    }

    /**
     * Create an instance of {@link QueryInfoType.Criteria }
     * 
     */
    public QueryInfoType.Criteria createQueryInfoTypeCriteria() {
        return new QueryInfoType.Criteria();
    }

    /**
     * Create an instance of {@link SiteInfoType }
     * 
     */
    public SiteInfoType createSiteInfoType() {
        return new SiteInfoType();
    }

    /**
     * Create an instance of {@link SiteInfoType.GeoLocation }
     * 
     */
    public SiteInfoType.GeoLocation createSiteInfoTypeGeoLocation() {
        return new SiteInfoType.GeoLocation();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo }
     * 
     */
    public SiteInfoType.TimeZoneInfo createSiteInfoTypeTimeZoneInfo() {
        return new SiteInfoType.TimeZoneInfo();
    }

    /**
     * Create an instance of {@link SeriesCatalogType }
     * 
     */
    public SeriesCatalogType createSeriesCatalogType() {
        return new SeriesCatalogType();
    }

    /**
     * Create an instance of {@link SeriesCatalogType.Series }
     * 
     */
    public SeriesCatalogType.Series createSeriesCatalogTypeSeries() {
        return new SeriesCatalogType.Series();
    }

    /**
     * Create an instance of {@link SiteInfoResponseType }
     * 
     */
    public SiteInfoResponseType createSiteInfoResponseType() {
        return new SiteInfoResponseType();
    }

    /**
     * Create an instance of {@link VariablesResponseType }
     * 
     */
    public VariablesResponseType createVariablesResponseType() {
        return new VariablesResponseType();
    }

    /**
     * Create an instance of {@link Options }
     * 
     */
    public Options createOptions() {
        return new Options();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link TimeSeriesResponseType }
     * 
     */
    public TimeSeriesResponseType createTimeSeriesResponseType() {
        return new TimeSeriesResponseType();
    }

    /**
     * Create an instance of {@link SourceType }
     * 
     */
    public SourceType createSourceType() {
        return new SourceType();
    }

    /**
     * Create an instance of {@link PropertyType }
     * 
     */
    public PropertyType createPropertyType() {
        return new PropertyType();
    }

    /**
     * Create an instance of {@link TimePeriodRealTimeType }
     * 
     */
    public TimePeriodRealTimeType createTimePeriodRealTimeType() {
        return new TimePeriodRealTimeType();
    }

    /**
     * Create an instance of {@link MetaDataType }
     * 
     */
    public MetaDataType createMetaDataType() {
        return new MetaDataType();
    }

    /**
     * Create an instance of {@link TimeIntervalType }
     * 
     */
    public TimeIntervalType createTimeIntervalType() {
        return new TimeIntervalType();
    }

    /**
     * Create an instance of {@link LatLonBoxType }
     * 
     */
    public LatLonBoxType createLatLonBoxType() {
        return new LatLonBoxType();
    }

    /**
     * Create an instance of {@link TimeSeriesType }
     * 
     */
    public TimeSeriesType createTimeSeriesType() {
        return new TimeSeriesType();
    }

    /**
     * Create an instance of {@link QualifierType }
     * 
     */
    public QualifierType createQualifierType() {
        return new QualifierType();
    }

    /**
     * Create an instance of {@link ContactInformationType }
     * 
     */
    public ContactInformationType createContactInformationType() {
        return new ContactInformationType();
    }

    /**
     * Create an instance of {@link CoordType }
     * 
     */
    public CoordType createCoordType() {
        return new CoordType();
    }

    /**
     * Create an instance of {@link TimeSingleType }
     * 
     */
    public TimeSingleType createTimeSingleType() {
        return new TimeSingleType();
    }

    /**
     * Create an instance of {@link QualityControlLevelType }
     * 
     */
    public QualityControlLevelType createQualityControlLevelType() {
        return new QualityControlLevelType();
    }

    /**
     * Create an instance of {@link LatLonPointType }
     * 
     */
    public LatLonPointType createLatLonPointType() {
        return new LatLonPointType();
    }

    /**
     * Create an instance of {@link TimeZoneType }
     * 
     */
    public TimeZoneType createTimeZoneType() {
        return new TimeZoneType();
    }

    /**
     * Create an instance of {@link ValueSingleVariable }
     * 
     */
    public ValueSingleVariable createValueSingleVariable() {
        return new ValueSingleVariable();
    }

    /**
     * Create an instance of {@link MethodType }
     * 
     */
    public MethodType createMethodType() {
        return new MethodType();
    }

    /**
     * Create an instance of {@link CensorCodeType }
     * 
     */
    public CensorCodeType createCensorCodeType() {
        return new CensorCodeType();
    }

    /**
     * Create an instance of {@link DocumentationType }
     * 
     */
    public DocumentationType createDocumentationType() {
        return new DocumentationType();
    }

    /**
     * Create an instance of {@link TsValuesSingleVariableType }
     * 
     */
    public TsValuesSingleVariableType createTsValuesSingleVariableType() {
        return new TsValuesSingleVariableType();
    }

    /**
     * Create an instance of {@link TimePeriodType }
     * 
     */
    public TimePeriodType createTimePeriodType() {
        return new TimePeriodType();
    }

    /**
     * Create an instance of {@link NoteType }
     * 
     */
    public NoteType createNoteType() {
        return new NoteType();
    }

    /**
     * Create an instance of {@link LabMethodType }
     * 
     */
    public LabMethodType createLabMethodType() {
        return new LabMethodType();
    }

    /**
     * Create an instance of {@link OffsetType }
     * 
     */
    public OffsetType createOffsetType() {
        return new OffsetType();
    }

    /**
     * Create an instance of {@link LatLonLineString }
     * 
     */
    public LatLonLineString createLatLonLineString() {
        return new LatLonLineString();
    }

    /**
     * Create an instance of {@link UnitsType }
     * 
     */
    public UnitsType createUnitsType() {
        return new UnitsType();
    }

    /**
     * Create an instance of {@link SampleType }
     * 
     */
    public SampleType createSampleType() {
        return new SampleType();
    }

    /**
     * Create an instance of {@link SourceInfoType }
     * 
     */
    public SourceInfoType createSourceInfoType() {
        return new SourceInfoType();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo.DefaultTimeZone }
     * 
     */
    public DataSetInfoType.TimeZoneInfo.DefaultTimeZone createDataSetInfoTypeTimeZoneInfoDefaultTimeZone() {
        return new DataSetInfoType.TimeZoneInfo.DefaultTimeZone();
    }

    /**
     * Create an instance of {@link DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
     * 
     */
    public DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone createDataSetInfoTypeTimeZoneInfoDaylightSavingsTimeZone() {
        return new DataSetInfoType.TimeZoneInfo.DaylightSavingsTimeZone();
    }

    /**
     * Create an instance of {@link VariableInfoType.VariableCode }
     * 
     */
    public VariableInfoType.VariableCode createVariableInfoTypeVariableCode() {
        return new VariableInfoType.VariableCode();
    }

    /**
     * Create an instance of {@link VariableInfoType.TimeScale }
     * 
     */
    public VariableInfoType.TimeScale createVariableInfoTypeTimeScale() {
        return new VariableInfoType.TimeScale();
    }

    /**
     * Create an instance of {@link VariableInfoType.Categories.Category }
     * 
     */
    public VariableInfoType.Categories.Category createVariableInfoTypeCategoriesCategory() {
        return new VariableInfoType.Categories.Category();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related.ParentCode }
     * 
     */
    public VariableInfoType.Related.ParentCode createVariableInfoTypeRelatedParentCode() {
        return new VariableInfoType.Related.ParentCode();
    }

    /**
     * Create an instance of {@link VariableInfoType.Related.RelatedCode }
     * 
     */
    public VariableInfoType.Related.RelatedCode createVariableInfoTypeRelatedRelatedCode() {
        return new VariableInfoType.Related.RelatedCode();
    }

    /**
     * Create an instance of {@link QueryInfoType.Criteria.TimeParam }
     * 
     */
    public QueryInfoType.Criteria.TimeParam createQueryInfoTypeCriteriaTimeParam() {
        return new QueryInfoType.Criteria.TimeParam();
    }

    /**
     * Create an instance of {@link QueryInfoType.Criteria.Parameter }
     * 
     */
    public QueryInfoType.Criteria.Parameter createQueryInfoTypeCriteriaParameter() {
        return new QueryInfoType.Criteria.Parameter();
    }

    /**
     * Create an instance of {@link SiteInfoType.SiteCode }
     * 
     */
    public SiteInfoType.SiteCode createSiteInfoTypeSiteCode() {
        return new SiteInfoType.SiteCode();
    }

    /**
     * Create an instance of {@link SiteInfoType.GeoLocation.LocalSiteXY }
     * 
     */
    public SiteInfoType.GeoLocation.LocalSiteXY createSiteInfoTypeGeoLocationLocalSiteXY() {
        return new SiteInfoType.GeoLocation.LocalSiteXY();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo.DefaultTimeZone }
     * 
     */
    public SiteInfoType.TimeZoneInfo.DefaultTimeZone createSiteInfoTypeTimeZoneInfoDefaultTimeZone() {
        return new SiteInfoType.TimeZoneInfo.DefaultTimeZone();
    }

    /**
     * Create an instance of {@link SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone }
     * 
     */
    public SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone createSiteInfoTypeTimeZoneInfoDaylightSavingsTimeZone() {
        return new SiteInfoType.TimeZoneInfo.DaylightSavingsTimeZone();
    }

    /**
     * Create an instance of {@link SeriesCatalogType.Series.ValueCount }
     * 
     */
    public SeriesCatalogType.Series.ValueCount createSeriesCatalogTypeSeriesValueCount() {
        return new SeriesCatalogType.Series.ValueCount();
    }

    /**
     * Create an instance of {@link SiteInfoResponseType.Site }
     * 
     */
    public SiteInfoResponseType.Site createSiteInfoResponseTypeSite() {
        return new SiteInfoResponseType.Site();
    }

    /**
     * Create an instance of {@link VariablesResponseType.Variables }
     * 
     */
    public VariablesResponseType.Variables createVariablesResponseTypeVariables() {
        return new VariablesResponseType.Variables();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.1/", name = "extension")
    public JAXBElement<Object> createExtension(Object value) {
        return new JAXBElement<Object>(_Extension_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariablesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.1/", name = "variablesResponse")
    public JAXBElement<VariablesResponseType> createVariablesResponse(VariablesResponseType value) {
        return new JAXBElement<VariablesResponseType>(_VariablesResponse_QNAME, VariablesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiteInfoResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.1/", name = "sitesResponse")
    public JAXBElement<SiteInfoResponseType> createSitesResponse(SiteInfoResponseType value) {
        return new JAXBElement<SiteInfoResponseType>(_SitesResponse_QNAME, SiteInfoResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeSeriesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.1/", name = "timeSeriesResponse")
    public JAXBElement<TimeSeriesResponseType> createTimeSeriesResponse(TimeSeriesResponseType value) {
        return new JAXBElement<TimeSeriesResponseType>(_TimeSeriesResponse_QNAME, TimeSeriesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VariableInfoType.TimeScale }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.cuahsi.org/waterML/1.1/", name = "timeScale", scope = VariableInfoType.class)
    public JAXBElement<VariableInfoType.TimeScale> createVariableInfoTypeTimeScale(VariableInfoType.TimeScale value) {
        return new JAXBElement<VariableInfoType.TimeScale>(_VariableInfoTypeTimeScale_QNAME, VariableInfoType.TimeScale.class, VariableInfoType.class, value);
    }

}
