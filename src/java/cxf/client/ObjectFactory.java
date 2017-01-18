
package cxf.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cxf.client package. 
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

    private final static QName _GetAreaList_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getAreaList");
    private final static QName _GetAreaListResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getAreaListResponse");
    private final static QName _GetCategoryList_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getCategoryList");
    private final static QName _GetCategoryListResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getCategoryListResponse");
    private final static QName _GetCheckInfByGuidOrg_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getCheckInfByGuidOrg");
    private final static QName _GetCheckInfByGuidOrgResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getCheckInfByGuidOrgResponse");
    private final static QName _GetLicenseInfByGuidOrg_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getLicenseInfByGuidOrg");
    private final static QName _GetLicenseInfByGuidOrgResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getLicenseInfByGuidOrgResponse");
    private final static QName _GetOrgBeanListByServGuid_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getOrgBeanListByServGuid");
    private final static QName _GetOrgBeanListByServGuidResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getOrgBeanListByServGuidResponse");
    private final static QName _GetOrgInfBeanById_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getOrgInfBeanById");
    private final static QName _GetOrgInfBeanByIdResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getOrgInfBeanByIdResponse");
    private final static QName _GetServiceBeanListByGuidDep_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getServiceBeanListByGuidDep");
    private final static QName _GetServiceBeanListByGuidDepResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getServiceBeanListByGuidDepResponse");
    private final static QName _GetSocOrgList_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSocOrgList");
    private final static QName _GetSocOrgListResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSocOrgListResponse");
    private final static QName _GetSprServiceBeanList_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSprServiceBeanList");
    private final static QName _GetSprServiceBeanListResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSprServiceBeanListResponse");
    private final static QName _GetStaffListByGuidDep_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getStaffListByGuidDep");
    private final static QName _GetStaffListByGuidDepResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getStaffListByGuidDepResponse");
    private final static QName _GetSubDivisionBeanListByGuidOrg_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSubDivisionBeanListByGuidOrg");
    private final static QName _GetSubDivisionBeanListByGuidOrgResponse_QNAME = new QName("http://socialorg.ws.ooic.ru/", "getSubDivisionBeanListByGuidOrgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cxf.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAreaList }
     * 
     */
    public GetAreaList createGetAreaList() {
        return new GetAreaList();
    }

    /**
     * Create an instance of {@link GetAreaListResponse }
     * 
     */
    public GetAreaListResponse createGetAreaListResponse() {
        return new GetAreaListResponse();
    }

    /**
     * Create an instance of {@link GetCategoryList }
     * 
     */
    public GetCategoryList createGetCategoryList() {
        return new GetCategoryList();
    }

    /**
     * Create an instance of {@link GetCategoryListResponse }
     * 
     */
    public GetCategoryListResponse createGetCategoryListResponse() {
        return new GetCategoryListResponse();
    }

    /**
     * Create an instance of {@link GetCheckInfByGuidOrg }
     * 
     */
    public GetCheckInfByGuidOrg createGetCheckInfByGuidOrg() {
        return new GetCheckInfByGuidOrg();
    }

    /**
     * Create an instance of {@link GetCheckInfByGuidOrgResponse }
     * 
     */
    public GetCheckInfByGuidOrgResponse createGetCheckInfByGuidOrgResponse() {
        return new GetCheckInfByGuidOrgResponse();
    }

    /**
     * Create an instance of {@link GetLicenseInfByGuidOrg }
     * 
     */
    public GetLicenseInfByGuidOrg createGetLicenseInfByGuidOrg() {
        return new GetLicenseInfByGuidOrg();
    }

    /**
     * Create an instance of {@link GetLicenseInfByGuidOrgResponse }
     * 
     */
    public GetLicenseInfByGuidOrgResponse createGetLicenseInfByGuidOrgResponse() {
        return new GetLicenseInfByGuidOrgResponse();
    }

    /**
     * Create an instance of {@link GetOrgBeanListByServGuid }
     * 
     */
    public GetOrgBeanListByServGuid createGetOrgBeanListByServGuid() {
        return new GetOrgBeanListByServGuid();
    }

    /**
     * Create an instance of {@link GetOrgBeanListByServGuidResponse }
     * 
     */
    public GetOrgBeanListByServGuidResponse createGetOrgBeanListByServGuidResponse() {
        return new GetOrgBeanListByServGuidResponse();
    }

    /**
     * Create an instance of {@link GetOrgInfBeanById }
     * 
     */
    public GetOrgInfBeanById createGetOrgInfBeanById() {
        return new GetOrgInfBeanById();
    }

    /**
     * Create an instance of {@link GetOrgInfBeanByIdResponse }
     * 
     */
    public GetOrgInfBeanByIdResponse createGetOrgInfBeanByIdResponse() {
        return new GetOrgInfBeanByIdResponse();
    }

    /**
     * Create an instance of {@link GetServiceBeanListByGuidDep }
     * 
     */
    public GetServiceBeanListByGuidDep createGetServiceBeanListByGuidDep() {
        return new GetServiceBeanListByGuidDep();
    }

    /**
     * Create an instance of {@link GetServiceBeanListByGuidDepResponse }
     * 
     */
    public GetServiceBeanListByGuidDepResponse createGetServiceBeanListByGuidDepResponse() {
        return new GetServiceBeanListByGuidDepResponse();
    }

    /**
     * Create an instance of {@link GetSocOrgList }
     * 
     */
    public GetSocOrgList createGetSocOrgList() {
        return new GetSocOrgList();
    }

    /**
     * Create an instance of {@link GetSocOrgListResponse }
     * 
     */
    public GetSocOrgListResponse createGetSocOrgListResponse() {
        return new GetSocOrgListResponse();
    }

    /**
     * Create an instance of {@link GetSprServiceBeanList }
     * 
     */
    public GetSprServiceBeanList createGetSprServiceBeanList() {
        return new GetSprServiceBeanList();
    }

    /**
     * Create an instance of {@link GetSprServiceBeanListResponse }
     * 
     */
    public GetSprServiceBeanListResponse createGetSprServiceBeanListResponse() {
        return new GetSprServiceBeanListResponse();
    }

    /**
     * Create an instance of {@link GetStaffListByGuidDep }
     * 
     */
    public GetStaffListByGuidDep createGetStaffListByGuidDep() {
        return new GetStaffListByGuidDep();
    }

    /**
     * Create an instance of {@link GetStaffListByGuidDepResponse }
     * 
     */
    public GetStaffListByGuidDepResponse createGetStaffListByGuidDepResponse() {
        return new GetStaffListByGuidDepResponse();
    }

    /**
     * Create an instance of {@link GetSubDivisionBeanListByGuidOrg }
     * 
     */
    public GetSubDivisionBeanListByGuidOrg createGetSubDivisionBeanListByGuidOrg() {
        return new GetSubDivisionBeanListByGuidOrg();
    }

    /**
     * Create an instance of {@link GetSubDivisionBeanListByGuidOrgResponse }
     * 
     */
    public GetSubDivisionBeanListByGuidOrgResponse createGetSubDivisionBeanListByGuidOrgResponse() {
        return new GetSubDivisionBeanListByGuidOrgResponse();
    }

    /**
     * Create an instance of {@link OrgBean }
     * 
     */
    public OrgBean createOrgBean() {
        return new OrgBean();
    }

    /**
     * Create an instance of {@link OrgInfBean }
     * 
     */
    public OrgInfBean createOrgInfBean() {
        return new OrgInfBean();
    }

    /**
     * Create an instance of {@link OrgBeanList }
     * 
     */
    public OrgBeanList createOrgBeanList() {
        return new OrgBeanList();
    }

    /**
     * Create an instance of {@link ServiceBeanList }
     * 
     */
    public ServiceBeanList createServiceBeanList() {
        return new ServiceBeanList();
    }

    /**
     * Create an instance of {@link ServiceBean }
     * 
     */
    public ServiceBean createServiceBean() {
        return new ServiceBean();
    }

    /**
     * Create an instance of {@link CheckBeanList }
     * 
     */
    public CheckBeanList createCheckBeanList() {
        return new CheckBeanList();
    }

    /**
     * Create an instance of {@link CheckBean }
     * 
     */
    public CheckBean createCheckBean() {
        return new CheckBean();
    }

    /**
     * Create an instance of {@link StaffBeanList }
     * 
     */
    public StaffBeanList createStaffBeanList() {
        return new StaffBeanList();
    }

    /**
     * Create an instance of {@link StaffBean }
     * 
     */
    public StaffBean createStaffBean() {
        return new StaffBean();
    }

    /**
     * Create an instance of {@link AreaBeanList }
     * 
     */
    public AreaBeanList createAreaBeanList() {
        return new AreaBeanList();
    }

    /**
     * Create an instance of {@link AreaBean }
     * 
     */
    public AreaBean createAreaBean() {
        return new AreaBean();
    }

    /**
     * Create an instance of {@link CategoryBeanList }
     * 
     */
    public CategoryBeanList createCategoryBeanList() {
        return new CategoryBeanList();
    }

    /**
     * Create an instance of {@link CategoryBean }
     * 
     */
    public CategoryBean createCategoryBean() {
        return new CategoryBean();
    }

    /**
     * Create an instance of {@link LicenseBeanList }
     * 
     */
    public LicenseBeanList createLicenseBeanList() {
        return new LicenseBeanList();
    }

    /**
     * Create an instance of {@link LicenseBean }
     * 
     */
    public LicenseBean createLicenseBean() {
        return new LicenseBean();
    }

    /**
     * Create an instance of {@link SubDivisionBeanList }
     * 
     */
    public SubDivisionBeanList createSubDivisionBeanList() {
        return new SubDivisionBeanList();
    }

    /**
     * Create an instance of {@link SubDivisionBean }
     * 
     */
    public SubDivisionBean createSubDivisionBean() {
        return new SubDivisionBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getAreaList")
    public JAXBElement<GetAreaList> createGetAreaList(GetAreaList value) {
        return new JAXBElement<GetAreaList>(_GetAreaList_QNAME, GetAreaList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAreaListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getAreaListResponse")
    public JAXBElement<GetAreaListResponse> createGetAreaListResponse(GetAreaListResponse value) {
        return new JAXBElement<GetAreaListResponse>(_GetAreaListResponse_QNAME, GetAreaListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getCategoryList")
    public JAXBElement<GetCategoryList> createGetCategoryList(GetCategoryList value) {
        return new JAXBElement<GetCategoryList>(_GetCategoryList_QNAME, GetCategoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCategoryListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getCategoryListResponse")
    public JAXBElement<GetCategoryListResponse> createGetCategoryListResponse(GetCategoryListResponse value) {
        return new JAXBElement<GetCategoryListResponse>(_GetCategoryListResponse_QNAME, GetCategoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckInfByGuidOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getCheckInfByGuidOrg")
    public JAXBElement<GetCheckInfByGuidOrg> createGetCheckInfByGuidOrg(GetCheckInfByGuidOrg value) {
        return new JAXBElement<GetCheckInfByGuidOrg>(_GetCheckInfByGuidOrg_QNAME, GetCheckInfByGuidOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCheckInfByGuidOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getCheckInfByGuidOrgResponse")
    public JAXBElement<GetCheckInfByGuidOrgResponse> createGetCheckInfByGuidOrgResponse(GetCheckInfByGuidOrgResponse value) {
        return new JAXBElement<GetCheckInfByGuidOrgResponse>(_GetCheckInfByGuidOrgResponse_QNAME, GetCheckInfByGuidOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseInfByGuidOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getLicenseInfByGuidOrg")
    public JAXBElement<GetLicenseInfByGuidOrg> createGetLicenseInfByGuidOrg(GetLicenseInfByGuidOrg value) {
        return new JAXBElement<GetLicenseInfByGuidOrg>(_GetLicenseInfByGuidOrg_QNAME, GetLicenseInfByGuidOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseInfByGuidOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getLicenseInfByGuidOrgResponse")
    public JAXBElement<GetLicenseInfByGuidOrgResponse> createGetLicenseInfByGuidOrgResponse(GetLicenseInfByGuidOrgResponse value) {
        return new JAXBElement<GetLicenseInfByGuidOrgResponse>(_GetLicenseInfByGuidOrgResponse_QNAME, GetLicenseInfByGuidOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrgBeanListByServGuid }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getOrgBeanListByServGuid")
    public JAXBElement<GetOrgBeanListByServGuid> createGetOrgBeanListByServGuid(GetOrgBeanListByServGuid value) {
        return new JAXBElement<GetOrgBeanListByServGuid>(_GetOrgBeanListByServGuid_QNAME, GetOrgBeanListByServGuid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrgBeanListByServGuidResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getOrgBeanListByServGuidResponse")
    public JAXBElement<GetOrgBeanListByServGuidResponse> createGetOrgBeanListByServGuidResponse(GetOrgBeanListByServGuidResponse value) {
        return new JAXBElement<GetOrgBeanListByServGuidResponse>(_GetOrgBeanListByServGuidResponse_QNAME, GetOrgBeanListByServGuidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrgInfBeanById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getOrgInfBeanById")
    public JAXBElement<GetOrgInfBeanById> createGetOrgInfBeanById(GetOrgInfBeanById value) {
        return new JAXBElement<GetOrgInfBeanById>(_GetOrgInfBeanById_QNAME, GetOrgInfBeanById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrgInfBeanByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getOrgInfBeanByIdResponse")
    public JAXBElement<GetOrgInfBeanByIdResponse> createGetOrgInfBeanByIdResponse(GetOrgInfBeanByIdResponse value) {
        return new JAXBElement<GetOrgInfBeanByIdResponse>(_GetOrgInfBeanByIdResponse_QNAME, GetOrgInfBeanByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceBeanListByGuidDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getServiceBeanListByGuidDep")
    public JAXBElement<GetServiceBeanListByGuidDep> createGetServiceBeanListByGuidDep(GetServiceBeanListByGuidDep value) {
        return new JAXBElement<GetServiceBeanListByGuidDep>(_GetServiceBeanListByGuidDep_QNAME, GetServiceBeanListByGuidDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceBeanListByGuidDepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getServiceBeanListByGuidDepResponse")
    public JAXBElement<GetServiceBeanListByGuidDepResponse> createGetServiceBeanListByGuidDepResponse(GetServiceBeanListByGuidDepResponse value) {
        return new JAXBElement<GetServiceBeanListByGuidDepResponse>(_GetServiceBeanListByGuidDepResponse_QNAME, GetServiceBeanListByGuidDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSocOrgList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSocOrgList")
    public JAXBElement<GetSocOrgList> createGetSocOrgList(GetSocOrgList value) {
        return new JAXBElement<GetSocOrgList>(_GetSocOrgList_QNAME, GetSocOrgList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSocOrgListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSocOrgListResponse")
    public JAXBElement<GetSocOrgListResponse> createGetSocOrgListResponse(GetSocOrgListResponse value) {
        return new JAXBElement<GetSocOrgListResponse>(_GetSocOrgListResponse_QNAME, GetSocOrgListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSprServiceBeanList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSprServiceBeanList")
    public JAXBElement<GetSprServiceBeanList> createGetSprServiceBeanList(GetSprServiceBeanList value) {
        return new JAXBElement<GetSprServiceBeanList>(_GetSprServiceBeanList_QNAME, GetSprServiceBeanList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSprServiceBeanListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSprServiceBeanListResponse")
    public JAXBElement<GetSprServiceBeanListResponse> createGetSprServiceBeanListResponse(GetSprServiceBeanListResponse value) {
        return new JAXBElement<GetSprServiceBeanListResponse>(_GetSprServiceBeanListResponse_QNAME, GetSprServiceBeanListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaffListByGuidDep }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getStaffListByGuidDep")
    public JAXBElement<GetStaffListByGuidDep> createGetStaffListByGuidDep(GetStaffListByGuidDep value) {
        return new JAXBElement<GetStaffListByGuidDep>(_GetStaffListByGuidDep_QNAME, GetStaffListByGuidDep.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaffListByGuidDepResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getStaffListByGuidDepResponse")
    public JAXBElement<GetStaffListByGuidDepResponse> createGetStaffListByGuidDepResponse(GetStaffListByGuidDepResponse value) {
        return new JAXBElement<GetStaffListByGuidDepResponse>(_GetStaffListByGuidDepResponse_QNAME, GetStaffListByGuidDepResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubDivisionBeanListByGuidOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSubDivisionBeanListByGuidOrg")
    public JAXBElement<GetSubDivisionBeanListByGuidOrg> createGetSubDivisionBeanListByGuidOrg(GetSubDivisionBeanListByGuidOrg value) {
        return new JAXBElement<GetSubDivisionBeanListByGuidOrg>(_GetSubDivisionBeanListByGuidOrg_QNAME, GetSubDivisionBeanListByGuidOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubDivisionBeanListByGuidOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://socialorg.ws.ooic.ru/", name = "getSubDivisionBeanListByGuidOrgResponse")
    public JAXBElement<GetSubDivisionBeanListByGuidOrgResponse> createGetSubDivisionBeanListByGuidOrgResponse(GetSubDivisionBeanListByGuidOrgResponse value) {
        return new JAXBElement<GetSubDivisionBeanListByGuidOrgResponse>(_GetSubDivisionBeanListByGuidOrgResponse_QNAME, GetSubDivisionBeanListByGuidOrgResponse.class, null, value);
    }

}
