
package com.netsuite.webservices.platform.core_2018_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2018_1.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.AccountingTransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.AddressSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.AssemblyItemBomSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BillingAccountSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BillingScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BinSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BomRevisionComponentSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BomRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BomSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.BudgetSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ChargeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ConsolidatedExchangeRateSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ContactCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ContactRoleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CostCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CouponCodeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CurrencyRateSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomListSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomRecordSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomerMessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.CustomerStatusSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.EntityGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.EntitySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.FairValuePriceSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.FileSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.FolderSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.GiftCertificateSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.GlobalAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.GroupMemberSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.HcmJobSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.InboundShipmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.InventoryDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.InventoryNumberBinSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.InventoryNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.IssueSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemAccountMappingSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemBinNumberSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemDemandPlanSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemRevisionSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ItemSupplyPlanSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.JobSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.JobStatusSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.JobTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ManufacturingCostTemplateSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ManufacturingOperationTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ManufacturingRoutingSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.MseSubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.NexusSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.NoteTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.OtherNameCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PartnerCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PaycheckSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PaymentMethodSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PayrollItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PriceLevelSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PricingGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PricingSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ProjectTaskAssignmentSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ProjectTaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.PromotionCodeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.ResourceAllocationSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.RevRecScheduleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.RevRecTemplateSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SalesRoleSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SalesTaxItemSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SiteCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SolutionSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaxDetailSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaxGroupSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TaxTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TermSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TimeBillSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TimeEntrySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TimeSheetSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TopicSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.UnitsTypeSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.UsageSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.VendorCategorySearchBasic;
import com.netsuite.webservices.platform.common_2018_1.VendorSearchBasic;
import com.netsuite.webservices.platform.common_2018_1.WinLossReasonSearchBasic;


/**
 * <p>Java class for SearchRecordBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchRecordBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2018_1.platform.webservices.netsuite.com}SearchRecord">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchRecordBasic")
@XmlSeeAlso({
    RevRecScheduleSearchBasic.class,
    AccountSearchBasic.class,
    TermSearchBasic.class,
    InventoryNumberBinSearchBasic.class,
    CustomerSearchBasic.class,
    ItemSearchBasic.class,
    ItemDemandPlanSearchBasic.class,
    ProjectTaskAssignmentSearchBasic.class,
    SiteCategorySearchBasic.class,
    ManufacturingRoutingSearchBasic.class,
    AccountingTransactionSearchBasic.class,
    TaskSearchBasic.class,
    NexusSearchBasic.class,
    JobStatusSearchBasic.class,
    UsageSearchBasic.class,
    ContactRoleSearchBasic.class,
    MseSubsidiarySearchBasic.class,
    CustomerStatusSearchBasic.class,
    EntityGroupSearchBasic.class,
    ContactSearchBasic.class,
    BomRevisionSearchBasic.class,
    HcmJobSearchBasic.class,
    CostCategorySearchBasic.class,
    GiftCertificateSearchBasic.class,
    ItemBinNumberSearchBasic.class,
    FairValuePriceSearchBasic.class,
    PaycheckSearchBasic.class,
    CalendarEventSearchBasic.class,
    PaymentMethodSearchBasic.class,
    EntitySearchBasic.class,
    CustomRecordSearchBasic.class,
    TaxTypeSearchBasic.class,
    ManufacturingOperationTaskSearchBasic.class,
    SupportCaseSearchBasic.class,
    ManufacturingCostTemplateSearchBasic.class,
    VendorSearchBasic.class,
    ItemRevisionSearchBasic.class,
    TransactionSearchBasic.class,
    TopicSearchBasic.class,
    PartnerCategorySearchBasic.class,
    BomRevisionComponentSearchBasic.class,
    SubsidiarySearchBasic.class,
    ItemAccountMappingSearchBasic.class,
    DepartmentSearchBasic.class,
    SolutionSearchBasic.class,
    OriginatingLeadSearchBasic.class,
    EmployeeSearchBasic.class,
    OpportunitySearchBasic.class,
    AddressSearchBasic.class,
    PhoneCallSearchBasic.class,
    CustomerMessageSearchBasic.class,
    ResourceAllocationSearchBasic.class,
    PayrollItemSearchBasic.class,
    SalesRoleSearchBasic.class,
    JobSearchBasic.class,
    BinSearchBasic.class,
    PriceLevelSearchBasic.class,
    TimeBillSearchBasic.class,
    RevRecTemplateSearchBasic.class,
    CustomerCategorySearchBasic.class,
    OtherNameCategorySearchBasic.class,
    InventoryDetailSearchBasic.class,
    ConsolidatedExchangeRateSearchBasic.class,
    UnitsTypeSearchBasic.class,
    AssemblyItemBomSearchBasic.class,
    ItemSupplyPlanSearchBasic.class,
    SalesTaxItemSearchBasic.class,
    AccountingPeriodSearchBasic.class,
    InboundShipmentSearchBasic.class,
    TaxGroupSearchBasic.class,
    TimeSheetSearchBasic.class,
    ExpenseCategorySearchBasic.class,
    InventoryNumberSearchBasic.class,
    ContactCategorySearchBasic.class,
    MessageSearchBasic.class,
    IssueSearchBasic.class,
    TaxDetailSearchBasic.class,
    TimeEntrySearchBasic.class,
    PromotionCodeSearchBasic.class,
    PartnerSearchBasic.class,
    VendorCategorySearchBasic.class,
    BillingScheduleSearchBasic.class,
    CustomListSearchBasic.class,
    ClassificationSearchBasic.class,
    LocationSearchBasic.class,
    ProjectTaskSearchBasic.class,
    CouponCodeSearchBasic.class,
    PricingSearchBasic.class,
    FolderSearchBasic.class,
    GroupMemberSearchBasic.class,
    WinLossReasonSearchBasic.class,
    CurrencyRateSearchBasic.class,
    NoteTypeSearchBasic.class,
    FileSearchBasic.class,
    GlobalAccountMappingSearchBasic.class,
    CampaignSearchBasic.class,
    ChargeSearchBasic.class,
    BillingAccountSearchBasic.class,
    BomSearchBasic.class,
    JobTypeSearchBasic.class,
    NoteSearchBasic.class,
    PricingGroupSearchBasic.class,
    BudgetSearchBasic.class
})
public abstract class SearchRecordBasic
    extends SearchRecord
{


}
